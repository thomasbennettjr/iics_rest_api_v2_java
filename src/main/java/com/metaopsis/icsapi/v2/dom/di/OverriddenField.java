package com.metaopsis.icsapi.v2.dom.di;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OverriddenField {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "@type", access = JsonProperty.Access.WRITE_ONLY)
    private String at_type = "";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private int precision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private int scale;

    public OverriddenField() {
    }

    public String getAt_type() {
        return at_type;
    }

    public void setAt_type(String at_type) {
        this.at_type = at_type;
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

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    @Override
    public String toString() {
        return "OverriddenField{" +
                "at_type='" + at_type + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", precision=" + precision +
                ", scale=" + scale +
                '}';
    }
}
