import java.util.ArrayList;

public class SearchTreePath {

    ArrayList<Integer> list=new ArrayList<Integer>();            //递归需要用到全局变量，存放临时路径
    ArrayList<ArrayList<Integer>> allList=new ArrayList<ArrayList<Integer>>();//存放所有路径
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root!=null){        //非空查找
            findAllPath(root,target);
        }
        return allList;
    }
    private void findAllPath(TreeNode root,int target) {
        if(root!=null&&root.left==null&&root.right==null){        //当root节点是叶子节点时，记录路径，并计算路径值
            ArrayList<Integer> tempList=new ArrayList<Integer>();    //必须每次都new一个新的List，临时list的值一直在变，否则allList里面存储的所有路径都是list最后的值
            int tempSum=0;
            for(int i=0;i<list.size();i++){
                tempSum=tempSum+list.get(i);
                tempList.add(list.get(i));
            }
            if(tempSum==target-root.val){
                tempList.add(root.val);
                allList.add(tempList);    //路径之和等于target，则加入allList.
            }
        }else {
            list.add(root.val);
            if(root.left!=null){    //递归查找左子树
                findAllPath(root.left,target);
            }
            if(root.right!=null){  //递归查找右子树
                findAllPath(root.right,target);
            }
            list.remove(list.size()-1);    //回溯删除上一个元素，进入下一个分支
        }
    }


    public static void  main(String args[]){
        int data[]={1,2,3,4,5,6};//int i=0;10,5,12,4,7
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(12);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(7);
//        root.right.left=new TreeNode(6);
        SearchTreePath path=new SearchTreePath();
        path.FindPath(root,15);
//        path.findAllPath(root);
        for(int i=0;i<path.allList.size();i++){
            for(int j=0;j<path.allList.get(i).size();j++){
                System.out.print(path.allList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
