package javaxm2.sbww.sy2;

public class VampireNumber {
    static int a(int i){
        return i/1000;
    }
    static int b(int i){
        return (i/100)%10;
    }
    static int c(int i){
        return (i/10)%10;
    }
    static int d(int i){
        return i%10;
    }
    static int com(int m,int n){
        return m*10+n;
    }
    static void text(int i,int m,int n){
        if(i == m*n) System.out.println(i+"="+m+"*"+n);
        return;
    }
    public static void main(String[] args){
        int i;
        for ( i=1001;i<=9999;i++){
            text(i,com(a(i),b(i)),com(d(i),c(i)));
            text(i,com(a(i),b(i)),com(c(i),d(i)));
            text(i,com(a(i),c(i)),com(d(i),b(i)));
            text(i,com(a(i),c(i)),com(b(i),d(i)));
            text(i,com(a(i),d(i)),com(b(i),c(i)));
            text(i,com(a(i),d(i)),com(c(i),b(i)));
            text(i,com(b(i),a(i)),com(d(i),c(i)));
            text(i,com(b(i),a(i)),com(c(i),d(i)));
            text(i,com(c(i),a(i)),com(b(i),d(i)));
            text(i,com(c(i),a(i)),com(d(i),b(i)));
            text(i,com(d(i),a(i)),com(b(i),c(i)));
            text(i,com(d(i),a(i)),com(c(i),b(i)));
        }
    }
}
