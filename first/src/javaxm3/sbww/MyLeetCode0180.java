package javaxm3.sbww;

import java.util.Arrays;

public class MyLeetCode0180 {
    public static void main(String[] args) {

    }
    public int numRescueBoats(int[] people, int limit) {
        int aus = 0;
        int l = 0,r = people.length-1;
        Arrays.sort(people);
        while (l<=r)
        {
            if(people[l]+people[r]<=limit)
            {
                l++;
            }
            r--;
            aus++;
        }
        return aus;
    }
}
