package javaxm3.sbww;


import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0096 {
    public static void main(String[] args) {

    }
    public static void f(List<Integer> a , MyLeetCode0073.TreeNode root)
    {
        if(root.right==null&&root.left==null)
        {
            a.add(root.val);
        }
        else {
            if(root.left!=null)
            {
                f(a,root.left);
            }
            if(root.right!=null)
            {
                f(a,root.right);
            }
        }
    }
    public static boolean leafSimilar(MyLeetCode0073.TreeNode root1, MyLeetCode0073.TreeNode root2) {
        List<Integer> a = new LinkedList<>(),b = new LinkedList<>();
        if(root1!=null) {
            f(a, root1);
        }
        if(root2!=null) {
            f(b, root2);
        }
        return a.equals(b);
    }
}
