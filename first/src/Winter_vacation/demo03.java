package Winter_vacation;

import java.util.*;

public class demo03 {
    public static class sb
    {
        int a,b;
        sb(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
    public static void main(String[] args) {
        List<sb> a=new LinkedList<>();
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            int c=r.nextInt(10);
            int c2=r.nextInt(25);
            a.add(new sb(c,c2));
        }
        Collections.sort(a, new Comparator<sb>() {
            @Override
            public int compare(sb o1, sb o2) {
                return o2.a-o1.a;
            }
        });
        for (sb s:a) {
            System.out.println(s.a+"   " +s.b);
        }
    }
}
