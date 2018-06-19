package codingoffer;
/*
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class Solution02 {
	public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0){
            return false;
        }
        int lenrow = array.length;
        int lencol = array[0].length;
        int i = lenrow-1;
        int j = 0;
        while(i >= 0 && j < lencol){
            if(array[i][j] == target){
                return true;
            }else if(array[i][j] < target){
                j++;
            }else if(array[i][j] > target){
                i--;
            }
        }
        return false;
    }
}