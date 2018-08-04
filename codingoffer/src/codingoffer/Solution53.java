package codingoffer;

/*
给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
*/

public class Solution53 {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        ListNode head1 = pHead;
        ListNode head2 = pHead;
        boolean flag = false;
        while(head2.next != null && head2.next.next != null){
            head1 = head1.next;
            head2 = head2.next.next;
            if(head1 == head2){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        head1 = pHead;
        while(head1 != head2){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }
}
