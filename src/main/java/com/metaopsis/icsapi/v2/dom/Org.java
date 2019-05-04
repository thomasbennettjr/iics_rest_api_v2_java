package com.metaopsis.icsapi.v2.dom;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class Org {
    @JsonProperty("@type")
    private final String type = "org";
    private String id;
    private String orgId;
    private String name;
    private String description;
    private String createTime;
    private String updateTime;
    private String createdBy;
    private String updatedBy;
    private String parentOrgId;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private StateCode state;
    private String zipcode;
    private TimeZone timezone;
    private CountryCode country;
    private Employees employees;
    private String offerCode;
    private String successEmails;
    private String warningEmails;
    private String errorEmails;
    private String campaignCode;
    private String atlasProjectId;
    private String zuoraAccountId;
    private String spiUrl;
    private boolean devOrg;
    private int maxLogRows;
    private int minPasswordLength;
    private int minPasswordCharMix;
    private int passwordReuseInDays;
    private int passwordExpirationInDays;
    private int subOrgLimit;
    private int restApiSessionLlimit;
    private String jobExecUserProfile;
    private String orgUUID;
    private SubOrg[] subOrgs;

    public Org() {
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

    public String getParentOrgId() {
        return parentOrgId;
    }

    public void setParentOrgId(String parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public StateCode getState() {
        return state;
    }

    public void setState(StateCode state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public TimeZone getTimezone() {
        return timezone;
    }

    public void setTimezone(TimeZone timezone) {
        this.timezone = timezone;
    }

    public CountryCode getCountry() {
        return country;
    }

    public void setCountry(CountryCode country) {
        this.country = country;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public String getOfferCode() {
        return offerCode;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public String getSuccessEmails() {
        return successEmails;
    }

    public void setSuccessEmails(String successEmails) {
        this.successEmails = successEmails;
    }

    public String getWarningEmails() {
        return warningEmails;
    }

    public void setWarningEmails(String warningEmails) {
        this.warningEmails = warningEmails;
    }

    public String getErrorEmails() {
        return errorEmails;
    }

    public void setErrorEmails(String errorEmails) {
        this.errorEmails = errorEmails;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public String getAtlasProjectId() {
        return atlasProjectId;
    }

    public void setAtlasProjectId(String atlasProjectId) {
        this.atlasProjectId = atlasProjectId;
    }

    public String getZuoraAccountId() {
        return zuoraAccountId;
    }

    public void setZuoraAccountId(String zuoraAccountId) {
        this.zuoraAccountId = zuoraAccountId;
    }

    public String getSpiUrl() {
        return spiUrl;
    }

    public void setSpiUrl(String spiUrl) {
        this.spiUrl = spiUrl;
    }

    public boolean isDevOrg() {
        return devOrg;
    }

    public void setDevOrg(boolean devOrg) {
        this.devOrg = devOrg;
    }

    public int getMaxLogRows() {
        return maxLogRows;
    }

    public void setMaxLogRows(int maxLogRows) {
        this.maxLogRows = maxLogRows;
    }

    public int getMinPasswordLength() {
        return minPasswordLength;
    }

    public void setMinPasswordLength(int minPasswordLength) {
        this.minPasswordLength = minPasswordLength;
    }

    public int getMinPasswordCharMix() {
        return minPasswordCharMix;
    }

    public void setMinPasswordCharMix(int minPasswordCharMix) {
        this.minPasswordCharMix = minPasswordCharMix;
    }

    public int getPasswordReuseInDays() {
        return passwordReuseInDays;
    }

    public void setPasswordReuseInDays(int passwordReuseInDays) {
        this.passwordReuseInDays = passwordReuseInDays;
    }

    public int getPasswordExpirationInDays() {
        return passwordExpirationInDays;
    }

    public void setPasswordExpirationInDays(int passwordExpirationInDays) {
        this.passwordExpirationInDays = passwordExpirationInDays;
    }

    public int getSubOrgLimit() {
        return subOrgLimit;
    }

    public void setSubOrgLimit(int subOrgLimit) {
        this.subOrgLimit = subOrgLimit;
    }

    public int getRestApiSessionLlimit() {
        return restApiSessionLlimit;
    }

    public void setRestApiSessionLlimit(int restApiSessionLlimit) {
        this.restApiSessionLlimit = restApiSessionLlimit;
    }

    public String getJobExecUserProfile() {
        return jobExecUserProfile;
    }

    public void setJobExecUserProfile(String jobExecUserProfile) {
        this.jobExecUserProfile = jobExecUserProfile;
    }

    public String getOrgUUID() {
        return orgUUID;
    }

    public void setOrgUUID(String orgUUID) {
        this.orgUUID = orgUUID;
    }

    public SubOrg[] getSubOrgs() {
        return subOrgs;
    }

    public void setSubOrgs(SubOrg[] subOrgs) {
        this.subOrgs = subOrgs;
    }

    @Override
    public String toString() {
        return "Org{" +
                "id='" + id + '\'' +
                ", orgId='" + orgId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", parentOrgId='" + parentOrgId + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zipcode='" + zipcode + '\'' +
                ", timezone=" + timezone +
                ", country=" + country +
                ", employees='" + employees + '\'' +
                ", offerCode='" + offerCode + '\'' +
                ", successEmails='" + successEmails + '\'' +
                ", warningEmails='" + warningEmails + '\'' +
                ", errorEmails='" + errorEmails + '\'' +
                ", campaignCode='" + campaignCode + '\'' +
                ", atlasProjectId='" + atlasProjectId + '\'' +
                ", zuoraAccountId='" + zuoraAccountId + '\'' +
                ", spiUrl='" + spiUrl + '\'' +
                ", devOrg=" + devOrg +
                ", maxLogRows=" + maxLogRows +
                ", minPasswordLength=" + minPasswordLength +
                ", minPasswordCharMix=" + minPasswordCharMix +
                ", passwordReuseInDays=" + passwordReuseInDays +
                ", passwordExpirationInDays=" + passwordExpirationInDays +
                ", subOrgLimit=" + subOrgLimit +
                ", restApiSessionLlimit=" + restApiSessionLlimit +
                ", jobExecUserProfile='" + jobExecUserProfile + '\'' +
                ", orgUUID='" + orgUUID + '\'' +
                ", subOrgs=" + Arrays.toString(subOrgs) +
                '}';
    }
}
