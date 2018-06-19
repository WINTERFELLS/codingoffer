package codingoffer;

/*
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Solution11 {
    public double Power(double base, int exponent) {
        if(base == 0) return 0;
        if(exponent == 0) return 1;
        boolean flagexponent = false;
        if(exponent < 0){
            flagexponent = true;
            exponent = -exponent;
        }
        double res = cal(base, exponent);
        if(flagexponent)
            return 1/res;
        else
            return res;
    }
    public double cal(double base, int exponent){
        if(exponent == 1){
            return base;
        }
        if(exponent % 2 == 0){
            return cal(base, exponent/2) * cal(base, exponent/2);
        }else{
            return cal(base, (exponent-1)/2) * cal(base, (exponent-1)/2) * base;
        }
    }
}
