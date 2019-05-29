package com.metaopsis.icsapi.v2.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaopsis.icsapi.v2.dom.ErrorObject;
import com.metaopsis.icsapi.v2.dom.Job;
import com.metaopsis.icsapi.v2.dom.User;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.StringWriter;
import java.io.Writer;

public class JobService {
    final static Logger logger = Logger.getLogger(JobService.class);
    private ObjectMapper mapper;
    private RestTemplate rest;
    private HttpHeaders headers;
    private User user;

    public JobService(User user)
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

    public Job start(Job job) throws InformaticaCloudException
    {
        logger.debug(job.toString());
        logger.info(this.getClass().getName()+"::start::enter");
        Job response = null;
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        ErrorObject errorObject = null;
        try {
            mapper.writeValue(jsonWriter, job);
            jsonWriter.flush();

            requestEntity = new HttpEntity<String>(jsonWriter.toString(), headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/job", HttpMethod.POST, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Job Start " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Job.class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::start::exit");
        return response;
    }

    public void stop(Job job) throws InformaticaCloudException
    {
        logger.debug(job.toString());
        logger.info(this.getClass().getName()+"::stop::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        ErrorObject errorObject = null;
        try {
            mapper.writeValue(jsonWriter, job);
            jsonWriter.flush();

            requestEntity = new HttpEntity<String>(jsonWriter.toString(), headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/job/stop", HttpMethod.POST, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Job Stop " + responseEntity.getStatusCode().toString());
            if (!responseEntity.getStatusCode().is2xxSuccessful())
            {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::stop::exit");
    }
}
