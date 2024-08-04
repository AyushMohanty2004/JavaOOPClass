package practice;

import java.util.Scanner;

/**
 * Innerbookborrow
 */
class MaxBooksBorrowedException extends Exception {
public MaxBooksBorrowedException (String message) {

    super(message);
}
    
}

class borrowBook {
    public void borrowBook(int num) throws MaxBooksBorrowedException{
        if (num>5) {
            throw new MaxBooksBorrowedException("Nahi padh payega");    
        }
        
    }
}
public class bookborrow {
    public static void main(String[] args) {
        System.out.println("enter no. of books");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        borrowBook method = new borrowBook();
        try {
            method.borrowBook(num);
        } catch (MaxBooksBorrowedException e) {
            System.out.println(e.getMessage());
        }
    }
    }
