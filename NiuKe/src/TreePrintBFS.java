import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

class testClass{

}
public class TreePrintBFS {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedBlockingQueue<TreeNode>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(root!=null){
            queue.add(root);
        }else {return null;}
        while(!queue.isEmpty()){
            TreeNode node=queue.peek();
            list.add(node.val);
            queue.poll();
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return list;
    }

    public static void main(String args[]){
        return;
    }
}
