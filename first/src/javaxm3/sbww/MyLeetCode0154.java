package javaxm3.sbww;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0154 {
    public static void main(String[] args) {

    }
    public List<Integer> pathInZigZagTree(int label) {
        int row = 1,sta = 1;
        while (sta*2<=label)
        {
            row++;
            sta*=2;
        }
        if(row%2==0)
        {
            label = f(label,row);
        }
        List<Integer> aus = new LinkedList<>();
        while (row>0)
        {
            if(row%2==0)
            {
                aus.add(f(label,row));
            }else {
                aus.add(label);
            }
            row--;
            label=label/2;
        }
        Collections.reverse(aus);
        return aus;
    }
    public int f(int label,int row)
    {
        return (1<<(row - 1))+(1<<row) - 1- label;
    }
}
