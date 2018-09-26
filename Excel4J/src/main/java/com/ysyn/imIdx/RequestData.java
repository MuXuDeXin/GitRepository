package com.ysyn.imIdx;

public class RequestData {
    private String idxId;
    private String dataDate;

    public String getIdxId() {
        return idxId;
    }

    public void setIdxId(String idxId) {
        this.idxId = idxId;
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    public RequestData() {
    }

    public RequestData(String idxId) {
        this.idxId = idxId;
    }
}
