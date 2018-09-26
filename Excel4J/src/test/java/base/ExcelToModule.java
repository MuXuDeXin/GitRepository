package base;

import com.ysyn.crab2died.ExcelUtils;
import modules.RunDaily;
import org.junit.Test;

import java.util.List;

public class ExcelToModule {
    @Test
    public void excel2Object() throws Exception {

        String[] paths = {"F:\\Excel4J\\src\\test\\resource\\yxrb2.xlsx"};
        System.out.println("读取全部：");
        for (String path : paths) {
            List<RunDaily> runDailies = ExcelUtils.getInstance().readExcel2Objects(path, RunDaily.class);
            for (RunDaily rd : runDailies) {
                System.out.println(rd);
            }
        }
    }
}
