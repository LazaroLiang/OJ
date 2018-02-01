public class VerifySequenceBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        int len=sequence.length;
        return judgeIleage(sequence,0,len-1);
    }
    public boolean judgeIleage(int [] sequence,int l,int r){
        if(l>=r){
            return true;
        }
        int j=l;
        for(int i=r-1;i>=l;i--){
            if(sequence[i]<sequence[r]){
                j=i;
                break;
            }
        }
        for(int k=j;k>l;k--){
            if(sequence[k]>sequence[r]){
                return false;
            }
        }
        return judgeIleage(sequence,l,j)&&judgeIleage(sequence,j+1,r-1);
    }

    public static void main(String args[]){
        int []data={4,3,2,1};
        VerifySequenceBST bst=new VerifySequenceBST();
        System.out.println(bst.VerifySquenceOfBST(data));
    }
}
