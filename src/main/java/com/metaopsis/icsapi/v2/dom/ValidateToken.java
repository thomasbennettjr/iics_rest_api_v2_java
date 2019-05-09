package com.metaopsis.icsapi.v2.dom;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ValidateToken {
    @JsonProperty("@type")
    private final String type = "validatedToken";
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String userName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String icToken;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private int timeUntilExpire;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private boolean isValidToken;

    public ValidateToken() {
    }

    public String getType() {
        return type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIcToken() {
        return icToken;
    }

    public void setIcToken(String icToken) {
        this.icToken = icToken;
    }

    public int getTimeUntilExpire() {
        return timeUntilExpire;
    }

    public void setTimeUntilExpire(int timeUntilExpire) {
        this.timeUntilExpire = timeUntilExpire;
    }

    public boolean isValidToken() {
        return isValidToken;
    }

    public void setValidToken(boolean validToken) {
        isValidToken = validToken;
    }

    @Override
    public String toString() {
        return "ValidateToken{" +
                "type='" + type + '\'' +
                ", userName='" + userName + '\'' +
                ", icToken='" + icToken + '\'' +
                ", timeUntilExpire=" + timeUntilExpire +
                ", isValidToken=" + isValidToken +
                '}';
    }
}
