package codingoffer;

/*
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����·�����ԴӾ����е�����һ�����ӿ�ʼ��
 * ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ����һ��·�������˾����е�ĳһ�����ӣ���֮�����ٴν���������ӡ�
 *  ���� a b c e s f c s a d e e ������3 X 4 �����а���һ���ַ���"bcced"��·�������Ǿ����в�����"abcb"·����
 *  ��Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
*/

public class Solution63 {
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int index = 0;
        char[][] matrixs = new char[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrixs[i][j] = matrix[index];
                index++;
            }
        }
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrixs[i][j] == str[0]){
                    int[][] flag = new int[rows][cols];
                    flag[i][j] = 1;
                    if(dfs(i,j,matrixs,str,1,flag)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean dfs(int i, int j, char[][] matrix, char[] str, int index, int[][] flag){
        if(index == str.length){
            return true;
        }else{
            char next = str[index];
            if(i-1 >= 0 && flag[i-1][j] != 1 && matrix[i-1][j] == next){
                flag[i-1][j] = 1;
                if(dfs(i-1,j,matrix,str,index+1,flag))
                    return true;
                flag[i-1][j] = 0;
            }
            if(i+1 < matrix.length && flag[i+1][j] != 1 && matrix[i+1][j] == next){
                flag[i+1][j] = 1;
                if(dfs(i+1,j,matrix,str,index+1,flag))
                    return true;
                flag[i+1][j] = 0;
            }
            if(j-1 >= 0 && flag[i][j-1] != 1 && matrix[i][j-1] == next){
                flag[i][j-1] = 1;
                if(dfs(i,j-1,matrix,str,index+1,flag))
                    return true;
                flag[i][j-1] = 0;
            }
            if(j+1 < matrix[0].length && flag[i][j+1] != 1 && matrix[i][j+1] == next){
                flag[i][j+1] = 1;
                if(dfs(i,j+1,matrix,str,index+1,flag))
                    return true;
                flag[i][j+1] = 0;
            }
            return false;
        }
    } 
}