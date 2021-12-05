package javaxm3.sbww;

public class MyLeetCode0246b {
    public int maxProduct(String[] words) {
        int aus = 0;
        int[] a = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (int j = 0; j < s.length(); j++) {
                a[i] |= 1<<(s.charAt(j)-'a');
            }
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if ((a[i]&a[j])==0){
                    System.out.println(words[i]+"  "+words[j]);
                    aus=Math.max(aus,words[i].length()*words[j].length());
                }
            }
        }


        return aus;
    }
}
