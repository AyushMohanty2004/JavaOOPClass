package lab5;
import java.util.Scanner;

public interface Employee {
    long empid=0;
    String empName="Pam";
    void getinput();
}

interface Manager extends Employee{
    long depid=0;
    String depName="Sales";
    void getdepinput();
}

class Head implements Manager {
    Scanner andy = new Scanner(System.in);
    @Override
    public void getinput() {
        System.out.println("enter your empid");
        int newempid = andy.nextInt();
        System.out.println("enter your name");
        String newempname = andy.nextLine();
System.out.println("Your name and ID are " + newempname + newempid);
    }

    public void getdepinput(){
    Scanner erin = new Scanner(System.in);
        System.out.println("enter your depid");
        int newdepid = erin.nextInt();
        System.out.println("enter your depname");
        String newdepname = erin.nextLine();
System.out.println("Your name and ID are " + newdepname + newdepid);
    }
    public static void main(String[] args) {
Head ryan = new Head();
        ryan.getinput();
        ryan.getdepinput();
    }
        
}
