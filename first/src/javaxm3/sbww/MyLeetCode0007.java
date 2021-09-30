package javaxm3.sbww;

import javax.swing.event.ListDataEvent;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyLeetCode0007 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x)
        {
            val = x;
        }
    }
    public static void main(String[] args) {
        int a[]={4,2,1,3};
        ListNode l =new ListNode(4);
        ListNode t=l;
        for (int i = 1; i < a.length; i++) {
            ListNode x=new ListNode(a[i]);
            t.next=x;
            t=x;
        }
        //show(l);
        //insertionSortLidt(l);
        show(insertionSortLidt(l));
    }
    public static void show(ListNode l)
    {
        System.out.println();
        while(l!=null)
        {
            System.out.print(l.val+"   ");
            l=l.next;
        }
    }
    public static ListNode insertionSortLidt(ListNode head)
    {
        if(head==null) return head;
        ListNode k=new ListNode(0);
        k.next=head;
        ListNode t=k.next,l=t.next;
        ListNode e=null,w,q=k;
        //show(k);
        while (l!=null)
        {
            if(l.val<t.val)
            {
                e=k;
                t.next=l.next;
                while (e.next.val<l.val)
                {
                    e=e.next;
                }
                //w=e.next;
                l.next=e.next;
                e.next=l;
                //show(k);
            }else{
                t=t.next;
            }
            l=t.next;
        }
        //show(k.next);
        return k.next;
    }
}
