package javaxm3.sbww;
//#474#2020.11.15
import javaxm2.sbww.sy2.Max;

import java.util.Arrays;

public class Myleetcode {
    public static void main(String[] args) {
        String[] str={"10","0001","111001","1","0"};
        String[] Str2={"10","0","1"};
        String[] s={"10","0001","111001","1","0"};
        System.out.println(FindMaxForm(s,4,3));
    }
    public static int FindMaxForm(String[] str, int m, int n)
    {
        int nus=0;
        int[][] a=count(str);
        int[][] b=new int[n+1][m+1];
        for (int k = 0; k < a.length; k++) {
            for (int i = n; i >= a[k][1]; i--) {
                for (int j = m; j >= a[k][0]; j--) {
                    b[i][j] = Math.max(1+b[i-a[k][1]][j-a[k][0]],b[i][j]);
                }
                //System.out.print(b[i][j]+"  ");
            }
            //System.out.println();
        }
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println(a[i][j]);
//            }
//        }
        nus = b[n][m];
        return nus;
    }
    public static int[][] count(String[] str)
    {
        int[][] a=new int [str.length][2];
        for (int i = 0; i < str.length; i++) {
            char[] t=str[i].toCharArray();
            //System.out.println(t);
            for (int j = 0; j < str[i].length(); j++) {
                if(t[j]=='0')
                {
                    a[i][0]+=1;
                }
                if(t[j]=='1')
                {
                    a[i][1]+=1;
                }
            }
        }
        return a;
    }


}

