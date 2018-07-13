package codingoffer;

/*
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1.
 */
public class Solution34 {
    public int FirstNotRepeatingChar(String str) {
        if (str.length() == 0) {
            return  -1;
        }
        int[] num = new int[128];
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int index = c-'A';
            num[index]++;
        }
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int index = c-'A';
            if(num[index] == 1){
                return i;
            }
        }
        return -1;
    }
}
