public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker.");

        // Input array using the utility class (assuming it's implemented)
        int[] numArr = Arrayutility.inputArray();

        // Check if the array is a palindrome
        boolean isbln = isPalindrome(numArr);

        // Output the result
        if(isbln) {
            System.out.println("This array is a palindrome.");
        } else {
            System.out.println("This array is not a palindrome.");
        }
        Arrayutility.displayArr(numArr);
    }


    // Method to check if the array is a palindrome
    public static boolean isPalindrome(int[] arr) {
        int i = 0;

        // Loop until the middle of the array
        while(i < arr.length / 2) {
            // Compare elements from start and end
            if(arr[i] == arr[arr.length - 1 - i]) {
                return true;  // If any elements don't match, it's not a palindrome
            }
            i++;  // Move to the next pair of elements
        }
        return true;  // If all pairs match, the array is a palindrome
    }
}
