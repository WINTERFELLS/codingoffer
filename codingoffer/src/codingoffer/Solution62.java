package codingoffer;

import java.util.ArrayDeque;
import java.util.ArrayList;

/*
 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
 * ���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ�
 * ���ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� �������{2,3,4,2,6,2,5,1}�Ļ�������������6����
 *  {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
*/

public class Solution62 {

	public ArrayList<Integer> maxInWindows(int [] num, int size){
		ArrayList<Integer> res = new ArrayList<>();
		if(size == 0) return res;
		int begin;
		ArrayDeque<Integer> q = new ArrayDeque<>();
		for(int i = 0; i < num.length; i++){
			begin = i - size + 1;
			if(q.isEmpty())
				q.add(i);
			else if(begin > q.peekFirst())
				q.pollFirst();
			while((!q.isEmpty()) && num[q.peekLast()] <= num[i])
				q.pollLast();
			q.add(i);
			if(begin >= 0)
				res.add(num[q.peekFirst()]);
			}
		return res;
	}
}