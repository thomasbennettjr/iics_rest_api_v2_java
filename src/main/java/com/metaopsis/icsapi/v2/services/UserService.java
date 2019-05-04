package com.metaopsis.icsapi.v2.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
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

public class UserService {
    final static Logger logger = Logger.getLogger(LoginService.class);
    private ObjectMapper mapper;
    private RestTemplate rest;
    private HttpHeaders headers;
    private User user;

    public UserService(User user)
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

    public User[] getAllUsers() throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAllUsers::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        User[] response = null;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/user", HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 getAllUsers " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), User[].class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAllUsers::exit");
        return response;
    }

    public User getUserById(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getUserById::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        User response = null;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/user/" + id, HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 getUserById " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), User.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getUserById::exit");
        return response;
    }

    public User getUserByName(String name) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getUserByName::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        User response = null;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/user/name/" + UriUtils.encode(name, "UTF-8"), HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 getUserByName " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), User.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getUserByName::exit");
        return response;
    }

    public User createUser(User user) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::createUser::enter");
        User response =  doUser(user, false);
        logger.info(this.getClass().getName()+"::createUser::exit");

        return response;
    }

    public User updateOrg(User user) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::updateUser::enter");
        User response =  doUser(user, true);
        logger.info(this.getClass().getName()+"::updateUser::exit");

        return response;
    }

    private User doUser(User user, boolean doUpdate) throws InformaticaCloudException
    {
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        User response = null;
        try {
            mapper.writeValue(jsonWriter, user);
            jsonWriter.flush();
            requestEntity = new HttpEntity<String>(jsonWriter.toString(), headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/user" + (doUpdate ? "/"+user.getId() : ""), HttpMethod.POST, requestEntity, String.class);

            logger.info("Informatica Cloud V2 " + (doUpdate ? "Update User" : "Create User")  + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), User.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        return response;
    }

    public void delete(String userId) throws InformaticaCloudException
    {
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;

        try {
            requestEntity = new HttpEntity<String>(null, headers);
            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/user/" + userId, HttpMethod.DELETE, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Delete User "  + responseEntity.getStatusCode().toString());

            if (!responseEntity.getStatusCode().is2xxSuccessful())
                throw new InformaticaCloudException(responseEntity.getBody());
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

    }
}
