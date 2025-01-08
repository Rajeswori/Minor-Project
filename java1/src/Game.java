import java.util.Scanner;

class Game{
    public static void main(String[] args) {
        int [] numArray = Arrayutility.inputArray();

        int sum =0;
        for(int i=0; i< numArray.length; i++){
            sum += numArray[i];
        }
        System.out.println("the total is "+ sum);

    }
}