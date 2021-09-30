package javaxm3.sbww;
//over#406
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MyLeetCode0002 {
    public static void main(String[] args) {
        int [][] a={{7,0},{4,4},{7,1},{5,0},{6,1},{5,1}};

        System.out.println(Arrays.deepToString(reconstrucQueue(a)));
    }
    public static int[][] reconstrucQueue(int[][] people) {
        LinkedList<int[]> b = new LinkedList<>();
        Arrays.sort(people, ((o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]));
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0];
            }
        });
        for (int[] a : people) {
            b.add(a[1], a);
        }
        return b.toArray(new int[people.length][]);
    }
}
