
package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.sql.*;
import Utils.JDBC;
import java.time.LocalDate;


public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql, String[] cols, Object ...args)
    {
        try
        {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBC.querry(sql, args);
            while (rs.next())
            {                
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++)
                {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        return null;
    }
    public List<Object[]> getDoanhThuTheoNgay(Date date)
    {
        String sql = "{CALL THONGKE_NGAYHIENTAI(?)}";
        String cols[] = {"STT", "TENSANPHAM" , "SOLUONG" , "THANHTIEN", "GIAMGIA", "THANHTOAN"};
        return this.getListOfArray(sql, cols,date);
    }
    
    public List<Object[]> getTongDoanhThu_NGAYHIENTAI(Date date){
        String sql = "{Call DOANHTHU_NGAYHIENTAI(?)}";
        String cols[] = {"TONG DOANH THU", "So Hoa Don"};
        return this.getListOfArray(sql, cols, date);
    }
    public List<Object[]> getSanPhamBanChay(Date date){
        String sql = "{Call DoanhThu_THONGKE_NGAYHIENTAI(?)}";
        String cols[] = {"STT", "TenSanPham", "SO LUONG", "GIA", "Thanhtien"};
        return this.getListOfArray(sql, cols, date);
    }
    
    public List<Object[]> getDoanhThuTong(Date startdate, Date enddate){
        String sql = "{Call DoanhThu_THONGKE_TIME (?, ?)}";
        String clos[] = {"STT", "TenSanPham","So luong", "Gia", "Giam Gia", "Thanh Tien"};
        return this.getListOfArray(sql, clos, startdate, enddate);
    }
    public List<Object[]> getTongDoanhThuTheoKhoang(Date startdate, Date enddate){
        String sql = "{Call DoanhThu_FROMDATE_TODATE (?, ?)}";
        String cols[] = {"So hoa don", "Tong doanh thu", "Khoang thoi gian"};
        return this.getListOfArray(sql, cols, startdate, enddate);
    }
    public List<Object[]> getSPBanChay(){
        String sql = "{Call SANPHAM_BANCHAYNHAT}";
        String cols[] = {"STT", "LoaiHang", "TenSanPham", "SoLuong","GiaBan", "ThanhTien"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getBieuDo(Date startdate, Date enddate){
        String sql = "{Call BIEUDO_DOANHTHU_TheoNgay(?,?)}";
        String cols[] = {"Ngay", "TongDoanhThu"};
        return this.getListOfArray(sql, cols, startdate, enddate);
    }
}
