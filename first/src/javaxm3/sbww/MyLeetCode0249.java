package javaxm3.sbww;

import java.util.Random;

public class MyLeetCode0249 {
    Random r;
    int[] aus;
    public void Solution(int[] nums) {
        this.aus = nums;
        r = new Random();
    }

    public int[] reset() {
        return aus;
    }

    public int[] shuffle() {
        int [] t = aus.clone();
        for (int i = 0; i < aus.length; i++) {
            s(i,i+r.nextInt(t.length-i),t);
        }
        return t;
    }
    public void s(int i,int j,int[] c){
        int t = c[i];
        c[i]=c[j];
        c[j]=t;
    }
}
