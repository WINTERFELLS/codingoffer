package codingoffer;

/*
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
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
