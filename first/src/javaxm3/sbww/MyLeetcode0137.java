package javaxm3.sbww;



import java.util.*;

public class MyLeetcode0137 {
    public static void main(String[] args) {
        System.out.println(frequencySort(new String("tree")));
    }
    public static String frequencySort(String s) {
        Map<Character,Integer> m =new HashMap<>();
        for (char x:s.toCharArray()) {
            m.put(x,m.getOrDefault(x,0)+1);
        }
        List<String> a = new LinkedList<>();
        for (Character x:m.keySet()) {
            int i = m.get(x);
            String s1 = "";
            for (int j = 0; j < i; j++) {
                s1+=x;
            }
            a.add(s1);
        }
        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        String aus = "";
        for (String w:a) {
            aus+=w;
        }
        return aus;
    }
}
