package javaxm3.sbww;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyLeetCode0201 {
    public static void main(String[] args) {

    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] aus = new ListNode[k];
        int[] a= new int[k];
        int all = 0;
        ListNode b = head;
        while (b!=null)
        {
            all++;
            b=b.next;
        }
        int n = all/k,m = all%k;
        for (int i = 0; i < k; i++) {
            if(i<m)
            {
                a[i] = n+1;
            }else {
                a[i] = n;
            }
        }
        System.out.println(n);
        System.out.println(m);
        for (int i = 0; i < k; i++) {
            if (head == null)
            {
                aus[i] = head;
            }else {
                ListNode q = new ListNode(head.val);
                head=head.next;
                aus[i] = q;
                for (int j = 0; j < a[i]-1; j++) {
                    if(head!=null) {
                        q.next = new ListNode(head.val);
                        q=q.next;
                        head=head.next;
                    }
                    else {
                        q.next = null;
                        head = null;
                    }
                }
                q.next = null;
            }
        }
        return aus;
    }
}
