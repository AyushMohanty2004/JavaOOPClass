public class StringOperations {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Labs";
        String s3 = "[[]]";

        // a. Compare s1 and s2 find out which is first in alphabetical order
        String firstInAlphabeticalOrder = (s1.compareTo(s2) < 0) ? s1 : s2;
        System.out.println("First in alphabetical order: " + firstInAlphabeticalOrder);

        // b. Create a new string which has the string s2 in the middle of s3
        String newString = s3.substring(0, s3.length() / 2) + s2 + s3.substring(s3.length() / 2);
        System.out.println("New string with s2 in the middle of s3: " + newString);

        // c. Create a new string that is the first character of s1 and the last character of s2. Next, capitalize all the letters of this created string.
        String firstAndLast = Character.toUpperCase(s1.charAt(0)) + String.valueOf(s2.charAt(s2.length() - 1)).toUpperCase();
        System.out.println("First and last characters capitalized: " + firstAndLast);

        // d. Print out all the substrings of length 2 from the middle of the resultant string obtained after the concatenation of s1 and s2
        String concatenated = s1 + s2;
        int middleIndex = concatenated.length() / 2;
        for (int i = 0; i <= concatenated.length() - 2; i++) {
            if (i >= middleIndex - 1 && i < middleIndex + 1) {
                String substring = concatenated.substring(i, i + 2);
                System.out.println("Substring of length 2 from middle: " + substring);
            }
        }
    }
}