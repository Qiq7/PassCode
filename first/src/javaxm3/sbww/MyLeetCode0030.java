package javaxm3.sbww;
//over#118
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0030 {
    public static void main(String[] args) {
        System.out.println(generate(0));
    }
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> a=new LinkedList<>();
        List<Integer> b=new LinkedList<>();
        if(numRows==0) return a;
        b.add(1);
        a.add(b);
        for (int i = 1; i < numRows; i++) {
            List<Integer> c=a.get(i-1);
            List<Integer> d=new LinkedList<>();
            d.add(1);
            for (int j = 0; j < i-1; j++) {
                    int x=c.get(j+1);
                    int y=c.get(j);
                    d.add(x+y);
            }
            d.add(1);
            a.add(d);
        }


        return a;
    }
}
