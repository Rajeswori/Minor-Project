
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the interest rate (in percentage): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = sc.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = sc.nextInt();

        double amount = principal * Math.pow(1 + (rate / (100 * n)), n * time);
        double compoundInterest =(int) amount - principal;

        System.out.println("Compound Interest after " + time + " years: " + compoundInterest);
        System.out.println("Amount after " + time + " years: " + amount);

        sc.close();
    }
}
