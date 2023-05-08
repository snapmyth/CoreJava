import java.util.Scanner;

public class ArrayCreations {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Array Created of size " + size );
        System.out.printf("Enter the %d elements to be stored in array:\n", size);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Elements are Stored");
        System.out.println("Elements in array are...");
        for(Integer i : array){
            System.out.println(i);
        }
        scanner.close();

        ReverseOperations reverse = new ReverseOperations();
        System.out.println("Given Array Elements In Reverse Order: ");
        reverse.reverseOperations(array);

        Summation summation = new Summation();
        System.out.println("Given Array of Each Elements Addition: " + summation.sum(array));

        MaxandMin mandm = new MaxandMin();
        System.out.println("Maximum Element: " + mandm.maximumElement(array));
        System.out.println("Maximum Element: " + mandm.minimumElement(array));
        
    }

}
