import java.util.Scanner;

public class Greatest_nesteadif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();

        int a=12, b=14, c=11;

        if(a>b)
            if(a>c)
                System.out.println("a is grater");
        else
                System.out.println("c is grater");
        else
            if(b>c)
                System.out.println("b is grater");
            else
                System.out.println(" c is grater");

    }
}
