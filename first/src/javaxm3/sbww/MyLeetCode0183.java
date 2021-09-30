package javaxm3.sbww;

public class MyLeetCode0183 {
    public static void main(String[] args) {

    }
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] aus = new int[n];
        for (int[] x:bookings) {
            aus[x[0]-1] += x[2];
            if(x[1]<n)
            {
                aus[x[1]] -= x[2];
            }

        }
        for (int i = 1; i < n; i++) {
            aus[i] += aus[i-1];
        }


        return aus;

    }
}
