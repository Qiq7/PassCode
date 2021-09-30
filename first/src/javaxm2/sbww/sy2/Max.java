package javaxm2.sbww.sy2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class Max {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("E:\\java相关文件作业\\随机数.txt"), "UTF-8");
        int i = 0;
        long[] a = new long[1000002];
        while (in.hasNext()) {
            a[ i] = in.nextLong();
            i++;
        }
        long MAX = a[0], MIN = a[0];
        for (int x = 0; x < 1000000; x++) {
            if (a[x] > MAX) MAX = a[x];

            if (a[x] < MIN) MIN = a[x];
        }
        System.out.println("javaxm2.sbww.sy2.Max = " + MAX + "\n"+"MIN = " + MIN);
    }
}
