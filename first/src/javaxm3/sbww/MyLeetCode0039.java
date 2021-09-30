package javaxm3.sbww;

public class MyLeetCode0039 {
    public static class ListNode
    {
         int val;
         ListNode next;
         ListNode(int x)
         {
             val=x;
         }
         ListNode()
         {
             this.next=null;
         }
    }
    public static void main(String[] args) {

    }
    public static ListNode partition(ListNode head, int x) {
            ListNode l0=new ListNode();
            ListNode l1=new ListNode();
            ListNode p0=l0;
            ListNode p=l1;
            ListNode h=head.next;
            if(h.next==null) return head;
            while (h!=null)
            {
                if(h.val<x)
                {
                    l0.next=h;
                    l0=l0.next;
                }else {
                    l1.next=h;
                    l1=l1.next;
                }
                h=h.next;
            }
            l1.next=null;
            l0.next=p.next;
            return p0.next.next;
    }
}
