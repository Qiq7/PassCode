package javaxm3.sbww;

import java.util.*;

public class PtAcm001 {
    public static void main(String[] args) {
        //System.out.println(minimumTimeRequired(new int[]{5,2,4,7,1,3},2));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //Arrays.sort(a);
        //int[] b= new int[a[a.length-1]];
        int m = n(a);
        List<Integer> b=new LinkedList<>();
//        b.add(1);
//        for (int i = 0; i < a[m]; i++) {
//            for (int j = 0; j < i; j++) {
//                b.add(0);
//            }
//            b.add(1);
//        }
       // System.out.println(b);
        int[] c = new int[a[m]];
        c[0] = 1;
        int k = 2;
        for (int i = 1; i < c.length;) {
            c[i] = 1;
            i=i+k;
            k++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(b.get(a[i]-1));
        }
    }
    public static int m(int[] k0)
    {
        int n = 0;
        for (int i = 0; i < k0.length; i++) {
            if(k0[n] > k0[i])
            {
                n = i;
            }
        }
        return n;
    }
    public static int n(int[] k0)
    {
        int n = 0;
        for (int i = 0; i < k0.length; i++) {
            if(k0[n] < k0[i])
            {
                n = i;
            }
        }
        return n;
    }
    public static int minimumTimeRequired(int[] jobs, int k) {
        // Please fill this blank
        int [] k0 = new int[k];
        int n;
        Arrays.sort(jobs);
        if(jobs.length<k) return jobs[jobs.length-1];
        for (int i = 0; i < k; i++) {
            k0[i] = jobs[jobs.length-1-i];
        }
        for (int i = jobs.length-1-k; i >=0 ; i--) {
             n = m(k0);
             k0[n] = k0[n]+jobs[i];
        }
        return k0[n(k0)];
    }
}
