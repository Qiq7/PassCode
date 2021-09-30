package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCount {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        String a = "2000-1-1 00:00:00";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(a);

        int ny = calendar.get(Calendar.YEAR);
        int nM = calendar.get(Calendar.MONTH);
        int nd = calendar.get(Calendar.DAY_OF_MONTH);

        calendar.setTime(date);

        int by = calendar.get(Calendar.YEAR);
        int bM = calendar.get(Calendar.MONTH);
        int bd = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(ny-by);
        Date Ndate = new Date();
        calendar.setTime(Ndate);
        System.out.println(calendar);

    }
}
