package codingoffer;

/*
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
 * ��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)����᲻�ᱻ������ס��(�������ĳ���������1)
 */
public class Solution30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int len = array.length;
        int[] dp = new int[len];
        dp[0] = array[0];
        for(int i = 1; i < len; i++){
            int temp = dp[i-1]+array[i];
            dp[i] = temp > array[i] ? temp : array[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++){
            max = max > dp[i] ? max : dp[i];
        }
        return max;
    }
}
