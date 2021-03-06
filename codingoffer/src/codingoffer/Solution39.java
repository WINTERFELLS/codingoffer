package codingoffer;

/*
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
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
        //找出为1的位数
        for(index = 0; index < 32; index++){
            if((res & (1 << index)) != 0)
                break;
        }
        //分两组计算
        for(int i = 0; i < len; i++){
            if((array[i] & (1 << index)) != 0){
                num1[0] ^= array[i];
            }else{
                num2[0] ^= array[i];
            }
        }
    }
}
