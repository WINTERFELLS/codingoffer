package codingoffer;

/*
��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
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
