package com.metaopsis.icsapi.v2.dom.di;

import java.util.Arrays;

public class ConnectorMetadata {
    private String type;
    private boolean isStandardConnType;
    private ConnectorMetadataAttribute[] attributes;

    public ConnectorMetadata() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStandardConnType() {
        return isStandardConnType;
    }

    public void setStandardConnType(boolean standardConnType) {
        isStandardConnType = standardConnType;
    }

    public ConnectorMetadataAttribute[] getAttributes() {
        return attributes;
    }

    public void setAttributes(ConnectorMetadataAttribute[] attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "ConnectorMetadata{" +
                "type='" + type + '\'' +
                ", isStandardConnType=" + isStandardConnType +
                ", attributes=" + Arrays.toString(attributes) +
                '}';
    }
}
