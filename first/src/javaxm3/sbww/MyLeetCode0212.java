package javaxm3.sbww;
//有一个密钥字符串 S ，只包含字母，数字以及 '-'（破折号）。其中， N 个 '-' 将字符串分成了 N+1 组。
//
//给你一个数字 K，请你重新格式化字符串，使每个分组恰好包含 K 个字符。特别地，第一个分组包含的字符个数必须小于等于 K，但至少要包含 1 个字符。两个分组之间需要用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。
//
//给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。
//




public class MyLeetCode0212 {
    public String licenseKeyFormatting(String s, int k) {
        String a = "";
        for (char x :s.toCharArray()) {
            if(x!='-')
            {
                a+=Character.toUpperCase(x);
            }
        }
        String aus = "";

        int f = a.length()%k,d = a.length()/k;
        int i = 0;
        while (i<a.length())
        {
            if(i==0&&f!=0)
            {
                for (int j = 0; j < f; j++) {
                    aus+=a.charAt(i);
                    i++;
                }
            }else{
                if(i!=0)aus+='-';

                for (int j = 0; j < k; j++) {
                    aus+=a.charAt(i);
                    i++;
                }
            }
        }

        return aus;
    }
}
