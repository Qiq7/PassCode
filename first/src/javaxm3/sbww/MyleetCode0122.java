package javaxm3.sbww;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MyleetCode0122 {
    public static void main(String[] args) {

    }
    enum zt {
        init,
        fu,
        num,
        dot,
        ex,
    }
    public static boolean isNumber(String s) {
        if (s.length()==1&&!(s.charAt(0)<='9'&&s.charAt(0)>='0'))
        {
            return false;
        }
        int n = s.length();
        int e = n,d = n;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == 'e'|| s.charAt(i) == 'E')
            {
                if(e!=n)
                {
                    return false;
                }else {
                    e = i;
                }
            }
            if(s.charAt(i) == '.')
            {
                if(d!=n)
                {
                    return false;
                }else {
                    d = i;
                }
            }
        }
        if (e==s.length()-1)
        {
            return false;
        }
        if(d+1==e)
        {
            if (d==0||!(s.charAt(d-1) >= '0'&& s.charAt(d-1)<='9'))
            {
                return false;
            }
        }
        if(s.charAt(n-1)=='+'||s.charAt(n-1)=='-')
            return false;
        if (d>e&&d!=n)
            return false;

        Map<zt, HashSet<zt>> state = new HashMap<>();

        HashSet<zt> init = new HashSet<>();
        init.add(zt.fu);
        init.add(zt.num);
        init.add(zt.dot);

        HashSet<zt> fu = new HashSet<>();
        fu.add(zt.dot);
        fu.add(zt.num);

        HashSet<zt> num = new HashSet<>();
        num.add(zt.dot);
        num.add(zt.num);
        num.add(zt.ex);

        HashSet<zt> dot = new HashSet<>();
        dot.add(zt.num);

        HashSet<zt> ex = new HashSet<>();
        ex.add(zt.num);
        ex.add(zt.fu);

        state.put(zt.init,init);
        state.put(zt.dot,dot);
        state.put(zt.num,num);
        state.put(zt.ex,ex);
        state.put(zt.fu,fu);
        zt a = zt.init;
        zt b ;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '+'||ch == '-')
            {
                b = zt.fu;
                if(!state.get(a).contains(b))
                {
                    return false;
                }else {
                    a = zt.fu;
                }
            }else if(ch >= '0'&& ch<='9')
            {
                b = zt.num;
                if(!state.get(a).contains(b))
                {
                    return false;
                }else {
                    a = zt.num;
                }
            }else if(ch == '.')
            {
                b = zt.dot;
                if(!state.get(a).contains(b))
                {
                    return false;
                }else {
                    if(i == s.length()-1&&!(s.charAt(i-1) >= '0'&& s.charAt(i-1)<='9'))
                        return false;
                    a = b;
                }
            }else if(ch == 'E'|| ch == 'e')
            {
                b = zt.ex;
                if(!state.get(a).contains(b))
                {
                    return false;
                }else {
                    a = b;
                }
            }else {
                return false;
            }
        }

        return true;
    }
}
