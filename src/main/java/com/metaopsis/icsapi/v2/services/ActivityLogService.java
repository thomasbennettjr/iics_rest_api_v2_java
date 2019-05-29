package com.metaopsis.icsapi.v2.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaopsis.icsapi.v2.dom.ActivityLogEntry;
import com.metaopsis.icsapi.v2.dom.User;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ActivityLogService {
    final static Logger logger = Logger.getLogger(ActivityLogService.class);
    private ObjectMapper mapper;
    private RestTemplate rest;
    private HttpHeaders headers;
    private User user;

    public ActivityLogService(User user)
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

    private ActivityLogEntry getActivityLog(String id) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getActivityLog::enter");
        if (id == null)
            throw new InformaticaCloudException("ID Value for this function is null");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        ActivityLogEntry response = null;
        try {

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/activity/activityLog/" + id, HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 ActivityLog " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), ActivityLogEntry.class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getActivityLog::exit");
        return response;
    }

    public ActivityLogEntry[] getActivityLogsByRunId(int runId) throws InformaticaCloudException
    {
        return getActivityLogs(runId, null, 0, 0);
    }

    public ActivityLogEntry[] getActivityLogsByTaskId(String taskId) throws InformaticaCloudException
    {
        return getActivityLogs(0, taskId, 0,0);
    }

    public ActivityLogEntry[] getActivityLogsByOffset(int offset) throws InformaticaCloudException
    {
        return getActivityLogs(0,null,offset,0);
    }

    public ActivityLogEntry[] getActivityLogsByRowLimit(int rowLimit) throws InformaticaCloudException
    {
        return getActivityLogs(0, null, 0, rowLimit);
    }

    public ActivityLogEntry[] getActivityLogs(int runId, String taskId, int offset, int rowLimit) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getActivityLogs::enter");
        HttpEntity<String> requestEntity = null;
        ResponseEntity<String> responseEntity = null;
        ActivityLogEntry[] response = null;
        try {
            StringBuilder queryString = new StringBuilder();
            if (runId > 0)
                queryString.append("runId=" + runId);
            if (taskId != null && taskId.trim().length() != 0)
                queryString.append(queryString.length() > 0 ? "&taskId="+taskId : "taskId="+taskId);
            if (offset > 0)
                queryString.append(queryString.length() > 0 ? "&offset="+offset : "offset=" + offset);
            if (rowLimit > 0)
                queryString.append(queryString.length() > 0 ? "&rowLimit="+rowLimit : "rowLimit="+rowLimit);

            requestEntity = new HttpEntity<String>(null, headers);

            responseEntity = rest.exchange(user.getServerUrl()+"/api/v2/activity/activityLog?" + queryString.toString() , HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 ActivityLogs " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                response = mapper.readValue(responseEntity.getBody(), ActivityLogEntry[].class);
            } else {
                logger.error(responseEntity.toString());
                throw new InformaticaCloudException(responseEntity.toString());
            }
        } catch(Exception e)
        {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getActivityLogs::exit");
        return response;
    }

    public void getErrorLog(String id, File file) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getErrorLog::enter");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            HttpEntity<String> requestEntity = null;
            ResponseEntity<String> responseEntity = null;
            requestEntity = new HttpEntity<String>("", this.buildHttpHeaders("text/plain","application/json"));

            responseEntity = rest.exchange(user.getServerUrl() + "/api/v2/activity/errorLog/" + id , HttpMethod.GET, requestEntity, String.class);

            logger.info("Informatica Cloud V2 ActivityLog Error Log " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                writer.write(responseEntity.getBody());
                writer.newLine();
                writer.close();
            } else {
                logger.error(responseEntity.getBody());
                throw new InformaticaCloudException(responseEntity.getBody());
            }

        } catch(Exception e) {
            throw new InformaticaCloudException(e.getMessage());
        }
        logger.info(this.getClass().getName()+"::getErrorLog::exit");
    }

    public void getSessionLog(String id, File file) throws InformaticaCloudException
    {
        this.getSessionLog(id, 0, 0, file);
    }

    public void getSessionLog(String id, int itemId, int childItemId, File file) throws InformaticaCloudException
    {
        logger.info(this.getClass().getName()+"::getSessionLog::enter");
        try {
            HttpEntity<String> requestEntity = null;
            ResponseEntity<byte[]> responseEntity = null;
            requestEntity = new HttpEntity<String>("", this.buildHttpHeaders("application/zip","application/json"));

            StringBuilder queryString = new StringBuilder();
            if (itemId > 0)
                queryString.append("itemId=" + itemId);
            if (childItemId > 0)
                queryString.append(queryString.length() > 0 ? "&childItemId=" + childItemId : "childItemId=" + childItemId);

            responseEntity = rest.exchange(user.getServerUrl()+ "/api/v2/activity/activityLog/" + id + "/sessionLog" + (queryString.length() > 0 ? "?" + queryString.toString() : ""), HttpMethod.GET, requestEntity, byte[].class);
            logger.info("Informatica Cloud V2 ActivityLog Session Log " + responseEntity.getStatusCode().toString());
            if (responseEntity.getStatusCode().is2xxSuccessful())
            {
                Files.write(Paths.get(file.getAbsolutePath()), responseEntity.getBody());
            } else {
                throw new InformaticaCloudException("Download Package " + id + " Error");
            }

        }
        catch (Exception e) {
            throw new InformaticaCloudException(e.getMessage());
        }

        logger.info(this.getClass().getName()+"::getSessionLog::exit");
    }


    private HttpHeaders buildHttpHeaders(String accept, String contentType)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", accept);
        headers.add("Content-Type", contentType);
        headers.add("icSessionId", this.user.getIcSessionId());

        return headers;
    }
}
