package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0106 {
    public static void main(String[] args) {

    }
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> a = new ArrayList<>();
        Map<String,Integer> m = new HashMap<>();
        for (String s:words) {
            m.put(s,m.getOrDefault(s,0)+1);
        }
        for (Map.Entry<String,Integer> map:m.entrySet()) {
            a.add(map.getKey());
        }
        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return m.get(o1)==m.get(o2)?o1.compareTo(o2):m.get(o2)-m.get(o1);
            }
        });
        return a.subList(0,k);
    }
}
