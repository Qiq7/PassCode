package javaxm2.sbww.sy2;

import java.util.Objects;
import java.util.Scanner;

public class test {

    static class a {
        int a;
        int b;
        int c;

        public a(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            a a1 = (a) o;
            return a == a1.a &&
                    b == a1.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }



    public static void main(String[] args) {

        a b = new a(1,1,4);
        a c = new a(1,1,5);
        System.out.println(b.equals(c));

        Scanner sc = new Scanner(System.in);
        System.out.println(isDoub(sc.next()));
    }
    public static boolean  isDoub(String s){
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            char x = ch[i];
            if (i==0)
            {
                if (!Character.isDigit(x)){
                    return false;
                }
                if (x=='0'){
                    if (i+1<ch.length&&ch[i+1]!='.'){
                        return false;
                    }
                }

            }else if (x=='.'){
                count++;
            }else {
                if (!Character.isDigit(x)){
                    return false;
                }
            }
        }
        return count<=1;
    }
}
