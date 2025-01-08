import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = Arrayutility.inputArray();

        System.out.println("Enter The Number To Check");
        int check = sc.nextInt();
        int repeat = noOf(numArr,check);
        System.out.println("The Occurance is "+repeat+" times repeat");
    }
    public static int noOf(int[] numArr, int check){
        int repeat = 0;
        int i = 0;
        while(i< numArr.length){

            if(check == numArr[i]){
                repeat++;
            }
            i++;
        }
        return repeat;
    }
}
