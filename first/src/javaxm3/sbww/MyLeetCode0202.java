package javaxm3.sbww;

public class MyLeetCode0202 {
    class Node{
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }


    public static void main(String[] args) {

    }
    public Node dfs(Node head)
    {
        Node cur = head
                ,last = null;
        while (cur!=null)
        {
            Node next = cur.next;
            if (cur.child!=null)
            {
                Node childLast = dfs(cur.child);

                cur.next = cur.child;
                cur.child.prev=cur;
                cur.child = null;

                if(next!=null)
                {
                    childLast.next = next;
                    next.prev = childLast;
                }
                last = childLast;

            }else {
                last = cur;
            }
            cur = cur.next;

        }
        return last;

    }
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }
}
