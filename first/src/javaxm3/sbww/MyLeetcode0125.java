package javaxm3.sbww;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyLeetcode0125 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(readBinaryWatch(1).toArray()));
    }
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> a = new ArrayList<>();
        int s = 3,f = 5;
        if(turnedOn > s+f)
            return a;
        for (int i = 0; i < 12; i++) {
            String ch,aus;
                aus = String.valueOf(i)+":";

            for (int j = 0; j < 60; j++) {
                if(j<10)
                {
                    ch = "0"+String.valueOf(j);
                }else {
                    ch = String.valueOf(j);
                }
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn)
                {
                    a.add(aus+ch);
                }
            }
        }
        return a;
    }
}
