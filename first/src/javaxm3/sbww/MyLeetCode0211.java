package javaxm3.sbww;

//给定两个整数，分别表示分数的分子 numerator 和分母 denominator，以 字符串形式返回小数 。
//
//如果小数部分为循环小数，则将循环的部分括在括号内。
//
//如果存在多个答案，只需返回 任意一个 。
//
//对于所有给定的输入，保证 答案字符串的长度小于 104 。
//

import java.util.HashMap;
import java.util.Map;

public class MyLeetCode0211 {
    public String fractionToDecimal(int numerator, int denominator) {
        long a = (long) numerator,b = (long)denominator;
        if(a%b==0) return String.valueOf(a/b);

        StringBuffer sb = new StringBuffer();
        if(a<0^b<0)
        {
            sb.append('-');
        }

        a = Math.abs(a);
        b = Math.abs(b);

        sb.append(a/b);
        sb.append('.');

        StringBuffer f = new StringBuffer();
        int index = 0;
        long c = a%b;
        Map<Long,Integer> map = new HashMap<>();
        while (c!=0&&!map.containsKey(c))
        {
            map.put(c,index);
            c*=10;
            f.append(c/b);
            c%=b;
            index++;
        }
        if(c!=0)
        {
            f.insert((int)map.get(c),'(');
            f.append(')');
        }
        sb.append(f.toString());
        return sb.toString();

    }
}
