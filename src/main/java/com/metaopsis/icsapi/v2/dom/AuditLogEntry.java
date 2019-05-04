package com.metaopsis.icsapi.v2.dom;

public class AuditLogEntry {
    private String id;
    private int version;
    private String orgId;
    private String username;
    private String entryTime;
    private String objectId;
    private String objectName;
    private String category;
    private String event;
    private String eventParam;
    private String message;

    public AuditLogEntry() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEventParam() {
        return eventParam;
    }

    public void setEventParam(String eventParam) {
        this.eventParam = eventParam;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "AuditLogEntry{" +
                "id='" + id + '\'' +
                ", version=" + version +
                ", orgId='" + orgId + '\'' +
                ", username='" + username + '\'' +
                ", entryTime='" + entryTime + '\'' +
                ", objectId='" + objectId + '\'' +
                ", objectName='" + objectName + '\'' +
                ", category='" + category + '\'' +
                ", event='" + event + '\'' +
                ", eventParam='" + eventParam + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
