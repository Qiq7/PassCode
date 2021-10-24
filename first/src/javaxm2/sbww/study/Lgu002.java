package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Scanner;

public class Lgu002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int [] a = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            a[i] = Integer.parseInt(s1[i]);
        }
//        System.out.println(Arrays.toString(a));
        int [] di = new int[a.length];
        int maxdi = 0;
        int maxhe = 0;
        int [] he = new int[a.length];
        for (int i = 0; i < di.length; i++) {
            di[i] = 1;
            he[i]=1;
            for (int j = i-1; j >=0 ; j--) {
                if(a[i]<a[j]){
                    if(di[j]+1>di[i]){
                        di[i] = di[j]+1;
                    }
                }
                    if (a[i]>a[j]){
                    if(he[j]+1>he[i]){
                        he[i]=he[j]+1;
                    }
                }
            }
//            he[i]=1;
//            for (int j = i-1; j >=0 ; j--) {
//                if (a[i]>a[j]){
//                    if(he[j]+1>he[i]){
//                        he[i]=he[j]+1;
//                    }
//                }
//            }

            if (maxhe<he[i]){
                maxhe=he[i];
            }
            if(di[i]>maxdi){
                maxdi=di[i];
            }
        }
        System.out.println(maxdi);
        System.out.println(maxhe);
//        boolean[] vised = new boolean[a.length];
//        System.out.println(Arrays.toString(di));
    }
}
