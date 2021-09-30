package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0088 {
        public static class Employee{
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
    public static void main(String[] args) {

    }
    public static int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> m = new HashMap<>();
        for (Employee x:employees) {
            m.put(x.id,x);
        }
        boolean [] a = new boolean[employees.size()];
        Deque b = new ArrayDeque<Employee>();
        b.add(m.get(id));
        ArrayList<Integer> q = new ArrayList<>();
        int s = 0;
        Employee e;
        while (!b.isEmpty())
        {
            e = (Employee) b.pop();
            if(e.subordinates.size()!=0)
            {
                for (Integer x:e.subordinates) {
                    if(!q.contains(x))
                    {
                        q.add(x);
                        b.add(m.get(x));
                    }
                }
            }
            s+=e.importance;
        }
        return s;
    }

}
