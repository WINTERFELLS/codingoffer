package codingoffer;

/*
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
 * ����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
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
        //�ݹ���ʽ�Ĺ鲢�������ֹ������ͨ��if
        //����Ƿǵݹ����ʽ��while
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