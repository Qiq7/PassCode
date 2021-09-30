package javaxm3.sbww;
//over#290
import java.util.HashMap;

public class MyLeetCode0034 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","aa bb bb aa"));
    }
    public  static  boolean wordPattern(String  pattern,String s)
    {
        HashMap<Character,String> a=new HashMap<>();
        HashMap<String,Character> b=new HashMap<>();
        String[] s0=s.split(" ");
        if (pattern.length()!=s0.length) return false;
        for (int i = 0; i < s0.length; i++) {
            if(!a.containsKey(pattern.charAt(i))&&!a.containsValue(s0[i]))
            {
                a.put(pattern.charAt(i),s0[i]);
                b.put(s0[i],pattern.charAt(i));
            }else {
                if(a.containsValue(s0[i]))
                {
                    if (!b.get(s0[i]).equals(pattern.charAt(i)))
                    {
                        return false;
                    }
                }else
                {
                    if(!a.get(pattern.charAt(i)).equals(s0[i]))
                    {
                        return  false;
                    }
                }
            }
        }
        return true;
    }
}
