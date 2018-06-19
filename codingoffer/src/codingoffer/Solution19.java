package codingoffer;

import java.util.ArrayList;

/*
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Solution19 {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix == null){
            return res;
        }
        int lenrow = matrix.length;
        int lencol = matrix[0].length;
        int start = 0;
        while((lenrow > start * 2) && (lencol > start * 2)){
            int endX = lencol - 1 - start;
            int endY = lenrow - 1- start;
            for(int i = start; i <= endX; i++){
                res.add(matrix[start][i]);
            }
            if(start < endY){
                for(int i = start+1; i <= endY; i++){
                    res.add(matrix[i][endX]);
                }
            }
            if(start < endX && start < endY){
                for(int i = endX-1; i >= start; i--){
                    res.add(matrix[endY][i]);
                }
            }
            if(start < endX && start < endY - 1){
                for(int i = endY-1; i >= start+1; i--){
                    res.add(matrix[i][start]);
                }
            }
            start++;
        }
        return res;
    }
}