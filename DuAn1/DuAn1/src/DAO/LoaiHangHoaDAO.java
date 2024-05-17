package DAO;

import Utils.JDBC;
import java.sql.ResultSet;
import java.util.List;
import Entity.LoaiHangHoa;
import java.util.ArrayList;

public class LoaiHangHoaDAO implements YumFoodDAO<LoaiHangHoa, Integer> {

    ResultSet rs;
    String SQL_INSERT = "INSERT INTO Loai_HangHoa( TEN_HANGHOA) "
            + "VALUES ( ?)";
    String SQL_UPDATE = "UPDATE Loai_HangHoa SET TEN_HANGHOA = ? WHERE ID = ?";
    String SQL_DELETE = "DELETE FROM Loai_HangHoa WHERE ID = ?";
    String SQL_SELECTBYID = "SELECT * FROM Loai_HangHoa WHERE ID = ?";
    String SQL_SELECTALL = "SELECT * FROM Loai_HangHoa";
    String SQL_SELECTBYTEN = "SELECT * FROM Loai_HangHoa WHERE TEN_HANGHOA like ?";

    @Override
    public void insert(LoaiHangHoa entity) {
        JDBC.update(SQL_INSERT, entity.getTen_HangHoa());
    }

    @Override
    public void update(LoaiHangHoa entity) {
        JDBC.update(SQL_UPDATE, entity.getTen_HangHoa(), entity.getID());
    }

    @Override
    public void delete(Integer id) {
        JDBC.update(SQL_DELETE, id);
    }

    @Override
    public List<LoaiHangHoa> selectAll() {
        return selectBySQL(SQL_SELECTALL);
    }

    @Override
    public LoaiHangHoa SelectByID(Integer id) {
        List<LoaiHangHoa> list = selectBySQL(SQL_SELECTBYID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public LoaiHangHoa Select_By_Name(String id) {
        List<LoaiHangHoa> list = selectBySQL(SQL_SELECTBYTEN, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<LoaiHangHoa> selectBySQL(String sql, Object... args) {
        List<LoaiHangHoa> list = new ArrayList<>();
        try {
            rs = JDBC.querry(sql, args);
            while (rs.next()) {
                LoaiHangHoa loai = new LoaiHangHoa();
                loai.setID(rs.getInt("ID"));
                loai.setTen_HangHoa(rs.getString("TEN_HANGHOA"));
                list.add(loai);
            }
            return list;
        } catch (Exception e) {
            System.out.println("ERROR: LOAIHANGHOADAO");
            e.printStackTrace();
        }
        return null;
    }

}
