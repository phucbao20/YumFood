
package DAO;

import Entity.SanPham;
import Utils.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class SanPhamDAO implements YumFoodDAO<SanPham, String>
{
    ResultSet rs;
    String SQL_INSERT = "INSERT INTO SANPHAM (MASP, TENSANPHAM, GIA, MOTA, HINH, maLoai) VALUES (?, ?, ?, ?, ?, ?);";
    String SQL_UPDATE = "UPDATE SANPHAM SET TENSANPHAM = ?, GIA = ? ,MOTA = ?, HINH = ?, maLoai = ? WHERE MASP = ?";
    String SQL_DELETE = "DELETE FROM SANPHAM WHERE MASP = ?";
    String SQL_SELECTBYID = "SELECT * FROM SANPHAM WHERE MASP = ?";
    String SQL_SELECTALL = "SELECT * FROM SANPHAM";
    @Override
    public void insert(SanPham entity) 
    {
        JDBC.update(SQL_INSERT, entity.getMaSP(), entity.getTenSP(), entity.getGia(), 
                entity.getMoTa(), entity.getHinh(), entity.getmaLoai());
    }

    @Override
    public void update(SanPham entity)
    {
        JDBC.update(SQL_UPDATE, entity.getTenSP(), entity.getGia(),entity.getMoTa(), 
                entity.getHinh(), entity.getmaLoai(), entity.getMaSP());
    }

    @Override
    public void delete(String id) 
    {
        JDBC.update(SQL_DELETE, id);
    }

    @Override
    public List<SanPham> selectAll() 
    {
        return selectBySQL(SQL_SELECTALL);
    }

    @Override
    public SanPham SelectByID(String id) 
    {
        List<SanPham> list = selectBySQL(SQL_SELECTBYID, id);
        if(list.isEmpty())
        {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<SanPham> selectBySQL(String sql, Object... args)
    {
        // MASP, TENSANPHAM, GIA, MOTA, HINH, ID
        List<SanPham> list = new ArrayList<>();
        try
        {
            rs = JDBC.querry(sql, args);
            while (rs.next())
            {                
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("MASP"));
                sp.setTenSP(rs.getString("TENSANPHAM"));
                sp.setGia(rs.getDouble("GIA"));
                sp.setMoTa(rs.getString("MOTA"));
                sp.setHinh(rs.getString("HINH"));
                sp.setmaLoai(rs.getInt("maLoai"));
                list.add(sp);
            }
            return list;
        } catch (Exception e) 
        {
            System.out.println("ERROR: SANPHAMDAO");
            e.printStackTrace();
        }
        return null;
        
    }
    
    public List<SanPham> SelectSanPham_ByKeyword(String name){
        String sql = "select * from sanpham where tensanpham like ?";
        List<SanPham> list = selectBySQL(sql,"%"+name+"%");
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
    public SanPham SelectSanPham_ByName(String name){
        String sql = "select * from sanpham where tensanpham like ?";
        List<SanPham> list = selectBySQL(sql, name );
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
    

    
}
