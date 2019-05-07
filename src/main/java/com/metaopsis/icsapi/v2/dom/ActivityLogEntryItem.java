package com.metaopsis.icsapi.v2.dom;

import java.util.Arrays;

public class ActivityLogEntryItem {
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
    private String orgId;
    private long totalSuccessRows;
    private long totalFailedRows;
    private String logFilename;
    private String errorFilename;
    private String errorFileDir;
    private String connType;
    private boolean stopOnError;
    private ActivityLogEntryItem[] children;
    private TransformationEntry[] transformationEntries;
    private SequenceValue[] sequenceValues;
    private InOutParameterValue[] inOutParameterValues;

    public ActivityLogEntryItem() {
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

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
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

    public String getLogFilename() {
        return logFilename;
    }

    public void setLogFilename(String logFilename) {
        this.logFilename = logFilename;
    }

    public String getErrorFilename() {
        return errorFilename;
    }

    public void setErrorFilename(String errorFilename) {
        this.errorFilename = errorFilename;
    }

    public String getErrorFileDir() {
        return errorFileDir;
    }

    public void setErrorFileDir(String errorFileDir) {
        this.errorFileDir = errorFileDir;
    }

    public String getConnType() {
        return connType;
    }

    public void setConnType(String connType) {
        this.connType = connType;
    }

    public boolean isStopOnError() {
        return stopOnError;
    }

    public void setStopOnError(boolean stopOnError) {
        this.stopOnError = stopOnError;
    }

    public ActivityLogEntryItem[] getChildren() {
        return children;
    }

    public void setChildren(ActivityLogEntryItem[] children) {
        this.children = children;
    }

    public TransformationEntry[] getTransformationEntries() {
        return transformationEntries;
    }

    public void setTransformationEntries(TransformationEntry[] transformationEntries) {
        this.transformationEntries = transformationEntries;
    }

    public SequenceValue[] getSequenceValues() {
        return sequenceValues;
    }

    public void setSequenceValues(SequenceValue[] sequenceValues) {
        this.sequenceValues = sequenceValues;
    }

    public InOutParameterValue[] getInOutParameterValues() {
        return inOutParameterValues;
    }

    public void setInOutParameterValues(InOutParameterValue[] inOutParameterValues) {
        this.inOutParameterValues = inOutParameterValues;
    }

    @Override
    public String toString() {
        return "ActivityLogEntryItem{" +
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
                ", orgId='" + orgId + '\'' +
                ", totalSuccessRows=" + totalSuccessRows +
                ", totalFailedRows=" + totalFailedRows +
                ", logFilename='" + logFilename + '\'' +
                ", errorFilename='" + errorFilename + '\'' +
                ", errorFileDir='" + errorFileDir + '\'' +
                ", connType='" + connType + '\'' +
                ", stopOnError=" + stopOnError +
                ", children=" + Arrays.toString(children) +
                ", transformationEntries=" + Arrays.toString(transformationEntries) +
                ", sequenceValues=" + Arrays.toString(sequenceValues) +
                ", inOutParameterValues=" + Arrays.toString(inOutParameterValues) +
                '}';
    }
}
