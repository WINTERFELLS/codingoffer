package codingoffer;

import java.util.Arrays;

/*
 * LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...��������г����5����,
 * �����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,
 * ��������,������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13�������5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����
 * LL����ȥ��������Ʊ���� 
 * ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Σ� ����������˳�Ӿ����true����������false��Ϊ�˷������,�������Ϊ��С����0��
 */
public class Solution44 {
	public boolean isContinuous(int[] numbers) {
		int numOfZero = 0;
		int numOfInterval = 0;
		int length = numbers.length;
		if(length == 0){
			return false;
		}
		Arrays.sort(numbers);
		for (int i = 0; i < length - 1; i++) {
			// �����������
			if (numbers[i] == 0) {
				numOfZero++;
				continue;
			}
			// ���ӣ�ֱ�ӷ���
			if (numbers[i] == numbers[i + 1]) {
				return false;
			}
			numOfInterval += numbers[i + 1] - numbers[i] - 1;
		}
		if (numOfZero >= numOfInterval) {
			return true;
		}
		return false;
	}
}
