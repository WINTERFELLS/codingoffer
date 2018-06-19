package codingoffer;

/*
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class Solution15 {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
