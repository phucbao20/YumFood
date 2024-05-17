package DAO;

import Entity.HoaDonChiTiet;
import Utils.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HoaDonChiTietDAO implements YumFoodDAO<HoaDonChiTiet, Integer> {

    ResultSet rs;
    String SQL_INSERT = "  INSERT INTO HOADONCHITIET ( MAHD, MASP, SL, GIA, GHICHU)"
            + " VALUES (?, ?, ?, ?, ?);";
    String SQL_UPDATE = "UPDATE HOADONCHITIET SET  SL = ?, GHICHU = ? WHERE MAHD = ? AND MASP = ?";
    String SQL_DELETE = "DELETE FROM HOADONCHITIET WHERE MACT = ?";
    String SQL_SELECTBY_MAHD = "SELECT * FROM HOADONCHITIET WHERE MAHD = ?";
    String SQL_SELECTALL = "SELECT * FROM HOADONCHITIET";

    @Override
    public void insert(HoaDonChiTiet entity) {
        JDBC.update(SQL_INSERT, entity.getMaHD(), entity.getMaSP(),
                entity.getSoLuong(), entity.getGia(), entity.getGhiChu());
    }

    @Override
    public void update(HoaDonChiTiet entity) {
        JDBC.update(SQL_UPDATE,entity.getSoLuong(), entity.getGhiChu(),entity.getMaHD(), entity.getMaSP());
    }

    @Override
    public void delete(Integer id) {
        JDBC.update(SQL_DELETE, id);
    }

    @Override
    public List<HoaDonChiTiet> selectAll() {
        return selectBySQL(SQL_SELECTALL);
    }

    @Override
    public HoaDonChiTiet SelectByID(Integer id) {
        List<HoaDonChiTiet> list = selectBySQL(SQL_SELECTBY_MAHD, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDonChiTiet> selectBySQL(String sql, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            // MAHD, MASP, SL, GIA, THANHTIEN
            rs = JDBC.querry(sql, args);
            while (rs.next()) {
                HoaDonChiTiet hd = new HoaDonChiTiet();
                hd.setMaHDCT(rs.getInt("MACT"));
                hd.setMaHD(rs.getInt("MAHD"));
                hd.setMaSP(rs.getString("MASP"));
                hd.setSoLuong(rs.getInt("SL"));
                hd.setGia(rs.getInt("GIA"));
                hd.setGhiChu(rs.getString("GHICHU"));
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            System.out.println("ERROR: HOADONCHITIETDAO");
            e.printStackTrace();
        }
        return null;
    }

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBC.querry(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);// doc cac gtri cua mang
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Object[]> getDanhSachSanPham_HoaDonChiTiet(int mahd) {
        String sql = "{CALL DanhSachSanPham_HoaDonChiTiet(?) }";
        String[] cols = {"STT", "TENSANPHAM", "SL", "GIA", "THANH TIEN", "GHICHU"};
        return this.getListOfArray(sql, cols, mahd);

    }

    public List<Object[]> getTHONGTIN_KHACHHANG_NHANVIEN(int mahd) {
        String sql = "{CALL THONGTIN_KHACHHANG_NHANVIEN(?) }";
        String[] cols = {"HO TEN KHACH HANG", "SDT KHACH HANG", "HO TEN NHAN VIEN", "SDT NHAN VIEN"};
        return this.getListOfArray(sql, cols, mahd);

    }

    public List<Object[]> getThanhToan(int mahd) {
        String sql = "{CALL THANHTOAN(?) }";
        String[] cols = {"TONG TIEN", "GIAM GIA", "GHI CHU", "THANH TOAN"};
        return this.getListOfArray(sql, cols, mahd);

    }
    
    public List<Object[]> getTien_ThanhToan(int mahd, double kd) {
        String sql = "{CALL TIEN_THANHTOAN(?,?) }";
        String[] cols = {"MAHD", "THANHTIEN", "KHACHDUA", "TRALAI"};
        return this.getListOfArray(sql, cols, mahd,kd);

    }
    
    public HoaDonChiTiet selectby_MaHD_MASP(int mahd, String masp){
        String sql = "SELECT * FROM HOADONCHITIET WHERE MAHD = ? AND MASP = ?";
        List<HoaDonChiTiet> list = selectBySQL(sql, mahd,masp);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    
    public void delete_mahd(Integer mahd){
        String sql = "DELETE FROM HOADONCHITIET WHERE MAHD = ?";
        JDBC.update(sql, mahd);
    }
    
    public void update_SoLuong_SanPham(HoaDonChiTiet hdct){
        String sql = "UPDATE HOADONCHITIET SET SL = SL + ?, GHICHU = GHICHU + " + " " +" + ? WHERE MAHD = ? AND MASP = ?";
        JDBC.update(sql, hdct.getSoLuong(),hdct.getGhiChu(),hdct.getMaHD(),hdct.getMaSP());
    }
    
    
}
