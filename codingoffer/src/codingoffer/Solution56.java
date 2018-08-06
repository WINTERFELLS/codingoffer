package codingoffer;

/*
请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
*/

public class Solution56 {
    boolean isSymmetrical(TreeNode pRoot){
        if(pRoot == null){
            return true;
        }
        return compare(pRoot,pRoot);
    }
    boolean compare(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null && rightNode == null)
            return true;
        else if(leftNode == null && rightNode != null)
            return false;
        else if(leftNode != null && rightNode == null)
            return false;
        else if(leftNode.val != rightNode.val)
            return false;
        else 
            return compare(leftNode.right, rightNode.left) && compare(leftNode.left, rightNode.right);
    }
}