package com.metaopsis.icsapi.v2.dom.di;

import java.util.Arrays;

public class Connection {
    private String id;
    private String orgId;
    private String name;
    private String description;
    private String createTime;
    private String updateTime;
    private String createdBy;
    private String updatedBy;
    private String agentId;
    private String runtimeEnvironmentId;
    private String dateFormat;
    private String database;
    private String codepage;
    private String type;
    private int port;
    private String majorUpdateTime;
    private int timeout;
    private String instanceName;
    private String serviceUrl;
    private String username;
    private String password;
    private String securityToken;
    private String shortDescription;
    private String host;
    private String adjustedJdbcHostName;
    private String schema;
    private String domain;
    private String remoteDirectory;
    private ConnectionListItem[] connListItem;

    public Connection() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getRuntimeEnvironmentId() {
        return runtimeEnvironmentId;
    }

    public void setRuntimeEnvironmentId(String runtimeEnvironmentId) {
        this.runtimeEnvironmentId = runtimeEnvironmentId;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getCodepage() {
        return codepage;
    }

    public void setCodepage(String codepage) {
        this.codepage = codepage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getMajorUpdateTime() {
        return majorUpdateTime;
    }

    public void setMajorUpdateTime(String majorUpdateTime) {
        this.majorUpdateTime = majorUpdateTime;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getAdjustedJdbcHostName() {
        return adjustedJdbcHostName;
    }

    public void setAdjustedJdbcHostName(String adjustedJdbcHostName) {
        this.adjustedJdbcHostName = adjustedJdbcHostName;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getRemoteDirectory() {
        return remoteDirectory;
    }

    public void setRemoteDirectory(String remoteDirectory) {
        this.remoteDirectory = remoteDirectory;
    }

    public ConnectionListItem[] getConnListItem() {
        return connListItem;
    }

    public void setConnListItem(ConnectionListItem[] connListItem) {
        this.connListItem = connListItem;
    }

    @Override
    public String toString() {
        return "IConnection{" +
                "id='" + id + '\'' +
                ", orgId='" + orgId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", agentId='" + agentId + '\'' +
                ", runtimeEnvironmentId='" + runtimeEnvironmentId + '\'' +
                ", dateFormat='" + dateFormat + '\'' +
                ", database='" + database + '\'' +
                ", codepage='" + codepage + '\'' +
                ", type='" + type + '\'' +
                ", port=" + port +
                ", majorUpdateTime='" + majorUpdateTime + '\'' +
                ", timeout=" + timeout +
                ", instanceName='" + instanceName + '\'' +
                ", serviceUrl='" + serviceUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", securityToken='" + securityToken + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", host='" + host + '\'' +
                ", adjustedJdbcHostName='" + adjustedJdbcHostName + '\'' +
                ", schema='" + schema + '\'' +
                ", domain='" + domain + '\'' +
                ", remoteDirectory='" + remoteDirectory + '\'' +
                ", connListItem=" + Arrays.toString(connListItem) +
                '}';
    }
}
