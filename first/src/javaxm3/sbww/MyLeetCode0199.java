package javaxm3.sbww;

public class MyLeetCode0199 {
    public static void main(String[] args) {

    }
    public int lengthOfLastWord(String s) {
        String[] a = s.split(" ");
        return a[a.length-1].length();
    }
}
