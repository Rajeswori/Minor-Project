public class Max_MIn {
    public static void main(String[] args) {
        int[] arr = Arrayutility.inputArray();
        System.out.println("The Minimum Number Is: "+min(arr));
        System.out.println("The Maximum Number Is: "+max(arr));
    }
        public static int max( int[] arr){
            int min = Integer.MIN_VALUE;
            int i = 0;
            while (i< arr.length - 1){
                if(min<arr[i]){
                    min = arr[i];
                }

                i++;
            }
            return min;

        }
        public static int min( int[] arr){
            int max = Integer.MAX_VALUE;
            int i = 0;
            while (i< arr.length -1){
                if(max>arr[i]){
                    max = arr[i];
                }

                i++;
            }
            return max;

        }

}
