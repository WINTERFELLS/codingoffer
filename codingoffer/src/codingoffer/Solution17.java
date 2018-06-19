package codingoffer;

/*
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 */
public class Solution17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(root1 != null && root2 != null){
            if(root1.val == root2.val){
                result = judge(root1, root2); 
            }
            if(!result){
                result = HasSubtree(root1.left, root2);
            }
            if(!result){
                result = HasSubtree(root1.right, root2);
            }
        }
        return result;
    }
    
    public boolean judge(TreeNode root1, TreeNode root2){
        if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        if(root1.val == root2.val){
            return judge(root1.left, root2.left) && judge(root1.right, root2.right);
        }else{
            return false;
        }
    }
}