package javaxm3.sbww;

import java.util.*;

public class TopVotedCandidate {


    //public Map<Integer,Integer> map = new HashMap<>();
    public Map<Integer,Integer> map2 = new HashMap<>();
    List<Integer> list = new LinkedList<>();
    int [] times;

    public TopVotedCandidate(int[] persons, int[] times) {
        this.times = times;
        for (int i = 0; i < persons.length; i++) {
            if (i!=0){
                int per = map2.get(list.get(list.size()-1));
                int now = map2.getOrDefault(persons[i],0)+1;
                if (per>now){
                    list.add(list.get(list.size()-1));
                }else {
                    list.add(persons[i]);
                }
            }else {
                list.add(persons[i]);
            }
            map2.put(persons[i],map2.getOrDefault(persons[i],0)+1);
//            System.out.println(map2.get(persons[i]));
        }
        for (int x:list) {
            System.out.println(x);
        }
    }

    public int q(int t){
        for (int i = 1; i < times.length; i++) {
            if (times[i-1]<=t&&t<times[i]){
                return list.get(i-1);
            }
        }
        return list.get(list.size()-1);
    }

}
