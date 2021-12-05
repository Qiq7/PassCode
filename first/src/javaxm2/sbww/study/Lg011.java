package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lg011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),
                num = sc.nextInt();
        int [][] men = new int[num+1][3];
        for (int i = 1; i < men.length; i++) {
            men[i][0] = sc.nextInt();
            men[i][1] = sc.nextInt();
            men[i][2] = sc.nextInt();
        }
        int[] mainW = new int[n+1],
        mainV = new int[n+1];

        int[][] subV = new int[n+1][3];
        int[][] subW = new int[n+1][3];

        for (int i = 1; i < men.length; i++) {
            if(men[i][2]==0){
                mainV[i] = men[i][0]*men[i][1];
                mainW[i] = men[i][0];
            }else{
                subV[men[i][2]][0]++;
                subV[men[i][2]][subV[men[i][2]][0]] = men[i][0]*men[i][1];
                subW[men[i][2]][subV[men[i][2]][0]] = men[i][0];
            }
        }
        int [] j = new int[n+10];
        for (int i = 1; i <= num ; i++) {
            for (int k = n;mainW[i] !=0 && k >= mainW[i]; k-=10) {
                j[k]=Math.max(j[k],j[k-mainW[i]]+mainV[i]);
                if (k>=mainW[i]+subW[i][1]){
                    j[k] = Math.max(j[k],
                            j[k-mainW[i]-subW[i][1]]+subV[i][1]
                                    +mainV[i]);
                }
                if (k>=mainW[i]+subW[i][2]){
                    j[k] = Math.max(j[k],
                            j[k-mainW[i]-subW[i][2]]+subV[i][2]
                                    +mainV[i]);
                }
                if (k>=mainW[i]+subW[i][1]+subW[i][2]){
                    j[k] = Math.max(j[k],
                            j[k-mainW[i]-subW[i][1]-subW[i][2]]+subV[i][1]+subV[i][2]
                    +mainV[i]);
                }
            }
        }

        System.out.println(j[n]);


        System.out.println(Arrays.deepToString(men));
    }
}
