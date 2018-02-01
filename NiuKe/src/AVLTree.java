/*
* 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
* */
public class AVLTree {
    boolean isBalanced=true;
    public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return isBalanced;
    }
    public int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        if(Math.abs(left-right)>1){
            isBalanced=false;
        }
        return left>right? left+1:right+1;
    }

    boolean isFirstNode=true;int lastValue;
    public void FirstOrderSearch(TreeNode root){
        if(!isBalanced){
            return;
        }
        if(root==null){

        }else {
            FirstOrderSearch(root.left);
            if(isFirstNode){
                lastValue=root.val;
                isFirstNode=false;
            }else {
                if(root.val>lastValue){
                    lastValue=root.val;
                    FirstOrderSearch(root.right);
                }else {
                    isBalanced=false;
                }
            }
//            System.out.print(root.val+" ");
        }
    }

    public static void main(String args[]){
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(6);
        root.right=new TreeNode(14);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(8);
        root.right.left=new TreeNode(12);
        root.right.right=new TreeNode(16);
        AVLTree tree=new AVLTree();
//        tree.FirstOrderSearch(root);
        System.out.println(tree.IsBalanced_Solution(root));

    }
}
