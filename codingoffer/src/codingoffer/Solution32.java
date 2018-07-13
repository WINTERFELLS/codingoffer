package codingoffer;

/*
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 */
import java.util.Arrays;
import java.util.Comparator;

public class Solution32 {
    public String PrintMinNumber(int [] numbers) {
        if(numbers == null || numbers.length == 0){
            return "";
        }
        int len = numbers.length;
        String[] str = new String[len];
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < len; i++){
            str[i] = numbers[i]+"";
        }
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                String str1 = s1+s2;
                String str2 = s2+s1;
                return str1.compareTo(str2);
            }
        });
        for(int i = 0; i < len; i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }
}