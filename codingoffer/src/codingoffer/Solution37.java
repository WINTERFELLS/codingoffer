package codingoffer;

/*
 * 统计一个数字在排序数组中出现的次数。
 */
public class Solution37 {
    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0){
            return 0;
        }
         int start = getStart(array,k);
         int end = getEnd(array,k);
         if(start != -1 && end != -1){
             return end-start+1;
         }
         return 0;
     }
     
     public int getStart(int[] array, int k){
         int start = 0;
         int end = array.length-1;
         while(start <= end){
             int mid = (start + end)/2;
             if(array[mid] == k){
            	 //重要
                 if((mid == start)||(array[mid-1] != k))
                     return mid;
                 else
                     end = mid - 1;
             }else{
                 if(array[mid] > k)
                     end = mid - 1;
                 else
                     start = mid + 1;
             }
         }
         return -1;
     }
     
     public int getEnd(int[] array, int k){
         int start = 0;
         int end = array.length-1;
         while(start <= end){
             int mid = (start+end)/2;
             if(array[mid] == k){
            	 //重要
                 if((mid == end)||(array[mid+1] != k))
                     return mid;
                 else
                     start = mid + 1;
             }else{
                 if(array[mid] > k)
                     end = mid - 1;
                 else
                     start = mid + 1;
             }
         }
         return -1;
     }
}
