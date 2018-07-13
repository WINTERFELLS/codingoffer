package codingoffer;

/*
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1.
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
