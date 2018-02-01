public class JumpFloor {
    int methodNum=0;
    public int JumpFloor(int target) {
        getMethodNum(target);
        return methodNum;
    }

    public void getMethodNum(int target){
        int jie;
        if(target==0){
            methodNum++;
        }else{
            if(target>=2){
                jie=target-2;
                JumpFloor(jie);
                jie=target+2;
                jie=target-1;
                JumpFloor(jie);
                jie=target+1;
            }else{
                JumpFloor(target-1);
            }
        }
    }
}
