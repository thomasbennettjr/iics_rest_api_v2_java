package com.metaopsis.icsapi.v2.dom;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Job {
    @JsonProperty("@type")
    private final String type = "job";
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String taskId = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String taskFederatedId = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String taskName = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String taskType = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String callbackURL = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private int runId = 0;

    public Job() {
    }

    public String getType() {
        return type;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskFederatedId() {
        return taskFederatedId;
    }

    public void setTaskFederatedId(String taskFederatedId) {
        this.taskFederatedId = taskFederatedId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getCallbackURL() {
        return callbackURL;
    }

    public void setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
    }

    public int getRunId() {
        return runId;
    }

    public void setRunId(int runId) {
        this.runId = runId;
    }

    @Override
    public String toString() {
        return "Job{" +
                "type='" + type + '\'' +
                ", taskId='" + taskId + '\'' +
                ", taskFederatedId='" + taskFederatedId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskType='" + taskType + '\'' +
                ", callbackURL='" + callbackURL + '\'' +
                ", runId=" + runId +
                '}';
    }
}
