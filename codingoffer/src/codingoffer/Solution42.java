package codingoffer;

/*
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ���������������һ���������ַ�����S���������ѭ������Kλ������������
 * ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 */
public class Solution42 {
    public String LeftRotateString(String str,int n) {
        if(str == "" || str.length() == 0){
            return "";
        }
        char[] chars = str.toCharArray();
        reserve(chars, 0, chars.length-1);
        reserve(chars, 0, chars.length-1-n);
        reserve(chars, chars.length-n, chars.length-1);
        return new String(chars);
        
    }
    public void reserve(char[] chars, int start, int end){
        while(start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
