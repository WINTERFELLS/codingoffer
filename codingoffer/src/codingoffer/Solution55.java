package codingoffer;

/*
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
*/

public class Solution55 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode == null)
            return null;
        if(pNode.right != null){
            pNode = pNode.right;
            while(pNode.left != null)
                pNode = pNode.left;
            return pNode;
        }
        if(pNode.next != null && pNode == pNode.next.left){
            return pNode.next;
        }
        if(pNode.next != null && pNode == pNode.next.right){
            while(pNode.next != null && pNode.next.left != pNode)
                pNode = pNode.next;
            return pNode.next;
        }
        return null;
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}