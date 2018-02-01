public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array[0]<=array[array.length-1]){
            return array[0];
        }else {
            for(int i=1;i<array.length-2;i++){
                if(array[i]<array[i-1]&&array[i]<array[i+1]){
                    return array[i];
                }
            }
        }

        return 0;
    }
}
