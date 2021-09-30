package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0156 {
    public static void main(String[] args) {

    }
    Map<Integer,int []> s = new HashMap<>();
    List<Integer> a = new LinkedList<>();
    Map<Integer,List<Integer>> m = new HashMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> aus = new LinkedList<>();
        f(root,0,0);
        Collections.sort(a);
        for (int x:a) {
            List<Integer> c = m.get(x);
            Collections.sort(c, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return s.get(o1)[0]==s.get(o2)[0]?o1-o2:s.get(o1)[0]-s.get(o2)[0];
                }
            });
            aus.add(c);
        }
        return aus;
    }
    public void f(TreeNode root,int r,int l)
    {
        if (root == null) return;
        if(!a.contains(l)) a.add(l);
        List<Integer> c = m.getOrDefault(l,new LinkedList<>());
        c.add(root.val);
        m.put(l,c);
        s.put(root.val,new int[]{r,l});
        f(root.left,r+1,l-1);
        f(root.right,r+1,l+1);
    }
}
