
package DAO;

import Entity.HoaDon;
import Utils.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HoaDonDAO  implements YumFoodDAO<HoaDon, Integer>{
    ResultSet rs;
    String SQL_INSERT = "  INSERT INTO HOADON "
            + "( TENKH, SDT_KH, NGAYTAO, GiaTriGiamGia, MANV, GHICHU)"
            + " VALUES ( ?, ?, ?, ?, ?, ?);";
    String SQL_UPDATE = "UPDATE HOADON SET TENKH = ? ,SDT_KH = ?, GiaTriGiamGia = ?, "
            + " MANV = ? , GHICHU = ? WHERE MAHD = ?";
    String SQL_DELETE = "DELETE FROM HOADON WHERE MAHD = ?";
    String SQL_SELECTBYID = "SELECT * FROM HOADON WHERE MAHD = ?";
    String SQL_SELECTALL = "SELECT * FROM HOADON";
    @Override
    public void insert(HoaDon entity)
    {
        JDBC.update(SQL_INSERT, entity.getTenKH(), entity.getSDT_KH()
        , entity.getNgayTao(), entity.getGiatrigg(), entity.getMaNV(), entity.getGhiChu());
    }

    @Override
    public void update(HoaDon entity) 
    {
        JDBC.update(SQL_UPDATE, entity.getTenKH(), entity.getSDT_KH()
        , entity.getGiatrigg(), entity.getMaNV(), entity.getGhiChu(), entity.getMaHD());
    }

    @Override
    public void delete(Integer id) 
    {
        JDBC.update(SQL_DELETE, id);
    }

    @Override
    public List<HoaDon> selectAll()
    {
        return selectBySQL(SQL_SELECTALL);
    }

    @Override
    public HoaDon SelectByID(Integer id)
    {
        List<HoaDon> list = selectBySQL(SQL_SELECTBYID, id);
        if(list.isEmpty())
        {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDon> selectBySQL(String sql, Object... args) 
    {
//        MAHD, TENKH, SDT_KH, NGAYTAO, THANHTIEN, GIAMGIA, TONGTIEN, KHACHDUA, THOILAI, MANV, GHICHU
        List<HoaDon> list = new ArrayList<>();
        try 
        {
            rs = JDBC.querry(sql, args);
            while (rs.next())
            {                
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getInt("MAHD"));
                hd.setTenKH(rs.getString("TENKH"));
                hd.setSDT_KH(rs.getString("SDT_KH"));
                hd.setNgayTao((Date) rs.getObject("NGAYTAO"));
                hd.setGiatrigg(rs.getInt("GIATRIGIAMGIA"));
                hd.setMaNV(rs.getString("MANV"));
                hd.setGhiChu(rs.getString("GHICHU"));
                list.add(hd);
            }
            return list;
        } catch (Exception e) 
        {
            System.out.println("ERROR: HOADONDAO");
            e.printStackTrace();
        }
        return null;
    }
    
    private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBC.querry(sql, args);
            while (rs.next()) {                
                Object[] vals = new Object[cols.length];
                for(int i = 0; i < cols.length ; i++){
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
    
    public List<Object[]> getDANHSACH_HOADON(){
        String sql = "{CALL DANHSACH_HOADON }";
        String[] cols = {"MAHD", "TENKH", "SDT_KH","NGAYTAO","TONG TIEN","MANV"};
        return this.getListOfArray(sql, cols);
    
    }
    
}
