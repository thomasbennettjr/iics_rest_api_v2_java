package com.metaopsis.icsapi.v2.dom;

public class TransformationEntry {
    private String txName;
    private String txType;
    private long successRows;
    private long failedRows;

    public TransformationEntry() {
    }

    public String getTxName() {
        return txName;
    }

    public void setTxName(String txName) {
        this.txName = txName;
    }

    public String getTxType() {
        return txType;
    }

    public void setTxType(String txType) {
        this.txType = txType;
    }

    public long getSuccessRows() {
        return successRows;
    }

    public void setSuccessRows(long successRows) {
        this.successRows = successRows;
    }

    public long getFailedRows() {
        return failedRows;
    }

    public void setFailedRows(long failedRows) {
        this.failedRows = failedRows;
    }

    @Override
    public String toString() {
        return "TransformationEntry{" +
                "txName='" + txName + '\'' +
                ", txType='" + txType + '\'' +
                ", successRows=" + successRows +
                ", failedRows=" + failedRows +
                '}';
    }
}
