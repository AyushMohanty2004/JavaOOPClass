package lab7;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string (optional for compare operation): ");
        String str2 = scanner.nextLine();

        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Perform operations
        System.out.println("\nString Operations:");
        System.out.println("a. Uppercase: " + str1.toUpperCase());
        System.out.println("b. Lowercase: " + str1.toLowerCase());
        System.out.println("c. Reversed: " + reverseString(str1));
        if (!str2.isEmpty()) {
            System.out.println("d. Compared to '" + str2 + "': " + str1.equals(str2));
        }
        System.out.println("e. (Already shown in uppercase and lowercase)");
        System.out.println("f. Character '" + ch + "' present at index: " + indexOfChar(str1, ch));
        System.out.println("g. Palindrome: " + isPalindrome(str1));
        System.out.println("h. Word count: " + countWords(str1));
        System.out.println("   Vowel count: " + countVowels(str1));
        System.out.println("   Consonant count: " + countConsonants(str1));
    } {
    
}
}