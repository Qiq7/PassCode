package javaxm3.sbww;

import java.util.HashSet;
import java.util.Set;

public class MyLeetCode0231 {
    Set<String> set = new HashSet<>();
    public boolean reorderedPowerOf2(int n) {
        init();
        return set.contains(f(n));
    }
    public void init(){
        for (int i = 1; i < 1e9;i<<=1 ) {
            set.add(f(i));
            System.out.println("o");
        }
    }
    public String f(int n){
        char[] a = new char[10];
        while (n>0){
            ++a[n%10];
            n/=10;
            System.out.println("k");
        }
        return new String(a);
    }
}
