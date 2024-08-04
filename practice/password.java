package practice;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        System.out.println("Enter a password");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length()< 5) {
            System.out.println("Password must be of atleast 5 characters");
        }
        boolean islow = false;
        boolean isdig = false;
        for(char c : s.toCharArray()){
            if (Character.isLowerCase(c)) {
                islow = true;
            }
            else if (Character.isDigit(c)) {
             isdig = true;   
            }
            else{
            System.out.println("password must contain lower and digit");
        }
    }
        int count =0;
for(char c : s.toCharArray()){
if (Character.isDigit(c)) {
    count++;
}
}


if (count < 3){
    System.out.println("MUST CONTAIN 3 digits");
}
    }
}    

