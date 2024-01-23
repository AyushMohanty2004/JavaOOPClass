import java.util.Scanner;
public class fifth{
    public static void main(String[] args) {
Scanner myinp = new Scanner(System.in);
int name;
System.out.println("Enter marks");
name=myinp.nextInt();
System.out.println("marks are "+ name);
if (name>=90) {
    System.out.println("A - Excellent");
}

else if (name>=80) {
    System.out.println("B - Very Good");
}
else if (name>=70) {
    System.out.println("C- Good");
}
else if (name>=60) {
 System.out.println("D- Satisfactory");   
}
else if (name>=50) {
 System.out.println("E - work harder");   
}
else if (name>= 40) {
System.out.println("F- Just passsed");    
}
else {
    System.out.println("Kuch bhi kya dal rha hai?");
}

    }
}

