package javaxm3.sbww;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class MyLeetCode0064 {
    public static void main(String[] args) {
        System.out.println(clumsy(4));
    }
    public static int clumsy(int N) {
        int aus = 0;
        Deque<Integer> a = new LinkedList<>();
        char[] c = {'*','/','+','-'};
        int j = 0;
        a.addLast(N);
        int t ;
        for (int i = N - 1; i >= 1 ; i--) {
            if(c[j%4]=='*')
            {
                t = a.getLast();
                a.removeLast();
                a.addLast(t*i);
            }else if(c[j%4]=='/'){
                t = a.getLast();
                a.removeLast();
                a.addLast(t/i);
            }else if(c[j%4]=='+')
            {
                a.addLast(i);
            }else {
                a.addLast(-i);
            }
            j++;
        }
        while (!a.isEmpty()){
            aus += a.pop();
        }
        return aus;
    }
}
