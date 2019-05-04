package com.metaopsis.icsapi.v2.dom;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Credentials {
    @JsonProperty("@type")
    private String type = "login";
    private String username;
    private String password;

    public Credentials() {
    }

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setType(CredentialType type)
    {
        switch (type)
        {
            case Login:
                this.type = "login";
                break;
            case Logout:
                this.type = "logout";
                break;
        }
    }

    public String getType() {
        return type;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "type='" + type + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
