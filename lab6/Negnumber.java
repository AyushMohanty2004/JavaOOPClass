import java.util.Scanner;

public class Negnumber {
    
        
    
    public class MyException extends Exception{
        
    }
    public void ProcessInput() throws MyException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num<0) {
            throw new MyException();
        }
        else{
            double num2 = num;
            System.out.println("Required double value is:" + num2);
        }
        sc.close();
    }
public static void main(String[] args) {
    try{
        Negnumber neg = new Negnumber();
        neg.ProcessInput();
    }
    catch(MyException e){
System.out.println("Negative number exception");
    }

}

}
