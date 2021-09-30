package javaxm3.sbww;

import java.util.ArrayList;
import java.util.List;

public class MyLeetCode0040 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> a=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int x=i;int j=i;
            while(j<s.length()&&s.charAt(x)==s.charAt(j))
            {
                j++;
            }
            if(j-1-i>=2)
            {
                List<Integer> b=new ArrayList<>();
                b.add(x);
                b.add(j-1);
                a.add(b);
                i=j-1;
            }
        }
        return a;
    }
}
