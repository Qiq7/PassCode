package javaxm3.sbww;
//over#222
public class MyLeetCode0012 {
    public class TreeNode{
        int x;
        TreeNode LNode;
        TreeNode RNode;
        TreeNode(int x)
        {
            this.x=x;
        }
    }
    public static void main(String[] args) {

    }
    public  int CountNode(TreeNode root)
    {
        if(root==null) return 0;
        return 1+CountNode(root.LNode)+CountNode(root.RNode);
    }
}
