package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0239 {
    public String getHint(String secret, String guess) {
        int[] nu = new int [10];
        int[] nu1= new int[10];
        int A=0,B=0;
        for (int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i)==guess.charAt(i)){
                A++;
            }else {
                nu[secret.charAt(i)-'0']++;
                nu1[guess.charAt(i)-'0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            B+=Math.min(nu[i],nu1[i]);
        }
//        for (int i = 0; i < 10; i++) {
//            if(nu[i][0]==1&&nu[i][1]==0){
//                B++;
//            }
//        }
        return A+"A"+B+"B";
    }
}
