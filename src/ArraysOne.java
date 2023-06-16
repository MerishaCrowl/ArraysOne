//Import java utilities
import java.util.Arrays;
import java.util.Scanner;

//Create class arrays and method main
public class ArraysOne {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] myArray = new int [size];
        int sum = 0;
        System.out.println("Enter an element of the array:");

        for (int i = 0; i < size; i++) {
            myArray[i] = s.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Elements of the array are: " + Arrays.toString(myArray));
        System.out.println("Sum of the elements of the array: " + sum);
    }
}