package javaxm3.sbww;

public class MyLeetCode0049 {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1,1,1}));
    }
    public static boolean isMonotonic(int[] A)
    {
        if(A.length<=1) return true;
        int index = 1;
        while (A[index]==A[index-1])
        {
            index++;
            if(index==A.length) return true;
        }
        //if(index==A.length) return true;
        int flg = A[index]>A[index-1]?0:1;
        for (int i = 1; i < A.length; i++) {
            if(flg==0)
            {
                if(A[i]<A[i-1]) return false;
            }else {
                if(A[i]>A[i-1]) return false;
            }
        }
        return true;
    }
}
