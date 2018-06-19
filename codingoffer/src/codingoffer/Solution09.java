package codingoffer;

/*
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 */
public class Solution09 {
    public int RectCover(int target) {
        if(target <= 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        int num1 = 1;
        int num2 = 2;
        for(int i = 3; i <= target; i++){
            int temp = num1+num2;
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }
}