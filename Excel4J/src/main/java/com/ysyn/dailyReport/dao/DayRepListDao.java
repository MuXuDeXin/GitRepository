package com.ysyn.dailyReport.dao;

import com.ysyn.dailyReport.entity.DayRepList;
import org.springframework.stereotype.Component;

@Component
public interface DayRepListDao {
    /**
     * 测试
     * @return 测试数据
     */
    int testSelect();
    /**
     * day_rep_list 表插入数据
     * @return 执行结果的数目
     */
    int insertIntoDayRepList(DayRepList dayRepList);
    /**
     * day_rep_list 删除数据
     * @return 执行结果的数目
     */
    int deleteDayRepList(DayRepList dayRepList);

    /**
     * day_file_list 表插入数据
     * @return 执行结果的数目
     */
    int insertIntoDayFileList(DayRepList dayRepList);
    /**
     * day_file_list 删除数据
     * @return 执行结果的数目
     */
    int deleteDayFileList(DayRepList dayRepList);

}
