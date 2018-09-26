package com.ysyn.dailyReport.servive;

import com.ysyn.dailyReport.dao.DayRepListDao;
import com.ysyn.dailyReport.entity.DayRepList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DayRepListService {
    @Autowired
    protected DayRepListDao dayRepListDao;

    /**
     * 测试
     * @return 测试数据
     */
    public int testSelect(){
        return  dayRepListDao.testSelect();
    }
    /**
     * day_rep_list 日报数据表插入数据
     * @param dayRepList 日报数据按照excel的列名来存入
     * @return 执行结果的数目
     */
    public Integer insertIntoDayRepList(DayRepList dayRepList){
        return dayRepListDao.insertIntoDayRepList(dayRepList);
    }
    /**
     * day_rep_list 日报数据表删除数据
     * @param dayRepList 日报数据按照excel的列名来存入
     * @return 执行结果的数目
     */
    public Integer deleteDayRepList(DayRepList dayRepList){
        return dayRepListDao.deleteDayRepList(dayRepList);
    }

    /**
     * day_file_list 日报信息表插入数据
     * @param dayRepList 日报数据信息
     * @return 执行结果的数目
     */
    public Integer insertIntoDayFileList(DayRepList dayRepList){
        dayRepListDao.deleteDayFileList(dayRepList);
        return dayRepListDao.insertIntoDayFileList(dayRepList);
    }

}
