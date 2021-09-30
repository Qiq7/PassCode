package javaxm2.sbww.study;

import java.util.Scanner;

public class Lqb019 {
    static class Trie{
        private Trie lt,rt;
        private char value;
        Trie()
        {
            lt = null;
            rt = null;
        }

        public Trie(char value) {
            this.value = value;
        }
    }
    public static Trie c(String s,int l,int r){
        if (l == r) {
            if (s.charAt(l) == '0')
            {
                return new Trie('B');
            }else {
                return new Trie('I');
            }
        }
        int x = l;
        char ch = 'B' ;
        boolean is0 =false,is1 = false;
        for (int i = x; i <= r ; i++) {
            if(s.charAt(i)=='1')
            {
                is1 = true;
            }else {
                is0 = true;
            }
        }
        if(is0&&is1)
        {
            ch = 'F';
        }
        if (!is0&&is1) ch = 'I';
        Trie node = new Trie(ch);
        node.lt = c(s,l,(l+r)/2);
        node.rt = c(s,(l+r)/2+1,r);
        return node;
    }
    public static void f(Trie node)
    {
        if (node == null)
        {
            return;
        }
            f(node.lt);
            f(node.rt);
        System.out.print(node.value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Trie node = c(s,0,s.length()-1);
        f(node);
    }
}
