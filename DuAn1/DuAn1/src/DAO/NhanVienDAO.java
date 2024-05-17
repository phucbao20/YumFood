package DAO;

import Entity.NhanVien;
import Utils.JDBC;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class NhanVienDAO implements YumFoodDAO<NhanVien, String> {

    ResultSet rs;
    String SQL_INSERT = "INSERT INTO NHANVIEN(MANV, MATKHAU, HOTEN, SDT, EMAIL, GIOITINH, DIACHI, VAITRO) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    String SQL_UPDATE = "UPDATE NHANVIEN SET MATKHAU = ? HOTEN = ? SDT = ? EMAIL = ? GIOITINH = ? "
            + "DIACHI = ? VAITRO = ? WHERE MANV = ?";
    String SQL_DELETE = "DELETE FROM NHANVIEN WHERE MANV = ?";
    String SQL_SELECTBYID = "SELECT * FROM NHANVIEN WHERE MANV = ?";
    String SQL_SELECTALL = "SELECT * FROM NHANVIEN";

    String SQL_UpdateMatKhau = "Update NhanVien set MatKhau = ? where Manv = ? ";

    @Override
    public void insert(NhanVien entity) {
        JDBC.update(SQL_INSERT, entity.getMaNV(), entity.getMatKhau(), entity.getHoTen(), entity.getSDT(),
                entity.getEmail(), entity.isGioiTinh(), entity.getDiaChi(), entity.isVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        JDBC.update(SQL_UPDATE, entity.getMatKhau(), entity.getHoTen(), entity.getSDT(), entity.getEmail(),
                entity.isGioiTinh(), entity.getDiaChi(), entity.isVaiTro(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        JDBC.update(SQL_DELETE, id);
    }

    @Override
    public List<NhanVien> selectAll() {

        return selectBySQL(SQL_SELECTALL);
    }

    @Override
    public NhanVien SelectByID(String id) {
        List<NhanVien> list = this.selectBySQL(SQL_SELECTBYID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            rs = JDBC.querry(sql, args);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setMatKhau(rs.getString("MATKHAU"));
                nv.setHoTen(rs.getString("HOTEN"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("EMAIL"));
                nv.setGioiTinh(rs.getBoolean("GIOITINH"));
                nv.setDiaChi(rs.getString("DIACHI"));
                nv.setVaiTro(rs.getBoolean("VAITRO"));
                list.add(nv);
            }
            return list;
        } catch (Exception e) {
            System.out.println("ERROR: NHANVIENDAO");
            e.printStackTrace();
        }

        return null;
    }

    public void UpdateMatKhau(NhanVien entity) {
        JDBC.update(SQL_UpdateMatKhau, entity.getMatKhau(), entity.getMaNV());
    }

}
