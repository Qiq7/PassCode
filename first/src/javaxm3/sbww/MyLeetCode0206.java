package javaxm3.sbww;

public class MyLeetCode0206 {
    public static void main(String[] args) {

    }
    public int f(TreeNode root,int taget)
    {
        int aus = 0;
        if (root==null)return 0;
        if(root.val==taget)
        {
            aus++;
        }
        aus+=f(root.left, taget-root.val);
        aus+=f(root.right,taget-root.val);
        return aus;
    }
    public int pathSum(TreeNode root,int targetSum) {
        if (root==null) return 0;
        int aus = f(root,targetSum);
        aus+=pathSum(root.right,targetSum);
        aus+=pathSum(root.left,targetSum);
        return aus;
    }
}
