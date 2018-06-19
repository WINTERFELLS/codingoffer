package codingoffer;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class Solution03 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if(listNode == null){
            return res;
        }
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }
}

class ListNode {
	int val;
	ListNode next = null;
	ListNode(int val) {
		this.val = val;
	}
}