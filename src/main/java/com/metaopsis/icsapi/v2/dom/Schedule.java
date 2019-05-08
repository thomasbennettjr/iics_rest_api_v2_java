package com.metaopsis.icsapi.v2.dom;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Schedule {
    @JsonProperty("@type")
    private final String type = "schedule";
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String id = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String orgId = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String name = null;
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String createTime = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String updateTime = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String createdBy = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String updatedBy = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String startTime = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String startTimUTC = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String endTime = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private Interval interval = null;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private int frequency;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String rangeStartTime = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String rangeEndTime = null;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean sun;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean mon;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean tue;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean wed;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean thu;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean fri;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean sat;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private boolean weekDay;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private int dayOfMonth;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private WeekOfMonth weekOfMonth = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private DayOfWeek dayOfWeek = null;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private TimeZone timeZone = null;

    public Schedule() {
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTimUTC() {
        return startTimUTC;
    }

    public void setStartTimUTC(String startTimUTC) {
        this.startTimUTC = startTimUTC;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getRangeStartTime() {
        return rangeStartTime;
    }

    public void setRangeStartTime(String rangeStartTime) {
        this.rangeStartTime = rangeStartTime;
    }

    public String getRangeEndTime() {
        return rangeEndTime;
    }

    public void setRangeEndTime(String rangeEndTime) {
        this.rangeEndTime = rangeEndTime;
    }

    public boolean isSun() {
        return sun;
    }

    public void setSun(boolean sun) {
        this.sun = sun;
    }

    public boolean isMon() {
        return mon;
    }

    public void setMon(boolean mon) {
        this.mon = mon;
    }

    public boolean isTue() {
        return tue;
    }

    public void setTue(boolean tue) {
        this.tue = tue;
    }

    public boolean isWed() {
        return wed;
    }

    public void setWed(boolean wed) {
        this.wed = wed;
    }

    public boolean isThu() {
        return thu;
    }

    public void setThu(boolean thu) {
        this.thu = thu;
    }

    public boolean isFri() {
        return fri;
    }

    public void setFri(boolean fri) {
        this.fri = fri;
    }

    public boolean isSat() {
        return sat;
    }

    public void setSat(boolean sat) {
        this.sat = sat;
    }

    public boolean isWeekDay() {
        return weekDay;
    }

    public void setWeekDay(boolean weekDay) {
        this.weekDay = weekDay;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public WeekOfMonth getWeekOfMonth() {
        return weekOfMonth;
    }

    public void setWeekOfMonth(WeekOfMonth weekOfMonth) {
        this.weekOfMonth = weekOfMonth;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", orgId='" + orgId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", startTime='" + startTime + '\'' +
                ", startTimUTC='" + startTimUTC + '\'' +
                ", endTime='" + endTime + '\'' +
                ", interval=" + interval +
                ", frequency=" + frequency +
                ", rangeStartTime='" + rangeStartTime + '\'' +
                ", rangeEndTime='" + rangeEndTime + '\'' +
                ", sun=" + sun +
                ", mon=" + mon +
                ", tue=" + tue +
                ", wed=" + wed +
                ", thu=" + thu +
                ", fri=" + fri +
                ", sat=" + sat +
                ", weekDay=" + weekDay +
                ", dayOfMonth=" + dayOfMonth +
                ", weekOfMonth=" + weekOfMonth +
                ", dayOfWeek=" + dayOfWeek +
                ", timeZone=" + timeZone +
                '}';
    }
}
