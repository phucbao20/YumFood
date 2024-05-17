package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author TVD
 */
public class ExportEx {

    public static boolean exportExcel(Map<String, Object[]> studentData, File path, String sheetName) {
        try {
            FileOutputStream out = null;
            XSSFWorkbook workbook = new XSSFWorkbook();
            if (path.exists()) {
                try {
                    workbook = new XSSFWorkbook(new FileInputStream(path));
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(ExportEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }

            XSSFSheet spreadsheet
                    = workbook.createSheet(sheetName);
            // creating a row object
            XSSFRow row;
            Set<String> keyid = studentData.keySet();
            int rowid = 0;
            // writing the data into the sheets...

            for (String key : keyid) {
                row = spreadsheet.createRow(rowid++);
                Object[] objectArr = studentData.get(key);
                int cellid = 0;
                for (Object obj : objectArr) {
                    XSSFCell cell = row.createCell(cellid++);
                    CellStyle style = workbook.createCellStyle();
                    if (rowid == 1) {
                        XSSFFont font = workbook.createFont();

                        font.setFontHeightInPoints((short) 16);
                        font.setColor(IndexedColors.WHITE.getIndex());
                        font.setBold(true);

                        style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
                        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style.setAlignment(HorizontalAlignment.CENTER);

                        style.setFont(font);
                    }
                    style.setBorderBottom(BorderStyle.THIN);
                    style.setBorderTop(BorderStyle.THIN);
                    style.setBorderLeft(BorderStyle.THIN);
                    style.setBorderRight(BorderStyle.THIN);

                    // Setting cell style
                    cell.setCellStyle(style);
                    cell.setCellValue(String.valueOf(obj));
                }

            }

            for (int i = 0; i < studentData.get("1").length; i++) {
                spreadsheet.autoSizeColumn(i);
            }

            if (!String.valueOf(path).contains(".xlsx")) {
                path = new File(path.getAbsolutePath() + ".xlsx");
            }
            out = new FileOutputStream(path);
            workbook.write(out);
            out.close();
            workbook.close();
            return true;
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExportEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ExportEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return false;
    }

//    public static void main(String[] args) {
//        Map<String, Object[]> studentData = new HashMap<>();
//        studentData.put(
//                "1",
//                new Object[]{"Mã khoá học",
//                    "Mã chuyên đề",
//                    "Học phí",
//                    "Thời lượng",
//                    "Ngày khai giảng",
//                    "Mã nhân viên",
//                    "Ngày Tạo"
//                }
//        );
//        for (int i = 0; i < 10; i++) 
//        {
//            studentData.put(
//                    // STT của hàng (i)
//                    String.valueOf(i),
//                    // nội dung
//                    new Object[]{"a",
//                        "b",
//                        "c",
//                        "d",
//                        "e",
//                        "f",
//                        "g"
//                    }
//            );
//        }
//
//        File path = new File("D:\\FPT Polytechnic\\Kì 4\\PRO1041 - DuAn1\\Assignment\\DuAn1\\YumFood");
//        exportExcel(studentData, path, "Datdeptrai");
//    }
}
