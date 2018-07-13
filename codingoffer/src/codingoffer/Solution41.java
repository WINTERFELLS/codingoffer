package codingoffer;

import java.util.ArrayList;

public class Solution41 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        
        ArrayList<Integer> res = new ArrayList<>();
        if(array == null || array.length == 0){
            return res;
        }
        int min = Integer.MAX_VALUE;
        int res1 = 0;
        int res2 = 0;
        int low = 0;
        int high = array.length-1;
        while(low < high){
            int temp = array[low] + array[high];
            if(temp > sum){
                high--;
            }else if(temp < sum){
                low++;
            }else{
                int t = array[low] * array[high];
                if(t < min){
                    min = t;
                    res1 = array[low];
                    res2 = array[high];
                }else{
                    low++;
                    high--;
                }
            }
        }
        if(res1 == 0 && res2 == 0){
            return res;
        }
        res.add(res1);
        res.add(res2);
        return res;
    }
}