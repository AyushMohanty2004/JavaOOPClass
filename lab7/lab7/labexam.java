public class labexam {

    public static void main(String[] args) {
      // Initialize the strings
      String s1 = "Java";
      String s2 = "Labs";
      String s3 = "[[]]";
  
      // a. Compare s1 and s2 and find out which is first in alphabetical order
      int comparison = s1.compareTo(s2);
      String firstString;
      if (comparison < 0) {
        firstString = s1;
      } else {
        firstString = s2;
      }
      System.out.println("The first string alphabetically is: " + firstString);
  
      // b. Create a new string which has the string s2 in the middle of s3
      String newString = s3.substring(0, 2) + s2 + s3.substring(2);
      System.out.println("The new string with s2 in the middle of s3 is: " + newString);
  
      // c. Create a new string that is the first character of s1 and the last character of s2.
      // Next, capitalize all the letters of this created string.
      String combinedString = s1.charAt(0) + s2.charAt(s2.length() - 1);
      String capitalizedString = combinedString.toUpperCase();
      System.out.println("The combined and capitalized string is: " + capitalizedString);
  
      // d. Print out all the substrings of length 2 from the middle of the resultant string
      // obtained after the concatenation of s1 and s2
      String combinedS1S2 = s1 + s2;
      int startIndex = combinedS1S2.length() / 2 - 1;
      for (int i = startIndex; i < startIndex + 2; i++) {
        System.out.println("Substring of length 2: " + combinedS1S2.substring(i, i + 2));
      }
    }
  }