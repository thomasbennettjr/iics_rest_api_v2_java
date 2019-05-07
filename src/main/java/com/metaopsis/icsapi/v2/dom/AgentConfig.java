package com.metaopsis.icsapi.v2.dom;

public class AgentConfig {
    private String name;
    private String type;
    private String subtype;
    private String value;
    private boolean customized;
    private boolean overridden;
    private String defaultValue;
    private String platform;

    public AgentConfig() {
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isCustomized() {
        return customized;
    }

    public void setCustomized(boolean customized) {
        this.customized = customized;
    }

    public boolean isOverridden() {
        return overridden;
    }

    public void setOverridden(boolean overridden) {
        this.overridden = overridden;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "AgentConfig{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", value='" + value + '\'' +
                ", customized=" + customized +
                ", overridden=" + overridden +
                ", defaultValue='" + defaultValue + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }
}
