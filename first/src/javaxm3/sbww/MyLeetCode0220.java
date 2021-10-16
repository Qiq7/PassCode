package javaxm3.sbww;

import java.util.ArrayList;
import java.util.List;
//给定一个仅包含数字 0-9 的字符串 num 和一个目标值整数 target ，在 num 的数字之间添加 二元 运算符（不是一元）+、- 或 * ，返回所有能够得到目标值的表达式。
//

public class MyLeetCode0220 {
    int target;
    List<String> aus;
    public List<String> addOperators(String num, int target) {
        this.target=target;
        this.aus = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        String a = new String();
        f(num,0,sb,0,0);
        return aus;
    }
    public void f(String num,int i,StringBuffer sb,long now,long cur){
        if (i==num.length())
        {
            if(now==target) aus.add(sb.toString());
            return;
        }
        int signIndex = sb.length();
        if(i>0) sb.append(0);
        long val = 0;
        for (int j = i; j < num.length()&&(j==i||num.charAt(i)!='0'); j++) {
        val = val*10 + num.charAt(j)-'0';
        sb.append(num.charAt(j));
        if(i==0)
        {
            f(num, j+1, sb, val,val);
        }else {
            sb.setCharAt(signIndex,'-');
            f(num, j+1, sb, now-val,-val);
            sb.setCharAt(signIndex,'+');
            f(num, j+1, sb, now+val,val);
            sb.setCharAt(signIndex,'*');
            f(num, j+1, sb, now-cur+cur*val,cur*val);
        }
        }
        sb.setLength(signIndex);
    }
}
