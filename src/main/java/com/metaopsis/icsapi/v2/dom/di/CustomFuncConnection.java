package com.metaopsis.icsapi.v2.dom.di;

public class CustomFuncConnection {
    private String id;
    private String name;
    private String type;
    private String subtype;
    private String description;
    private String connectionId;

    public CustomFuncConnection() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    @Override
    public String toString() {
        return "CustomFuncConnection{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", description='" + description + '\'' +
                ", connectionId='" + connectionId + '\'' +
                '}';
    }
}
