package com.metaopsis.icsapi.v2.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaopsis.icsapi.v2.dom.Schedule;
import com.metaopsis.icsapi.v2.dom.User;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriUtils;

import java.io.StringWriter;
import java.io.Writer;

public class ScheduleService {
    final static Logger logger = Logger.getLogger(ScheduleService.class);
    private ObjectMapper mapper;
    private RestTemplate rest;
    private HttpHeaders headers;
    private User user;

    public ScheduleService(User user)
    {
        this.user = user;

        // Set HttpHeaders for request
        this.headers = new HttpHeaders();
        this.headers.add("Content-Type", "application/json");
        this.headers.add("Accept", "application/json");
        this.headers.add("icSessionId", user.getIcSessionId());

        // Set ObjectMapper
        this.mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // Set RestTemplate
        this.rest = new RestTemplate();
        this.rest.setErrorHandler(new CustomResponseErrorHandler());
    }

    public Schedule[] getAllSchedules() throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAllSchedules::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Schedule[] response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/schedule", HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 All Schedules " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Schedule[].class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAllSchedules::exit");

        return response;
    }

    public Schedule getScheduleById(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getScheduleById::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Schedule response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/schedule/" + id, HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Schedule By Id " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Schedule.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getScheduleById::exit");

        return response;
    }

    public Schedule getAgentByName(String name) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getScheduleByName::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Schedule response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/schedule/name/" + UriUtils.encode(name, "UTF-8"), HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Schedule By Name " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Schedule.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getScheduleByName::exit");

        return response;
    }

    public Schedule create(Schedule schedule) throws InformaticaCloudException
    {
        logger.debug(schedule.toString());
        logger.info(this.getClass().getName()+"::create::enter");
        Schedule response = null;
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        try {
            mapper.writeValue(jsonWriter, schedule);
            jsonWriter.flush();

            requestEntity = new HttpEntity<String>(jsonWriter.toString(), headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/schedule", HttpMethod.POST, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Create Schedule " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Schedule.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::create::exit");
        return response;
    }

    public Schedule update(Schedule schedule, boolean isPartialUpdate) throws InformaticaCloudException
    {
        logger.debug(schedule.toString());
        logger.info(this.getClass().getName()+"::update::enter");
        Schedule response = null;
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        try {
            mapper.writeValue(jsonWriter, schedule);
            jsonWriter.flush();
            if (isPartialUpdate)
                headers.add("Update-Mode", "PARTIAL");
            requestEntity = new HttpEntity<String>(jsonWriter.toString(), headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/schedule/" + schedule.getId(), HttpMethod.POST, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Update Schedule " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Schedule.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::update::exit");
        return response;
    }

    public boolean delete(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::delete::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        boolean response = true;
        try {
            requestEntity = new HttpEntity<String>(null, headers);
            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/schedule/" + id, HttpMethod.DELETE, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Delete Schedule "  + responseEntity.getStatusCode().toString());

            if (!responseEntity.getStatusCode().is2xxSuccessful()) {
                response = false;
                throw new InformaticaCloudException(responseEntity.getBody());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }
        logger.info(this.getClass().getName()+"::delete::exit");
        return response;
    }
}
