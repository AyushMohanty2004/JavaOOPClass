package lab5;

import java.util.Scanner;

/**
 * Michael
 */
interface Michael {
void earnings(double salary);
    void bonus(double salary);
    void deductions(double salary);
}
public class Manager implements Michael{
    public void earnings(double salary){
        double earnings= salary + 0.8*salary + 0.15*salary;
        System.out.println("your reported earnings are"+ earnings);
    }
    
    public void deductions(double salary){
        
            double deductions= 0.12*salary;
            System.out.println("your deduction pf is"+ deductions);
        
    }

    public void bonus(double salary){};
}
class  Substaff extends Manager{
public void bonus(double salary){

        double bonus= salary + 0.8*salary + 0.15*salary;
        System.out.println("your reported earnings are"+ bonus);
    }
}
 
/**
 * InnerManager
 */
class Scott {
public static void main(String[] args) {
Scanner Dwight = new Scanner(System.in);
System.out.println("Enter your Salary");    
double salary = Dwight.nextInt();
Substaff jim = new Substaff();
jim.earnings(salary);
jim.deductions(salary);
jim.bonus(salary);
}
    
}
