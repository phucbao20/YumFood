
package Utils;
import java.sql.*;

public class JDBC {
    // kết nối SQL
    public static Connection getConnection()
    {
        try {
            String URL = "jdbc:sqlserver://localhost;databaseName=YumFood;user=sa;password=123456;encrypt=false; ";
           // String URL = "jdbc:sqlserver://localhost;databaseName=LAB5_JAVA3;username=sa;password=080304;encrypt=false";
            return DriverManager.getConnection(URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static PreparedStatement pre(String sql, Object...args)
    {
        try
        {
            PreparedStatement preS = null;
            if(sql.contains("{"))
            {
                preS = getConnection().prepareCall(sql);
            }
            else
            {
                preS = getConnection().prepareStatement(sql);
            }
            for (int i = 0; i < args.length; i++)
            {
                preS.setObject(i+1, args[i]);
            }
            return preS;
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public static ResultSet querry(String sql, Object...args)
    {
        try 
        {
            PreparedStatement state = JDBC.pre(sql, args);
            return state.executeQuery();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    return null;
    }
    
    public static void update(String sql, Object...args)
    {
        try
        {
            getConnection();
            PreparedStatement state = JDBC.pre(sql, args);
            state.executeUpdate();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
