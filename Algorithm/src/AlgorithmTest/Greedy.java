package AlgorithmTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Greedy {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> bc = new HashMap<>();
        HashSet<String> s1=new HashSet<>();
        s1.add("北京");
        s1.add("上海");
        s1.add("天津");

        HashSet<String> s2=new HashSet<>();
        s2.add("广州");
        s2.add("北京");
        s2.add("深圳");

        HashSet<String> s3=new HashSet<>();
        s3.add("成都");
        s3.add("上海");
        s3.add("杭州");

        HashSet<String> s4=new HashSet<>();
        s4.add("天津");
        s4.add("上海");


        HashSet<String> s5=new HashSet<>();
        s5.add("杭州");
        s5.add("大连");

        bc.put("K1",s1);
        bc.put("K2",s2);
        bc.put("K3",s3);
        bc.put("K4",s4);
        bc.put("K5",s5);

        HashSet<String> allAreas = new HashSet<>();
        allAreas.add("北京");
        allAreas.add("上海");
        allAreas.add("天津");
        allAreas.add("广州");
        allAreas.add("深圳");
        allAreas.add("成都");
        allAreas.add("杭州");
        allAreas.add("大连");

        ArrayList<String> select = new ArrayList<>();
        HashSet<String> t= new HashSet<>();
        String maxKey = null;
        while (allAreas.size()!=0)
        {
            maxKey=null;
            for (String key : bc.keySet()) {
                t.clear();
                HashSet<String> areas=bc.get(key);
                t.addAll(areas);
                t.retainAll(allAreas);
                if(t.size()>0&&(maxKey==null||t.size()>bc.get(maxKey).size()))
                {
                        maxKey=key;
                }
            }
            if(maxKey!=null)
            {
                select.add(maxKey);
                allAreas.removeAll(bc.get(maxKey));
            }
        }
        System.out.println(select);
    }
}
