package codingoffer;

/*
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution10 {
	public int NumberOf1(int n) {
        if(n == 0) return 0;
        int res = 0;
        while(n!=0){
            res++;
            n = n&(n-1);
        }
        return res;
    }
}
