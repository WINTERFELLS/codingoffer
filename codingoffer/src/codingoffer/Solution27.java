package codingoffer;

/*
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 */
import java.util.ArrayList;
public class Solution27 {
    ArrayList<String> res = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
       if(str == "" || str.length() == 0){
           return res;
       }
        int len = str.length();
        StringBuffer sb = new StringBuffer(str);
        int[] flag = new int[len];
        StringBuffer temp = new StringBuffer();
        dfs(temp, 0, len, flag, sb);
        return res;
    }
    public void dfs(StringBuffer temp, int count, int len, int[] flag, StringBuffer sb){
        if(count == len){
            String s = temp.toString();
            if(res.contains(s)) return;
            else res.add(s);
        }else{
            for(int i = 0; i < len; i++){
                if(flag[i] == 0){
                    temp.append(sb.charAt(i));
                    count++;
                    flag[i] = 1;
                    dfs(temp, count, len, flag, sb);
                    temp.deleteCharAt(temp.length()-1);
                    count--;
                    flag[i] = 0;
                }
            }
        }
    }
}