package practice;

import java.util.Scanner;

public class ageisano {
    public void ageisano(int age) throws Innerageisano{
if (age<0 || age >100) {
    throw new Innerageisano("Invalid age input");
}
    } 
}

    
class Innerageisano extends Exception {
    public Innerageisano(String message){
        super(message);
    }}

    /**
     * Innerageisano_1
     */
    class Innerageisano_1 {
    public static void main(String[] args) {
        System.out.println("Enter your age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        ageisano old = new ageisano();
        try {
            old.ageisano(age);
            
            System.out.println("hi");
        } catch (Innerageisano e) {
        System.out.println(e.getMessage());
        }
        finally{
            
        }
    }
        
    }