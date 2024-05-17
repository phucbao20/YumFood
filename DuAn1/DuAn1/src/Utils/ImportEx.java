/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.sql.*;
import Utils.JDBC;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 *
 * @author space
 */
public class ImportEx { 
    public static boolean importFileExcel(String sql, File path) {
        final int batchSize = 1000;
        Connection con = JDBC.getConnection();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            con.setAutoCommit(false);
            int insertCount = 0;
            // Mở file Excel
            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(path));
            // Lấy sheet đầu tiên trong file Excel
            Sheet sheet = workbook.getSheetAt(0);
            // Lặp qua tất cả các hàng trong sheet
            for (Row row : sheet) {
                int index = 0;
                for (Cell cell : row) {
                    if (cell.getCellType() == 1) {
                        if (cell.getStringCellValue().equalsIgnoreCase("Trưởng Phòng") || cell.getStringCellValue().equalsIgnoreCase("Nhân viên")) {
                            ps.setObject(index + 1, (cell.getStringCellValue().equalsIgnoreCase("Trưởng Phòng") ? "1" : "0"));
                        } else if (cell.getStringCellValue().equalsIgnoreCase("Nam") || cell.getStringCellValue().equalsIgnoreCase("Nữ")) {
                            ps.setObject(index + 1, (cell.getStringCellValue().equalsIgnoreCase("Nam") ? "1" : "0"));
                        } else {
                            ps.setObject(index + 1, cell.getStringCellValue());
                        }
                    }
                    if (cell.getCellType() == 0) {
                        ps.setObject(index + 1, cell.getNumericCellValue());
                        if (DateUtil.isCellDateFormatted(cell)) {
                            ps.setObject(index + 1, cell.getDateCellValue());
                        }
                    }
                    index++;
                }
                ps.addBatch();
                if (++insertCount % batchSize == 0) {
                    ps.executeBatch();
                }
            }
            workbook.close();
            ps.executeBatch();
            con.commit();
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                java.util.logging.Logger.getLogger(ImportEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            ex.printStackTrace();
            return false;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(ImportEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                return false;
            }
        }
        return true;
    }
}
