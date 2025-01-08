public class Sort_num {
    public static void main(String[] args) {
        System.out.println("Welcome to array sorting check post");
        int[] arr1 = Arrayutility.inputArray();  // Assuming Arrayutility.inputArray() gets the input array

        if (increaseOrder(arr1)) {
            System.out.println("Array is sorted in increasing order.");
        } else if (decreaseOrder(arr1)) {
            System.out.println("Array is sorted in decreasing order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }


    public static boolean increaseOrder(int[] arr) {
        int i = 0;
        while (i < arr.length-1 ) {
            if (arr[i] < arr[i + 1]) {
                return true;
            }
            i++;
        }
        return false;
    }


    public static boolean decreaseOrder(int[] arr) {
        int i = 0;
        while (i < arr.length-1) {
            if (arr[i] > arr[i + 1]) {
                return true;
            }
            i++;
        }
        return false;
    }
}
