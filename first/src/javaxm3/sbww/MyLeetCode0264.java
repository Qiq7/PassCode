package javaxm3.sbww;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyLeetCode0264 {

    public static void main(String[] args) {
        MyLeetCode0264 a = new MyLeetCode0264();
        a.isNStraightHand(new int[]{1,2},2);
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length%groupSize!=0){
            return false;
        }
        int n = hand.length/groupSize;
        Map<Integer,Integer> map = new HashMap<>();
        for (int x:hand) {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        Arrays.sort(hand);
        for (int x:hand) {
            if (!map.containsKey(x)){
                continue;
            }
            for (int i = 0; i < groupSize; i++) {
                if (!map.containsKey(x+i)){
                    return false;
                }else {
                    map.put(x+i,map.get(x+i)-1);
                    if (map.get(x+i)==0){
                        map.remove(x+i);
                    }
                }
            }
        }


        return true;
    }
}
