package javaxm3.sbww;

public class MyLeeTcode0143 {
    public static void main(String[] args) {

    }
    public int hIndex(int[] citations) {
        int r = citations.length - 1,i = 0;
        while (r>=0)
        {
            if(citations[r]<i) break;
            i++;
            r--;
        }
        return i - 1;
    }
}
