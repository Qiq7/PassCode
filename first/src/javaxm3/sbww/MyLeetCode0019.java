package javaxm3.sbww;
//over#454
import java.util.HashMap;

public class MyLeetCode0019 {
    public static void main(String[] args) {
            int[] a={1,2};
            int[] b={-2,-1};
            int[] c={-1,2};
            int[] d={0,2};
            System.out.println(fourSumCount(a,b,c,d));
    }
    public static int fourSumCount(int[] A,int[] B,int[] C,int[] D)
    {
        HashMap<Integer,Integer> n=new HashMap<>();
        int count=0;
//        int[] ab=new int[A.length*B.length];
//        int iab=0;
//        int[] cd=new int[C.length*D.length];
//        int icd=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                //ab[iab++]=A[i]+B[i];
                n.put(A[i]+B[j],n.getOrDefault(A[i]+B[j],0)+1);
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                if(n.containsKey(-C[i]-D[j]))
                {
                    count+=n.get(-C[i]-D[j]);
                }
            }
        }

        return count;
    }
}
