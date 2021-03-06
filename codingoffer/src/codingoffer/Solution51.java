package codingoffer;

/*
请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
*/

public class Solution51 {
    public boolean isNumeric(char[] str) {
        if(str == null || str.length == 0){
            return false;
        }
        boolean sign = false;
        boolean decimal = false;
        boolean hasE = false;
        for(int i = 0 ; i < str.length; i++){
            if(str[i] == 'e'||str[i] == 'E'){
                if(i == str.length-1){
                    return false;
                }else if(hasE){
                    return false;
                }else{
                    hasE = true;
                }
            }else if(str[i] == '+' || str[i] == '-'){
                if(sign && str[i-1] != 'e' && str[i-1] != 'E'){
                    return false;
                }else if(!sign && i > 0 && str[i-1] != 'e' && str[i-1] != 'E'){
                    return false;
                }else{
                    sign = true;
                }
            }else if(str[i] == '.'){
                if(hasE || decimal){
                    return false;
                }else{
                    decimal = true;
                }
            }else if(str[i] < '0' || str[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
