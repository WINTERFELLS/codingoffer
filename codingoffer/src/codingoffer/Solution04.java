package codingoffer;

/*
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Solution04 {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || pre.length == 0 || in == null || in.length == 0){
            return null;
        }
        return reConstruct(pre, in, 0, pre.length-1, 0, in.length-1);
    }
    
    public TreeNode reConstruct(int[] pre, int[] in, int startpre, int endpre, int startin, int endin){
        
        if(startpre > endpre || startin > endin)
            return null;
        
        TreeNode temp = new TreeNode(pre[startpre]);
        for(int index = startin; index <= endin; index++){
            if(in[index] == pre[startpre]){
                temp.left = reConstruct(pre, in, startpre+1, index-startin+startpre, startin, index-1);
                temp.right = reConstruct(pre, in, index-startin+startpre+1, endpre, index+1, endin);
            }
        }
        return temp;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}