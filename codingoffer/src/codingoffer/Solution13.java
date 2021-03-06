package codingoffer;

/*
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution13 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null){
            return null;
        }
        ListNode pre = head;
        ListNode next = head;
        for(int i = 0; i < k; i++){
            if(next == null)
                return null;
            else
                next = next.next;
        }
        while(next != null){
            pre = pre.next;
            next = next.next;
        }
        return pre;
    }
}
