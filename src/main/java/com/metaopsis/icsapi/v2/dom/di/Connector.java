package com.metaopsis.icsapi.v2.dom.di;

public class Connector {
    private String orgId;
    private String name;
    private String updateTime;
    private String type;
    private String publisher;
    private int connectorVersion;
    private String guid;
    private String shortName;
    private boolean isPublic;

    public Connector() {
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getConnectorVersion() {
        return connectorVersion;
    }

    public void setConnectorVersion(int connectorVersion) {
        this.connectorVersion = connectorVersion;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    @Override
    public String toString() {
        return "Connector{" +
                "orgId='" + orgId + '\'' +
                ", name='" + name + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", type='" + type + '\'' +
                ", publisher='" + publisher + '\'' +
                ", connectorVersion=" + connectorVersion +
                ", guid='" + guid + '\'' +
                ", shortName='" + shortName + '\'' +
                ", isPublic=" + isPublic +
                '}';
    }
}
