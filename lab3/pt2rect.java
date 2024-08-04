package lab3;
import java.util.Scanner;

class Rectangle {
    double length, breadth;

    // Default constructor
    public Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    public Rectangle(double len, double br) {
        length = len;
        breadth = br;
    }

    // Method to calculate area
    double calculateArea() {
        return length * breadth;
    }
}

public class pt2rect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using default constructor
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Area of Rectangle 1: " + rectangle1.calculateArea());

        // Using parameterized constructor
        System.out.print("\nEnter length for Rectangle 2: ");
        double len = scanner.nextDouble();
        System.out.print("Enter breadth for Rectangle 2: ");
        double br = scanner.nextDouble();

        Rectangle rectangle2 = new Rectangle(len, br);
        System.out.println("Area of Rectangle 2: " + rectangle2.calculateArea());
    }
}
