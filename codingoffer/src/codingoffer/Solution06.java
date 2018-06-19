package codingoffer;

/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class Solution06 {
    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int start = 0;
        int end = array.length-1;
        while(start < end){
            int mid = (start+end)/2;
            if(array[mid] > array[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return array[start];
    }
}
