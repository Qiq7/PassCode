package javaxm2.sbww.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String b = a.readLine().toString();
        String[] d = b.split(" ");
        int[] c = new int[d.length];
        for (int i = 0; i <d.length ; i++) {
               c[i]  = Integer.parseInt(d[i]);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println(Arrays.toString(d));
    }
    public int[] Scan() throws IOException
    {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String a = str.readLine().toString();
        String[] b = a.split(" ");
        int[] c = new int[b.length];
        for (int i = 0; i <b.length ; i++) {
            c[i] = Integer.parseInt(b[i]);
        }
        return c;
    }
}
