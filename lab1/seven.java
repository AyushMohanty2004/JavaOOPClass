import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
Scanner myinp = new Scanner(System.in);
int name;//n=121
System.out.println("Enter the possible palindrome");
name=myinp.nextInt();
System.out.println("number is "+ name);
int c=name;//c=121
int r,s=0;
while (name>0) {
    r=name%10;
s=s*10+r;
name=name/10;
}
if(c==s){
System.out.println("Palindrome succesfully detected.");
}
else{
    System.out.println("The input number is not a palindrome.");
}
}
}
