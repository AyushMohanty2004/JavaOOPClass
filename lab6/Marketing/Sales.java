package Marketing;

import java.util.Scanner;

import General.*;
public class Sales extends employee {
    double tallowance(int basicsal){
double tallowance = 0.05*basicsal;
return tallowance;
    }

    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);
   System.out.println("enter salary");
 int basicsal= pp.nextInt(); 
   employee emp = new employee();  // Create Employee object with input
        double earnings = emp.earnings(basicsal);
        System.out.println("ID and name is "+emp.empid + emp.empname);
        System.out.println("Your toal salary is "+ earnings);
        Sales sale = new Sales();

        double tallw = sale.tallowance(basicsal);
        System.out.println("travel allowance is " + tallw);
        
    }
}
