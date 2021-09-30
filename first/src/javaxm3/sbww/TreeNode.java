package javaxm3.sbww;

public class TreeNode {

    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(TreeNode left,TreeNode right ,int val)
    {
        this.left = left;
        this.right = right;
        this.val = val;
    }
    TreeNode(int val)
    {
        this.val = val;
        this.right = null;
        this.left = null;
    }
    TreeNode(){}
}
