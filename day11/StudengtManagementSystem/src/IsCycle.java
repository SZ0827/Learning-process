import java.util.HashSet;
import java.util.Set;

public class IsCycle {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        System.out.println(isCycle(node1));
        System.out.println(isCycle2(node1));

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean isCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        Set<ListNode> set=new HashSet<>();
        while(head!=null){
            if(set.contains(head))
            return true;
            set.add(head);
            head=head.next;
        }
        return false;
    }
    public static boolean isCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(slow!=fast){
            if(slow.next==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}