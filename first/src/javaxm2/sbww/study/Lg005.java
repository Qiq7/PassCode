package javaxm2.sbww.study;
//timeout
import java.util.Scanner;
//4  2
//1231
public class Lg005 {
    private static long aus = 0;
    public static void f(String b,int K,long now){
        if(b.length()-1<K){
            return;
        }
        if (K==0&&b.charAt(0)!='0'){
            long x = 0;
            //System.out.println(now+"*"+Integer.parseInt(b)+"="+now*Integer.parseInt(b));
            for (int i = 0; i < b.length(); i++) {
                x*=10;
                x += b.charAt(i)-'0';
            }
            aus=Math.max(aus,now*x);
        }

        long x = 0;
        for (int i = 0; i < b.length() - 1; i++) {
            if(i==0&&b.charAt(i)=='0') break;
            char ch = b.charAt(i);
            x+=ch-'0';
            f(b.substring(i+1),K-1,now*x);
            x*=10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(),
            K = sc.nextInt();
        String s = sc.next();
        long x = 0;
        long now = 1;
        for (int i = 0; i < N - 1 ; i++) {
            if(i==0&&s.charAt(i)=='0') break;
            char ch = s.charAt(i);
            x+=ch-'0';
            f(s.substring(i+1),K-1,now*x);
            x*=10;
        }
        System.out.println(aus);
//        System.out.println(N);
//        System.out.println(K);
//        System.out.println(s);
    }
}
