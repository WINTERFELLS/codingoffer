package codingoffer;

import java.util.ArrayList;

/*
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class Solution24 {
	ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null){
            return res;
        }
        ArrayList<Integer> templist = new ArrayList<>();
        templist.add(root.val);
        dfs(root, target, root.val, templist);
        return res;
    }
    public void dfs(TreeNode root, int target, int temptarget, ArrayList<Integer> templist){
        if(temptarget == target && root.left == null && root.right == null){
            res.add(new ArrayList<>(templist));
            return;
        }
        if(temptarget > target){
            return;
        }
        if(root.left != null){
            int temp = temptarget + root.left.val;
            templist.add(root.left.val);
            dfs(root.left, target, temp, templist);
            templist.remove(templist.size()-1);
        }
        if(root.right != null){
            int temp = temptarget + root.right.val;
            templist.add(root.right.val);
            dfs(root.right, target, temp, templist);
            templist.remove(templist.size()-1);
        }
    }
}
