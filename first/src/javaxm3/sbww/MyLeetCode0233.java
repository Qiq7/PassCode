package javaxm3.sbww;


import java.util.Arrays;

public class MyLeetCode0233 {
    public static void main(String[] args) {
        MyLeetCode0233 a= new MyLeetCode0233();
        System.out.println(Arrays.toString(a.findWords(new String[]{"omk"})));
    }
    private String[] a = {"qwertyuiopQWERTYUIOP","ASDFGHJKLasdfghjkl","ZXCVBNMzxcvbnm"};
    public String[] findWords(String[] words) {
        StringBuffer sb = new StringBuffer();
        for (String x:words) {
            for (String b:a) {
                int i = 0;
                for (i = 0; i < x.length(); i++) {
                    if(!b.contains(x.charAt(i)+"")){
                        //System.out.println(x.charAt(i));
                        break;
                    }
                }
                if (i==x.length()){
                    sb.append(x+",");
                }
            }
        }
        return sb.length()==0?new String[]{}:sb.toString().split(",");
//        return sb.toString().split(",");
    }
}
