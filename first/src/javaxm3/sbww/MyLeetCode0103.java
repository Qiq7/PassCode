package javaxm3.sbww;

public class MyLeetCode0103 {
    public static void main(String[] args) {

    }
    private static int [][] map ;
    private static int q1,q2;
    public static void f(MyLeetCode0073.TreeNode root, int x, int y,int k)
    {
        if(root==null)
        {
            return;
        }
        if (root.val==x)
        {
            map[0][0] = q1;
            map[0][1] = k;
        }
        if(root.val==y)
        {
            map[1][0] = q2;
            map[1][1] = k;
        }
        q1 = root.val;
        q2 = root.val;
        f(root.left,x,y,k+1);
        q1 = root.val;
        q2 = root.val;
        f(root.right,x,y,k+1);
    }
    public static boolean isCousins(MyLeetCode0073.TreeNode root, int x, int y) {
        map = new int[2][2];
        f(root,x,y,0);
        return map[0][0]!=map[1][0]?map[0][1]==map[1][1]:false;
    }
}
