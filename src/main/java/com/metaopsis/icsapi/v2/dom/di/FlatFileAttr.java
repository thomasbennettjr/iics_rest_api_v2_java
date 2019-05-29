package com.metaopsis.icsapi.v2.dom.di;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FlatFileAttr {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "@type", access = JsonProperty.Access.WRITE_ONLY)
    private String at_type = "flatFileAttrs";

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String delimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String textQualifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String escapeChar;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private int headerLineNo;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private int firstDataRow;

    public FlatFileAttr() {
    }

    public String getAt_type() {
        return at_type;
    }

    public void setAt_type(String at_type) {
        this.at_type = at_type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getTextQualifier() {
        return textQualifier;
    }

    public void setTextQualifier(String textQualifier) {
        this.textQualifier = textQualifier;
    }

    public String getEscapeChar() {
        return escapeChar;
    }

    public void setEscapeChar(String escapeChar) {
        this.escapeChar = escapeChar;
    }

    public int getHeaderLineNo() {
        return headerLineNo;
    }

    public void setHeaderLineNo(int headerLineNo) {
        this.headerLineNo = headerLineNo;
    }

    public int getFirstDataRow() {
        return firstDataRow;
    }

    public void setFirstDataRow(int firstDataRow) {
        this.firstDataRow = firstDataRow;
    }

    @Override
    public String toString() {
        return "FlatFileAttr{" +
                "at_type='" + at_type + '\'' +
                ", id=" + id +
                ", delimiter='" + delimiter + '\'' +
                ", textQualifier='" + textQualifier + '\'' +
                ", escapeChar='" + escapeChar + '\'' +
                ", headerLineNo=" + headerLineNo +
                ", firstDataRow=" + firstDataRow +
                '}';
    }
}
