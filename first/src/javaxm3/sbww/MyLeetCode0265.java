package javaxm3.sbww;

public class MyLeetCode0265 {
    public int lastRemaining(int n) {

        int aus = 1,k=0,step = 1,cnt = n;
        while (cnt>1){
            if (k%2==0){
                aus = aus + step;
            }else {
                aus = cnt%2==0?aus:aus+step;
            }
            k++;
            cnt/=2;
            step*=2;

        }

        return aus;
    }
}
