import java.lang.management.ManagementFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtils {
    public static Connection getConnection(String s)
    {
        Connection c=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user="root";
            String password="123456";
            String url="jdbc:mysql://localhost:3306/"+s;
            c = DriverManager.getConnection(url,user,password);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return c;
    }
    public static void closeAll(Connection c, Statement s, ResultSet r)
    {
        try
        {
            if(r!=null) r.close();
            if(s!=null) s.close();
            if(c!=null) c.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
