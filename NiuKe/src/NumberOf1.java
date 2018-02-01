public class NumberOf1 {
    public int NumberOf1(int n) {
        int yu,t=2,num=0;
        if(n<0){
            n=-n;
            num++;
        }
        while(n>=1){
            yu=n%2;
            n=n/2;
            if(yu==1){
                num++;
            }
        }
        return num;
        //int b[]=getBinaryNum(2);
    }

    public int[] getBinaryNum(int n){
        int a[] = new int[32];
        for(int i=0;i<32;i++){
            a[i]=0;
        }
        return a;
    }
}
