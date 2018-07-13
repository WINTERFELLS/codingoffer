package codingoffer;

/*
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class Solution36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode temp1 = pHead1;
        ListNode temp2 = pHead2;
        while(temp1 != temp2){
        	//注意是temp == null 而不是temp1.next==null
            temp1 = (temp1 == null) ? pHead2 : temp1.next;
            temp2 = (temp2 == null) ? pHead1 : temp2.next;
        }
        return temp1;
    }
}
