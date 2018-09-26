package com.ysyn.dailyReport.servive;

import com.ysyn.publicBusiness.RunSumDailyConstants;
import com.ysyn.dailyReport.entity.DayRepList;
import com.ysyn.imIdx.ImIdx;
import com.ysyn.imIdx.RequestData;
import com.ysyn.imIdx.ImIdxData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class RunSumDailyProcess {
    @Autowired
    protected FdRunSumDailyService fdRunSumDailyService;
    /**
     * 1、拆分daily_report数据（15个指标）数据存储到表idx_data
     * 2、idx_id为自动生成
     * 3、org_no 来自于sys_office 的code
     * 4、idx_id 、 idx_code 来自于表im_idx
     * 5、period 目前的数据都为日频度
     * 6、stat_cycle 来自于daily_export的data_date
     * 7、dim_code1 、dim_val_id1、dim_val_code1都为固定值
     */
    /*public List<ImIdxData> splitUpData() {
        List<DayRepList> fdDayRepListList = fdRunSumDailyService.queryRunSumDailyList(new RequestData());
        List<ImIdxData> list = new ArrayList<>();
        for (DayRepList rsdList : fdDayRepListList) {
//            TODO:
            //年计划上网电量
            String dataValue1 = rsdList.getO()==null || rsdList.getO().equals("") ? "0.0" : rsdList.getO();
            ImIdxData imIdxData1 = getImIdxData(rsdList,RunSumDailyConstants.YEAR_PLAN_ONLINE_ELECTR_ID,dataValue1);
            list.add(imIdxData1);
            //月计划上网电量
            String dataValue2 = rsdList.getL()==null || rsdList.getL().equals("") ? "0.0" :rsdList.getL();
            ImIdxData imIdxData2 = getImIdxData(rsdList,RunSumDailyConstants.MONTH_PLAN_ONLINE_ELECTR_ID,dataValue2);
            list.add(imIdxData2);

            //上网电量
            String dataValue3 = rsdList.getJ()==null || rsdList.getJ().equals("") ? "0.0" :rsdList.getJ();
            ImIdxData imIdxData3 = getImIdxData(rsdList,RunSumDailyConstants.DAILY_ONLINE_ELECTR_ID,dataValue3);
            list.add(imIdxData3);

           *//*if (!rsdList.getJ().equals("")){//累计上网电量
                ImIdx imIdx = runSumDailyService.queryImIdxList(new RequestData(RunSumDailyConstants.DAILY_ONLINE_ELECTR_ID));
            }
           if (!rsdList.getJ().equals("")){//故障损失电量
                ImIdx imIdx = runSumDailyService.queryImIdxList(new RequestData(RunSumDailyConstants.DAILY_ONLINE_ELECTR_ID));
            }*//*

            //并网容量
            String dataValue4 = rsdList.getE()==null || rsdList.getE().equals("") ? "0.0" :rsdList.getE();
            ImIdxData imIdxData4 = getImIdxData(rsdList,RunSumDailyConstants.GRID_CAPACITY_ID,dataValue4);
            list.add(imIdxData4);

            //月累计上网电量
            String dataValue5 = rsdList.getM()==null || rsdList.getM().equals("") ? "0.0" :rsdList.getM();
            ImIdxData imIdxData5 = getImIdxData(rsdList,RunSumDailyConstants.MON_ACC_ONLINE_ELECTR_ID,dataValue5);
            list.add(imIdxData5);

            //年累计上网电量
            String dataValue6 = rsdList.getP()==null || rsdList.getP().equals("") ? "0.0" :rsdList.getP();
            ImIdxData imIdxData6 = getImIdxData(rsdList,RunSumDailyConstants.YEAR_ACC_ONLINE_ELECTR_ID,dataValue6);
            list.add(imIdxData6);

            //年利用小时数
            String dataValue9 = rsdList.getR()==null ||  rsdList.getR().equals("") ? "0.0" :rsdList.getR();
            ImIdxData imIdxData9 = getImIdxData(rsdList,RunSumDailyConstants.MONTH_UTILIZATION_HOURS_ID,dataValue9);
            list.add(imIdxData9);
        }
        return list;
    }*/

    /**
     * 将拆分完毕的数据提交到IM_IDX_DATA表中
     * @param imIdxData 拆分好的数据ImIdxData实体
     * @return 返回保存完成的统计数据
     */
    /*public int insertToIdxData(ImIdxData imIdxData){
        return fdRunSumDailyService.insertToIdxData(imIdxData);
    }*/
    /**
     * 辅助方法 业务处理
     * @param rsdList 风电运行数据
     * @param idxId 指标id
     * @return ImIdxData
     */
    /*private ImIdxData getImIdxData(DayRepList rsdList, String idxId, String dataValue){
        ImIdx imIdx = fdRunSumDailyService.queryImIdxList(new RequestData(idxId));
        ImIdxData imIdxData = new ImIdxData();
        imIdxData.setOrgNo(rsdList.getStationNo()==null ? "" : rsdList.getStationNo());
        imIdxData.setIdxId(imIdx.getIdxId()==null ? "" : imIdx.getIdxId());
        imIdxData.setIdxCode(imIdx.getIdxCode() == null ? "" : imIdx.getIdxCode());
        imIdxData.setPeriod(RunSumDailyConstants.PERIOD_DAY);
        imIdxData.setStatCycle(rsdList.getDayDate() == null || rsdList.getDayDate().equals("") ? "" : rsdList.getDayDate());
        imIdxData.setDimCode1(RunSumDailyConstants.DIM_CODE_FDLX);
        imIdxData.setDimValId1(RunSumDailyConstants.DIM_VAL_ID_FD);
        imIdxData.setDimValCode1(RunSumDailyConstants.DIM_VAL_CODE_FD);
        imIdxData.setDataValue(Double.parseDouble(dataValue));
        return imIdxData;
    }*/

}
