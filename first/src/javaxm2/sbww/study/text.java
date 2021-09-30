package javaxm2.sbww.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] b = s.toCharArray();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if(Character.isDigit(b[i]))
            {
                a.add(b[i] - '0');
            }
        }
        int [] d = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            d[i] = a.get(i);
        }
        Arrays.sort(d);
        int j = 0;
        String s1 = "";
        for (int i = 0; i < b.length; i++) {
            if(Character.isDigit(b[i]))
            {
                b[i] = (char)(d[j++] + 48);
            }
            System.out.println(b[i]);
            s1 += b[i];
        }
        System.out.println(Arrays.toString(d));
        System.out.println(s1);
    }
}
