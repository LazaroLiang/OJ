/*
* 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
* */
public class TreeConvertList {
    public TreeNode Convert(TreeNode pRootOfTree) {

        return null;
    }
    public void Search(TreeNode node){
        if(node!=null){
            Search(node.left);
            System.out.print(node.val+" ");
            node.left=node.left.left;
            node.right=node.right.right;
            Search(node.right);
        }
    }
    public static void  main(String args[]){
        int data[]={1,2,3,4,5,6};//int i=0;10,6,14,4,8,12,16
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(6);
        root.right=new TreeNode(14);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(8);
        root.right.left=new TreeNode(12);
        root.right.right=new TreeNode(16);
        TreeConvertList list=new TreeConvertList();
        list.Search(root);


    }
}
