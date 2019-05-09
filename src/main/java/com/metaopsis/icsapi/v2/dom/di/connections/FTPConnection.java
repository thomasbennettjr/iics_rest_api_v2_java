package com.metaopsis.icsapi.v2.dom.di.connections;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FTPConnection implements IConnection {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String orgId;
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;
    private String type;
    private String username;
    private String password;
    private String host;
    private int port;
    @JsonProperty("database")
    private String localDirectory;
    private String remoteDirectory;
    private String dateFormat;
    private String codepage;
    private String runtimeEnvironmentId;


    public FTPConnection(boolean isSFTP)
    {
        this.type = isSFTP ? "SFTP" : "FTP";
        this.port = isSFTP ? 22 : 21;
        this.dateFormat = "MM/dd/yyyy HH:mm:ss";
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getLocalDirectory() {
        return localDirectory;
    }

    public void setLocalDirectory(String localDirectory) {
        this.localDirectory = localDirectory;
    }

    public String getRemoteDirectory() {
        return remoteDirectory;
    }

    public void setRemoteDirectory(String remoteDirectory) {
        this.remoteDirectory = remoteDirectory;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getCodepage() {
        return codepage;
    }

    public void setCodepage(String codepage) {
        this.codepage = codepage;
    }

    public String getRuntimeEnvironmentId() {
        return runtimeEnvironmentId;
    }

    public void setRuntimeEnvironmentId(String runtimeEnvironmentId) {
        this.runtimeEnvironmentId = runtimeEnvironmentId;
    }

    @Override
    public String toString() {
        return "FTPConnection{" +
                "id='" + id + '\'' +
                ", orgId='" + orgId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", host='" + host + '\'' +
                ", port=" + port +
                ", localDirectory='" + localDirectory + '\'' +
                ", remoteDirectory='" + remoteDirectory + '\'' +
                ", dateFormat='" + dateFormat + '\'' +
                ", codepage='" + codepage + '\'' +
                ", runtimeEnvironmentId='" + runtimeEnvironmentId + '\'' +
                '}';
    }
}
