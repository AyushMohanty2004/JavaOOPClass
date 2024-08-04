import java.util.Scanner;

public class arithmeticex {
        public static void main(String[] args) {
        System.out.println("Enter 2 numbers:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try {
        int result = num1/num2;
        System.out.println("Result is " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally{
        System.out.println("Program ends");
            sc.close();
        }
}
}