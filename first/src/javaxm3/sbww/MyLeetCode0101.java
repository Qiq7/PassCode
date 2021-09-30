package javaxm3.sbww;

public class MyLeetCode0101 {
    public static void main(String[] args) {

    }
    public static String intToRoman(int num) {
        int [] n = {
                1,4,5,9,10,40,50,90,100,400,500,900,1000
        };
        String [] rom = {
                "I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"
        };
        StringBuffer sb = new StringBuffer();
        for (int i = rom.length-1; i >= 0 ; i--) {
            String s = rom[i];
            while(num>=n[i])
            {
                sb.append(s);
                num-=n[i];
            }
            if(num==0)
            {
                break;
            }
        }
        return sb.toString();
    }
}
