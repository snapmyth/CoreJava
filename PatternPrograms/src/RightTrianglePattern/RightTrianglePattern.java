package RightTrianglePattern;

public class RightTrianglePattern {
    public static void main(String[] args) {
        /*
         * i stands for rows and j stands for columns
         * row denotes the number of rows you want to print
         */
        int i,j,row= 6;
        //outer loop for rows
        for(i = 0; i < row; i++) {
            //inner loops for columns
            for( j = 0; j <= i; j++){
                //prints the star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
