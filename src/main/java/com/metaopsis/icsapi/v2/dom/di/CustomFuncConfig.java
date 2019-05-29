package com.metaopsis.icsapi.v2.dom.di;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class CustomFuncConfig {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "@type", access = JsonProperty.Access.WRITE_ONLY)
    private String at_type = "customFuncConfig";

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private CustomFuncConnection[] connections;

    public CustomFuncConfig() {
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

    public CustomFuncConnection[] getConnections() {
        return connections;
    }

    public void setConnections(CustomFuncConnection[] connections) {
        this.connections = connections;
    }

    @Override
    public String toString() {
        return "CustomFuncConfig{" +
                "at_type='" + at_type + '\'' +
                ", id=" + id +
                ", connections=" + Arrays.toString(connections) +
                '}';
    }
}
