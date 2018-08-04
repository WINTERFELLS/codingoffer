package codingoffer;

/*
请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，
第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
*/

public class Solution52 {
    int[] num = new int[256];
    int index = 0;
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        index++;
        if(num[ch] == 0){
            num[ch] = index;
        }else if(num[ch] > 0){
            num[ch] = -1;
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int min = Integer.MAX_VALUE;
        char res = '#';
        for(int i = 0; i < 256; i++){
            if(num[i] > 0){
                if(num[i] < min){
                    min = num[i];
                    res = (char)i;
                }
            }
        }
        return res;
    }
}
