package javaxm3.sbww;
//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
//
//请注意，你可以假定字符串里不包括任何不可打印的字符。
public class MyLeetCode0214 {
    public int countSegments(String s) {
        if (s=="") return 0;
        int aus = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (flag&&s.charAt(i)!=' ')
            {
                aus++;
                flag=false;
            }
            if (s.charAt(i)==' ')
            {
                flag = true;
            }
        }
        return aus;
    }
}
