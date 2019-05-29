package com.metaopsis.icsapi.v2.dom.di;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.HashMap;

public class MtTask {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "@type", access = JsonProperty.Access.WRITE_ONLY)
    private String type = "mtTask";

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String orgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String description;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String createTime;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String updateTime;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String createdBy;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String updatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private TaskEmail errorTaskEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private TaskEmail successTaskEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private TaskEmail warningTaskEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String runtimeEnvironmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private int maxLogs;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean verbose;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String mappingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String shortDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean enableCrossSchemaPushdown;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private HashMap<String, String> sessionProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private TaskParameter[] parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private Sequence[] sequences;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private InOutParameter[] inOutParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String lastRunTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String scheduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String preProcessingCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String postProcessingCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String parameterFileName;

    public MtTask() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public TaskEmail getErrorTaskEmail() {
        return errorTaskEmail;
    }

    public void setErrorTaskEmail(TaskEmail errorTaskEmail) {
        this.errorTaskEmail = errorTaskEmail;
    }

    public TaskEmail getSuccessTaskEmail() {
        return successTaskEmail;
    }

    public void setSuccessTaskEmail(TaskEmail successTaskEmail) {
        this.successTaskEmail = successTaskEmail;
    }

    public TaskEmail getWarningTaskEmail() {
        return warningTaskEmail;
    }

    public void setWarningTaskEmail(TaskEmail warningTaskEmail) {
        this.warningTaskEmail = warningTaskEmail;
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

    public int getMaxLogs() {
        return maxLogs;
    }

    public void setMaxLogs(int maxLogs) {
        this.maxLogs = maxLogs;
    }

    public boolean isVerbose() {
        return verbose;
    }

    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }

    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public boolean isEnableCrossSchemaPushdown() {
        return enableCrossSchemaPushdown;
    }

    public void setEnableCrossSchemaPushdown(boolean enableCrossSchemaPushdown) {
        this.enableCrossSchemaPushdown = enableCrossSchemaPushdown;
    }

    public HashMap<String, String> getSessionProperties() {
        return sessionProperties;
    }

    public void setSessionProperties(HashMap<String, String> sessionProperties) {
        this.sessionProperties = sessionProperties;
    }

    public TaskParameter[] getParameters() {
        return parameters;
    }

    public void setParameters(TaskParameter[] parameters) {
        this.parameters = parameters;
    }

    public Sequence[] getSequences() {
        return sequences;
    }

    public void setSequences(Sequence[] sequences) {
        this.sequences = sequences;
    }

    public InOutParameter[] getInOutParameters() {
        return inOutParameters;
    }

    public void setInOutParameters(InOutParameter[] inOutParameters) {
        this.inOutParameters = inOutParameters;
    }

    public String getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(String lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getPreProcessingCmd() {
        return preProcessingCmd;
    }

    public void setPreProcessingCmd(String preProcessingCmd) {
        this.preProcessingCmd = preProcessingCmd;
    }

    public String getPostProcessingCmd() {
        return postProcessingCmd;
    }

    public void setPostProcessingCmd(String postProcessingCmd) {
        this.postProcessingCmd = postProcessingCmd;
    }

    public String getParameterFileName() {
        return parameterFileName;
    }

    public void setParameterFileName(String parameterFileName) {
        this.parameterFileName = parameterFileName;
    }

    @Override
    public String toString() {
        return "MtTask{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", orgId='" + orgId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", errorTaskEmail=" + errorTaskEmail +
                ", successTaskEmail=" + successTaskEmail +
                ", warningTaskEmail=" + warningTaskEmail +
                ", agentId='" + agentId + '\'' +
                ", runtimeEnvironmentId='" + runtimeEnvironmentId + '\'' +
                ", maxLogs=" + maxLogs +
                ", verbose=" + verbose +
                ", mappingId='" + mappingId + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", enableCrossSchemaPushdown=" + enableCrossSchemaPushdown +
                ", sessionProperties=" + sessionProperties +
                ", parameters=" + Arrays.toString(parameters) +
                ", sequences=" + Arrays.toString(sequences) +
                ", inOutParameters=" + Arrays.toString(inOutParameters) +
                ", lastRunTime='" + lastRunTime + '\'' +
                ", scheduleId='" + scheduleId + '\'' +
                ", preProcessingCmd='" + preProcessingCmd + '\'' +
                ", postProcessingCmd='" + postProcessingCmd + '\'' +
                ", parameterFileName='" + parameterFileName + '\'' +
                '}';
    }
}
