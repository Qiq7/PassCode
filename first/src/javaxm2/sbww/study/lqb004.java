package javaxm2.sbww.study;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class lqb004 {
    public static void f0(int[] A,int[] B)
    {
        int n = A.length,m = B.length;
        int i=0,j=0;
        while (i<n&&j<m)
        {
            if(A[i]==B[j])
            {
                System.out.print(A[i]+" ");
                i++;
                j++;
            }
            if (i<n&&j<m&&A[i]>B[j]) {
                j++;
            }
            if(i<n&&j<m&&A[i]<B[j])
            {
                i++;
            }
        }
    }
    public static void f1(int[] a, int [] b)
    {
        int i=0,j=0;
        int n =a.length,m = b.length;
        while (i<n&&j<m)
        {
            if(a[i]==b[j])
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            if(i<n&&j<m&&a[i]>b[j])
            {
                System.out.print(b[j]+" ");
                j++;
            }
            if(i<n&&j<m&&a[i]<b[j])
            {
                System.out.print(a[i++]+" ");
            }
        }
        while (i<n)
        {
            System.out.print(a[i++]+" ");
        }
        while (j<m)
        {
            System.out.print(b[j++]+" ");
        }
    }
    public static void f2(int[] a,int [] b)
    {
        int i=0,j=0;
        int n =a.length,m = b.length;
        while (i<n&&j<m)
        {
            if(a[i]==b[j])
            {
                //System.out.print(a[i]+" ");
                i++;
                j++;
            }
            if(i<n&&j<m&&a[i]>b[j])
            {
                //System.out.print(b[j]+" ");
                j++;
            }
            if(i<n&&j<m&&a[i]<b[j])
            {
                System.out.print(a[i++]+" ");
            }
        }
        while (i<n)
        {
            System.out.print(a[i++]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        int [] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        f0(A,B);
        System.out.println();
        f1(A,B);
        System.out.println();
        f2(A,B);
    }
}
