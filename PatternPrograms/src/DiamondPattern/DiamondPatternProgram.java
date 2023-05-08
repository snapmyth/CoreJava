package DiamondPattern;

import java.util.Scanner;

public class DiamondPatternProgram {
    public static void main(String[] args) {
        int row,i,j,space=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of row you want to print: ");
        row = scanner.nextInt();
        space = row - 1;
        for(j = 1 ; j <= row ; j++) {
            for(i = 1; i <= space; i++){
                System.out.print(" ");
            }
            space--;
            for(i = 1; i <= 2*j -1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for(i = 1; j <= row  -1 ; j++){
            for(i = 1; i <= space ; i++){
                System.out.print(" ");
            }
            space++;
            for(i = 1; i <= 2*(row - j) -1 ; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
