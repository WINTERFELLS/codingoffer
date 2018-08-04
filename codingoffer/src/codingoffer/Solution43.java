package codingoffer;

/*
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
 * ���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 */
public class Solution43 {
    public String ReverseSentence(String str) {
        if(str == null || str.length() == 0){
            return "";
        }
        char[] chars = str.toCharArray();
        reserve(chars, 0, chars.length-1);
        int index = 0;
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                reserve(chars, index, i-1);
                index = i+1;
            }
        }
        reserve(chars, index, chars.length-1);
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