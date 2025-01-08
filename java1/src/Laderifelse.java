import java.util.Scanner;

public class Laderifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the unit: ");
        double unit= sc.nextDouble();
        double charge;

        if(unit>=1 && unit<=100)
            charge=100;
        else if(unit>=101 && unit <=150)
            charge=100+(unit-100)*1;
        else if(unit>=151 && unit<=225)
            charge=100+50+(unit-150)*1.5;
        else if(unit>=226&& unit<=350)
            charge=100+50+112.50+(unit-225)*2.0;
        else if(unit>=351&& unit<=551)
            charge=100+50+112.50+250+(unit-350)*2.5;
        else
            charge=100+50+112.50+250+400+(unit-550)*5.0;
        System.out.println("Total bill is:"+charge);



    }
}
