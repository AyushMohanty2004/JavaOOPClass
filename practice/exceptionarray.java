package practice;

import java.util.Scanner;

public class exceptionarray {
    public static void main(String[] args) {
        try{
            int index;
            int [] marks = new int[20];
            marks[0]=69;
            marks[1]=420;
            marks[2]=786;
            marks[3]=12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index");
        index = sc.nextInt();
        System.out.println("the number at entered index is "+ marks[index]);
        System.out.println("Enter the number you want to divide this with:");
        int number = sc.nextInt();
        System.out.println("The quotient will be"+ marks[index]/number);
        }
        catch(ArithmeticException e){
            System.out.println("invalid divisor input" + e);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid array index input " + e);
        }

        catch(Exception e){
            System.out.println("Error generated");
        }
    }
}
