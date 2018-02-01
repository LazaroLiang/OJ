public class RectCover {
    int methodNum=0;
    public int RectCover(int target) {
        getMethodNum(target);
        return methodNum;
    }
    public void getMethodNum(int target){
        if(target==0){
            methodNum++;
        }else{
            if(target>=2){
                getMethodNum(target-2);
                getMethodNum(target-1);
            }else{
                getMethodNum(target-1);
            }
        }
    }
}
