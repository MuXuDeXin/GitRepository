package com.ysyn.publicBusiness;

public class RunSumDailyConstants {
//******************************************start of 指标**********************************************
    /**
     * 计划上网电量（年）
     */
    public static final String YEAR_PLAN_ONLINE_ELECTR_ID = "zgh00000000000000000173";
    /**
     * 计划上网电量（月）
     */
    public static final String MONTH_PLAN_ONLINE_ELECTR_ID = "zgh00000000000000000021";
    /**
     * 上网电量（日）
     */
    public static final String DAILY_ONLINE_ELECTR_ID = "zgh00000000000000000026";
    /**
     * 上网电量（月）
     */
    public static final String MONTH_ONLINE_ELECTR_ID = "zgh00000000000000000174";
    /**
     * 上网电量（年）
     */
    public static final String YEAR_ONLINE_ELECTR_ID = "zgh00000000000000000175";

    /**
     * 故障损失电量（日）
     */
    public static final String DAILY_FAILURE_LOSS_POWER_ID = "zgh00000000000000000042";
    /**
     * 故障损失电量（月）
     */
    public static final String MONTH_FAILURE_LOSS_POWER_ID = "zgh00000000000000000176";

    /**
     * 并网容量
     */
    public static final String GRID_CAPACITY_ID = "zgh00000000000000000045";
    /**
     * 月累计上网电量
     */
    public static final String MON_ACC_ONLINE_ELECTR_ID = "zgh00000000000000000164";
    /**
     * 年累计上网电量
     */
    public static final String YEAR_ACC_ONLINE_ELECTR_ID = "zgh00000000000000000166";
    /**
     * 年利用小时数
     */
    public static final String MONTH_UTILIZATION_HOURS_ID = "zgh00000000000000000177";
//******************************************end of 指标**********************************************

//******************************************start of 频度**********************************************

    /**
     * 频度：日
     */
    public static final String PERIOD_DAY = "01";
    /**
     * 频度：月
     */
    public static final String PERIOD_MONTH = "02";
    /**
     * 频度：年
     */
    public static final String PERIOD_YEAR = "08";
//******************************************end of 频度**********************************************

//******************************************start of 维度**********************************************
    /**
     * 发电类型
     */
    public static final String DIM_CODE_FDLX = "SC0000001";
    /**
     * 机型分类
     */
    public static final String DIM_CODE_JXFL = "SC0000002";
    /**
     * 系统类型
     */
    public static final String DIM_CODE_XTLX = "SC0000003";
//******************************************end of 维度**********************************************

//******************************************start of 维度值**********************************************
    /**
     * 风电类型code
     */
    public static final String DIM_VAL_CODE_FD = "01";
    /**
     * 风电类型id
     */
    public static final String DIM_VAL_ID_FD = "1";
    /**
     * 光伏类型code
     */
    public static final String DIM_VAL_CODE_GF = "02";
    /**
     * 光伏类型id
     */
    public static final String DIM_VAL_ID_GF = "2";
    /**
     * 水电类型code
     */
    public static final String DIM_VAL_CODE_SD = "03";
    /**
     * 水电类型id
     */
    public static final String DIM_VAL_ID_SD = "3";
    /**
     * 汇总code
     */
    public static final String DIM_VAL_CODE_HZ = "99";
    /**
     * 汇总id
     */
    public static final String DIM_VAL_ID_HZ = "4";
//******************************************end of 维度值**********************************************

}
