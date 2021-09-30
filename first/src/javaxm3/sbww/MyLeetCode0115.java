package javaxm3.sbww;

import java.util.HashSet;
import java.util.Set;

public class MyLeetCode0115 {
    public static void main(String[] args) {

    }
    public static MyLeetCode0056.ListNode getIntersectionNode(MyLeetCode0056.ListNode headA, MyLeetCode0056.ListNode headB) {
        Set<MyLeetCode0056.ListNode> visited = new HashSet<>();
        MyLeetCode0056.ListNode temp = headA;
        while (temp!=null)
        {
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp!=null)
        {
            if(visited.contains(temp))
            {
                return  temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
