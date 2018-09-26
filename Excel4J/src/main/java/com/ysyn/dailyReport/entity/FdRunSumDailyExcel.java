package com.ysyn.dailyReport.entity;

import com.ysyn.crab2died.annotation.ExcelField;

/**
 * 风电运行汇总日报excel实体
 */
public class FdRunSumDailyExcel {
    // 公司
    @ExcelField(title = "公司", order = 1)
    private String company;

    // 风电场
    @ExcelField(title = "风电场", order = 2)
    private String station;

    // 风机型号
    @ExcelField(title = "风机型号", order = 3)
    private String machine;

    // 装机容量
    @ExcelField(title = "装机容量\n" + "(万千瓦)", order = 4)
    private String installedCapacity;

    // 并网容量
    @ExcelField(title = "并网容量\n" + "（万千瓦）", order = 5)
    private String gridCapacity;

    // 风机运行台数
    @ExcelField(title = "风机运行台数", order = 6)
    private String runningMachine;

    // 停机台数
    @ExcelField(title = "停机台数", order = 7)
    private String shutdownMachine;

    // 天气情况
    @ExcelField(title = "天气情况", order = 8)
    private String weather;

    // 平均风速
    @ExcelField(title = "平均风速\n" + "(m/s)", order = 9)
    private String value1;

    // 日上网电量
    @ExcelField(title = "日上网电量\n" + "(万kWh)", order = 10)
    private String dailyOnLineElectr;

    // 日限电损失
    @ExcelField(title = "日限电损失\n" + "(万kWh)", order = 11)
    private String dailyLossOfElectr;

    // 月计划上网电量
    @ExcelField(title = "月计划上网电量\n" + "(万kWh)", order = 12)
    private String monPlanOnlineElectr;

    // 月累计上网电量
    @ExcelField(title = "月累计上网电量\n" + "(万kWh)", order = 13)
    private String monAccOnlineElectr;

    // 月计划电量完成率
    @ExcelField(title = "月计划电量完成率", order = 14)
    private String monPlanComrate;

    // 年计划上网电量
    @ExcelField(title = "年计划上网电量\n" + "(万kWh)", order = 15)
    private String annPlanOnlineElectr;

    // 年累计上网电量
    @ExcelField(title = "年累计上网电量\n" + "(万kWh)", order =16)
    private String yearAcOnlineElectr;

    // 年计划电量完成率
    @ExcelField(title = "年计划电量完成率", order = 17)
    private String annPlanComrate;

    // 年利用小时数
    @ExcelField(title = "年利用小时数\n" + "(小时)", order = 18)
    private String annutilizationHours;

    // 当日故障损失
    @ExcelField(title = "当日故障损失\n" + "(万kWh)", order = 19)
    private String dailyLossElectr;

    // 月累计故障损失
    @ExcelField(title = "月累计故障损失\n" + "(万kWh)", order = 20)
    private String monAccFailureLoss;

    // 年累计故障损失
    @ExcelField(title = "年累计故障损失\n" + "(万kWh)", order = 21)
    private String annAccFailureLoss;

    // 月限电损失
    @ExcelField(title = "月限电损失\n" + "(万kWh)", order = 22)
    private String monElectrLoss;

    // 年限电损失
    @ExcelField(title = "年限电损失\n" + "(万kWh)", order = 23)
    private String yearsElectrLoss;

    // 日限电率
    @ExcelField(title = "日限电率", order = 24)
    private String dailyElectrRate;

    // 月限电率
    @ExcelField(title = "月限电率", order = 25)
    private String monElectrRate;

    // 年限电率
    @ExcelField(title = "年限电率", order = 26)
    private String yearElectrRate;

    // 月平均风速
    @ExcelField(title = "月平均风速\n" + "(m/s)", order = 27)
    private String value2;

    // 年平均风速
    @ExcelField(title = "年平均风速\n" + "(m/s)", order = 28)
    private String value3;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getInstalledCapacity() {
        return installedCapacity;
    }

    public void setInstalledCapacity(String installedCapacity) {
        this.installedCapacity = installedCapacity;
    }

    public String getGridCapacity() {
        return gridCapacity;
    }

    public void setGridCapacity(String gridCapacity) {
        this.gridCapacity = gridCapacity;
    }

    public String getRunningMachine() {
        return runningMachine;
    }

    public void setRunningMachine(String runningMachine) {
        this.runningMachine = runningMachine;
    }

    public String getShutdownMachine() {
        return shutdownMachine;
    }

    public void setShutdownMachine(String shutdownMachine) {
        this.shutdownMachine = shutdownMachine;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getDailyOnLineElectr() {
        return dailyOnLineElectr;
    }

    public void setDailyOnLineElectr(String dailyOnLineElectr) {
        this.dailyOnLineElectr = dailyOnLineElectr;
    }

    public String getDailyLossOfElectr() {
        return dailyLossOfElectr;
    }

    public void setDailyLossOfElectr(String dailyLossOfElectr) {
        this.dailyLossOfElectr = dailyLossOfElectr;
    }

    public String getMonPlanOnlineElectr() {
        return monPlanOnlineElectr;
    }

    public void setMonPlanOnlineElectr(String monPlanOnlineElectr) {
        this.monPlanOnlineElectr = monPlanOnlineElectr;
    }

    public String getMonAccOnlineElectr() {
        return monAccOnlineElectr;
    }

    public void setMonAccOnlineElectr(String monAccOnlineElectr) {
        this.monAccOnlineElectr = monAccOnlineElectr;
    }

    public String getMonPlanComrate() {
        return monPlanComrate;
    }

    public void setMonPlanComrate(String monPlanComrate) {
        this.monPlanComrate = monPlanComrate;
    }

    public String getAnnPlanOnlineElectr() {
        return annPlanOnlineElectr;
    }

    public void setAnnPlanOnlineElectr(String annPlanOnlineElectr) {
        this.annPlanOnlineElectr = annPlanOnlineElectr;
    }

    public String getYearAcOnlineElectr() {
        return yearAcOnlineElectr;
    }

    public void setYearAcOnlineElectr(String yearAcOnlineElectr) {
        this.yearAcOnlineElectr = yearAcOnlineElectr;
    }

    public String getAnnPlanComrate() {
        return annPlanComrate;
    }

    public void setAnnPlanComrate(String annPlanComrate) {
        this.annPlanComrate = annPlanComrate;
    }

    public String getAnnutilizationHours() {
        return annutilizationHours;
    }

    public void setAnnutilizationHours(String annutilizationHours) {
        this.annutilizationHours = annutilizationHours;
    }

    public String getDailyLossElectr() {
        return dailyLossElectr;
    }

    public void setDailyLossElectr(String dailyLossElectr) {
        this.dailyLossElectr = dailyLossElectr;
    }

    public String getMonAccFailureLoss() {
        return monAccFailureLoss;
    }

    public void setMonAccFailureLoss(String monAccFailureLoss) {
        this.monAccFailureLoss = monAccFailureLoss;
    }

    public String getAnnAccFailureLoss() {
        return annAccFailureLoss;
    }

    public void setAnnAccFailureLoss(String annAccFailureLoss) {
        this.annAccFailureLoss = annAccFailureLoss;
    }

    public String getMonElectrLoss() {
        return monElectrLoss;
    }

    public void setMonElectrLoss(String monElectrLoss) {
        this.monElectrLoss = monElectrLoss;
    }

    public String getYearsElectrLoss() {
        return yearsElectrLoss;
    }

    public void setYearsElectrLoss(String yearsElectrLoss) {
        this.yearsElectrLoss = yearsElectrLoss;
    }

    public String getDailyElectrRate() {
        return dailyElectrRate;
    }

    public void setDailyElectrRate(String dailyElectrRate) {
        this.dailyElectrRate = dailyElectrRate;
    }

    public String getMonElectrRate() {
        return monElectrRate;
    }

    public void setMonElectrRate(String monElectrRate) {
        this.monElectrRate = monElectrRate;
    }

    public String getYearElectrRate() {
        return yearElectrRate;
    }

    public void setYearElectrRate(String yearElectrRate) {
        this.yearElectrRate = yearElectrRate;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    @Override
    public String toString() {
        return "DayRepList{" +
                ", company='" + company + '\'' +
                ", station='" + station + '\'' +
                ", machine='" + machine + '\'' +
                ", installedCapacity='" + installedCapacity + '\'' +
                ", gridCapacity='" + gridCapacity + '\'' +
                ", runningMachine='" + runningMachine + '\'' +
                ", shutdownMachine='" + shutdownMachine + '\'' +
                ", weather='" + weather + '\'' +
                ", value1='" + value1 + '\'' +
                ", dailyOnLineElectr='" + dailyOnLineElectr + '\'' +
                ", dailyLossOfElectr='" + dailyLossOfElectr + '\'' +
                ", monPlanOnlineElectr='" + monPlanOnlineElectr + '\'' +
                ", monAccOnlineElectr='" + monAccOnlineElectr + '\'' +
                ", monPlanComrate='" + monPlanComrate + '\'' +
                ", annPlanOnlineElectr='" + annPlanOnlineElectr + '\'' +
                ", yearAcOnlineElectr='" + yearAcOnlineElectr + '\'' +
                ", annPlanComrate='" + annPlanComrate + '\'' +
                ", annutilizationHours='" + annutilizationHours + '\'' +
                ", dailyLossElectr='" + dailyLossElectr + '\'' +
                ", monAccFailureLoss='" + monAccFailureLoss + '\'' +
                ", annAccFailureLoss='" + annAccFailureLoss + '\'' +
                ", monElectrLoss='" + monElectrLoss + '\'' +
                ", yearsElectrLoss='" + yearsElectrLoss + '\'' +
                ", dailyElectrRate='" + dailyElectrRate + '\'' +
                ", monElectrRate='" + monElectrRate + '\'' +
                ", yearElectrRate='" + yearElectrRate + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                '}';
    }
}
