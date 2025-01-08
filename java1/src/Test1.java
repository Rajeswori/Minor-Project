import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        ///wap to check wheather is a year is leap yer=ar or not
        // if year is divi
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//
//        if (year % 100!= 0) {
//            if(year % 4 ==0){
//                System.out.println(" it is leap year");
//            }
//            else{
//                System.out.println("it is not a leap year");
//            }
//        }
//        else{
//            if(year % 400 ==0){
//                System.out.println(" it is leap year");
//            }
//            else{
//                System.out.println("it is not a leap year");
//            }
//        }

//        if((year % 400==0) || (year%100 !=0) && (year %4==0)){
//            System.out.println("is leap year");
//        }
//        else{
//            System.out.println("is not");
//        }

//        int s1=10, s2=12, s3=15;
//
//        if((s1+s2>s3) && (s2+s3>s1) && (s1+s3>s2)){
//            System.out.println("valid");
//        }
//        else{
//            System.out.println("invalid");
//        }
//        int sum= s1-(-s2);
//        System.out.println(sum);
////int n =5;
//        int rows = 5;  // Number of rows in the triangle
//
//        for (int i = 1; i <= rows; i++) {
//            // Loop to print spaces and stars
//            for (int j = 1; j <= rows + i - 1; j++) {
//                if (j <= rows - i) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();  // Move to the next line after each row
//        }

        int num=5;
        int fact=1;
//        while(num !=0){
//            fact=fact * num;
//            num--;
//        }
//        System.out.println("factorial "+ num+" is "+ fact);
//        do{
//            fact=fact*num;
//            num--;
//        }
//        while(num !=0);
//        System.out.println("factorial "+ num+" is "+ fact);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 Number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();

//        int hcf = 1;
//        for(int i = 1; i <= num1 && i <= num2; i++) {
//            if(num1 % i == 0 && num2 % i == 0) {
//                hcf = i;
//            }
//        }
//
//        int lcm = (num1 * num2) / hcf;

        int hcf=1;

        for(int i=1; i<=num1 && i<=num2; i++){
            if(num1 % i ==0 && num2 % i==0){
                hcf=i;
            }
        }
        int lcm = (num1 * num2)/hcf;

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm );
    }
}



