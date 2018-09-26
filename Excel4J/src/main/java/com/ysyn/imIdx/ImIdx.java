package com.ysyn.imIdx;

public class ImIdx {
    private String idxId;
    private String idxCode;
    private String idxName;

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

    public String getIdxName() {
        return idxName;
    }

    public void setIdxName(String idxName) {
        this.idxName = idxName;
    }

    @Override
    public String toString() {
        return "ImIdx{" +
                "idxId='" + idxId + '\'' +
                ", idxCode='" + idxCode + '\'' +
                ", idxName='" + idxName + '\'' +
                '}';
    }
}
