package com.metaopsis.icsapi.v2.dom;

import java.util.Arrays;

public class Agent {
    private String id;
    private String orgId;
    private String name;
    private String createTime;
    private String updateTime;
    private String createdBy;
    private String updatedBy;
    private boolean active;
    private boolean readyToRun;
    private String platform;
    private String agentHost;
    private String password;
    private String proxyHost;
    private int proxyPort;
    private String proxyUser;
    private String proxyPassword;
    private String agentVersion;
    private String spiUrl;
    private String upgradeStatus;
    private String lastUpgrade;
    private String lastUpgradeCheck;
    private String lastStatusChange;
    private String[] packages;
    private String configUpdateTime;
    private AgentConfig[] agentConfigs;
    private AgentEngine[] agentEngines;


    public Agent() {
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isReadyToRun() {
        return readyToRun;
    }

    public void setReadyToRun(boolean readyToRun) {
        this.readyToRun = readyToRun;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getAgentHost() {
        return agentHost;
    }

    public void setAgentHost(String agentHost) {
        this.agentHost = agentHost;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getProxyUser() {
        return proxyUser;
    }

    public void setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public String getSpiUrl() {
        return spiUrl;
    }

    public void setSpiUrl(String spiUrl) {
        this.spiUrl = spiUrl;
    }

    public String getUpgradeStatus() {
        return upgradeStatus;
    }

    public void setUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
    }

    public String getLastUpgrade() {
        return lastUpgrade;
    }

    public void setLastUpgrade(String lastUpgrade) {
        this.lastUpgrade = lastUpgrade;
    }

    public String getLastUpgradeCheck() {
        return lastUpgradeCheck;
    }

    public void setLastUpgradeCheck(String lastUpgradeCheck) {
        this.lastUpgradeCheck = lastUpgradeCheck;
    }

    public String getLastStatusChange() {
        return lastStatusChange;
    }

    public void setLastStatusChange(String lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    public String[] getPackages() {
        return packages;
    }

    public void setPackages(String[] packages) {
        this.packages = packages;
    }

    public String getConfigUpdateTime() {
        return configUpdateTime;
    }

    public void setConfigUpdateTime(String configUpdateTime) {
        this.configUpdateTime = configUpdateTime;
    }

    public AgentConfig[] getAgentConfigs() {
        return agentConfigs;
    }

    public void setAgentConfigs(AgentConfig[] agentConfigs) {
        this.agentConfigs = agentConfigs;
    }

    public AgentEngine[] getAgentEngines() {
        return agentEngines;
    }

    public void setAgentEngines(AgentEngine[] agentEngines) {
        this.agentEngines = agentEngines;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id='" + id + '\'' +
                ", orgId='" + orgId + '\'' +
                ", name='" + name + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", active=" + active +
                ", readyToRun=" + readyToRun +
                ", platform='" + platform + '\'' +
                ", agentHost='" + agentHost + '\'' +
                ", password='" + password + '\'' +
                ", proxyHost='" + proxyHost + '\'' +
                ", proxyPort=" + proxyPort +
                ", proxyUser='" + proxyUser + '\'' +
                ", proxyPassword='" + proxyPassword + '\'' +
                ", agentVersion='" + agentVersion + '\'' +
                ", spiUrl='" + spiUrl + '\'' +
                ", upgradeStatus='" + upgradeStatus + '\'' +
                ", lastUpgrade='" + lastUpgrade + '\'' +
                ", lastUpgradeCheck='" + lastUpgradeCheck + '\'' +
                ", lastStatusChange='" + lastStatusChange + '\'' +
                ", packages=" + Arrays.toString(packages) +
                ", configUpdateTime='" + configUpdateTime + '\'' +
                ", agentConfigs=" + Arrays.toString(agentConfigs) +
                ", agentEngines=" + Arrays.toString(agentEngines) +
                '}';
    }
}
