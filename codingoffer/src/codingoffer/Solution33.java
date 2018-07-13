package codingoffer;

/*
 * ��ֻ����������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ������������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 */
public class Solution33 {
	public int GetUglyNumber_Solution(int index) {
        if(index == 0){
            return 0;
        }
        int[] nums = new int[index];
        nums[0] = 1;
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        for(int i = 1; i < index; i++){
            nums[i] = Math.min(2*nums[t2], Math.min(3*nums[t3], 5*nums[t5]));
            if(nums[i] == nums[t2]*2) t2++;
            if(nums[i] == nums[t3]*3) t3++;
            if(nums[i] == nums[t5]*5) t5++;
        }
        return nums[index-1];
    }
}
