package javaxm2.sbww.sy2;

import java.util.*;
public class INSERTIONsort {
    public static void main(String[] args){
        int n;
        System.out.print("n = ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int a[] = new int[n];
        for (int i=0;i < n;i ++)
        {
            a[i] = in.nextInt();
        }
        for (int j = 1;j < n;j ++){
            int key = a[j];
            int i2 = j - 1;
            while(i2 >= 0&&a[i2] < key)
            {
                a[i2+1] = a[i2];
                i2 --;
            }
            a[i2+1] = key;
        }
        for (int x:a) {
                System.out.print(x+"  ");
        }
    }
}
