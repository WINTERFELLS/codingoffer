package codingoffer;

/*
��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
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