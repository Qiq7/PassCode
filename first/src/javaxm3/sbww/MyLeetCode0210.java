package javaxm3.sbww;

import javax.swing.plaf.IconUIResource;

//给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。
//
//注意:
//
//十六进制中所有字母(a-f)都必须是小写。
//十六进制字符串中不能包含多余的前导零。如果要转化的数为0，那么以单个字符'0'来表示；对于其他情况，十六进制字符串中的第一个字符将不会是0字符。 
//给定的数确保在32位有符号整数范围内。
//不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法。
//
public class MyLeetCode0210 {
    public static void main(String[] args) {
        MyLeetCode0210 a = new MyLeetCode0210();
        System.out.println(a.toHex(-1));
    }
    public String f(int x)
    {
        if(x<=9)
        {
            return String.valueOf(x);
        }else {
            char ch = (char) ('a'+(x-10));
            return String.valueOf(ch);
        }
    }
    public String toHex(int num) {
        if (num==0)return "0";
        String aus = "";
        for (int i = 28; i >= 0 ; i-=4) {
            int b = ((num>>i)&0xf);
            String c = f(b);
            if(aus==""&&c.equals("0"))
            {
                continue;
            }else{
                aus+=c;
            }
        }
        return aus;
    }
}
