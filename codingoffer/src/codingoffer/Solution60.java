package codingoffer;

import java.util.ArrayList;

/*
给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
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