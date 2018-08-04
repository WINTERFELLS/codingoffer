package codingoffer;

/*
 * ��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�����string����������Ҫ��ʱ����0)��
 * Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
 */
public class Solution48 {
    public int StrToInt(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }
        boolean morethanzero = true;
        if(str.charAt(0) == '-'){
            morethanzero = false;
        }
        
        long res = 0;
        for(int i = 0; i < str.length(); i++){
            char t = str.charAt(i);
            if(t == '-' && i == 0) continue;
            if(t == '+' && i == 0) continue;
            if(t < '0' || t > '9'){
                return 0;
            }
            res = res*10 + (t-'0');
        }
        if(morethanzero) return (int)res;
        else return 0-(int)res;
    }
}
