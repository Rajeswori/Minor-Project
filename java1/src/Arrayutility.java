import java.util.Scanner;

public class Arrayutility {

    // Method to input a 1D array from the user
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input elements
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element no " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        return arr; // Return the input array
    }

    // Method to input a 2D array from the user
    public static int[][] input2dArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] newArr = new int[rows][columns];

        // Input elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element for row " + (i + 1) + ", column " + (j + 1) + ":");
                newArr[i][j] = sc.nextInt();
            }
        }
        return newArr; // Return the input 2D array
    }

    // Method to display a 1D array
    public static void displayArr(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println(); // Newline after printing all elements
    }

    // Method to display a 2D array
    public static void display2DArr(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }
    }
}
