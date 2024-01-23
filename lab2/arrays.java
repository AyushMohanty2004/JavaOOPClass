package lab2;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = Scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Scanner.nextInt();
        }

        System.out.println("Array elements:");
        for (int element : array) {
            System.out.print(element + " ");
Arrays.sort(array);

// Printing and display sorted array

System.out.printf("Modified arr[] : %s",

Arrays.toString(array));
        }
    }
}

