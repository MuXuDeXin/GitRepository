package com.ysyn.imIdx;

public class ImIdxData {
    private String idxDataId;
    private String orgNo;
    private String idxId;
    private String idxCode;
    private String period;
    private String statCycle;
    private String dimCode1;
    private String dimValId1;
    private String dimValCode1;
    private Double dataValue;

    public String getIdxDataId() {
        return idxDataId;
    }

    public void setIdxDataId(String idxDataId) {
        this.idxDataId = idxDataId;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getIdxId() {
        return idxId;
    }

    public void setIdxId(String idxId) {
        this.idxId = idxId;
    }

    public String getIdxCode() {
        return idxCode;
    }

    public void setIdxCode(String idxCode) {
        this.idxCode = idxCode;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getStatCycle() {
        return statCycle;
    }

    public void setStatCycle(String statCycle) {
        this.statCycle = statCycle;
    }

    public String getDimCode1() {
        return dimCode1;
    }

    public void setDimCode1(String dimCode1) {
        this.dimCode1 = dimCode1;
    }

    public String getDimValId1() {
        return dimValId1;
    }

    public void setDimValId1(String dimValId1) {
        this.dimValId1 = dimValId1;
    }

    public String getDimValCode1() {
        return dimValCode1;
    }

    public void setDimValCode1(String dimValCode1) {
        this.dimValCode1 = dimValCode1;
    }

    public Double getDataValue() {
        return dataValue;
    }

    public void setDataValue(Double dataValue) {
        this.dataValue = dataValue;
    }

    @Override
    public String toString() {
        return "ImIdxData{" +
                "idxDataId='" + idxDataId + '\'' +
                ", orgNo='" + orgNo + '\'' +
                ", idxId='" + idxId + '\'' +
                ", idxCode='" + idxCode + '\'' +
                ", period='" + period + '\'' +
                ", statCycle='" + statCycle + '\'' +
                ", dimCode1='" + dimCode1 + '\'' +
                ", dimValId1='" + dimValId1 + '\'' +
                ", dimValCode1='" + dimValCode1 + '\'' +
                ", dataValue=" + dataValue +
                '}';
    }
}
