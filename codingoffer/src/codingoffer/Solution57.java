package codingoffer;

import java.util.ArrayList;
import java.util.Stack;

/*
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
*/

public class Solution57 {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null){
            return res;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(pRoot);
        boolean flag = true;
        while(!stack1.empty() || !stack2.empty()){
            ArrayList<Integer> list = new ArrayList<>();
            if(flag){
                int len = stack1.size();
                for(int i = 0; i < len; i++){
                    TreeNode temp = stack1.pop();
                    list.add(temp.val);
                    if(temp.left != null) stack2.push(temp.left);
                    if(temp.right != null) stack2.push(temp.right);
                }
            }else{
                int len = stack2.size();
                for(int i = 0; i < len; i++){
                    TreeNode temp = stack2.pop();
                    list.add(temp.val);
                    if(temp.right != null) stack1.push(temp.right);
                    if(temp.left != null) stack1.push(temp.left);
                }
            }
            res.add(list);
            flag = (flag == true) ? false : true;
        }
        return res;
    }
}