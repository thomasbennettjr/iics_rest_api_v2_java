package com.metaopsis.icsapi.v2.dom;

import java.util.Arrays;

public class ActivityMonitorEntry {
    private String id;
    private String type;
    private String taskId;
    private String taskName;
    private String objectName;
    private long runId;
    private String startTime;
    private String endTime;
    private ExecutionState executionState;
    private long failedSourceRows;
    private long successSourceRows;
    private long failedTargetRows;
    private long successTargetRows;
    private String errorMsg;
    private ActivityMonitorEntry[] entries;
    private String agentId;
    private String runtimeEnvironmentId;
    private String startedBy;
    private String runContextType;
    private String scheduleName;
    private String callbackURL;

    public ActivityMonitorEntry() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public long getRunId() {
        return runId;
    }

    public void setRunId(long runId) {
        this.runId = runId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ExecutionState getExecutionState() {
        return executionState;
    }

    public void setExecutionState(ExecutionState executionState) {
        this.executionState = executionState;
    }

    public long getFailedSourceRows() {
        return failedSourceRows;
    }

    public void setFailedSourceRows(long failedSourceRows) {
        this.failedSourceRows = failedSourceRows;
    }

    public long getSuccessSourceRows() {
        return successSourceRows;
    }

    public void setSuccessSourceRows(long successSourceRows) {
        this.successSourceRows = successSourceRows;
    }

    public long getFailedTargetRows() {
        return failedTargetRows;
    }

    public void setFailedTargetRows(long failedTargetRows) {
        this.failedTargetRows = failedTargetRows;
    }

    public long getSuccessTargetRows() {
        return successTargetRows;
    }

    public void setSuccessTargetRows(long successTargetRows) {
        this.successTargetRows = successTargetRows;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ActivityMonitorEntry[] getEntries() {
        return entries;
    }

    public void setEntries(ActivityMonitorEntry[] entries) {
        this.entries = entries;
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

    public String getStartedBy() {
        return startedBy;
    }

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    public String getRunContextType() {
        return runContextType;
    }

    public void setRunContextType(String runContextType) {
        this.runContextType = runContextType;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public String getCallbackURL() {
        return callbackURL;
    }

    public void setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
    }

    @Override
    public String toString() {
        return "ActivityMonitorEntry{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", objectName='" + objectName + '\'' +
                ", runId=" + runId +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", executionState=" + executionState +
                ", failedSourceRows=" + failedSourceRows +
                ", successSourceRows=" + successSourceRows +
                ", failedTargetRows=" + failedTargetRows +
                ", successTargetRows=" + successTargetRows +
                ", errorMsg='" + errorMsg + '\'' +
                ", entries=" + Arrays.toString(entries) +
                ", agentId='" + agentId + '\'' +
                ", runtimeEnvironmentId='" + runtimeEnvironmentId + '\'' +
                ", startedBy='" + startedBy + '\'' +
                ", runContextType='" + runContextType + '\'' +
                ", scheduleName='" + scheduleName + '\'' +
                ", callbackURL='" + callbackURL + '\'' +
                '}';
    }
}
