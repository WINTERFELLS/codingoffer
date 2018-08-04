package codingoffer;

/*
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
 * ����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
 */
public class Solution50 {
	public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        if(A == null || len == 0){
            return B;
        }
        int[] C = new int[len];
        int[] D = new int[len];
        C[0] = 1;
        D[len-1] = 1;
        for(int i = 1; i < len ;i++){
            C[i] = C[i-1] * A[i-1];
        }
        for(int i = len-2; i >= 0; i--){
            D[i] = D[i+1] * A[i+1];
        }
        for(int i = 0; i < len; i++){
            B[i] = C[i] * D[i];
        }
        return B;
    }
}
