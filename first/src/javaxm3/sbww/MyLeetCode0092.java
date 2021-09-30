package javaxm3.sbww;

public class MyLeetCode0092 {
    public static void main(String[] args) {

    }
    public static int[] decode(int[] encoded, int first) {
        int [] aus = new int[encoded.length+1];
        aus[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            int x = encoded[i];
            int k = 0;
            while ((aus[i] ^ k)!=x)
            {
                k++;
            }
            aus[i+1] = k;
        }
        return aus;
    }
}
