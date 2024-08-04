package lab3;
import java.util.Scanner;

class AreaCalculator {
    // Overloaded area method for circle
    double area(double pi, double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded area method for triangle
    double area(double constant ,double base, double height) {
        return 0.5 * base * height;
    }

    // Overloaded area method for square
    double area(double sideLength) {
        return sideLength * sideLength;
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            double pi=3.14;
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + calculator.area(pi, radius));
                break;

            case 2:
            double constant=0.5;
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area of the triangle: " + calculator.area(constant,base, height));
                break;

            case 3:
                System.out.print("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();
                System.out.println("Area of the square: " + calculator.area(sideLength));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}