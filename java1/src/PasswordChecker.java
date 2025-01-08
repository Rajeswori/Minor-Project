import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Welcome to Password Checker..");
        String password;

        do{
            System.out.println("enter ur password");
            password = sc.next();
        } while(!isValid(password));
        //it check the function directly in the while loop
        //not equal is check if the password is true or not and the loop continue until the password is true

    }
    public static boolean isValid(String password){
        if(password == "avishek18"){
            return true;
        }
        return password.length() > 6;
    }
}
