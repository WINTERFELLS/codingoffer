package codingoffer;

/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution01 {
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
