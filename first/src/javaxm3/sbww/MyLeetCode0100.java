package javaxm3.sbww;

import java.util.HashMap;

public class MyLeetCode0100 {
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
    public static int romanToInt(String s) {
        int [] num = {
           1,4,5,9,10,40,50,90,100,400,500,900,1000
        };
        String [] rom = {
          "I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"
        };
        HashMap<String,Integer> m = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            m.put(rom[i],num[i]);
        }
        int aus = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(s.charAt(i));
            if(i!=s.length()-1)
            {
                sb.append(s.charAt(i+1));
                if (!m.containsKey(sb.toString())){
                    sb.deleteCharAt(sb.length()-1);
                }else {
                    i++;
                }
            }
            //System.out.println(sb);
            aus += m.get(sb.toString());
        }
        return aus;
    }
}
