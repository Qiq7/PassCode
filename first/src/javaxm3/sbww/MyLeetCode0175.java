package javaxm3.sbww;

public class MyLeetCode0175 {
    public static void main(String[] args) {

    }
    public int compress(char[] chars) {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int k = 1;
            while (i<chars.length&&chars[i+1]==ch)
            {
                k++;
                i++;
            }
            if(k==1)
            {
                s+=ch;
            }else {
                s+=ch;
                s+=k;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}
