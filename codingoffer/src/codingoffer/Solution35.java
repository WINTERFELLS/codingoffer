package codingoffer;

/*
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class Solution35 {
	public int res;
    public int InversePairs(int [] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        mergeSort(array,0,array.length-1);
        return res%1000000007;
    }
    public void mergeSort(int[] array, int start, int end){
        int mid = (start+end)/2;
        //递归形式的归并排序的终止条件是通过if
        //如果是非递归的形式用while
        if(start<end){
            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end);
            merge(array, start, mid, end);
        }
    }
    public void merge(int[] array, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int index = 0;
        while(i <= mid && j <= end){
            if(array[i] < array[j]){
                temp[index] = array[i];
                index++;
                i++;
            }
            if(array[i] > array[j]){
                temp[index] = array[j];
                index++;
                j++;
                res += mid-i+1;
                res %= 1000000007;
            }
        }
        while(i <= mid){
            temp[index++] = array[i++];
        }
        while(j <= end){
            temp[index++] = array[j++];
        }
        for(int k = 0; k < temp.length; k++){
            array[start+k] = temp[k];
        }
    }
}
