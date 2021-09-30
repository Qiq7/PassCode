package javaxm3.sbww;
//over#49
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyLeetCode0031 {
    public static void main(String[] args) {
        String[] s={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(s));
    }
    public static List<List<String>> groupAnagrams(String[] Strs)
    {
        List<List<String>> a=new ArrayList<>();
        if(Strs.length==0) return a;
        List<String> b=new ArrayList<>();
        for (String s:Strs) {
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String ch=new String(chars);
            if(b.isEmpty()||!b.contains(ch))
            {
                List<String> a0=new ArrayList<>();
                a0.add(s);
                b.add(new String(chars));
                a.add(a0);
            }else{
                for (List<String> a1:a) {
                    char [] ch0=a1.get(0).toCharArray();
                    Arrays.sort(ch0);
                    String s2=new String(ch0);
                    if(s2.equals(ch))
                    {
                        a1.add(s);
                    }
                }
            }
        }
//        for (List<String> s0:a) {
//            for (String c:s0) {
//                System.out.print(c);
//            }
//            System.out.println();
//        }
        for (String s:b) {
            System.out.println(s);
        }
        return a;
    }
}
