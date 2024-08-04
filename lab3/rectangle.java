package lab3;
import java.util.Scanner;

class Rectangle {
    double length, breadth;

    void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();
    }

    void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        display(area, perimeter);
    }

    void display(double area, double perimeter) {
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

public class rectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        System.out.println("Enter dimensions for Rectangle 1:");
        rectangle1.read();
        rectangle1.calculate();

        System.out.println("\nEnter dimensions for Rectangle 2:");
        rectangle2.read();
        rectangle2.calculate();
    }
}