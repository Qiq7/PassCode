package mysqlTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws Exception{
        Connection c=DBUtils.getConnection();
        PreparedStatement ps=c.prepareCall("select * from student");
        ResultSet r= ps.executeQuery();
        while (r.next())
        {
            System.out.println(r.getString(1));
        }
    }

}
