package javaxm3.sbww;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//给定一个正整数 n ，输出外观数列的第 n 项。
//
//「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
//
//你可以将其视作是由递归公式定义的数字字符串序列：
//
//countAndSay(1) = "1"
//countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
//

public class MyLeetCode0219 {
    public static void main(String[] args) {
        MyLeetCode0219 a = new MyLeetCode0219();
        System.out.println(a.countAndSay(4));
    }

    public String countAndSay(int n) {
        List<String> aus = new ArrayList<>();
        if(n==1) return "1";
        aus.add("1");
        for (int i = 1; i < n ; i++) {
            String a = new String();
            String b = aus.get(i-1);
            char ch = '@';
            int chn = 0;
            for (int j = 0; j <= b.length() ; j++) {
                if(j!=b.length()&&(ch=='@'||ch==b.charAt(j)))
                {
                    ch=b.charAt(j);
                    chn++;
                }else{
                    a+=chn+""+ch;
                    if (j!=b.length())ch=b.charAt(j);
                    chn=1;
                }
            }
            aus.add(a);
        }
        //System.out.println(Arrays.toString(aus.toArray()));
        return aus.get(n-1);

    }
}
