package javaxm3.sbww;
//over#976
import java.util.Arrays;

public class MyLeetCode0021 {
    public static void main(String[] args) {
        int[] a={3,6,3,2};
            System.out.println(largestPerimeter(a));
    }
    public static int largestPerimeter(int[] A)
    {
        int a,b,c,l=0;
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        c=A[A.length-1];
        for (int i = A.length-2; i > 0 ; i--) {
            b=A[i];
            a=A[i-1];
            if(a+b>c&&c+b>a&&a+c>b)
            {
                return a+b+c;
            }else {
                c=b;
            }
        }
        return l;
    }

}
