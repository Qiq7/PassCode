package javaxm3.sbww;

public class MyLeetCode0073 {
      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static void main(String[] args) {
          TreeNode root = new TreeNode(1);
          TreeNode a = new TreeNode(0);
          TreeNode b = new TreeNode(12);
          TreeNode c = new TreeNode(48);
          TreeNode d = new TreeNode(49);
          root.left=a;
          root.right=c;
          c.left=b;
          c.right=d;
        System.out.println(minDiffInBST(root));
    }
      private static int aus = 666;
      private static int pre = -1;
    public static void f(TreeNode root)
    {
        if(root == null)
        {
            return;
        }else{
            f(root.left);
            if (pre != -1) {
                aus = Math.min(aus, root.val - pre);
            }
            pre = root.val;
            f(root.right);
        }
    }
    public static int minDiffInBST(TreeNode root) {
        f(root);
        return aus;
    }
}
