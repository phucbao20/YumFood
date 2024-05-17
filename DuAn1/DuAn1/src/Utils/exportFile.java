/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
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
 * @author PHUCBAO
 */
public class exportFile {

    public static boolean exportExcel(Map<String, Object[]> studentData, File path, String sheetName) {
        FileOutputStream out = null;
        XSSFWorkbook workbook = new XSSFWorkbook();
        try {
            if (path.exists()) {
                workbook = new XSSFWorkbook(new FileInputStream(path));
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(exportFile.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(exportFile.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
//send mail ko can xuat file
    public static File exportExcelBySendingEmail(Map<String, Object[]> studentData, String sheetName) {
        FileOutputStream out = null;
        XSSFWorkbook workbook = new XSSFWorkbook();
        File path = new File("D://report");
        try {

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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(exportFile.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(exportFile.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return path;
    }
}
