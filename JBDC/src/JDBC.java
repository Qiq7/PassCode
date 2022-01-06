import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/test";
        String user="root";
        String password="123456";
        Connection c= DriverManager.getConnection(url,user,password);

        Statement s = c.createStatement();
//      String sql= "insert into student value('xiaohei',21,'2000.2.5');";

//        if(s.executeUpdate(sql)==1)
//        {
//            System.out.println("ok");
//        }else {
//            System.out.println("on");
//        }
//        System.out.println(s.executeUpdate(sql));
//        String sql0= "delete from student where name ='xiaohei '";
//        System.out.println(s.executeUpdate(sql0));
//        System.out.println(c==null);
        String s0= "select * from student;";
        ResultSet s1=s.executeQuery(s0);
        while (s1.next())
        {
            String a=s1.getString(1);
            String b=s1.getString(2);
            String d=s1.getString(3);
            System.out.println(a+"\t"+b+"\t"+d);
        }
        s1.close();
        s.close();
        c.close();
    }
}
