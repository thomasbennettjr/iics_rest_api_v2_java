package com.metaopsis.icsapi.v2.dom;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Registration {
    @JsonProperty("@type")
    private final String type = "registration";
    private RegistrationOrg org;
    private RegistrationUser user;
    private String registrationCode;
    private boolean sendEmail;

    public Registration() {
    }

    public String getType() {
        return type;
    }

    public RegistrationOrg getOrg() {
        return org;
    }

    public void setOrg(RegistrationOrg org) {
        this.org = org;
    }

    public RegistrationUser getUser() {
        return user;
    }

    public void setUser(RegistrationUser user) {
        this.user = user;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public boolean isSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "type='" + type + '\'' +
                ", org=" + org +
                ", user=" + user +
                ", registrationCode='" + registrationCode + '\'' +
                ", sendEmail=" + sendEmail +
                '}';
    }
}
