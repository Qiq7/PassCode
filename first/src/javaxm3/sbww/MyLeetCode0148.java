package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0148 {
    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> aus = new LinkedList<>();
        Map<String,List<String>> m = new HashMap<>();
        for (String x:strs) {
            char [] ch = x.toCharArray();
            Arrays.sort(ch);
            List<String> a = m.getOrDefault(new String(ch),new LinkedList<>());
            a.add(x);
            m.put(new String(ch),a);
        }
        for (Map.Entry<String, List<String>> x: m.entrySet()) {
           List<String> a = x.getValue();
           aus.add(a);
        }
        return aus;
    }
}
