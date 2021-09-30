package javaxm3.sbww;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyLeetCode0134 {
    public static void main(String[] args) {

    }
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }
    public String f(TreeNode t,String st)
    {
        if(t == null)
        {
            st+="None,";
        }else{
            st+=String.valueOf(t.val)+",";
            st=f(t.left,st);
            st=f(t.right,st);
        }
        return st;
    }
    public TreeNode t(List<String> a){
        if(a.get(0).equals("None"))
        {
            a.remove(0);
            return null;
        }
        TreeNode x = new TreeNode(Integer.valueOf(a.get(0)));
        a.remove(0);
        x.left = t(a);
        x.right = t(a);
        return x;
    }
    public String serialize(TreeNode root) {
        return f(root,"");
    }
    public TreeNode deserialize(String data) {
        String[] s = data.split(",");
        List<String> a = new LinkedList<>(Arrays.asList(s));
        return t(a);
    }
}
