package javaxm3.sbww;

import java.util.Deque;
import java.util.LinkedList;

public class MyLeetCode0109 {
    public static void main(String[] args) {

    }
    public static String reverseParentheses(String s) {
        Deque<String> d = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                d.push(sb.toString());
                sb.setLength(0);
            }else if(ch == ')'){
                sb.reverse();
                sb.insert(0,d.pop());
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
