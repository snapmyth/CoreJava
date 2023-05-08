package LeftTrianglePattern;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        int i,j,row =6;
        for(i = 0 ; i < row ; i++) {
            //inner loop works for space 
           for(j = 2*(row -i); j >=0;j--) {
            //space between two stars
            System.out.print(" ");
           }
           for(j = 0; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
        }
    }
}
