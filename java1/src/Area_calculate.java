import java.util.Scanner;

public class Area_calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For Square
        System.out.print("Enter the length of the Square: ");
        double length_square = scanner.nextDouble();
        double areasquare = length_square * length_square;
        double parametersquare = 4 * length_square;

        System.out.println("Area of the Square is: " + areasquare);
        System.out.println("parameter of the Square is: " + parametersquare);

        // For Rectangle

        System.out.print("Enter the length of the Rectangle: ");
        double length_rec = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double wiidth_rec = scanner.nextDouble();

        double area_rec = length_rec * wiidth_rec;
        double parameter_rec = 2 * (length_rec + area_rec);
        System.out.println("Area of the Rectangle is: " + area_rec);
        System.out.println("parameter of the Rectangle is: " + parameter_rec);

        // For Cir circle
        System.out.print("enter the Radius of the circle: ");
        double radius_circle = scanner.nextDouble();

        double areaCircle = Math.PI * radius_circle * radius_circle;
        double circumferenceCircle = 2 * Math.PI * radius_circle;

        System.out.println("Area of the circle: " + areaCircle);
        System.out.println("Circumference of the circle: " + circumferenceCircle);

        scanner.close();
    }
}
