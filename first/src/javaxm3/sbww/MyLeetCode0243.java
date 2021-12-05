package javaxm3.sbww;

import javax.print.DocFlavor;

public class MyLeetCode0243 {
    public boolean detectCapitalUse(String word) {
        if (word.length()==1) return true;
        if (word.charAt(0)>='a'&&word.charAt(0)<='z'){
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                    return false;
                }
            }
        }else {
            boolean flag = false;
            if ((word.charAt(1)>='a'&&word.charAt(1)<='z')){
                flag = true;
            }
            for (int i = 1; i < word.length(); i++) {
                System.out.println(word.charAt(i));
                System.out.println(flag);
                if (flag&&(word.charAt(i)>='A'&&word.charAt(i)<='Z')){
                    return false;
                }
                if (!flag&&(word.charAt(i)>='a'&&word.charAt(i)<='z')){
                    return false;
                }
            }
        }

        return true;
    }
}
