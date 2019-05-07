package com.metaopsis.icsapi.v2.dom;

public class AgentEngineStatus {
    private String appname;
    private String appDisplayName;
    private String appversion;
    private String replacePolicy;
    private String status;
    private String desiredStatus;
    private String subState;
    private String createTime;
    private String updateTime;

    public AgentEngineStatus() {
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getAppDisplayName() {
        return appDisplayName;
    }

    public void setAppDisplayName(String appDisplayName) {
        this.appDisplayName = appDisplayName;
    }

    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    public String getReplacePolicy() {
        return replacePolicy;
    }

    public void setReplacePolicy(String replacePolicy) {
        this.replacePolicy = replacePolicy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesiredStatus() {
        return desiredStatus;
    }

    public void setDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
    }

    public String getSubState() {
        return subState;
    }

    public void setSubState(String subState) {
        this.subState = subState;
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

    @Override
    public String toString() {
        return "AgentEngineStatus{" +
                "appname='" + appname + '\'' +
                ", appDisplayName='" + appDisplayName + '\'' +
                ", appversion='" + appversion + '\'' +
                ", replacePolicy='" + replacePolicy + '\'' +
                ", status='" + status + '\'' +
                ", desiredStatus='" + desiredStatus + '\'' +
                ", subState='" + subState + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
