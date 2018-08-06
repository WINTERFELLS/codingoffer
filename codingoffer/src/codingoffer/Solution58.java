package codingoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
*/

public class Solution58 {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        while(!queue.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            int len = queue.size();
            for(int i = 0; i < len; i++){
                TreeNode t = queue.poll();
                temp.add(t.val);
                if(t.left != null) queue.offer(t.left);
                if(t.right != null) queue.offer(t.right);
            }
            res.add(temp);
        }
        return res;
    }
}