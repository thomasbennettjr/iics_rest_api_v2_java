package com.metaopsis.icsapi.v2.dom;

public class SequenceValue {
    private String txName;
    private String nextValue;

    public SequenceValue() {
    }

    public String getTxName() {
        return txName;
    }

    public void setTxName(String txName) {
        this.txName = txName;
    }

    public String getNextValue() {
        return nextValue;
    }

    public void setNextValue(String nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public String toString() {
        return "SequenceValue{" +
                "txName='" + txName + '\'' +
                ", nextValue='" + nextValue + '\'' +
                '}';
    }
}
