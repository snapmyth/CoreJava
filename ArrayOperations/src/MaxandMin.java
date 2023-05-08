public class MaxandMin {
    public int minimumElement(int []array) {
        int min = array[0];
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    
    
    public int maximumElement(int []array) {
        int max = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
