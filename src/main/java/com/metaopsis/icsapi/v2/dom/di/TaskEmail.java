package com.metaopsis.icsapi.v2.dom.di;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskEmail {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String emails;

    public TaskEmail() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "TaskEmail{" +
                "id='" + id + '\'' +
                ", emails='" + emails + '\'' +
                '}';
    }
}
