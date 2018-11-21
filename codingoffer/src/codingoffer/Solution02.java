package codingoffer;
/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution02 {
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
