package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0139 {
    public static void main(String[] args) {

    }
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> aus = new LinkedList<>();
        Map<Integer,Map<String,Integer>> m = new HashMap<>();
        Set<String> name = new HashSet<>();
        for (List<String> a:orders) {
            String i = a.get(1),v = a.get(2);
            int b = Integer.parseInt(i);
            name.add(v);
            Map<String,Integer> c = m.getOrDefault(b,new HashMap<>());
            c.put(v, c.getOrDefault(v,0)+1);
            m.put(b,c);
        }
        List<String> v1 = new LinkedList<>();
        List<Integer> nu = new LinkedList<>();

        for (String a:name) {
            v1.add(a);
        }
        for (Map.Entry<Integer, Map<String, Integer>> x:m.entrySet()) {
            nu.add(x.getKey());
        }
        Collections.sort(v1);
        Collections.sort(nu);

        List<String> q1 = new LinkedList<>();
        q1.add("Table");
        for (String x:v1) {
            q1.add(x);
        }
        aus.add(q1);

        int n = v1.size();
        for (int i:nu) {
            Map<String,Integer> q2 = m.get(i);
            List<String> itm = new LinkedList<>();
            itm.add(String.valueOf(i));
            for (int j = 0; j < n; j++) {
                itm.add(String.valueOf(q2.getOrDefault(v1.get(j),0)));
            }
            aus.add(itm);
        }


        return aus;
    }
}
