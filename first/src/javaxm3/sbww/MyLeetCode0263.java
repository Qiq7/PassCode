package javaxm3.sbww;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MyLeetCode0263 {

    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        int level = 0;
        q.offer(root);
        while (!q.isEmpty()){

            int pre = level%2==0?Integer.MIN_VALUE:Integer.MAX_VALUE;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                int value = node.val;
                if (level%2==0){
                    if (!(value>pre&&value%2==1)){
                        System.out.println(value);
                        return false;
                    }
                }

                if (level%2==1){
                    if (!(value<pre&&value%2==0)){
                        System.out.println(pre);
                        System.out.println(value);
                        return false;
                    }
                }
                pre = value;


                    if (node.left!=null){
                        q.offer(node.left);
                    }
                if (node.right!=null){
                    q.offer(node.right);
                }
            }
            level++;
        }
        return true;
    }
}
