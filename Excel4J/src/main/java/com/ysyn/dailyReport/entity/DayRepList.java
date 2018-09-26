package com.ysyn.dailyReport.entity;

/**
 * 日报报表实体 按照excel自身的列名称来定义实体
 */
public class DayRepList {
    //主键
    private String id;
    //公司ID
    private String orgNo;
    // 风电场ID
    private String stationNo;

    // 公司
    private String a;

    // 风电场
    private String b;

    // 风机型号
    private String c;

    // 装机容量
    private String d;

    // 并网容量
    private String e;

    // 风机运行台数
    private String f;

    // 停机台数
    private String g;

    // 天气情况
    private String h;

    // 平均风速
    private String i;

    // 日上网电量
    private String j;

    // 日限电损失
    private String k;

    // 月计划上网电量
    private String l;

    // 月累计上网电量
    private String m;

    // 月计划电量完成率
    private String n;

    // 年计划上网电量
    private String o;

    // 年累计上网电量
    private String p;

    // 年计划电量完成率
    private String q;

    // 年利用小时数
    private String r;

    // 当日故障损失
    private String s;

    // 月累计故障损失
    private String t;

    // 年累计故障损失
    private String u;

    // 月限电损失
    private String v;

    // 年限电损失
    private String w;

    // 日限电率
    private String x;

    // 月限电率
    private String y;

    // 年限电率
    private String z;

    // 月平均风速
    private String aa;

    // 年平均风速
    private String ab;

    //文件名称
    private String fileName;

    // 行号
    private Double sheetLineNo;

    // 日期
    private String dayDate;

    // 报表名称
    private String repTypeName;

    // 报表类型
    private String repType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getStationNo() {
        return stationNo;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getAb() {
        return ab;
    }

    public void setAb(String ab) {
        this.ab = ab;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Double getSheetLineNo() {
        return sheetLineNo;
    }

    public void setSheetLineNo(Double sheetLineNo) {
        this.sheetLineNo = sheetLineNo;
    }

    public String getDayDate() {
        return dayDate;
    }

    public void setDayDate(String dayDate) {
        this.dayDate = dayDate;
    }

    public String getRepTypeName() {
        return repTypeName;
    }

    public void setRepTypeName(String repTypeName) {
        this.repTypeName = repTypeName;
    }

    public String getRepType() {
        return repType;
    }

    public void setRepType(String repType) {
        this.repType = repType;
    }

    @Override
    public String toString() {
        return "DayRepList{" +
                "id='" + id + '\'' +
                ", orgNo='" + orgNo + '\'' +
                ", stationNo='" + stationNo + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", e='" + e + '\'' +
                ", f='" + f + '\'' +
                ", g='" + g + '\'' +
                ", h='" + h + '\'' +
                ", i='" + i + '\'' +
                ", j='" + j + '\'' +
                ", k='" + k + '\'' +
                ", l='" + l + '\'' +
                ", m='" + m + '\'' +
                ", n='" + n + '\'' +
                ", o='" + o + '\'' +
                ", p='" + p + '\'' +
                ", q='" + q + '\'' +
                ", r='" + r + '\'' +
                ", s='" + s + '\'' +
                ", t='" + t + '\'' +
                ", u='" + u + '\'' +
                ", v='" + v + '\'' +
                ", w='" + w + '\'' +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", z='" + z + '\'' +
                ", aa='" + aa + '\'' +
                ", ab='" + ab + '\'' +
                ", fileName='" + fileName + '\'' +
                ", sheetLineNo=" + sheetLineNo +
                ", dayDate='" + dayDate + '\'' +
                ", repTypeName='" + repTypeName + '\'' +
                ", repType='" + repType + '\'' +
                '}';
    }
}
