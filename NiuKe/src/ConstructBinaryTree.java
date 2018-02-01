
public class ConstructBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=getTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    public TreeNode getTree(int []pre,int preStart,int preEnd,int []in,int inStart,int inEnd){
        if(preStart>preEnd||inStart>inEnd){
            return null;
        }
        int rootIndex=-1;TreeNode node=new TreeNode(pre[preStart]);
        for(int i=inStart;i<=inEnd;i++){
            if(pre[preStart]==in[i]){
                rootIndex=i;
                break;
            }
        }

        if(rootIndex!=-1){
            node.left=getTree(pre,preStart+1,preStart+rootIndex-inStart,in,inStart,rootIndex-1);
            node.right=getTree(pre,preStart+rootIndex-inStart+1,preEnd,in,rootIndex+1,inEnd);
        }

        return node;
    }
}
