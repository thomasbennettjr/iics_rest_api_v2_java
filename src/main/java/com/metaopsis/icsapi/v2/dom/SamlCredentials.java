package com.metaopsis.icsapi.v2.dom;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SamlCredentials {
    @JsonProperty("@type")
    private String type = "login";
    private String samlToken;
    private String orgId;

    public SamlCredentials() {
    }

    public String getType() {
        return type;
    }

    public String getSamlToken() {
        return samlToken;
    }

    public void setSamlToken(String samlToken) {
        this.samlToken = samlToken;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Override
    public String toString() {
        return "SamlCredentials{" +
                "type='" + type + '\'' +
                ", samlToken='" + samlToken + '\'' +
                ", orgId='" + orgId + '\'' +
                '}';
    }
}
