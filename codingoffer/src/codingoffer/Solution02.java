package codingoffer;
/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
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
