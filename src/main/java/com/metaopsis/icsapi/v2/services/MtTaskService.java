package com.metaopsis.icsapi.v2.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaopsis.icsapi.v2.dom.ErrorObject;
import com.metaopsis.icsapi.v2.dom.User;
import com.metaopsis.icsapi.v2.dom.di.MtTask;
import com.metaopsis.icsapi.v2.dom.di.UpdateMode;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriUtils;

import java.io.StringWriter;
import java.io.Writer;

public class MtTaskService {
    final static Logger logger = Logger.getLogger(MtTaskService.class);
    private ObjectMapper mapper;
    private RestTemplate rest;
    private HttpHeaders headers;
    private User user;
    private UpdateMode mode;

    public MtTaskService(User user, UpdateMode mode)
    {
        init(user, mode);
    }

    public MtTaskService(User user)
    {
        init(user, UpdateMode.FULL);

    }

    private void init(User user, UpdateMode mode)
    {
        this.user = user;
        this.mode = mode;

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

    public MtTask[] getAllMtTask() throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAllMtTask::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        MtTask[] response = null;
        ErrorObject errorObject = null;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/mttask", HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 MtTask " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), MtTask[].class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAllMtTask::exit");
        return response;
    }

    public MtTask getMtTaskById(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getMtTaskById::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        MtTask response = null;
        ErrorObject errorObject = null;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/mttask/" + id, HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 MtTask By Id " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), MtTask.class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getMtTaskById::exit");
        return response;
    }

    public MtTask getMtTaskByName(String name) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getMtTaskByName::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        MtTask response = null;
        ErrorObject errorObject = null;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/mttask/name/" + UriUtils.encode(name, "UTF-8"), HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 MtTask By Name " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), MtTask.class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getMtTaskByName::exit");
        return response;
    }

    public MtTask createMtTask(MtTask task) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::createMtTask::enter");
        MtTask response =  doOrg(task, false);
        logger.info(this.getClass().getName()+"::createMtTask::exit");

        return response;
    }

    public MtTask updateMtTask(MtTask task) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::updateMtTask::enter");
        MtTask response =  doOrg(task, true);
        logger.info(this.getClass().getName()+"::updateMtTask::exit");

        return response;
    }

    private MtTask doOrg(MtTask task, boolean doUpdate) throws InformaticaCloudException
    {
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        MtTask response = null;
        ErrorObject errorObject = null;
        try {
            mapper.writeValue(jsonWriter, task);
            jsonWriter.flush();
            requestEntity = new HttpEntity<String>(jsonWriter.toString(), headers);
            if (this.mode == UpdateMode.PARTIAL)
                this.headers.add("Update-Mode","PARTIAL");
            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/mttask" + (doUpdate ? "/"+task.getId() : ""), HttpMethod.POST, requestEntity, String.class);

            logger.info("Informatica Cloud V2 " + (doUpdate ? "Update MtTask" : "Create MtTask")  + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), MtTask.class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        return response;
    }

    public void delete(String taskId) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::delete::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        ErrorObject errorObject = null;
        try {
            requestEntity = new HttpEntity<String>(null, headers);
            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/mttask/" + taskId, HttpMethod.DELETE, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Delete MtTask "  + responseEntity.getStatusCode().toString());

            if (!responseEntity.getStatusCode().is2xxSuccessful()) {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }
        logger.info(this.getClass().getName()+"::delete::exit");
    }
}
