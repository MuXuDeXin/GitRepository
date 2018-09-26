import com.ysyn.dailyReport.entity.DayRepList;
import com.ysyn.dailyReport.servive.DayRepListService;
import com.ysyn.utils.FindAssignedFiles;
import com.ysyn.publicBusiness.RemoveRunSumDailyEmpty;
import com.ysyn.publicBusiness.RunSumDailyConstants;
import com.ysyn.crab2died.ExcelUtils;
import com.ysyn.dailyReport.entity.FdRunSumDailyExcel;
import com.ysyn.dailyReport.servive.RunSumDailyProcess;
import com.ysyn.imIdx.RequestData;
import com.ysyn.dailyReport.servive.FdRunSumDailyService;
import com.ysyn.imIdx.ImIdxData;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:ApplicationContext.xml"})
public class Test {
    @Autowired
    DayRepListService dayRepListService;

    @org.junit.Test
    public void test01(){
        int op = dayRepListService.testSelect();
        System.out.println(op);
    }
}
