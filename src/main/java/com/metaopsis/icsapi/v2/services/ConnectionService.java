package com.metaopsis.icsapi.v2.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaopsis.icsapi.v2.dom.ErrorObject;
import com.metaopsis.icsapi.v2.dom.User;
import com.metaopsis.icsapi.v2.dom.di.Connection;
import com.metaopsis.icsapi.v2.dom.di.connections.*;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriUtils;

import java.io.StringWriter;
import java.io.Writer;

public class ConnectionService {
    final static Logger logger = Logger.getLogger(LoginService.class);
    private ObjectMapper mapper;
    private RestTemplate rest;
    private HttpHeaders headers;
    private User user;

    public ConnectionService(User user)
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

    public Connection[] getAllAgents() throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAllConnections::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Connection[] response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/connection", HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 All Connections " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Connection[].class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAllConnections::exit");

        return response;
    }

    public Connection getAgentById(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getConnectionById::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Connection response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/connection/" + id, HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Connection By Id " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Connection.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getConnectionById::exit");

        return response;
    }

    public Connection getAgentByTypeAndId(ConnectionType type, String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getConnectionByTypeAndId::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Connection response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/connection/" + (type == ConnectionType.Source ? "source/" : "target/") + id, HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Connection By Type And Id " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Connection.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getConnectionByTypeAndId::exit");

        return response;
    }

    public Connection getAgentByName(String name) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getConnectionByName::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Connection response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/connection/name/" + UriUtils.encode(name, "UTF-8"), HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Connection By Name " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Connection.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getConnectionByName::exit");

        return response;
    }

    public Connection getAgentByTypeAndName(ConnectionType type, String name) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getConnectionByTypeAndName::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Connection response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/connection/"+ (type == ConnectionType.Source ? "source" : "target") +"/name/" + UriUtils.encode(name, "UTF-8"), HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Connection By Type And Name " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Connection.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getConnectionByTypeAndName::exit");

        return response;
    }

    public IConnection create(IConnection connection) throws InformaticaCloudException
    {
        if (connection instanceof CSVConnection)
            return this.doCSVConnection((CSVConnection) connection, false);
        else if (connection instanceof FTPConnection)
            return this.doFTPConnection((FTPConnection) connection, false);
        else if (connection instanceof ODBCConnection)
            return this.doODBCConnection((ODBCConnection) connection, false);
        else if (connection instanceof SalesforceConnection)
            return this.doSalesforceConnection((SalesforceConnection) connection, false);
        else
            return null;
    }

    public IConnection update(IConnection connection) throws InformaticaCloudException
    {
        if (connection instanceof CSVConnection)
            return this.doCSVConnection((CSVConnection) connection, true);
        else if (connection instanceof FTPConnection)
            return this.doFTPConnection((FTPConnection) connection, true);
        else if (connection instanceof ODBCConnection)
            return this.doODBCConnection((ODBCConnection) connection, true);
        else if (connection instanceof SalesforceConnection)
            return this.doSalesforceConnection((SalesforceConnection) connection, true);
        else
            return null;
    }

    private IConnection doCSVConnection(CSVConnection connection, boolean doUpdate) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::doCSVConnection::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        CSVConnection response = null;
        ErrorObject errorObject = null;
        try {
            mapper.writeValue(jsonWriter, connection);
            jsonWriter.flush();
            requestEntity = new HttpEntity<String>(jsonWriter.toString(), headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/connection" + (doUpdate ? "/"+ connection.getId() : ""), HttpMethod.POST, requestEntity, String.class);

            logger.info("Informatica Cloud V2 " + (doUpdate ? "Update CSVConnection" : "Create CSVConnection")  + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), CSVConnection.class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }
        logger.info(this.getClass().getName()+"::doCSVConnection::exit");
        return response;
    }

    private IConnection doODBCConnection(ODBCConnection connection, boolean doUpdate) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::doODBCConnection::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        ODBCConnection response = null;
        ErrorObject errorObject = null;
        try {
            mapper.writeValue(jsonWriter, connection);
            jsonWriter.flush();
            requestEntity = new HttpEntity<String>(jsonWriter.toString(), headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/connection" + (doUpdate ? "/"+ connection.getId() : ""), HttpMethod.POST, requestEntity, String.class);

            logger.info("Informatica Cloud V2 " + (doUpdate ? "Update ODBCConnection" : "Create ODBCConnection")  + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), ODBCConnection.class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }
        logger.info(this.getClass().getName()+"::doODBCConnection::exit");
        return response;
    }

    private IConnection doFTPConnection(FTPConnection connection, boolean doUpdate) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::doFTPConnection::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        FTPConnection response = null;
        ErrorObject errorObject = null;
        try {
            mapper.writeValue(jsonWriter, connection);
            jsonWriter.flush();
            requestEntity = new HttpEntity<String>(jsonWriter.toString(), headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/connection" + (doUpdate ? "/"+ connection.getId() : ""), HttpMethod.POST, requestEntity, String.class);

            logger.info("Informatica Cloud V2 " + (doUpdate ? "Update FTPConnection" : "Create FTPConnection")  + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), FTPConnection.class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }
        logger.info(this.getClass().getName()+"::doFTPConnection::exit");
        return response;
    }

    private IConnection doSalesforceConnection(SalesforceConnection connection, boolean doUpdate) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::doSalesforceConnection::enter");
        Writer jsonWriter = new StringWriter();
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        SalesforceConnection response = null;
        ErrorObject errorObject = null;
        try {
            mapper.writeValue(jsonWriter, connection);
            jsonWriter.flush();
            requestEntity = new HttpEntity<String>(jsonWriter.toString(), headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/connection" + (doUpdate ? "/"+ connection.getId() : ""), HttpMethod.POST, requestEntity, String.class);

            logger.info("Informatica Cloud V2 " + (doUpdate ? "Update SalesforceConnection" : "Create SalesforceConnection")  + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), SalesforceConnection.class);
            } else {
                errorObject = mapper.readValue(responseEntity.getBody(), ErrorObject.class);
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(errorObject.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }
        logger.info(this.getClass().getName()+"::doSalesforceConnection::exit");
        return response;
    }

}
