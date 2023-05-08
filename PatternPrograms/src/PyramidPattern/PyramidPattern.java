package PyramidPattern;

public class PyramidPattern {
    public static void main(String[] args) {
        int i, j, row = 6;
        for (i = 0; i < row; i++) {
            //prints space betwween two stars
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {
                //prints star
                System.out.print("* ");
            }
            //throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
