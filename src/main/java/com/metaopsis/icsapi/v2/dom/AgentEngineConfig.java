package com.metaopsis.icsapi.v2.dom;

public class AgentEngineConfig {
    private String type;
    private String name;
    private String value;
    private String platform;
    private boolean customized;

    public AgentEngineConfig() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isCustomized() {
        return customized;
    }

    public void setCustomized(boolean customized) {
        this.customized = customized;
    }

    @Override
    public String toString() {
        return "AgentEngineConfig{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", platform='" + platform + '\'' +
                ", customized=" + customized +
                '}';
    }
}
