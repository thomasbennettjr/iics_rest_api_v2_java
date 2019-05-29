package com.metaopsis.icsapi.v2.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaopsis.icsapi.v2.dom.User;
import com.metaopsis.icsapi.v2.dom.di.Connector;
import com.metaopsis.icsapi.v2.dom.di.ConnectorType;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConnectorService {
    final static Logger logger = Logger.getLogger(ConnectorService.class);
    private ObjectMapper mapper;
    private RestTemplate rest;
    private HttpHeaders headers;
    private User user;

    public ConnectorService(User user)
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

    public Connector[] getAllConnectors() throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getAllConnectors::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Connector[] response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/connector", HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Connector " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Connector[].class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getAllConnectors::exit");

        return response;
    }

    public Connector[] getAllConnectorsMetadata() throws InformaticaCloudException
    {
        return metadata(null);
    }

    public Connector[] getConnectorMetdata(ConnectorType type) throws InformaticaCloudException
    {
        return metadata(type);
    }

    private Connector[] metadata(ConnectorType type) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::metadata::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        Connector[] response;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/connector/metadata" + (type == null ? "" : "?connectorName="+type.toString()), HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 Connector Metadata " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), Connector[].class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::metadata::exit");

        return response;
    }


}
