package com.metaopsis.icsapi.v2.dom.di;

import java.util.Arrays;

public class CustomFunc {
    private String id;
    private String orgId;
    private String name;
    private String description;
    private String createTime;
    private String updateTime;
    private String createdBy;
    private String updatedBy;
    private String mappletName;
    private boolean active;
    private String mappletXmlFile;
    private String[] inputs;
    private String[] outputs;
    private CustomFuncConnection[] connections;

    public CustomFunc() {
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

    public String getMappletName() {
        return mappletName;
    }

    public void setMappletName(String mappletName) {
        this.mappletName = mappletName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getMappletXmlFile() {
        return mappletXmlFile;
    }

    public void setMappletXmlFile(String mappletXmlFile) {
        this.mappletXmlFile = mappletXmlFile;
    }

    public String[] getInputs() {
        return inputs;
    }

    public void setInputs(String[] inputs) {
        this.inputs = inputs;
    }

    public String[] getOutputs() {
        return outputs;
    }

    public void setOutputs(String[] outputs) {
        this.outputs = outputs;
    }

    public CustomFuncConnection[] getConnections() {
        return connections;
    }

    public void setConnections(CustomFuncConnection[] connections) {
        this.connections = connections;
    }

    @Override
    public String toString() {
        return "CustomFunc{" +
                "id='" + id + '\'' +
                ", orgId='" + orgId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", mappletName='" + mappletName + '\'' +
                ", active=" + active +
                ", mappletXmlFile='" + mappletXmlFile + '\'' +
                ", inputs=" + Arrays.toString(inputs) +
                ", outputs=" + Arrays.toString(outputs) +
                ", connections=" + Arrays.toString(connections) +
                '}';
    }
}
