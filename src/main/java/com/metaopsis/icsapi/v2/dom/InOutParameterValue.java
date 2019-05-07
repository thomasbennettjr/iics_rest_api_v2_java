package com.metaopsis.icsapi.v2.dom;

public class InOutParameterValue {
    private String name;
    private String value;

    public InOutParameterValue() {
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

    @Override
    public String toString() {
        return "InOutParameterValue{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
