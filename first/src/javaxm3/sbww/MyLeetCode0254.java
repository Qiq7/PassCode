package javaxm3.sbww;




public class MyLeetCode0254 {
    public int maxPower(String s) {
        int aus = 1,count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(i-1)){
                aus=Math.max(aus,count);
                count=1;
            }else {
                count++;
            }
        }
        aus=Math.max(aus,count);
        int [] a = new int[20];
        return aus;
    }
}
