package codingoffer;

/*
 * ����n���������ҳ�������С��K������
 * ��������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 */
import java.util.*;
public class Solution29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(input == null || input.length == 0){
            return res;
        }
        int len = input.length;
        if(len < k){
            return res;
        }
        if(k == 0){
            return res;
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return o2.compareTo(o1); 
            }
        });
        
        for(int i = 0; i < input.length; i++){
            if(maxHeap.size() < k){
                maxHeap.add(input[i]);
            }else{
                if(maxHeap.peek() > input[i]){
                    maxHeap.poll();
                    maxHeap.offer(input[i]);
                }
            }
        }
        for(Integer num : maxHeap){
            res.add(num);
        }
        return res;
    }
}
