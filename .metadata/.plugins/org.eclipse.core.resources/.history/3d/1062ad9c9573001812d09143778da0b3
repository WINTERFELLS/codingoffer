package codingoffer;

/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution08 {
    public int JumpFloor(int target) {
        if(target <= 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int num1 = 1;
        int num2 = 2;
        for(int i = 3; i <= target; i++){
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }
}
