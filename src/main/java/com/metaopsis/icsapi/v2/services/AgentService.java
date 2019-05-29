package com.metaopsis.icsapi.v2.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaopsis.icsapi.v2.dom.Agent;
import com.metaopsis.icsapi.v2.dom.User;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriUtils;

public class AgentService {
    final static Logger logger = Logger.getLogger(AgentService.class);
    private ObjectMapper mapper;
    private RestTemplate rest;
    private HttpHeaders headers;
    private User user;

    public AgentService(User user)
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

    public Agent[] getAllAgents() throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAllAgents::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Agent[] response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/agent", HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 All Agents " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Agent[].class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAllAgents::exit");

        return response;
    }

    public Agent getAgentById(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAgentById::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Agent response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/agent/" + id, HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Agent By Id " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Agent.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAgentById::exit");

        return response;
    }

    public Agent getAgentByName(String name) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAgentByName::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Agent response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/agent/name/" + UriUtils.encode(name, "UTF-8"), HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Agent By Name " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Agent.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAgentByName::exit");

        return response;
    }

    public Agent[] getAllAgentsDetails() throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAllAgentsDetails::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Agent[] response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/agent/details", HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 All Agents Details " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Agent[].class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAllAgentsDetails::exit");

        return response;
    }

    public Agent getAgentDetailsById(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAgentDetails::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Agent response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/agent/details/" + id, HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Agent Details " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Agent.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAgentDetails::exit");

        return response;
    }

    public void delete(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::delete::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;

        try {
            requestEntity = new HttpEntity<String>(null, headers);
            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/agent/" + id, HttpMethod.DELETE, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Delete Agent "  + responseEntity.getStatusCode().toString());

            if (!responseEntity.getStatusCode().is2xxSuccessful())
                throw new InformaticaCloudException(responseEntity.getBody());
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }
        logger.info(this.getClass().getName()+"::delete::exit");
    }
}
