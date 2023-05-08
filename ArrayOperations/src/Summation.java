public class Summation {
    public int sum(int []arr) {
        int sum = 0;
        if(arr.length == 0){
            return sum;
        }else{
            for (int i : arr) {
                sum += i;
            }
        }
        return sum;
    }
}
