package lab3;
class Calculator {
    // Overloaded subtract methods with various parameters
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    // Method to subtract an array of integers
    int subtract(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result -= num;
        }
        return result;
    }
}

public class cal {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        // Using the first subtract method with integers
        int result1 = myCalculator.subtract(10, 5);
        System.out.println("Result 1: " + result1);

        // Using the second subtract method with doubles
        double result2 = myCalculator.subtract(8.5, 3.2);
        System.out.println("Result 2: " + result2);

        // Using the third subtract method with an array of integers
        int[] numbers = {20, 5, 3};
        int result3 = myCalculator.subtract(numbers);
        System.out.println("Result 3: " + result3);
    }
}