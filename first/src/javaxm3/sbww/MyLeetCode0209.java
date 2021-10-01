package javaxm3.sbww;
//给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示，其中 paths[i] = [cityAi, cityBi] 表示该线路将会从 cityAi 直接前往 cityBi 。请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。
//
//题目数据保证线路图会形成一条不存在循环的线路，因此恰有一个旅行终点站。
//

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyLeetCode0209 {
    public String destCity(List<List<String>> paths) {

        String aus = "";
        Map<String,String> map = new HashMap<>();
        for (List<String> x:paths) {
            String a = x.get(0),b = x.get(1);
            map.put(a,b);
        }
        for (Map.Entry x:map.entrySet()) {
            if(!map.containsKey(x.getValue()))
            {
                return (String) x.getValue();
            }
        }
        return aus;
    }
}
