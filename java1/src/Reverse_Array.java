public class Reverse_Array {
    public static void main(String[] args) {
        // Assuming Arrayutility.inputArray() is correctly implemented and returns an array
        int[] arr1 = Arrayutility.inputArray();
        reverse(arr1);
        System.out.println("The Reverse Array is: ");
        Arrayutility.displayArr(arr1);


        // Printing the original array
//        System.out.println("Original Array:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        // Printing the reversed array
//        System.out.println("Reversed Array:");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
    }
    public static void  reverse(int[] arr){
        int i =0;
        while(i< arr.length / 2){
            int temp = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = temp;
            i++;
        }
    }
}
