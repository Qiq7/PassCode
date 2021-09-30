package javaxm3.sbww;


import java.util.HashMap;
import java.util.Map;

public class MyleetCode0184 {
    public static void main(String[] args) {

    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        Map<Integer,ListNode> map = new HashMap<>();
        int i = 1;
        while (head!=null)
        {
            map.put(i,head);
            head=head.next;
            i++;
        }
        return map.get(i-k);
    }
}
