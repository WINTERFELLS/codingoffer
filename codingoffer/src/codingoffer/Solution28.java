package codingoffer;

/*
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
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
