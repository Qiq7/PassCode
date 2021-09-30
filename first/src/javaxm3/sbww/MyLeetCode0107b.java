package javaxm3.sbww;

import java.util.Arrays;
import java.util.Comparator;

public class MyLeetCode0107b {
    public static void main(String[] args) {

    }
    static class Trie{
        private static final int L = 30;
        Trie[] t = new Trie[2];
        public void insert(int x)
        {
            Trie node = this;
            for (int i = L; i >= 0 ; i--) {
                int b = (x>>i) & 1;
                if(node.t[b]==null)
                {
                    node.t[b] = new Trie();
                }
                node = node.t[b];
            }
        }
        public int getM(int x)
        {
            int aus = 0;
            Trie node = this;
            for (int i = L; i >= 0 ; i++) {
                int b = (x>>i) & 1;
                if(node.t[b^1]!=null)
                {
                    aus |= 1<<i;
                    b ^= 1;
                }
                node = node.t[b];
            }
            return aus;
        }
    }
    public int[] maximizeXor(int[] nums, int[][] queries) {
        int[] a = new int[queries.length];
        int [][] b = new int[queries.length][3];
        for (int i = 0; i < queries.length; i++) {
            b[i][0] = queries[i][0];
            b[i][1] = queries[i][1];
            b[i][2] = i;
        }
        Arrays.sort(nums);
        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        Trie t = new Trie();
        int c = 0;
        for (int [] x:b) {
            while (c<nums.length&&nums[c]<=x[1])
            {
                t.insert(nums[c]);
                c++;
            }
            if(c==0)
            {
                a[x[2]] = -1;
            }else {
                a[x[2]] = t.getM(x[0]);
            }
        }
        return a;
    }
}
