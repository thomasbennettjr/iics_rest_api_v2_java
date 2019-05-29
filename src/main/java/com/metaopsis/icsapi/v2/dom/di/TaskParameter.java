package com.metaopsis.icsapi.v2.dom.di;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class TaskParameter {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "@type", access = JsonProperty.Access.WRITE_ONLY)
    private String at_type = "mtTaskParameter";

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String sourceConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String targetConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String lookupConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String transfConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String midstreamConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String sourceObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String sourceObjectLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String targetObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String targetObjectLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String lookupObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String lookupObjectLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String midstreamObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String midstreamObjectLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean newObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String newObjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String operationType;

    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean newFlatFile;

    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean showBusinessNames;

    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean naturalOrder;

    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean truncateTarget;

    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean bulkApiDBTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private FlatFileAttr srcFFAttrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private FlatFileAttr tgtFFAttrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private FlatFileAttr lkpFFAttrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private FlatFileAttr flatFileAttrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private CustomFuncConfig customFuncCfg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String[] targetUpdateColumns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean isRESTModernSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean isFileList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean handleSpecialChars;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private OverriddenField[] overriddenFields;

    public TaskParameter() {
    }

    public String getAt_type() {
        return at_type;
    }

    public void setAt_type(String at_type) {
        this.at_type = at_type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSourceConnectionId() {
        return sourceConnectionId;
    }

    public void setSourceConnectionId(String sourceConnectionId) {
        this.sourceConnectionId = sourceConnectionId;
    }

    public String getTargetConnectionId() {
        return targetConnectionId;
    }

    public void setTargetConnectionId(String targetConnectionId) {
        this.targetConnectionId = targetConnectionId;
    }

    public String getLookupConnectionId() {
        return lookupConnectionId;
    }

    public void setLookupConnectionId(String lookupConnectionId) {
        this.lookupConnectionId = lookupConnectionId;
    }

    public String getTransfConnectionId() {
        return transfConnectionId;
    }

    public void setTransfConnectionId(String transfConnectionId) {
        this.transfConnectionId = transfConnectionId;
    }

    public String getMidstreamConnectionId() {
        return midstreamConnectionId;
    }

    public void setMidstreamConnectionId(String midstreamConnectionId) {
        this.midstreamConnectionId = midstreamConnectionId;
    }

    public String getSourceObject() {
        return sourceObject;
    }

    public void setSourceObject(String sourceObject) {
        this.sourceObject = sourceObject;
    }

    public String getSourceObjectLabel() {
        return sourceObjectLabel;
    }

    public void setSourceObjectLabel(String sourceObjectLabel) {
        this.sourceObjectLabel = sourceObjectLabel;
    }

    public String getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(String targetObject) {
        this.targetObject = targetObject;
    }

    public String getTargetObjectLabel() {
        return targetObjectLabel;
    }

    public void setTargetObjectLabel(String targetObjectLabel) {
        this.targetObjectLabel = targetObjectLabel;
    }

    public String getLookupObject() {
        return lookupObject;
    }

    public void setLookupObject(String lookupObject) {
        this.lookupObject = lookupObject;
    }

    public String getLookupObjectLabel() {
        return lookupObjectLabel;
    }

    public void setLookupObjectLabel(String lookupObjectLabel) {
        this.lookupObjectLabel = lookupObjectLabel;
    }

    public String getMidstreamObject() {
        return midstreamObject;
    }

    public void setMidstreamObject(String midstreamObject) {
        this.midstreamObject = midstreamObject;
    }

    public String getMidstreamObjectLabel() {
        return midstreamObjectLabel;
    }

    public void setMidstreamObjectLabel(String midstreamObjectLabel) {
        this.midstreamObjectLabel = midstreamObjectLabel;
    }

    public boolean isNewObject() {
        return newObject;
    }

    public void setNewObject(boolean newObject) {
        this.newObject = newObject;
    }

    public String getNewObjectName() {
        return newObjectName;
    }

    public void setNewObjectName(String newObjectName) {
        this.newObjectName = newObjectName;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public boolean isNewFlatFile() {
        return newFlatFile;
    }

    public void setNewFlatFile(boolean newFlatFile) {
        this.newFlatFile = newFlatFile;
    }

    public boolean isShowBusinessNames() {
        return showBusinessNames;
    }

    public void setShowBusinessNames(boolean showBusinessNames) {
        this.showBusinessNames = showBusinessNames;
    }

    public boolean isNaturalOrder() {
        return naturalOrder;
    }

    public void setNaturalOrder(boolean naturalOrder) {
        this.naturalOrder = naturalOrder;
    }

    public boolean isTruncateTarget() {
        return truncateTarget;
    }

    public void setTruncateTarget(boolean truncateTarget) {
        this.truncateTarget = truncateTarget;
    }

    public boolean isBulkApiDBTarget() {
        return bulkApiDBTarget;
    }

    public void setBulkApiDBTarget(boolean bulkApiDBTarget) {
        this.bulkApiDBTarget = bulkApiDBTarget;
    }

    public FlatFileAttr getSrcFFAttrs() {
        return srcFFAttrs;
    }

    public void setSrcFFAttrs(FlatFileAttr srcFFAttrs) {
        this.srcFFAttrs = srcFFAttrs;
    }

    public FlatFileAttr getTgtFFAttrs() {
        return tgtFFAttrs;
    }

    public void setTgtFFAttrs(FlatFileAttr tgtFFAttrs) {
        this.tgtFFAttrs = tgtFFAttrs;
    }

    public FlatFileAttr getLkpFFAttrs() {
        return lkpFFAttrs;
    }

    public void setLkpFFAttrs(FlatFileAttr lkpFFAttrs) {
        this.lkpFFAttrs = lkpFFAttrs;
    }

    public FlatFileAttr getFlatFileAttrs() {
        return flatFileAttrs;
    }

    public void setFlatFileAttrs(FlatFileAttr flatFileAttrs) {
        this.flatFileAttrs = flatFileAttrs;
    }

    public CustomFuncConfig getCustomFuncCfg() {
        return customFuncCfg;
    }

    public void setCustomFuncCfg(CustomFuncConfig customFuncCfg) {
        this.customFuncCfg = customFuncCfg;
    }

    public String[] getTargetUpdateColumns() {
        return targetUpdateColumns;
    }

    public void setTargetUpdateColumns(String[] targetUpdateColumns) {
        this.targetUpdateColumns = targetUpdateColumns;
    }

    public boolean isRESTModernSource() {
        return isRESTModernSource;
    }

    public void setRESTModernSource(boolean RESTModernSource) {
        isRESTModernSource = RESTModernSource;
    }

    public boolean isFileList() {
        return isFileList;
    }

    public void setFileList(boolean fileList) {
        isFileList = fileList;
    }

    public boolean isHandleSpecialChars() {
        return handleSpecialChars;
    }

    public void setHandleSpecialChars(boolean handleSpecialChars) {
        this.handleSpecialChars = handleSpecialChars;
    }

    public OverriddenField[] getOverriddenFields() {
        return overriddenFields;
    }

    public void setOverriddenFields(OverriddenField[] overriddenFields) {
        this.overriddenFields = overriddenFields;
    }

    @Override
    public String toString() {
        return "TaskParameter{" +
                "at_type='" + at_type + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", sourceConnectionId='" + sourceConnectionId + '\'' +
                ", targetConnectionId='" + targetConnectionId + '\'' +
                ", lookupConnectionId='" + lookupConnectionId + '\'' +
                ", transfConnectionId='" + transfConnectionId + '\'' +
                ", midstreamConnectionId='" + midstreamConnectionId + '\'' +
                ", sourceObject='" + sourceObject + '\'' +
                ", sourceObjectLabel='" + sourceObjectLabel + '\'' +
                ", targetObject='" + targetObject + '\'' +
                ", targetObjectLabel='" + targetObjectLabel + '\'' +
                ", lookupObject='" + lookupObject + '\'' +
                ", lookupObjectLabel='" + lookupObjectLabel + '\'' +
                ", midstreamObject='" + midstreamObject + '\'' +
                ", midstreamObjectLabel='" + midstreamObjectLabel + '\'' +
                ", newObject=" + newObject +
                ", newObjectName='" + newObjectName + '\'' +
                ", operationType='" + operationType + '\'' +
                ", newFlatFile=" + newFlatFile +
                ", showBusinessNames=" + showBusinessNames +
                ", naturalOrder=" + naturalOrder +
                ", truncateTarget=" + truncateTarget +
                ", bulkApiDBTarget=" + bulkApiDBTarget +
                ", srcFFAttrs=" + srcFFAttrs +
                ", tgtFFAttrs=" + tgtFFAttrs +
                ", lkpFFAttrs=" + lkpFFAttrs +
                ", flatFileAttrs=" + flatFileAttrs +
                ", customFuncCfg=" + customFuncCfg +
                ", targetUpdateColumns=" + Arrays.toString(targetUpdateColumns) +
                ", isRESTModernSource=" + isRESTModernSource +
                ", isFileList=" + isFileList +
                ", handleSpecialChars=" + handleSpecialChars +
                ", overriddenFields=" + Arrays.toString(overriddenFields) +
                '}';
    }
}
