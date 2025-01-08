import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        System.out.println("welcome to fibbonaci");
        Scanner Sc =  new Scanner(System.in);
        System.out.println("enter the size Of series..");
        int size = Sc.nextInt();
        int[] arr = new int[size];
        int a = 0, b=1, sum = 0 ;
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = a;
            sum = a+ b;
            a = b;
            b = sum;

        }
        Arrayutility.displayArr(arr);

    }
}
