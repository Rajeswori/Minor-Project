import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D Array.");

        // Input the 2D array
        int[][] array2D = Arrayutility.input2dArray();

        // Input the number to search
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search:");
        int search = sc.nextInt();

        // Perform the search
        boolean isFound = search(array2D, search);

        // Display the result of the search
        if (isFound) {
            System.out.println("Number found in the array.");
        } else {
            System.out.println("Number not found in the array.");
        }

        // Display the 2D array
        System.out.println("The 2D array is: ");
        Arrayutility.display2DArr(array2D);
    }

    // Method to search for a number in the 2D array
    public static boolean search(int[][] array, int search) {
        // Loop through the rows
        for (int i = 0; i < array.length; i++) {
            // Loop through the columns of the current row
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == search) {
                    return true; // Return true if the element is found
                }
            }
        }
        return false; // Return false if the element is not found
    }
}
