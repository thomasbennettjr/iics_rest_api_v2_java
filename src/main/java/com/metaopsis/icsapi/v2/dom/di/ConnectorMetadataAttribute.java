package com.metaopsis.icsapi.v2.dom.di;

import java.util.Arrays;

public class ConnectorMetadataAttribute {
    private String name;
    private String label;
    private String id;
    private String value;
    private int type;
    private boolean isMandatory;
    private boolean visible;
    private String[] list;

    public ConnectorMetadataAttribute() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isMandatory() {
        return isMandatory;
    }

    public void setMandatory(boolean mandatory) {
        isMandatory = mandatory;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ConnectorMetadataAttribute{" +
                "name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", id='" + id + '\'' +
                ", value='" + value + '\'' +
                ", type=" + type +
                ", isMandatory=" + isMandatory +
                ", visible=" + visible +
                ", list=" + Arrays.toString(list) +
                '}';
    }
}
