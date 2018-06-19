package codingoffer;

/*
 * ����һ������������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ���������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 */
public class Solution25 {
	public RandomListNode Clone(RandomListNode pHead){
			if(pHead==null)
				return null;
			RandomListNode pCur = pHead;
			//����next ��ԭ����A->B->C ���A->A'->B->B'->C->C'
			while(pCur!=null){
				RandomListNode node = new RandomListNode(pCur.label);
				node.next = pCur.next;
				pCur.next = node;
				pCur = node.next;
			}
			pCur = pHead;
			//����random pCur��ԭ�������Ľ�� pCur.next�Ǹ���pCur�Ľ��
			while(pCur!=null){
				if(pCur.random!=null)
					pCur.next.random = pCur.random.next;
				pCur = pCur.next.next;
			}
			RandomListNode head = pHead.next;
			RandomListNode cur = head;
			pCur = pHead;
			//�������
			while(pCur!=null){
				pCur.next = pCur.next.next;
				if(cur.next!=null)
					cur.next = cur.next.next;
					cur = cur.next;
					pCur = pCur.next;
				}
			return head;
		}
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}