package codingoffer;

/*
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
 */
public class Solution23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0){
            return false;
        }
        return judge(sequence, 0, sequence.length-1);
    }
    
    public boolean judge(int[] a, int start, int end){
        if(start >= end){
            return true;
        }
        int index = end;
        while(index > start && a[index-1]>a[end]){
            index--;
        }
        for(int i = start; i < index-1; i++){
            if(a[i] > a[end]){
                return false;
            }
        }
        return judge(a,start,index-1) && judge(a,index,end-1);
    }
}