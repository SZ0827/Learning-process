public class Algorithm {
    public static void main(String[] args) {
        //创建两个链表
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        ListNode l3=mergeTwoLists(l1,l2);
        while(l3!=null){
            System.out.print(l3.val+"->");
            l3=l3.next;
        }
        System.out.print("null");

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum=new ListNode(0),cur=dum;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                cur.next=l1;
                l1=l1.next;
            }else{
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        cur.next=l1!=null?l1:l2;
        return dum.next;
    }



}
