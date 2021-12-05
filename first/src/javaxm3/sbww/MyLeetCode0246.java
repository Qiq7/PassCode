package javaxm3.sbww;

public class MyLeetCode0246 {

    public int maxProduct(String[] words) {
        int aus = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                boolean flag = true;
                for (int k = 0; k < words[j].length(); k++) {
                    if (words[i].contains(String.valueOf(words[j].charAt(k)))){
                        flag = !flag;
                        break;
                    }
                }
                if (flag){
                    System.out.println(words[i]+"  "+words[j]);
                    aus=Math.max(aus,words[i].length()*words[j].length());
                }
            }
        }

        return aus;
    }
}
