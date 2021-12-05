package javaxm3.sbww;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyLeetCode0230 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> aus = new ArrayList<>();
        Set<String> cur = new HashSet<>();
        cur.add(s);
        while (true){
            for (String x:cur) {
                if(isOk(x)){
                    aus.add(x);
                }
            }
            if(aus.size()>0) return aus;

            Set<String> next = new HashSet<>();
            for (String a:cur) {
                for (int i = 0; i < a.length(); i++) {
                    if (i>0&&a.charAt(i)==a.charAt(i-1)){
                        continue;
                    }
                    if (a.charAt(i)=='('||a.charAt(i)==')'){
                        next.add(a.substring(0,i)+a.substring(i+1));
                    }
                }
            }
            cur = next;
        }
    }
    public boolean isOk(String s){
        char[] aus = s.toCharArray();
        int count = 0;
        for (char x:aus) {
            if(x=='('){
                count++;
            }else if(x==')'){
                count--;
                if(count<0) return false;
            }
        }
        return count==0;
    }
}
