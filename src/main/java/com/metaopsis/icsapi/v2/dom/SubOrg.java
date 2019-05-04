package com.metaopsis.icsapi.v2.dom;

public class SubOrg {
    private String id;
    private String name;

    public SubOrg() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SubOrg{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
