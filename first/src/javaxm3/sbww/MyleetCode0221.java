package javaxm3.sbww;


import java.util.ArrayDeque;
import java.util.Deque;
//给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
public class MyleetCode0221 {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root!=null||!stack.isEmpty())
        {
            while (root.left!=null)
            {
                stack.push(root.left);
                root=root.left;
            }
            root = stack.pop();
            k--;
            if(k==0) break;
            root = root.right;

        }
        return root.val;
    }
}
