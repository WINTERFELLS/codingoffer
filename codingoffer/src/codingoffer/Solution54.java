package codingoffer;

/*
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
*/

public class Solution54 {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode cur = pHead;
        ListNode res = new ListNode(-1);
        res.next = pHead;
        //设置前置结点用来进行操作
        ListNode pre = res;
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                int val = cur.val;
                while(cur != null && cur.val == val){
                    cur = cur.next;
                }
                pre.next = cur;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        return res.next;
    }
}
