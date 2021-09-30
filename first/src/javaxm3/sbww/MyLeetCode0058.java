package javaxm3.sbww;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MyLeetCode0058 {
    public static void main(String[] args) {

    }
    public static int evalRPN(String[] tokens) {
        List<Integer> a= new LinkedList<>();
        //int aus = 0;
        int a1 ,a2;
        //a.add(Integer.valueOf(tokens[0]));
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            switch (s)
            {
                case "+":
                {

                    a1 = a.get(a.size()-1);
                    a2 = a.get(a.size()-2);
                    a.remove(a.size()-1);
                    a.remove(a.size()-1);
                    a.add(a1+a2);
                } break;
                case "-":
                {
                    a1 = a.get(a.size()-1);
                    a2 = a.get(a.size()-2);
                    a.remove(a.size()-1);
                    a.remove(a.size()-1);
                    a.add(a2-a1);
                } break;
                case "/":
                {
                    a1 = a.get(a.size()-1);
                    a2 = a.get(a.size()-2);
                    a.remove(a.size()-1);
                    a.remove(a.size()-1);
                    a.add(a2/a1);
                } break;
                case "*":
                {
                    a1 = a.get(a.size()-1);
                    a2 = a.get(a.size()-2);
                    a.remove(a.size()-1);
                    a.remove(a.size()-1);
                    a.add(a1*a2);
                } break;
                default:{
                    a.add(Integer.valueOf(s));
                }
            }
        }
        return a.get(0);
    }
}
