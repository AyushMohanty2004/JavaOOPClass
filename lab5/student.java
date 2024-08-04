
package lab5;
import java.util.Scanner;

public abstract class student {
    long rollno;
    long regno;
    void getinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rollno");
        rollno=sc.nextInt();
        System.out.println("Enter your regno");
        regno=sc.nextInt();
    }
    abstract void course();
}

class kiitian extends student{
void course(){
    System.out.println("Registration number is "+ regno);
    System.out.println("Roll number is "+ rollno);
}
}

class Innerstudent {
    public static void main(String[] args) {
        kiitian student = new kiitian();
        student.getinput();
        student.course();    
    }
        
}