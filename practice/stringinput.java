package practice;

import java.util.Scanner;

public class stringinput {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Enter a character ");
        char c = sc.next().charAt(0);
        int count=0;
    for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i)==c) {
            count++;
        }
    } 
    System.out.println("Number of occurences of character " + count);

    int left = 0;
    int right = s1.length() - 1 ;
    boolean isPalindrome = false;
    while (left < right && s1.charAt(left) == s1.charAt(right)) {
        isPalindrome = true ;
        left++;
        right--;
    }
    if (isPalindrome) {
        System.out.println("Is Palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }
    }
    
}
