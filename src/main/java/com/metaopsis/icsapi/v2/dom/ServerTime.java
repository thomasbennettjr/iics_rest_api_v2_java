package com.metaopsis.icsapi.v2.dom;

public class ServerTime {
    private String time;

    public ServerTime() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ServerTime{" +
                "time='" + time + '\'' +
                '}';
    }
}
