package com.ysyn.publicBusiness;

import com.ysyn.dailyReport.entity.GfRunSumDailyExcel;
import com.ysyn.dailyReport.entity.DayRepList;
import com.ysyn.dailyReport.entity.FdRunSumDailyExcel;
import com.ysyn.dailyReport.entity.SdRunSumDailyExcel;

/**
 * 汇总日报 excel实体 与 数据库实体转换
 */
public class RemoveRunSumDailyEmpty {
    public static DayRepList fdRunSumDailyRemoveEmpty(FdRunSumDailyExcel fdRunSumDailyExcel) {
        DayRepList fdDayRepList = new DayRepList();
        // 公司
        if (fdRunSumDailyExcel.getCompany() == null || fdRunSumDailyExcel.getCompany().equals("")){
            fdDayRepList.setA("");
        }else{
            fdDayRepList.setA(fdRunSumDailyExcel.getCompany());
        }
        // 风电场
        if (fdRunSumDailyExcel.getStation() == null || fdRunSumDailyExcel.getStation().equals("")) {
            fdDayRepList.setB("");
        }else{
            fdDayRepList.setB(fdRunSumDailyExcel.getStation());
        }
        // 风机型号
        if (fdRunSumDailyExcel.getMachine() == null || fdRunSumDailyExcel.getMachine().equals("")) {
            fdDayRepList.setC("");
        }else{
            fdDayRepList.setC(fdRunSumDailyExcel.getMachine());
        }
        // 装机容量
        if (fdRunSumDailyExcel.getInstalledCapacity() == null || fdRunSumDailyExcel.getInstalledCapacity().equals("")){
            fdDayRepList.setD("0.0");
        }else{
            fdDayRepList.setD(fdRunSumDailyExcel.getInstalledCapacity().replace(",","").replace("，",""));
        }

        // 并网容量
        if (fdRunSumDailyExcel.getGridCapacity() == null || fdRunSumDailyExcel.getGridCapacity().equals("")){
            fdDayRepList.setE("0.0");
        }else{
            fdDayRepList.setE(fdRunSumDailyExcel.getGridCapacity().replace(",","").replace("，",""));
        }

        // 风机运行台数
        if (fdRunSumDailyExcel.getRunningMachine() == null || fdRunSumDailyExcel.getRunningMachine().equals("")){
            fdDayRepList.setF("0.0");
        }else {
            fdDayRepList.setF(fdRunSumDailyExcel.getRunningMachine().replace(",","").replace("，",""));
        }

        // 停机台数
        if (fdRunSumDailyExcel.getShutdownMachine() == null || fdRunSumDailyExcel.getShutdownMachine().equals("")){
            fdDayRepList.setG("0.0");
        }else{
            fdDayRepList.setG(fdRunSumDailyExcel.getShutdownMachine().replace(",","").replace("，",""));
        }

        // 天气情况
        if (fdRunSumDailyExcel.getWeather() == null || fdRunSumDailyExcel.getWeather().equals("")) {
            fdDayRepList.setH("");
        }else{
            fdDayRepList.setH(fdRunSumDailyExcel.getWeather());
        }
        // 平均风速
        if (fdRunSumDailyExcel.getValue1() == null || fdRunSumDailyExcel.getValue1().equals("")){
            fdDayRepList.setI("0.0");
        }else{
            fdDayRepList.setI(fdRunSumDailyExcel.getValue1().replace(",","").replace("，",""));
        }
        // 日上网电量
        if (fdRunSumDailyExcel.getDailyOnLineElectr() == null || fdRunSumDailyExcel.getDailyOnLineElectr().equals("")){
            fdDayRepList.setJ("0.0");
        }else{
            fdDayRepList.setJ(fdRunSumDailyExcel.getDailyOnLineElectr().replace(",","").replace("，",""));
        }

        // 日限电损失
        if (fdRunSumDailyExcel.getDailyLossOfElectr() == null || fdRunSumDailyExcel.getDailyLossOfElectr().equals("")){
            fdDayRepList.setK("0.0");
        }else{
            fdDayRepList.setK(fdRunSumDailyExcel.getDailyLossOfElectr().replace(",","").replace("，",""));
        }

        // 月计划上网电量
        if (fdRunSumDailyExcel.getMonPlanOnlineElectr() == null || fdRunSumDailyExcel.getMonPlanOnlineElectr().equals("")){
            fdDayRepList.setL("0.0");
        }else{
            fdDayRepList.setL(fdRunSumDailyExcel.getMonPlanOnlineElectr().replace(",","").replace("，",""));
        }

        // 月累计上网电量
        if (fdRunSumDailyExcel.getMonAccOnlineElectr() == null || fdRunSumDailyExcel.getMonAccOnlineElectr().equals("")){
            fdDayRepList.setM("0.0");
        }else{
            fdDayRepList.setM(fdRunSumDailyExcel.getMonAccOnlineElectr().replace(",","").replace("，",""));
        }

        // 月计划电量完成率
        if (fdRunSumDailyExcel.getMonPlanComrate() == null || fdRunSumDailyExcel.getMonPlanComrate().equals("")){
            fdDayRepList.setN("0.0");
        }else{
            fdDayRepList.setN(fdRunSumDailyExcel.getMonPlanComrate().replace(",","").replace("，",""));
        }

        // 年计划上网电量
        if (fdRunSumDailyExcel.getAnnPlanOnlineElectr() == null || fdRunSumDailyExcel.getAnnPlanOnlineElectr().equals("")){
            fdDayRepList.setO("0.0");
        }else{
            fdDayRepList.setO(fdRunSumDailyExcel.getAnnPlanOnlineElectr().replace(",","").replace("，",""));
        }

        // 年累计上网电量
        if (fdRunSumDailyExcel.getYearAcOnlineElectr() == null || fdRunSumDailyExcel.getYearAcOnlineElectr().equals("")){
            fdDayRepList.setP("0.0");
        }else{
            fdDayRepList.setP(fdRunSumDailyExcel.getYearAcOnlineElectr().replace(",","").replace("，",""));
        }

        // 年计划电量完成率
        if (fdRunSumDailyExcel.getAnnPlanComrate() == null || fdRunSumDailyExcel.getAnnPlanComrate().equals("")){
            fdDayRepList.setQ("0.0");
        }else{
            fdDayRepList.setQ(fdRunSumDailyExcel.getAnnPlanComrate().replace(",","").replace("，",""));
        }

        // 年利用小时数
        if (fdRunSumDailyExcel.getAnnutilizationHours() == null || fdRunSumDailyExcel.getAnnutilizationHours().equals("")){
            fdDayRepList.setR("0.0");
        }else{
            fdDayRepList.setR(fdRunSumDailyExcel.getAnnutilizationHours().replace(",","").replace("，",""));
        }

        // 当日故障损失
        if (fdRunSumDailyExcel.getDailyLossElectr() == null || fdRunSumDailyExcel.getDailyLossElectr().equals("")){
            fdDayRepList.setS("0.0");
        }else{
            fdDayRepList.setS(fdRunSumDailyExcel.getDailyLossElectr().replace(",","").replace("，",""));
        }

        // 月累计故障损失
        if (fdRunSumDailyExcel.getMonAccFailureLoss() == null || fdRunSumDailyExcel.getMonAccFailureLoss().equals("")){
            fdDayRepList.setT("0.0");
        }else{
            fdDayRepList.setT(fdRunSumDailyExcel.getMonAccFailureLoss().replace(",","").replace("，",""));
        }

        // 年累计故障损失
        if (fdRunSumDailyExcel.getAnnAccFailureLoss() == null || fdRunSumDailyExcel.getAnnAccFailureLoss().equals("")){
            fdDayRepList.setU("0.0");
        }else{
            fdDayRepList.setU(fdRunSumDailyExcel.getAnnAccFailureLoss().replace(",","").replace("，",""));
        }

        // 月限电损失
        if (fdRunSumDailyExcel.getMonElectrLoss() == null || fdRunSumDailyExcel.getMonElectrLoss().equals("")){
            fdDayRepList.setV("0.0");
        }else{
            fdDayRepList.setV(fdRunSumDailyExcel.getMonElectrLoss().replace(",","").replace("，",""));
        }

        // 年限电损失
        if (fdRunSumDailyExcel.getYearsElectrLoss() == null || fdRunSumDailyExcel.getYearsElectrLoss().equals("")){
            fdDayRepList.setW("0.0");
        }else{
            fdDayRepList.setW(fdRunSumDailyExcel.getYearsElectrLoss().replace(",","").replace("，",""));
        }

        // 日限电率
        if (fdRunSumDailyExcel.getDailyElectrRate() == null || fdRunSumDailyExcel.getDailyElectrRate().equals("")){
            fdDayRepList.setX("0.0");
        }else{
            fdDayRepList.setX(fdRunSumDailyExcel.getDailyElectrRate().replace(",","").replace("，",""));
        }

        // 月限电率
        if (fdRunSumDailyExcel.getMonElectrRate() == null || fdRunSumDailyExcel.getMonElectrRate().equals("")){
            fdDayRepList.setY("0.0");
        }else{
            fdDayRepList.setY(fdRunSumDailyExcel.getMonElectrRate().replace(",","").replace("，",""));
        }

        // 年限电率
        if (fdRunSumDailyExcel.getYearElectrRate() == null || fdRunSumDailyExcel.getYearElectrRate().equals("")){
            fdDayRepList.setZ("0.0");
        }else{
            fdDayRepList.setZ(fdRunSumDailyExcel.getYearElectrRate().replace(",","").replace("，",""));
        }

        // 月平均风速
        if (fdRunSumDailyExcel.getValue2() == null || fdRunSumDailyExcel.getValue2().equals("")){
            fdDayRepList.setAa("0.0");
        }else{
            fdDayRepList.setAa(fdRunSumDailyExcel.getValue2().replace(",","").replace("，",""));
        }

        // 年平均风速
        if (fdRunSumDailyExcel.getValue3() == null || fdRunSumDailyExcel.getValue3().equals("")){
            fdDayRepList.setAb("0.0");
        }else{
            fdDayRepList.setAb(fdRunSumDailyExcel.getValue3().replace(",","").replace("，",""));
        }
        return fdDayRepList;
    }
    public static DayRepList sdRunSumDailyRemoveEmpty(SdRunSumDailyExcel sdRunSumDailyExcel) {
        DayRepList fdDayRepList = new DayRepList();
        // 公司
        if (sdRunSumDailyExcel.getCompany() == null || sdRunSumDailyExcel.getCompany().equals("")){
            fdDayRepList.setA("");
        }else{
            fdDayRepList.setA(sdRunSumDailyExcel.getCompany());
        }
        // 水电站
        if (sdRunSumDailyExcel.getStation() == null || sdRunSumDailyExcel.getStation().equals("")) {
            fdDayRepList.setB("");
        }else{
            fdDayRepList.setB(sdRunSumDailyExcel.getStation());
        }
        // 机组型号
        if (sdRunSumDailyExcel.getMachine() == null || sdRunSumDailyExcel.getMachine().equals("")) {
            fdDayRepList.setC("");
        }else{
            fdDayRepList.setC(sdRunSumDailyExcel.getMachine());
        }
        // 装机容量
        if (sdRunSumDailyExcel.getInstalledCapacity() == null || sdRunSumDailyExcel.getInstalledCapacity().equals("")){
            fdDayRepList.setD("0.0");
        }else{
            fdDayRepList.setD(sdRunSumDailyExcel.getInstalledCapacity().replace(",","").replace("，",""));
        }

        // 并网容量
        if (sdRunSumDailyExcel.getGridCapacity() == null || sdRunSumDailyExcel.getGridCapacity().equals("")){
            fdDayRepList.setE("0.0");
        }else{
            fdDayRepList.setE(sdRunSumDailyExcel.getGridCapacity().replace(",","").replace("，",""));
        }

        // 机组运行台数
        if (sdRunSumDailyExcel.getRunningMachine() == null || sdRunSumDailyExcel.getRunningMachine().equals("")){
            fdDayRepList.setF("0.0");
        }else{
            fdDayRepList.setF(sdRunSumDailyExcel.getRunningMachine().replace(",","").replace("，",""));
        }

        // 停机台数
        if (sdRunSumDailyExcel.getShutdownMachine() == null || sdRunSumDailyExcel.getShutdownMachine().equals("")){
            fdDayRepList.setG("0.0");
        }else{
            fdDayRepList.setG(sdRunSumDailyExcel.getShutdownMachine().replace(",","").replace("，",""));
        }

        // 天气情况
        if (sdRunSumDailyExcel.getWeather() == null || sdRunSumDailyExcel.getWeather().equals("")) {
            fdDayRepList.setH("");
        }else{
            fdDayRepList.setH(sdRunSumDailyExcel.getWeather());
        }
        // 平均入库流量
        if (sdRunSumDailyExcel.getValue1() == null || sdRunSumDailyExcel.getValue1().equals("")){
            fdDayRepList.setI("0.0");
        }else{
            fdDayRepList.setI(sdRunSumDailyExcel.getValue1().replace(",","").replace("，",""));
        }
        // 日上网电量
        if (sdRunSumDailyExcel.getDailyOnLineElectr() == null || sdRunSumDailyExcel.getDailyOnLineElectr().equals("")){
            fdDayRepList.setJ("0.0");
        }else{
            fdDayRepList.setJ(sdRunSumDailyExcel.getDailyOnLineElectr().replace(",","").replace("，",""));
        }

        // 日限电损失
        if (sdRunSumDailyExcel.getDailyLossOfElectr() == null || sdRunSumDailyExcel.getDailyLossOfElectr().equals("")){
            fdDayRepList.setK("0.0");
        }else{
            fdDayRepList.setK(sdRunSumDailyExcel.getDailyLossOfElectr().replace(",","").replace("，",""));
        }

        // 月计划上网电量
        if (sdRunSumDailyExcel.getMonPlanOnlineElectr() == null || sdRunSumDailyExcel.getMonPlanOnlineElectr().equals("")){
            fdDayRepList.setL("0.0");
        }else{
            fdDayRepList.setL(sdRunSumDailyExcel.getMonPlanOnlineElectr().replace(",","").replace("，",""));
        }

        // 月累计上网电量
        if (sdRunSumDailyExcel.getMonAccOnlineElectr() == null || sdRunSumDailyExcel.getMonAccOnlineElectr().equals("")){
            fdDayRepList.setM("0.0");
        }else{
            fdDayRepList.setM(sdRunSumDailyExcel.getMonAccOnlineElectr().replace(",","").replace("，",""));
        }

        // 月计划电量完成率
        if (sdRunSumDailyExcel.getMonPlanComrate() == null || sdRunSumDailyExcel.getMonPlanComrate().equals("")){
            fdDayRepList.setN("0.0");
        }else{
            fdDayRepList.setN(sdRunSumDailyExcel.getMonPlanComrate().replace(",","").replace("，",""));
        }

        // 年计划上网电量
        if (sdRunSumDailyExcel.getAnnPlanOnlineElectr() == null || sdRunSumDailyExcel.getAnnPlanOnlineElectr().equals("")){
            fdDayRepList.setO("0.0");
        }else{
            fdDayRepList.setO(sdRunSumDailyExcel.getAnnPlanOnlineElectr().replace(",","").replace("，",""));
        }

        // 年累计上网电量
        if (sdRunSumDailyExcel.getYearAcOnlineElectr() == null || sdRunSumDailyExcel.getYearAcOnlineElectr().equals("")){
            fdDayRepList.setP("0.0");
        }else{
            fdDayRepList.setP(sdRunSumDailyExcel.getYearAcOnlineElectr().replace(",","").replace("，",""));
        }

        // 年计划电量完成率
        if (sdRunSumDailyExcel.getAnnPlanComrate() == null || sdRunSumDailyExcel.getAnnPlanComrate().equals("")){
            fdDayRepList.setQ("0.0");
        }else{
            fdDayRepList.setQ(sdRunSumDailyExcel.getAnnPlanComrate().replace(",","").replace("，",""));
        }

        // 年利用小时数
        if (sdRunSumDailyExcel.getAnnutilizationHours() == null || sdRunSumDailyExcel.getAnnutilizationHours().equals("")){
            fdDayRepList.setR("0.0");
        }else{
            fdDayRepList.setR(sdRunSumDailyExcel.getAnnutilizationHours().replace(",","").replace("，",""));
        }

        // 当日故障损失
        if (sdRunSumDailyExcel.getDailyLossElectr() == null || sdRunSumDailyExcel.getDailyLossElectr().equals("")){
            fdDayRepList.setS("0.0");
        }else{
            fdDayRepList.setS(sdRunSumDailyExcel.getDailyLossElectr().replace(",","").replace("，",""));
        }

        // 月累计故障损失
        if (sdRunSumDailyExcel.getMonAccFailureLoss() == null || sdRunSumDailyExcel.getMonAccFailureLoss().equals("")){
            fdDayRepList.setT("0.0");
        }else{
            fdDayRepList.setT(sdRunSumDailyExcel.getMonAccFailureLoss().replace(",","").replace("，",""));
        }

        // 年累计故障损失
        if (sdRunSumDailyExcel.getAnnAccFailureLoss() == null || sdRunSumDailyExcel.getAnnAccFailureLoss().equals("")){
            fdDayRepList.setU("0.0");
        }else{
            fdDayRepList.setU(sdRunSumDailyExcel.getAnnAccFailureLoss().replace(",","").replace("，",""));
        }

        // 月限电损失
        if (sdRunSumDailyExcel.getMonElectrLoss() == null || sdRunSumDailyExcel.getMonElectrLoss().equals("")){
            fdDayRepList.setV("0.0");
        }else{
            fdDayRepList.setV(sdRunSumDailyExcel.getMonElectrLoss().replace(",","").replace("，",""));
        }

        // 年限电损失
        if (sdRunSumDailyExcel.getYearsElectrLoss() == null || sdRunSumDailyExcel.getYearsElectrLoss().equals("")){
            fdDayRepList.setW("0.0");
        }else{
            fdDayRepList.setW(sdRunSumDailyExcel.getYearsElectrLoss().replace(",","").replace("，",""));
        }

        // 日限电率
        if (sdRunSumDailyExcel.getDailyElectrRate() == null || sdRunSumDailyExcel.getDailyElectrRate().equals("")){
            fdDayRepList.setX("0.0");
        }else{
            fdDayRepList.setX(sdRunSumDailyExcel.getDailyElectrRate().replace(",","").replace("，",""));
        }

        // 月限电率
        if (sdRunSumDailyExcel.getMonElectrRate() == null || sdRunSumDailyExcel.getMonElectrRate().equals("")){
            fdDayRepList.setY("0.0");
        }else{
            fdDayRepList.setY(sdRunSumDailyExcel.getMonElectrRate().replace(",","").replace("，",""));
        }

        // 年限电率
        if (sdRunSumDailyExcel.getYearElectrRate() == null || sdRunSumDailyExcel.getYearElectrRate().equals("")){
            fdDayRepList.setZ("0.0");
        }else{
            fdDayRepList.setZ(sdRunSumDailyExcel.getYearElectrRate().replace(",","").replace("，",""));
        }

        // 月平均入库流量
        if (sdRunSumDailyExcel.getValue2() == null || sdRunSumDailyExcel.getValue2().equals("")){
            fdDayRepList.setAa("0.0");
        }else{
            fdDayRepList.setAa(sdRunSumDailyExcel.getValue2().replace(",","").replace("，",""));
        }

        // 年平均入库流量
        if (sdRunSumDailyExcel.getValue3() == null || sdRunSumDailyExcel.getValue3().equals("")){
            fdDayRepList.setAb("0.0");
        }else{
            fdDayRepList.setAb(sdRunSumDailyExcel.getValue3().replace(",","").replace("，",""));
        }
        return fdDayRepList;
    }
    public static DayRepList gfRunSumDailyRemoveEmpty(GfRunSumDailyExcel gfRunSumDailyExcel) {
        DayRepList fdDayRepList = new DayRepList();
        // 公司
        if (gfRunSumDailyExcel.getCompany() == null || gfRunSumDailyExcel.getCompany().equals("")){
            fdDayRepList.setA("");
        }else{
            fdDayRepList.setA(gfRunSumDailyExcel.getCompany());
        }
        // 光伏站
        if (gfRunSumDailyExcel.getStation() == null || gfRunSumDailyExcel.getStation().equals("")) {
            fdDayRepList.setB("");
        }else{
            fdDayRepList.setB(gfRunSumDailyExcel.getStation());
        }
        // 逆变器型号
        if (gfRunSumDailyExcel.getMachine() == null || gfRunSumDailyExcel.getMachine().equals("")) {
            fdDayRepList.setC("");
        }else{
            fdDayRepList.setC(gfRunSumDailyExcel.getMachine());
        }
        // 装机容量
        if (gfRunSumDailyExcel.getInstalledCapacity() == null || gfRunSumDailyExcel.getInstalledCapacity().equals("")){
            fdDayRepList.setD("0.0");
        }else{
            fdDayRepList.setD(gfRunSumDailyExcel.getInstalledCapacity().replace(",","").replace("，",""));
        }

        // 并网容量
        if (gfRunSumDailyExcel.getGridCapacity() == null || gfRunSumDailyExcel.getGridCapacity().equals("")){
            fdDayRepList.setE("0.0");
        }else{
            fdDayRepList.setE(gfRunSumDailyExcel.getGridCapacity().replace(",","").replace("，",""));
        }

        // 逆变器运行台数
        if (gfRunSumDailyExcel.getRunningMachine() == null || gfRunSumDailyExcel.getRunningMachine().equals("")){
            fdDayRepList.setF("0.0");
        }else{
            fdDayRepList.setF(gfRunSumDailyExcel.getRunningMachine().replace(",","").replace("，",""));
        }

        // 停机台数
        if (gfRunSumDailyExcel.getShutdownMachine() == null || gfRunSumDailyExcel.getShutdownMachine().equals("")){
            fdDayRepList.setG("0.0");
        }else{
            fdDayRepList.setG(gfRunSumDailyExcel.getShutdownMachine().replace(",","").replace("，",""));
        }

        // 天气情况
        if (gfRunSumDailyExcel.getWeather() == null || gfRunSumDailyExcel.getWeather().equals("")) {
            fdDayRepList.setH("");
        }else{
            fdDayRepList.setH(gfRunSumDailyExcel.getWeather());
        }
        // 平均辐照度
        if (gfRunSumDailyExcel.getValue1() == null || gfRunSumDailyExcel.getValue1().equals("")){
            fdDayRepList.setI("0.0");
        }else{
            fdDayRepList.setI(gfRunSumDailyExcel.getValue1().replace(",","").replace("，",""));
        }
        // 日上网电量
        if (gfRunSumDailyExcel.getDailyOnLineElectr() == null || gfRunSumDailyExcel.getDailyOnLineElectr().equals("")){
            fdDayRepList.setJ("0.0");
        }else{
            fdDayRepList.setJ(gfRunSumDailyExcel.getDailyOnLineElectr().replace(",","").replace("，",""));
        }

        // 日限电损失
        if (gfRunSumDailyExcel.getDailyLossOfElectr() == null || gfRunSumDailyExcel.getDailyLossOfElectr().equals("")){
            fdDayRepList.setK("0.0");
        }else{
            fdDayRepList.setK(gfRunSumDailyExcel.getDailyLossOfElectr().replace(",","").replace("，",""));
        }

        // 月计划上网电量
        if (gfRunSumDailyExcel.getMonPlanOnlineElectr() == null || gfRunSumDailyExcel.getMonPlanOnlineElectr().equals("")){
            fdDayRepList.setL("0.0");
        }else{
            fdDayRepList.setL(gfRunSumDailyExcel.getMonPlanOnlineElectr().replace(",","").replace("，",""));
        }

        // 月累计上网电量
        if (gfRunSumDailyExcel.getMonAccOnlineElectr() == null || gfRunSumDailyExcel.getMonAccOnlineElectr().equals("")){
            fdDayRepList.setM("0.0");
        }else{
            fdDayRepList.setM(gfRunSumDailyExcel.getMonAccOnlineElectr().replace(",","").replace("，",""));
        }

        // 月计划电量完成率
        if (gfRunSumDailyExcel.getMonPlanComrate() == null || gfRunSumDailyExcel.getMonPlanComrate().equals("")){
            fdDayRepList.setN("0.0");
        }else{
            fdDayRepList.setN(gfRunSumDailyExcel.getMonPlanComrate().replace(",","").replace("，",""));
        }

        // 年计划上网电量
        if (gfRunSumDailyExcel.getAnnPlanOnlineElectr() == null || gfRunSumDailyExcel.getAnnPlanOnlineElectr().equals("")){
            fdDayRepList.setO("0.0");
        }else{
            fdDayRepList.setO(gfRunSumDailyExcel.getAnnPlanOnlineElectr().replace(",","").replace("，",""));
        }

        // 年累计上网电量
        if (gfRunSumDailyExcel.getYearAcOnlineElectr() == null || gfRunSumDailyExcel.getYearAcOnlineElectr().equals("")){
            fdDayRepList.setP("0.0");
        }else{
            fdDayRepList.setP(gfRunSumDailyExcel.getYearAcOnlineElectr().replace(",","").replace("，",""));
        }

        // 年计划电量完成率
        if (gfRunSumDailyExcel.getAnnPlanComrate() == null || gfRunSumDailyExcel.getAnnPlanComrate().equals("")){
            fdDayRepList.setQ("0.0");
        }else{
            fdDayRepList.setQ(gfRunSumDailyExcel.getAnnPlanComrate().replace(",","").replace("，",""));
        }

        // 年利用小时数
        if (gfRunSumDailyExcel.getAnnutilizationHours() == null || gfRunSumDailyExcel.getAnnutilizationHours().equals("")){
            fdDayRepList.setR("0.0");
        }else{
            fdDayRepList.setR(gfRunSumDailyExcel.getAnnutilizationHours().replace(",","").replace("，",""));
        }

        // 当日故障损失
        if (gfRunSumDailyExcel.getDailyLossElectr() == null || gfRunSumDailyExcel.getDailyLossElectr().equals("")){
            fdDayRepList.setS("0.0");
        }else{
            fdDayRepList.setS(gfRunSumDailyExcel.getDailyLossElectr().replace(",","").replace("，",""));
        }

        // 月累计故障损失
        if (gfRunSumDailyExcel.getMonAccFailureLoss() == null || gfRunSumDailyExcel.getMonAccFailureLoss().equals("")){
            fdDayRepList.setT("0.0");
        }else{
            fdDayRepList.setT(gfRunSumDailyExcel.getMonAccFailureLoss().replace(",","").replace("，",""));
        }

        // 年累计故障损失
        if (gfRunSumDailyExcel.getAnnAccFailureLoss() == null || gfRunSumDailyExcel.getAnnAccFailureLoss().equals("")){
            fdDayRepList.setU("0.0");
        }else{
            fdDayRepList.setU(gfRunSumDailyExcel.getAnnAccFailureLoss().replace(",","").replace("，",""));
        }

        // 月限电损失
        if (gfRunSumDailyExcel.getMonElectrLoss() == null || gfRunSumDailyExcel.getMonElectrLoss().equals("")){
            fdDayRepList.setV("0.0");
        }else{
            fdDayRepList.setV(gfRunSumDailyExcel.getMonElectrLoss().replace(",","").replace("，",""));
        }

        // 年限电损失
        if (gfRunSumDailyExcel.getYearsElectrLoss() == null || gfRunSumDailyExcel.getYearsElectrLoss().equals("")){
            fdDayRepList.setW("0.0");
        }else{
            fdDayRepList.setW(gfRunSumDailyExcel.getYearsElectrLoss().replace(",","").replace("，",""));
        }

        // 日限电率
        if (gfRunSumDailyExcel.getDailyElectrRate() == null || gfRunSumDailyExcel.getDailyElectrRate().equals("")){
            fdDayRepList.setX("0.0");
        }else{
            fdDayRepList.setX(gfRunSumDailyExcel.getDailyElectrRate().replace(",","").replace("，",""));
        }

        // 月限电率
        if (gfRunSumDailyExcel.getMonElectrRate() == null || gfRunSumDailyExcel.getMonElectrRate().equals("")){
            fdDayRepList.setY("0.0");
        }else{
            fdDayRepList.setY(gfRunSumDailyExcel.getMonElectrRate().replace(",","").replace("，",""));
        }

        // 年限电率
        if (gfRunSumDailyExcel.getYearElectrRate() == null || gfRunSumDailyExcel.getYearElectrRate().equals("")){
            fdDayRepList.setZ("0.0");
        }else{
            fdDayRepList.setZ(gfRunSumDailyExcel.getYearElectrRate().replace(",","").replace("，",""));
        }

        // 月平均辐照度
        if (gfRunSumDailyExcel.getValue2() == null || gfRunSumDailyExcel.getValue2().equals("")){
            fdDayRepList.setAa("0.0");
        }else{
            fdDayRepList.setAa(gfRunSumDailyExcel.getValue2().replace(",","").replace("，",""));
        }

        // 年平均辐照度
        if (gfRunSumDailyExcel.getValue3() == null || gfRunSumDailyExcel.getValue3().equals("")){
            fdDayRepList.setAb("0.0");
        }else{
            fdDayRepList.setAb(gfRunSumDailyExcel.getValue3().replace(",","").replace("，",""));
        }
        return fdDayRepList;
    }
}
