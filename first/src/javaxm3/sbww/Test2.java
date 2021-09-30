package javaxm3.sbww;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet<Person> people =new HashSet<>();
        Person p1 =new Person("xiaomin",15);
        Person p2=new Person("xiaohua",20);
        people.add(p1);
        people.add(p2);
        people.add(new Person("xiaomin",15));
        System.out.println(people.toString());
        System.out.println("----------------------------");
        TreeSet<Person> pp =new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int n1 = o1.getName().compareTo(o2.getName());
                int n2 = o1.getAge()-o2.getAge();

                return n1==0?n2:n1;
            }
        });
        pp.add(p1);
        pp.add(p2);
        pp.add(new Person("xiaohua",55));
        Iterator<Person> it=pp.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        TreeSet<Person> p=new TreeSet<>();
        p.add(p1);
        p.add(p2);
        p.add(new Person("xiaohua",55));
        for (Person s:p) {
            System.out.println(s);
        }
    }
}
