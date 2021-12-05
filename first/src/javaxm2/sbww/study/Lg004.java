package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lg004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double D1 = sc.nextDouble(),
                C = sc.nextDouble(),
                D2 = sc.nextDouble(),
                P = sc.nextDouble();
        int N = sc.nextInt();

        double [][] pd = new double[N][2];

        for (int i = 0; i < N; i++) {
            pd[i][0] = sc.nextDouble();
            pd[i][1] = sc.nextDouble();
        }

        Arrays.sort(pd, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return (int) (o1[1]==o2[1]?(o2[0]-o1[0])*10:(o1[1]-o2[1])*10);
//                return (int) (o1[0]-o2[0]);
            }
        });


        //System.out.println(Arrays.deepToString(pd));
        double nowp = P,
                MaxD = C*D2,
                sur = D1,
                aus = 0,
                nowC = 0,
                avd = 0;
        boolean flag = true;
        while (flag){
        double fP = 0,
            fd = 0;
            for (int i = 0; i < N; i++) {
                if(pd[i][0]-avd>0){
                    if(MaxD>pd[i][0]-avd){
                        fP = pd[i][1];
                        fd = pd[i][0];
                        break;
                    }
                }
            }
            System.out.println(fd+"   "+fP);
            System.out.println(aus);
            if (MaxD>sur&&(fP==0||fP>nowp)){
                aus+=((sur-nowC*D2)/D2)*nowp;
                System.out.println("---------"+nowC);
                sur=0;
                break;
            }
            if (fP==0) break;
            if (fP<nowp){
                aus+=((fd-avd-nowC/D2)/D2)*nowp;
                nowC=0;
            }else {
                aus+=(C-nowC)*nowp;
                nowC=C-(fd-avd)/D2;
            }
            nowp = fP;
            avd = avd+(fd-avd);
            sur = D1-avd;
            System.out.println(aus+"  -- "+nowC);
        }


//        for (int i = 0; i < pd.length; i++) {
//
//            if (MaxD>sur&&nowp<pd[i][1]){
//                aus+=((sur-nowC*D2)/D2)*nowp;
//                sur=0;
//                break;
//            }
//
//            if(MaxD>pd[i][0]){
//                    if (nowp < pd[i][1]) {
//                        aus += (C-nowC) * nowp;
//                        nowC = C - (pd[i][0]/D2);
//
//                    } else {
//                        aus+=((pd[i][0]-nowC*D2)/D2)*nowp;
//
//                        nowC = 0;
//                    }
//                nowp = pd[i][1];
//                sur = D1 - pd[i][0];
//            }else {
//                continue;
//            }
//        }
        if (sur!=0){
            System.out.println("No Solution");
        }else {
            System.out.println(String.format("%.2f",aus));
        }
//        System.out.println(Arrays.deepToString(pd));
//        System.out.println(D1);
//        System.out.println(C);
//        System.out.println(D2);
//        System.out.println(P);
//        System.out.println(N);

    }
}
