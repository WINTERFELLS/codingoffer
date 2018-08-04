package codingoffer;

/*
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class Solution48 {
    public int StrToInt(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }
        boolean morethanzero = true;
        if(str.charAt(0) == '-'){
            morethanzero = false;
        }
        
        long res = 0;
        for(int i = 0; i < str.length(); i++){
            char t = str.charAt(i);
            if(t == '-' && i == 0) continue;
            if(t == '+' && i == 0) continue;
            if(t < '0' || t > '9'){
                return 0;
            }
            res = res*10 + (t-'0');
        }
        if(morethanzero) return (int)res;
        else return 0-(int)res;
    }
}
