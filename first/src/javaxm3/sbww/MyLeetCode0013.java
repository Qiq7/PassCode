package javaxm3.sbww;
//over#1276
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyLeetCode0013 {
    public static void main(String[] args) {
        List<Integer> a=numOfBurgers(16,7);
        Iterator b=a.iterator();
        while (b.hasNext())
        {
            System.out.println(b.next());
        }
    }
    public static List<Integer> numOfBurgers(int tomatoSlices,int cheeseSlices)
    {
        List<Integer> a=new ArrayList<>();
        if(tomatoSlices%2!=0||cheeseSlices*4<tomatoSlices||cheeseSlices*2>tomatoSlices)
            return a;
        else
        {
            a.add(tomatoSlices/2-cheeseSlices);
            a.add(cheeseSlices-(tomatoSlices/2-cheeseSlices));
        }
        return a;
    }
}
