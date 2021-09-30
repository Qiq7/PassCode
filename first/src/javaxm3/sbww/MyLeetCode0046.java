package javaxm3.sbww;

public class MyLeetCode0046 {
    public static void main(String[] args) {

    }
    public int numEquivDominoPairs(int [][] dominoes)
    {
        int[] n=new int[100];
        int val;
        int auns=0;
        for (int[] a:dominoes) {
           val= a[0]>a[1]?a[0]*10+a[1]:a[1]*10+a[0];
           auns+=n[val];
           n[val]++;
        }
        return auns;
    }
}
