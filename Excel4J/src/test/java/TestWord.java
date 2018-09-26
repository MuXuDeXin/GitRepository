import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLTextExtractor;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlException;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestWord {
    @Test
    public void test01() throws IOException {
        XWPFDocument document = new XWPFDocument(new FileInputStream("F:\\Excel4J\\src\\test\\resource\\风电检修汇总日报2017-12-06.docx"));
        // 获取所有表格
        List<XWPFTable> tables = document.getTables();
        System.out.println(tables.size());
        for (XWPFTable table : tables) {
            // 获取表格的行
            List<XWPFTableRow> rows = table.getRows();
            for (XWPFTableRow row : rows) {
                // 获取表格的每个单元格
                List<XWPFTableCell> tableCells = row.getTableCells();
                for (XWPFTableCell cell : tableCells) {
                    // 获取单元格的内容
                    System.out.printf(cell.getText()+",");

                }
                System.out.println();
                System.out.println("---------------------------------------");
            }
        }
    }
    @Test
    public void test02() throws IOException {
        String baseDIR = "C:\\Users\\Administrator\\Desktop\\广核数据";
        File base = new File(baseDIR);
        File[] baseFiles = base.listFiles();
        for ( File baseFile:baseFiles ) {
            System.out.println(baseFile.toString());
        }

    }
    @Test
    public void test03() throws IOException, OpenXML4JException, XmlException {
        OPCPackage opcPackage = POIXMLDocument.openPackage("C:\\Users\\Administrator\\Desktop\\广核数据\\12月6日\\风电检修汇总日报2017-12-06.docx");
        POIXMLTextExtractor extractor = new XWPFWordExtractor(opcPackage);
        String text2007 = extractor.getText();
        System.out.println(text2007);
    }
    @Test
    public void test04() throws IOException {
        List<List<String>> result = new ArrayList<>();
        XWPFDocument document = new XWPFDocument(new FileInputStream("F:\\Excel4J\\src\\test\\resource\\CGN_daily_c1210.docx"));
        // 获取最外层第二个表格
        XWPFTable tablesOutside = document.getTables().get(1);
        List<XWPFTableRow> rowsOutsideList = tablesOutside.getRows();
        for (XWPFTableRow rowsOutside:rowsOutsideList ) {
            // 获取2号表格的第一行第一个单元格
            XWPFTableCell cellsInside = rowsOutside.getTableCells().get(0);
            // 获取2号表格第一行第一个单元格内的表格
            XWPFTable table = cellsInside.getTables().get(0);
            // 获取2号表格第一行第一个单元格内的表格的行数
            List<XWPFTableRow> rowsList = table.getRows();
            for (int i = 0; i < rowsList.size(); i++) {
                if ( i == 2 ) continue;
                List<XWPFTableCell> cellsList = rowsList.get(i).getTableCells();
                List<String> stringList = new ArrayList<>();
                for (XWPFTableCell cell : cellsList) {
                    if ( i == 0 || i == 1){
                        if (cell.getText().trim().equals("")) continue;
                        stringList.add(cell.getText().trim());
                    }else {
                        stringList.add(cell.getText().trim());
                    }
                    System.out.printf(cell.getText().trim() + ",");
                }
                result.add(stringList);
                System.out.println();
                System.out.println("------------------"+i+"--------------------");
            }
        }
        for (List<String> list : result ) {
            System.out.println(list);
            System.out.println(list.size());
        }
    }

}
