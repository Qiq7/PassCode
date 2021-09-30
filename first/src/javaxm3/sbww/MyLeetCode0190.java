package javaxm3.sbww;

public class MyLeetCode0190 {
    public static void main(String[] args) {

    }
    public int chalkReplacer(int[] chalk, int k) {
        int i = 0,n = chalk.length;
        int aus = 0,chalkAll = 0;
        for (int x:chalk) {
            chalkAll+=x;
        }
        int toF = k%chalkAll;
        System.out.println(toF);
        for (int j = 0; j < chalk.length; j++) {
            if(aus+chalk[j]>toF)
            {
                i=j;
                break;
            }else {
                aus+=chalk[j];
            }
        }
        return i;
    }
}
