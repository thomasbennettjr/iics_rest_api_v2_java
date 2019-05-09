package com.metaopsis.icsapi.v2.dom;

public class ErrorObject {
    private String code;
    private String description;
    private int statusCode;

    public ErrorObject() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "ErrorObject{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", statusCode=" + statusCode +
                '}';
    }
}
