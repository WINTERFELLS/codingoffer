package codingoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return res;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0; i < len; i++){
                TreeNode temp = queue.poll();
                res.add(temp.val);
                if(temp.left != null)
                    queue.offer(temp.left);
                if(temp.right != null)
                    queue.offer(temp.right);
            }
        }
        return res;
    }
}
