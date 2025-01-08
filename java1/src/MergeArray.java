import java.util.Arrays;

class MergeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Merged Array..");

        // Input the first array
        int[] arr1 = Arrayutility.inputArray();
        System.out.println("Input the second array..");

        // Input the second array
        int[] arr2 = Arrayutility.inputArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Merge the arrays
        int[] newarray = newArray(arr1, arr2);

        // Display the merged array
        System.out.println("The Merged Array is: ");
        Arrayutility.displayArr(newarray);
        System.out.println("the reverse of array is: ");
        
    }

    // Method to merge two sorted arrays
    public static int[] newArray(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        return mergedArray; // Return the merged array
    }
}


