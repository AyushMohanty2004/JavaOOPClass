package General;

import java.util.Scanner;

public class employee {
    public int empid;
    public String empname;    
public double earnings(int basicsal){
    
Scanner sc = new Scanner(System.in);
    System.out.println("Enter employee ID and name respectively:");
    empid =sc.nextInt();
    empname= sc.nextLine();
    
    
    
    double earnings= basicsal+0.8*basicsal+0.5*basicsal;
    return earnings;
}
public static void main(String[] args) {
   Scanner pp = new Scanner(System.in);
   System.out.println("enter salary");
 int basicsal= pp.nextInt(); 
   employee emp = new employee();  // Create Employee object with input
        double earnings = emp.earnings(basicsal);
        System.out.println("ID and name is "+emp.empid + emp.empname);
        System.out.println("Your toal salary is "+ earnings);
}
}
