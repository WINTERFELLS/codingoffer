package codingoffer;

/*
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 */
public class Solution28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int max = array[0];
        int count = 1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == max){
                count++;
            }else{
                if(count == 0){
                    max = array[i];
                    count = 1;
                }else{
                    count--;
                }
            }
        }
        count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == max)
                count++;
        }
        if(count*2 > array.length)
            return max;
        else
            return 0;
    }
}
