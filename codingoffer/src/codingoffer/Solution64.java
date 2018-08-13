package codingoffer;

/*
������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ��
���ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ� ���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18��
���ǣ������ܽ��뷽��35,38������Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
*/

public class Solution64 {
	public int movingCount(int threshold, int rows, int cols){
        int res = 0;
        if(threshold == 0){
            return res;
        }
        int[][] num = new int[rows][cols];
        dfs(0,0,num,rows,cols,threshold);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(num[i][j] == 1){
                    res++;
                }
            }
        }
        return res;
    }
    
    public void dfs(int temprow, int tempcol, int[][] num, int rows, int cols, int threshold){
        if(temprow < 0 || tempcol < 0 || temprow >= rows || tempcol >= cols)
            return;
        if(num[temprow][tempcol] == 1)
            return;
        if(sum(temprow,tempcol)>threshold)
            return;
        num[temprow][tempcol] = 1;
        dfs(temprow+1,tempcol,num,rows,cols,threshold);
        dfs(temprow-1,tempcol,num,rows,cols,threshold);
        dfs(temprow,tempcol+1,num,rows,cols,threshold);
        dfs(temprow,tempcol-1,num,rows,cols,threshold);
    }
    
    public int sum(int a, int b){
        int num1 = cal(a);
        int num2 = cal(b);
        return num1+num2;
    }
    
    public int cal(int num){
        int res = 0;
        while(num > 0){
            res += num%10;
            num /= 10;
        }
        return res;
    }
}