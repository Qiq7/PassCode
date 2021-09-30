

public class MyLeeetCode0084 {
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

    }
    private static TreeNode t ;
      public static void f(TreeNode t0)
      {
          if(t0 == null)
          {
              return;
          }
          f(t0.left);
          t.right = new TreeNode(t0.val);
          t = t.right;
          f(t.right);
      }
    public static TreeNode increasingBST(TreeNode root) {
        t = new TreeNode();
        TreeNode c = t;
        f(root);
        return c.right;
    }
}
