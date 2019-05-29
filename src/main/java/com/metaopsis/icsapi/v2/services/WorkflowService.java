package com.metaopsis.icsapi.v2.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaopsis.icsapi.v2.dom.ErrorObject;
import com.metaopsis.icsapi.v2.dom.User;
import com.metaopsis.icsapi.v2.dom.di.UpdateMode;
import com.metaopsis.icsapi.v2.dom.di.Workflow;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriUtils;

import java.io.StringWriter;
import java.io.Writer;

public class WorkflowService {
    final static Logger logger = Logger.getLogger(WorkflowService.class);
    private ObjectMapper mapper;
    private RestTemplate rest;
    private HttpHeaders headers;
    private User user;
    private UpdateMode mode;

    public WorkflowService(User user, UpdateMode mode)
    {
        init(user, mode);
    }

    public WorkflowService(User user)
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

    public Workflow[] getAllWorkflow() throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAllWorkflow::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Workflow[] response = null;
        ErrorObject errorObject = null;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/workflow", HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Workflow " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Workflow[].class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAllWorkflow::exit");
        return response;
    }

    public Workflow getWorkflowById(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getWorkflowById::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Workflow response = null;
        ErrorObject errorObject = null;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/workflow/" + id, HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Workflow By Id " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Workflow.class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getWorkflowById::exit");
        return response;
    }

    public Workflow getWorkflowByName(String name) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getWorkflowByName::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Workflow response = null;
        ErrorObject errorObject = null;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/workflow/name/" + UriUtils.encode(name, "UTF-8"), HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Workflow By Name " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Workflow.class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getWorkflowByName::exit");
        return response;
    }

    public Workflow createWorkflow(Workflow workflow) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::createWorkflow::enter");
        Workflow response =  doOrg(workflow, false);
        logger.info(this.getClass().getName()+"::createWorkflow::exit");

        return response;
    }

    public Workflow updateWorkflow(Workflow workflow) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::updateWorkflow::enter");
        Workflow response =  doOrg(workflow, true);
        logger.info(this.getClass().getName()+"::updateWorkflow::exit");

        return response;
    }

    private Workflow doOrg(Workflow workflow, boolean doUpdate) throws InformaticaCloudException
    {
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Workflow response = null;
        ErrorObject errorObject = null;
        try {
            mapper.writeValue(jsonWriter, workflow);
            jsonWriter.flush();
            requestEntity = new HttpEntity<String>(jsonWriter.toString(), headers);
            if (this.mode == UpdateMode.PARTIAL)
                this.headers.add("Update-Mode","PARTIAL");
            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/workflow" + (doUpdate ? "/"+workflow.getId() : ""), HttpMethod.POST, requestEntity, String.class);

            logger.info("Informatica Cloud V2 " + (doUpdate ? "Update Workflow" : "Create Workflow")  + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Workflow.class);
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
            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/workflow/" + taskId, HttpMethod.DELETE, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Delete Workflow "  + responseEntity.getStatusCode().toString());

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
