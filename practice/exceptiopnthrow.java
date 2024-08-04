package practice;

import java.util.Scanner;

public class exceptiopnthrow {
    /**
     * MyException extends Exception
     */    class MyException extends Exception {
public String toString(){
    return "I am the knight";
}

public void printStackTrace(){
getStackTrace();
}
        
public String getMessage(){
    return "Hi";
}
    }
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
if(a<9){
    try {
        throw new MyException();
    } catch (Exception e) {
        System.out.println(e);
        System.out.println(e.getMessage());
    e.printStackTrace();
        // TODO: handle exception
    }
}
    }
}
