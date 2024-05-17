package DAO;

import Entity.LoaiGiamGia;
import Utils.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoaiGiamGiaDAO implements YumFoodDAO<LoaiGiamGia, String> {

    ResultSet rs;
    String SQL_INSERT = "  INSERT INTO LOAIGIAMGIA "
            + "(MAGG, TENCT, NGAYBD, NGAYKT, GIATRI)"
            + " VALUES (?, ?, ?, ?, ?);";
    String SQL_UPDATE = "UPDATE LOAIGIAMGIA SET TENCT = ?, NGAYBD = ?, NGAYKT = ?, GIATRI = ? "
            + " WHERE MAGG = ?";
    String SQL_DELETE = "DELETE FROM LOAIGIAMGIA WHERE MAGG = ?";
    String SQL_SELECTBYID = "SELECT * FROM LOAIGIAMGIA WHERE MAGG = ?";
    String SQL_SELECTALL = "SELECT * FROM LoaiGiamGia";
    String SQL_SELECTBY_TENCT = "SELECT * FROM LOAIGIAMGIA WHERE TENCT LIKE ?";

    @Override
    public void insert(LoaiGiamGia entity) {
        JDBC.update(SQL_INSERT, entity.getMaGG(), entity.getTenCT(), entity.getNgayBD(),
                 entity.getNgayKT(), entity.getGiaTri());
    }

    @Override
    public void update(LoaiGiamGia entity) {
        JDBC.update(SQL_UPDATE, entity.getTenCT(), entity.getNgayBD(),
                 entity.getNgayKT(), entity.getGiaTri(), entity.getMaGG());
    }

    @Override
    public void delete(String id) {
        JDBC.update(SQL_DELETE, id);
    }

    @Override
    public List<LoaiGiamGia> selectAll() {
        return selectBySQL(SQL_SELECTALL);
    }

    @Override
    public LoaiGiamGia SelectByID(String id) {
        List<LoaiGiamGia> list = selectBySQL(SQL_SELECTBYID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<LoaiGiamGia> selectBySQL(String sql, Object... args) {
        List<LoaiGiamGia> list = new ArrayList<>();
        // MAGG, TENCT, NGAYBD, NGAYKT, GIATRI
        try {
            rs = JDBC.querry(sql, args);
            while (rs.next()) {
                LoaiGiamGia loai = new LoaiGiamGia();
                loai.setMaGG(rs.getString("MAGG"));
                loai.setTenCT(rs.getString("TENCT"));
                loai.setNgayBD(rs.getDate("NGAYBD"));
                loai.setNgayKT(rs.getDate("NGAYKT"));
                loai.setGiaTri(rs.getInt("GIATRI"));
                list.add(loai);
            }
            return list;
        } catch (Exception e) {
            System.out.println("ERROR: LOAIGIAMGIADAO");
            e.printStackTrace();
        }
        return null;
    }

    public LoaiGiamGia selectBy_tenct(String name) {
        List<LoaiGiamGia> list = selectBySQL(SQL_SELECTBY_TENCT, name);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
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

    public List<Object[]> getGiamGia(Date date) {
        String sql = "{CALL GIAMGIA(?) }";
        String[] cols = {"GIATRI", "GHICHU"};
        return this.getListOfArray(sql, cols, date);

    }

}
