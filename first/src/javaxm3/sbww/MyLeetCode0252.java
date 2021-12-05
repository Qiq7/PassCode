package javaxm3.sbww;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyLeetCode0252 {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        List<int[]> aus = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                aus.add(new int[]{arr[i],arr[j]});
            }
        }

        Collections.sort(aus,(x,y)->(x[0]*y[1]-y[0]*x[1]));
        for (int [] x:aus) {
            System.out.println(Arrays.toString(x));
        }
        return aus.get(k-1);
    }
}
