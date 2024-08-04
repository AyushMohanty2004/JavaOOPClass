import java.util.Scanner;

public class timeexception {
    public class MyException extends Exception{

    }
    public void Gettime() throws MyException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours");
        int hours= sc.nextInt();
        System.out.println("Enter minutes");
        int minutes= sc.nextInt();
        System.out.println("Enter seconds");
        int seconds= sc.nextInt();
        sc.close();
        if (hours>24||hours<0) {
            throw new MyException();
        }
        
        else if (minutes>60||minutes<0) {
            throw new MyException();
        }
        
        else if (seconds>60||seconds<0) {
            throw new MyException();
        }

        else{
            System.out.println("Correct time is " + hours + ":" +minutes + ":"+ seconds);
        }

    }
public static void main(String[] args) {
    try{
        timeexception time = new timeexception();
        time.Gettime();
    }
    catch(MyException e){
        System.out.println("invalid input " + e);
    }
}
}
