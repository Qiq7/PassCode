package javaxm3.sbww;


import java.util.Map;
import java.util.TreeMap;
// 给你一个由非负整数 a1, a2, ..., an 组成的数据流输入，请你将到目前为止看到的数字总结为不相交的区间列表。
//
//实现 SummaryRanges 类：
//
//SummaryRanges() 使用一个空数据流初始化对象。
//void addNum(int val) 向数据流中加入整数 val 。
//int[][] getIntervals() 以不相交区间 [starti, endi] 的列表形式返回对数据流中整数的总结。
//
public class SummaryRanges {
    public TreeMap<Integer,Integer> map ;

    public SummaryRanges() {
        map = new TreeMap<>();
    }

    public void addNum(int val) {

        Map.Entry<Integer,Integer> ar = map.ceilingEntry(val+1);
        Map.Entry<Integer,Integer> al = map.floorEntry(val);

        if(al!=null&&al.getKey()<=val&&al.getValue()>=val)
        {
            return;
        }else {
            boolean l = al!=null&&al.getValue()+1==val,
                    r = ar!=null&&ar.getKey()-1==val;
            if(l&r)
            {
                map.remove(ar.getKey());
                map.remove(al.getKey());
                map.put(al.getKey(),ar.getValue());
            }else if (l)
            {
                map.remove(al.getKey());
                map.put(al.getKey(),val);
            }else if(r) {
                map.remove(ar.getKey());
                map.put(val,ar.getValue());
            }else {
                map.put(val,val);
            }
        }


    }
    public int[][] getIntervals() {
        int size = map.size();
        int [][] aus = new int[size][2];
        int i = 0;
        for (Map.Entry<Integer,Integer> x:map.entrySet()) {
            aus[i][0] = x.getKey();
            aus[i][1] = x.getValue();
            i++;
        }
        return aus;
    }
}
