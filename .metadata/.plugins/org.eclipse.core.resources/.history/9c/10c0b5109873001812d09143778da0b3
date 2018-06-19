package codingoffer;

/*
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution14 {
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
