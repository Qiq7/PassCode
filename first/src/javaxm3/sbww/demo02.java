package javaxm3.sbww;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set类
public class demo02 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("aaa");
        s.add("bbb");
        s.add("aab");
        s.add("ccc");
        System.out.println(s.toString());
        for (String a:s) {
            System.out.println(a);
        }
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(s.contains("aaa"));
    }
    }


