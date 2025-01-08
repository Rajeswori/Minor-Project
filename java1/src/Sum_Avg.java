public class Sum_Avg {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2D array.");

        // Input 2D array
        int[][] new2DArr = Arrayutility.input2dArray();

        // Calculate sum and average
        int sum = sum(new2DArr);
        double avg = avg(new2DArr);

        // Display results
        System.out.println("The Sum of 2D array is: " + sum);
        System.out.println("The Average of 2D array is: " + avg);
    }

    // Method to calculate the sum of the 2D array
    public static int sum(int[][] new2DArr) {
        int sum = 0;
        for (int i = 0; i < new2DArr.length; i++) {
            for (int j = 0; j < new2DArr[i].length; j++) {
                sum += new2DArr[i][j];
            }
        }
        return sum;
    }

    // Method to calculate the average of the 2D array
    public static double avg(int[][] new2DArr) {
        int sum = 0;
        int count = 0; // To count the total number of elements
        for (int i = 0; i < new2DArr.length; i++) {
            for (int j = 0; j < new2DArr[i].length; j++) {
                sum += new2DArr[i][j];
                count++;
            }
        }
        // Return the average as a double for more precision
        return (double) sum / count;
    }
}
