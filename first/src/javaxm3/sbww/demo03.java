package javaxm3.sbww;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo03 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("cn","china");
        m.put("uk","英国");
        m.put("usa","美国");
        System.out.println(m.toString());
        System.out.println(m.size());
        System.out.println("-------------------------");
        Set<String> s1 = m.keySet();
        for (String s:s1) {
            System.out.println(s+"------"+m.get(s));
        }
        System.out.println("---------------------------");
        for (Map.Entry<String,String> e:m.entrySet()) {
                System.out.println(e.getKey()+"-------"+e.getValue());
        }
    }
}
