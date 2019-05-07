package com.metaopsis.icsapi.v2.dom;

import java.util.Arrays;

public class ActivityLogEntry {
    private String id;
    private TaskType type;
    private String objectId;
    private String objectName;
    private long runId;
    private String agentId;
    private String runtimeEnvironmentId;
    private String startTime;
    private String endTime;
    private String startTimeUtc;
    private String endTimeUtc;
    private String state;
    private long failedSourceRows;
    private long successSourceRows;
    private long failedTargetRows;
    private long successTargetRows;
    private String errorMsg;
    private String startedBy;
    private String runContextType;
    private String scheduleName;
    private ActivityLogEntry[] entries;
    private long totalSuccessRows;
    private long totalFailedRows;
    private boolean stopOnError;
    private boolean hasStopOnErrorRecord;
    private String contextExternalId;
    private ActivityLogEntryItem[] items;

    public ActivityLogEntry() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
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

    public long getRunId() {
        return runId;
    }

    public void setRunId(long runId) {
        this.runId = runId;
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

    public String getStartTimeUtc() {
        return startTimeUtc;
    }

    public void setStartTimeUtc(String startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
    }

    public String getEndTimeUtc() {
        return endTimeUtc;
    }

    public void setEndTimeUtc(String endTimeUtc) {
        this.endTimeUtc = endTimeUtc;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public ActivityLogEntry[] getEntries() {
        return entries;
    }

    public void setEntries(ActivityLogEntry[] entries) {
        this.entries = entries;
    }

    public long getTotalSuccessRows() {
        return totalSuccessRows;
    }

    public void setTotalSuccessRows(long totalSuccessRows) {
        this.totalSuccessRows = totalSuccessRows;
    }

    public long getTotalFailedRows() {
        return totalFailedRows;
    }

    public void setTotalFailedRows(long totalFailedRows) {
        this.totalFailedRows = totalFailedRows;
    }

    public boolean isStopOnError() {
        return stopOnError;
    }

    public void setStopOnError(boolean stopOnError) {
        this.stopOnError = stopOnError;
    }

    public boolean isHasStopOnErrorRecord() {
        return hasStopOnErrorRecord;
    }

    public void setHasStopOnErrorRecord(boolean hasStopOnErrorRecord) {
        this.hasStopOnErrorRecord = hasStopOnErrorRecord;
    }

    public String getContextExternalId() {
        return contextExternalId;
    }

    public void setContextExternalId(String contextExternalId) {
        this.contextExternalId = contextExternalId;
    }

    public ActivityLogEntryItem[] getItems() {
        return items;
    }

    public void setItems(ActivityLogEntryItem[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ActivityLogEntry{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", objectId='" + objectId + '\'' +
                ", objectName='" + objectName + '\'' +
                ", runId=" + runId +
                ", agentId='" + agentId + '\'' +
                ", runtimeEnvironmentId='" + runtimeEnvironmentId + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", startTimeUtc='" + startTimeUtc + '\'' +
                ", endTimeUtc='" + endTimeUtc + '\'' +
                ", state='" + state + '\'' +
                ", failedSourceRows=" + failedSourceRows +
                ", successSourceRows=" + successSourceRows +
                ", failedTargetRows=" + failedTargetRows +
                ", successTargetRows=" + successTargetRows +
                ", errorMsg='" + errorMsg + '\'' +
                ", startedBy='" + startedBy + '\'' +
                ", runContextType='" + runContextType + '\'' +
                ", scheduleName='" + scheduleName + '\'' +
                ", entries=" + Arrays.toString(entries) +
                ", totalSuccessRows=" + totalSuccessRows +
                ", totalFailedRows=" + totalFailedRows +
                ", stopOnError=" + stopOnError +
                ", hasStopOnErrorRecord=" + hasStopOnErrorRecord +
                ", contextExternalId='" + contextExternalId + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
