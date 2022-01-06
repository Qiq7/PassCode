package mysqlTest;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DBUtils {
    static private Properties p=new Properties();
    static {
        InputStream is= DBUtils.class.getResourceAsStream("/db.properties");
        try {
            p.load(is);
            Class.forName(p.getProperty("driver"));
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(String s)
    {
        Connection c=null;
        try
        {
            c= DriverManager.getConnection(p.getProperty("url0")+s,p.getProperty("user"),p.getProperty("password"));

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return c;
    }
    public static Connection getConnection()
    {
        Connection c=null;
        try
        {
            c= DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("password"));

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return c;
    }
    public static void closeAll(Connection c, Statement s, ResultSet re)
    {
        try
        {
            if(re!=null) re.close();
            if(s!=null) s.close();
            if(c!=null) c.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
