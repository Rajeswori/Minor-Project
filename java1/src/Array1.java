public class Array1 {

        public static void main(String[] args) {
            // Declare and initialize an array
            int[] arr = {10, 20, 30, 40, 50};

            // Print each element of the array
            System.out.println("Printing each element in the array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }

            // Print elements in pairs using arr.length - 1
            System.out.println("\nPrinting elements in pairs (current and next):");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.println("Comparing arr[" + i + "] = " + arr[i] + " and arr[" + (i + 1) + "] = " + arr[i + 1]);
            }
        }
    }


