package com.ysyn;

import com.ysyn.dailyReport.entity.DayRepList;
import com.ysyn.dailyReport.servive.DayRepListService;
import com.ysyn.publicBusiness.TransferExcelAndWordData2DataSourceData;
import com.ysyn.utils.FindAssignedFiles;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        DayRepListService dayRepListService = (DayRepListService) context.getBean("dayRepListService");

        String baseFile = "C:\\Users\\Administrator\\Desktop\\广核数据";
        File base = new File(baseFile);
        File[] baseFiles = base.listFiles();

        if (baseFiles != null) {
            for ( File baseDIR:baseFiles ) {
                //        String baseDIR = "C:\\Users\\Administrator\\Desktop\\20171212";
                List<String> fileList = new ArrayList<>();
                FindAssignedFiles.findFiles(baseDIR.toString(), "*.xlsx", fileList);
                FindAssignedFiles.findFiles(baseDIR.toString(), "*.docx", fileList);
                List<DayRepList> dayRepListList;

                for (String path : fileList) {
                    if (path.contains("邮件") || path.contains("新建")) continue;
                    System.out.println(path);
                    dayRepListList = TransferExcelAndWordData2DataSourceData.readExcelAndWordDataInfor(path,4);
                    dayRepListService.insertIntoDayFileList(dayRepListList.get(0));
                    dayRepListService.deleteDayRepList(dayRepListList.get(0));
                    for (DayRepList dayRep : dayRepListList) {
                        dayRepListService.insertIntoDayRepList(dayRep);
                    }
                }
            }
        }
    }

}
