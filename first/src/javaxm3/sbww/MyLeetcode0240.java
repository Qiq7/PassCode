package javaxm3.sbww;

public class MyLeetcode0240 {

    public int findPoisonedDuration(int[] timeSeries, int duration) {

        if (timeSeries.length==1) return duration;
        int aus = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i]-timeSeries[i-1]>duration){
                aus+=duration;
            }else {
                aus+=timeSeries[i]-timeSeries[i-1];
            }
        }
        aus+=duration;
        return aus;
    }
}
