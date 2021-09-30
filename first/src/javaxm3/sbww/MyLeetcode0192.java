package javaxm3.sbww;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyLeetcode0192 {
    public static void main(String[] args) {

    }
    public boolean checkValidString(String s) {

        Deque<Integer> lq = new LinkedList<>();
        Deque<Integer> xq = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(')
            {
                lq.push(i);
            }else if (s.charAt(i)=='*')
            {
                xq.push(i);
            }else{
                if(!lq.isEmpty())
                {
                    lq.poll();
                }else if(!xq.isEmpty())
                    {
                        xq.poll();
                    }else {
                    return false;
                }
            }
        }

        while (!xq.isEmpty()&&!lq.isEmpty()){
            int l = lq.poll();
            int x = xq.poll();
            if(x < l)
            {
                return false;
            }

        }
        return lq.isEmpty();

    }
}
