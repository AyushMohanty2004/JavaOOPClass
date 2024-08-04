package practice;

public class exceptiontry {
    public static void main(String[] args) {
        int a=100;
        int b=0;
        try{
System.out.println("Result is:"+ a/b);
        }
        catch (Exception e) {
            System.out.println("I can't man, coz of " + e);
        }
    }
    
}
