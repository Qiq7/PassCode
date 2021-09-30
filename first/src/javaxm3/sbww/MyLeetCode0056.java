package javaxm3.sbww;

public class MyLeetCode0056 {
    public static void main(String[] args) {

    }

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public void reverse(ListNode l,ListNode r,ListNode t)
        {
            ListNode b = l;
            ListNode t0 = l.next;
            while (t0 != null)
            {
                ListNode t1 = t0.next;
                t0.next = l;
                l = t0;
                t0 = t1;
            }
            b.next = r.next;
        }
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode l = new ListNode(-1,head);
            ListNode li = head,ri = head;
            for (int i = 0; i < left; i++) {
                li = li.next;
            }
            for (int i = 0; i < right; i++) {
                ri = ri.next;
            }
            ListNode t = ri.next;
            ListNode b = l;
            for (int i = 0; i < left ; i++) {
                b = b.next;
            }
            b.next = ri;
            ri.next = null;
            reverse(li,ri,t);
            return l.next;
        }
    }
}
