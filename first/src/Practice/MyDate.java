package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String data = "2021-12-05 00:00:00";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date a = sdf.parse(data);
        System.out.println(sf.format(date));
        System.out.println(a);
        String q = sf.format(date);
        Date c = sdf.parse(q+" 00:00:00");
        System.out.println(c);
        //System.out.println(date);



    }

}
