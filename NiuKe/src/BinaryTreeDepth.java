/*
* 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
* */
public class BinaryTreeDepth {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    int maxDepth=-1,depth=0;
    public int TreeDepth(TreeNode root) {
        findTreeDepth(root);
        return maxDepth;
    }
    public void findTreeDepth(TreeNode root){
        if(root==null){
            if(depth>maxDepth){
                maxDepth=depth;
            }
        }else {
            depth++;
            findTreeDepth(root.left);
            findTreeDepth(root.right);
            depth--;
        }
    }
}
