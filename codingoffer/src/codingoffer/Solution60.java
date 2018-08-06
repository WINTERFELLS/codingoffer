package codingoffer;

import java.util.ArrayList;

/*
����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣���磬 ��5��3��7��2��4��6��8��    �У��������ֵ��С˳�����С����ֵΪ4��
*/

public class Solution60 {
    ArrayList<TreeNode> list;
    TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot == null || k == 0){
            return null;
        }
        list = new ArrayList<>();
        middleview(pRoot);
        if(k>list.size()) return null;
        return list.get(k-1);
    }
    void middleview(TreeNode pRoot){
        if(pRoot == null)
            return;
        middleview(pRoot.left);
        list.add(pRoot);
        middleview(pRoot.right);
    }
}