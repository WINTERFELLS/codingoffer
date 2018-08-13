package codingoffer;

/*
地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
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