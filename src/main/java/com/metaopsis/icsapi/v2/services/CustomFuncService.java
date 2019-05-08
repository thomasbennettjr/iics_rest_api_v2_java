package com.metaopsis.icsapi.v2.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaopsis.icsapi.v2.dom.User;
import com.metaopsis.icsapi.v2.dom.di.CustomFunc;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriUtils;

import java.util.UUID;

public class CustomFuncService {
    final static Logger logger = Logger.getLogger(LoginService.class);
    private ObjectMapper mapper;
    private RestTemplate rest;
    private HttpHeaders headers;
    private User user;

    public CustomFuncService(User user)
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

    public CustomFunc[] getAllCustomFuncs() throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAllCustomFuncs::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        CustomFunc[] response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/customFunc", HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 All CustomFuncs " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), CustomFunc[].class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAllCustomFuncs::exit");

        return response;
    }

    public CustomFunc getCustomFuncByName(String name) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getCustomFuncByName::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        CustomFunc response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/customFunc/name/" + UriUtils.encode(name, "UTF-8"), HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 CustomFunc By Name " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), CustomFunc.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getCustomFuncByName::exit");

        return response;
    }

    public CustomFunc getCustomFuncById(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAllCustomFuncs::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        CustomFunc response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/customFunc/" + id, HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 CustomFunc By Id " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), CustomFunc.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAllCustomFuncs::exit");

        return response;
    }


    private boolean create(String name, String filename, boolean active, String xml, String description) throws InformaticaCloudException
    {
        return doCustomFunc(name, filename, active, xml, description, null);
    }

    private boolean doCustomFunc(String name, String filename, boolean active, String xml, String description, String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::doCustomFunc::enter");

        boolean response = true;
        long boundary = UUID.randomUUID().timestamp();
        try
        {
            HttpEntity<String> requestEntity = null;
            ResponseEntity<String> responseEntity = null;
            requestEntity = new HttpEntity<String>("--"+boundary+"\r\nContent-Disposition: form-data; name=\"file\"; filename=\""+ filename
                    + "\"; Content-Type: text/xml\r\n\r\n"+xml+"\r\n\r\n--"+boundary+"\r\nContent-Disposition: form-data; name=\"name\"\r\n\r\n"
                    + name+"\r\n--"+boundary+"\r\nContent-Disposition: form-data; name=\"active\"\r\n\r\n"+active+"\r\n--"+boundary
                    + "\r\nContent-Disposition: form-data; name=\"desc\"\r\n\r\n"+(description == null ? "" : description)+"\r\n--"+boundary+"--", this.headers);
            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/customFunc" + (id == null ? "" : "/"+id), HttpMethod.POST,
                    requestEntity, String.class);
            if (!responseEntity.getStatusCode().is2xxSuccessful())
            {
                logger.info("Informatica Cloud V2 doCustomFunc " + responseEntity.getStatusCode().toString());
                throw new InformaticaCloudException(responseEntity.getBody());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }
        logger.info(this.getClass().getName()+"::doCustomFunc::exit");
        return response;
    }

    public boolean update(String name, String filename, boolean active, String xml, String description, String id) throws InformaticaCloudException
    {
        return doCustomFunc(name, filename, active, xml, description, id);
    }

    public void delete(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::delete::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;

        try {
            requestEntity = new HttpEntity<String>(null, headers);
            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/customFunc/" + id, HttpMethod.DELETE, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Delete CustomFunc "  + responseEntity.getStatusCode().toString());

            if (!responseEntity.getStatusCode().is2xxSuccessful())
                throw new InformaticaCloudException(responseEntity.getBody());
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }
        logger.info(this.getClass().getName()+"::delete::exit");
    }
}
