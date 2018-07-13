package codingoffer;

/*
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 */
public class Solution39 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length == 0){
            num1[0] = 0;
            num2[0] = 0;
            return;
        }
        int len = array.length;
        int index = 0;
        int res = 0;
        for(int i = 0; i < len; i++){
            res ^= array[i];
        }
        //�ҳ�Ϊ1��λ��
        for(index = 0; index < 32; index++){
            if((res & (1 << index)) != 0)
                break;
        }
        //���������
        for(int i = 0; i < len; i++){
            if((array[i] & (1 << index)) != 0){
                num1[0] ^= array[i];
            }else{
                num2[0] ^= array[i];
            }
        }
    }
}