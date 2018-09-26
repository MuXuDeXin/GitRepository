package com.ysyn.publicBusiness;

import com.ysyn.crab2died.ExcelUtils;
import com.ysyn.dailyReport.entity.DayRepList;
import com.ysyn.dailyReport.entity.FdRunSumDailyExcel;
import com.ysyn.dailyReport.entity.GfRunSumDailyExcel;
import com.ysyn.dailyReport.entity.SdRunSumDailyExcel;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransferExcelAndWordData2DataSourceData {
    /**
     * 读取excel表格数据，根据excel文件内容的表头名称，自动匹配相应的读取模板
     * @param path 当前读取的excel文件
     * @param sheetLineNoStart 读取的数据在excel的文件中的起始行号
     * @return 返回数据库实体的list
     * @throws Exception 抛出异常
     */
    public static List<DayRepList> readExcelAndWordDataInfor(String path, double sheetLineNoStart) throws Exception {
        List<DayRepList> dayRepListList = new ArrayList<>();
        double sheetLineNo = sheetLineNoStart;// 行号
        File file = new File(path);
        /*读取excel数据*/
        if (file.getName().contains("风电运行")||file.getName().contains("光伏运行")||file.getName().contains("水电运行")){
            //读取excel表头title
            List<String> title = readExcelTitleData(path);
            // 根据表头信息来区分excel报表的类型
            if(title.size() > 0){
                if (title.get(0).contains("风电")){
                    //读取excel数据
                    List<FdRunSumDailyExcel> runDailies = ExcelUtils.getInstance().readExcel2Objects(path, FdRunSumDailyExcel.class, 2, 0);
                    //将excel数据转化为存入数据库的实体数据
                    for (FdRunSumDailyExcel rd : runDailies) {
                        DayRepList dayRepList = RemoveRunSumDailyEmpty.fdRunSumDailyRemoveEmpty(rd);
                        dayRepList = parseOthersToEntity(dayRepList,title,path,sheetLineNo);
                        dayRepListList.add(dayRepList);
                        sheetLineNo ++ ;
                    }
                } else if (title.get(0).contains("光伏")){
                    //读取excel数据
                    List<GfRunSumDailyExcel> runDailies = ExcelUtils.getInstance().readExcel2Objects(path, GfRunSumDailyExcel.class, 2, 0);
                    //将excel数据转化为存入数据库的实体数据
                    for (GfRunSumDailyExcel rd : runDailies) {
                        DayRepList dayRepList = RemoveRunSumDailyEmpty.gfRunSumDailyRemoveEmpty(rd);
                        dayRepList = parseOthersToEntity(dayRepList,title,path,sheetLineNo);
                        dayRepListList.add(dayRepList);
                        sheetLineNo ++ ;
                    }
                }else if (title.get(0).contains("水电")){
                    //读取excel数据
                    List<SdRunSumDailyExcel> runDailies = ExcelUtils.getInstance().readExcel2Objects(path, SdRunSumDailyExcel.class, 2, 0);
                    //将excel数据转化为存入数据库的实体数据
                    for (SdRunSumDailyExcel rd : runDailies) {
                        DayRepList dayRepList = RemoveRunSumDailyEmpty.sdRunSumDailyRemoveEmpty(rd);
                        dayRepList = parseOthersToEntity(dayRepList,title,path,sheetLineNo);
                        dayRepListList.add(dayRepList);
                        sheetLineNo ++ ;
                    }
                }
            }
        }
        /*读取excel数据*/
        else if (file.getName().contains("风电检修") || file.getName().contains("CGN")){
            List<List<String>> result = new ArrayList<>();
            XWPFDocument document = new XWPFDocument(new FileInputStream(path));/* 读取Word文件*/
            XWPFTable tablesOutside = document.getTables().get(1);/* 获取最外层第二个表格*/
            List<XWPFTableRow> rowsOutsideList = tablesOutside.getRows();/*获取最外层第二个表格的行数*/
            for (XWPFTableRow rowsOutside : rowsOutsideList) {
                XWPFTableCell cellsInside = rowsOutside.getTableCells().get(0);/* 获取2号表格 行 第一个单元格*/
                XWPFTable table = cellsInside.getTables().get(0);/* 获取2号表格 行 第一个单元格内的表格*/
                List<XWPFTableRow> rowsList = table.getRows();/* 获取2号表格 行 第一个单元格内的表格的行数*/
                for (int i = 0; i < rowsList.size(); i++) {
                    if (i == 2) continue;
                    List<XWPFTableCell> cellsList = rowsList.get(i).getTableCells();
                    List<String> stringList = new ArrayList<>();
                    for (XWPFTableCell cell : cellsList){
                        if (i == 0 || i == 1) {
                            if (cell.getText().trim().equals("")) continue;
                            stringList.add(cell.getText().trim());
                        } else {
                            stringList.add(cell.getText().trim());
                        }
                    }
                    result.add(stringList);
                }
            }
            dayRepListList = tansferWordListData2DataSourceData(path,result,sheetLineNo);
        }
        return dayRepListList;
    }
    /**
     * ****************读取EXCEL表头数据******************
     */
    private static List<String> readExcelTitleData(String path) {
        List<List<String>> strList = null;
        try {
            strList = ExcelUtils.getInstance().readExcel2List(path, 0, 2, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; strList != null && i < strList.size(); i++) {
            for (String str : strList.get(i)) {
                if (str.trim().equals("")) continue;
                if (i == 0) {
                    list.add(str.trim());
                } else if (i == 1) {
                    Date date1 = null;
                    try {
                        date1 = new SimpleDateFormat("yyyy/MM/dd").parse(str.trim());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    list.add(new SimpleDateFormat("yyyyMMdd").format(date1));
                }
            }
        }
        return list;
    }

    /**
     * runSumDaily中封装repTypeName、repType、dayDate、fileName、sheetLineNo
     * @param dayRepList 与excel实体等同的实体
     * @param titles excel正文的标题
     * @param path 当前excel的文件路径
     * @param sheetLineNo 当前数据所在excel的行号
     * @return 返回封装了repTypeName、repType、dayDate、fileName、sheetLineNo 的 dayRepList
     */
    private static DayRepList parseOthersToEntity(DayRepList dayRepList, List<String> titles, String path, Double sheetLineNo){
        File baseFile = new File(path);
        dayRepList.setRepTypeName(titles.get(0));// repTypeName excel文件的标题
        if (titles.get(0)!= null && titles.get(0).contains("风电")){// repType excel文件类型
            dayRepList.setRepType(RunSumDailyConstants.DIM_VAL_CODE_FD);
        }else if (titles.get(0)!= null && titles.get(0).contains("光伏")){
            dayRepList.setRepType(RunSumDailyConstants.DIM_VAL_CODE_GF);
        }else if (titles.get(0)!= null && titles.get(0).contains("水电")){
            dayRepList.setRepType(RunSumDailyConstants.DIM_VAL_CODE_SD);
        }
        dayRepList.setDayDate(titles.get(1));// dayDate excel文件的日期
        dayRepList.setFileName(baseFile.getName()); // fileName excel文件的全名
        dayRepList.setSheetLineNo(sheetLineNo);
        return dayRepList;
    }
    /**
     *
     * @param path 当前Word文件的路径
     * @param listData 读取Word表格的数据，类型为List<List<String>>
     * @param lineNo 起始行号
     * @return List<DayRepList> 存入数据库的实体list
     */
    private static List<DayRepList> tansferWordListData2DataSourceData(String path, List<List<String>> listData, double lineNo){
        List<DayRepList> dayRepLists = new ArrayList<>();
        File baseFile = new File(path);
        for (int i = 0; i < listData.size(); i++) {
            if ( i == 0 || i == 1 || i == 2 || i == 3 || i == (listData.size()-1)) continue;
            DayRepList dayRepList = new DayRepList();
            dayRepList.setRepTypeName(listData.get(0).get(0));
            Date date = null;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(listData.get(1).get(0).trim());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            dayRepList.setDayDate(new SimpleDateFormat("yyyyMMdd").format(date));
            dayRepList.setA(listData.get(i).get(0).equals("") ? "" : listData.get(i).get(0));
            dayRepList.setB(listData.get(i).get(1).equals("") ? "" : listData.get(i).get(1));
            dayRepList.setC(listData.get(i).get(2).equals("") ? "" : listData.get(i).get(2));
            dayRepList.setD(listData.get(i).get(3).equals("") ? "" : listData.get(i).get(3));
            dayRepList.setE(listData.get(i).get(4).equals("") ? "" : listData.get(i).get(4));
            dayRepList.setF(listData.get(i).get(5).equals("") ? "" : listData.get(i).get(5));
            dayRepList.setG(listData.get(i).get(6).equals("") ? "" : listData.get(i).get(6));
            dayRepList.setH(listData.get(i).get(7).equals("") ? "" : listData.get(i).get(7));
            dayRepList.setI(listData.get(i).get(8).equals("") ? "" : listData.get(i).get(8));
            dayRepList.setJ(listData.get(i).get(9).equals("") ? "0.0" : listData.get(i).get(9));
            dayRepList.setK(listData.get(i).get(10).equals("") ? "0.0" : listData.get(i).get(10));
            dayRepList.setL(listData.get(i).get(11).equals("") ? "" : listData.get(i).get(11));
            dayRepList.setM(listData.get(i).get(12).equals("") ? "" : listData.get(i).get(12));
            dayRepList.setN(listData.get(i).get(13).equals("") ? "" : listData.get(i).get(13));
            dayRepList.setO(listData.get(i).get(14).equals("0.0") ? "" : listData.get(i).get(14));
            dayRepList.setP(listData.get(i).get(15).equals("") ? "" : listData.get(i).get(15));
            dayRepList.setQ("");
            dayRepList.setR("");
            dayRepList.setS("");
            dayRepList.setT("");
            dayRepList.setU("");
            dayRepList.setV("");
            dayRepList.setW("");
            dayRepList.setX("");
            dayRepList.setY("");
            dayRepList.setZ("");
            dayRepList.setAa("");
            dayRepList.setAb("");
            dayRepList.setSheetLineNo(lineNo);
            dayRepList.setRepType(RunSumDailyConstants.DIM_VAL_CODE_FD);
            dayRepList.setFileName(baseFile.getName());
            dayRepLists.add(dayRepList);
            lineNo ++;
        }
        return dayRepLists;
    }
}
