import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("welcome to the factorial...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Here");
        int num = sc.nextInt();
        factorial(num);
//        System.out.println("The factorial is "+factorial(num));
    }

    public static void factorial(int num) {
        int fact = 1;
//        if (num == 0 || num == 1) {
//        }
        for (int i =num; i >=1 ; i--) {
            fact *= i;
        }
        System.out.println("The factorial is "+fact);
    }
}

