public class JumpFloorII {
    int methodNum=0;
    public int JumpFloorII(int target) {
        getMethodNum(target);
        return methodNum;
    }
    public void getMethodNum(int target){
        if(target==0){
            methodNum++;
        }else {
            for(int i=1;i<=target;i++){
                if(target>=i){
                    getMethodNum(target-i);
                }
            }
        }
    }
}
