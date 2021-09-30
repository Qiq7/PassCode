package javaxm3.sbww;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyLeetCode0067 {
    public static void main(String[] args) {

    }
    public static int numRabbits(int[] answers) {
        int aus = 0;
        Map<Integer,Integer> m = new TreeMap<>();
        if(answers.length < 1) return 0;
        for (int i = 0; i < answers.length; i++) {
            if(answers[i]!=0&&m.containsKey(answers[i]))
            {
                if(m.get(answers[i])-1 == -1)
                {
                    aus += answers[i] + 1;
                    m.put(answers[i],answers[i]);
                }else{
                    m.put(answers[i],m.get(answers[i])-1);
                }
            }else if(answers[i]!=0){
                m.put(answers[i],answers[i]);
            }else {
                aus += 1;
            }
        }
        for (Integer a:m.keySet()) {
            aus += 1 + a;
        }
        return aus;
    }
}
