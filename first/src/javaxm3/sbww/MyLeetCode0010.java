package javaxm3.sbww;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyLeetCode0010 {
    public static void main(String[] args) {
        String a="PAYPALISHIRING";
        System.out.println(convert(a,4));
    }
    public static String convert(String s,int numRows)
    {
        if(numRows==1) return s;
        List<StringBuffer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(new StringBuffer());
        }
        int flag=-1,i=0;
        for (char c:s.toCharArray()) {
            row.get(i).append(c);
            if(i==0||i==numRows-1) flag=-flag;
            i+=flag;
        }
        StringBuffer ans=new StringBuffer();
        for (StringBuffer r:row) {
            ans.append(r);
        }
        return ans.toString();
    }
}
