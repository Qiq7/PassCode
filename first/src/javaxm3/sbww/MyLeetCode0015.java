package javaxm3.sbww;
//over#784
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0015 {
    public static void main(String[] args) {

    }
    public static List<String> ltetterCassemutation(String S)
    {
        List<String> q=new LinkedList<>();
        int b=0;
        for (int i = 0; i < S.length(); i++) {
           if (Character.isLetter(S.charAt(i)))
           {
               b++;
           }
        }
        for (int i = 0; i < 1<<b; i++) {
            StringBuffer sb=new StringBuffer();
            int n=0;
            for (char c:S.toCharArray()) {
                if (Character.isLetter(c))
                {
                    if(((i>>n++)&1)==1)
                    {
                        sb.append(Character.toLowerCase(c));
                    }else
                    {
                        sb.append(Character.toUpperCase(c));
                    }
                }else
                {
                    sb.append(c);
                }
            }
            q.add(sb.toString());
        }
        return  q;
    }
}
