import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class play {
    public static void main(String[] args) throws Exception{
        Connection c=DBUtils.getConnection("test");
        String s="select * from student";
        Statement st= c.createStatement();
        ResultSet r=st.executeQuery(s);
        while (r.next())
        {
            String a=r.getString(1);
            String b=r.getString(2);
            String d=r.getString(3);
            System.out.println(a+"\t"+b+"\t"+d);
        }
        DBUtils.closeAll(c,st,r);
    }
}
