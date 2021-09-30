package javaxm3.sbww;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class demo04 {
    public static void main(String[] args) {
        HashMap<Person,String> s = new HashMap<>();
        Person p1 =new Person("xiaoming",12);
        Person p2=new Person("xiaohong",13);
        Person p3=new Person("xiaohua",15);
        s.put(p1,"hhh");
        s.put(p2,"eee");
        s.put(p3,"aaa");
        //s.remove(p1);
        System.out.println(s.toString());
        System.out.println("---------------------");
        Set<Person> s2 =s.keySet();
        for (Person p:s2) {
            System.out.println(p+"---------"+s.get(p));
        }
        System.out.println("-------------------------");
        for (Map.Entry<Person,String> a:s.entrySet()) {
            System.out.println(a.getKey()+"--------"+a.getValue());
        }

    }
}
