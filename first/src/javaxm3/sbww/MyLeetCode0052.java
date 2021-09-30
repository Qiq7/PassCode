package javaxm3.sbww;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class MyLeetCode0052 {
    public static void main(String[] args) {

    }
    public int calculate(String s)
    {
        Deque<Integer> d=new LinkedList<>();
        int num = 0,aus = 0;
        char p = '+';
        for (int i = 0; i < s.length(); i++) {
            if( Character.isDigit(s.charAt(i)))
            {
                num = num*10+s.charAt(i)-'0';
            }
            if(!Character.isDigit(s.charAt(i))&&s.charAt(i)!=' '||i==s.length()-1)
            {
                switch (p)
                {
                    case '+':{
                        d.push(num);break;
                    }
                    case '*':{
                        d.push(d.pop()*num);
                        break;
                    }
                    case '-': {
                        d.push(-num);break;
                    }
                    case '/': {
                        d.push(d.pop()/num);break;
                    }
                }
                p = s.charAt(i);
                num = 0;
            }
        }
        while (!d.isEmpty())
        {
            aus+=d.pop();
        }
        return aus;
    }
}
