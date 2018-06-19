package codingoffer;

/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution01 {
    public String replaceSpace(StringBuffer str) {
    	if(str == null || str.length() == 0){
            return "";
        }
        int len = str.length();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count += 2;
            }
        }
        str.setLength(len+count);
        int index = len-1;
        for(int i = str.length()-1; i >= 0; i--,index--){
            if(str.charAt(index) == ' '){
                str.setCharAt(i, '0');
                str.setCharAt(i-1, '2');
                str.setCharAt(i-2, '%');
                i -= 2;
            }else{
                str.setCharAt(i, str.charAt(index));
            }
        }
        return str.toString();
    }
}
