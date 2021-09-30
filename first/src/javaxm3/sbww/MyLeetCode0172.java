package javaxm3.sbww;

public class MyLeetCode0172 {
    public static void main(String[] args) {

    }
    public boolean checkRecord(String s) {
        int a = 0,l=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A')
            {
                a++;
            }
            if(s.charAt(i)=='L')
            {
                l++;
            }else {
                l=0;
            }
            if (l==3) return false;
        }
        return a<2;
    }
}
