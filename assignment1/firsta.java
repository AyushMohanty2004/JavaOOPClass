package assignment1;
import java.util.Scanner;


interface Address {
public void getAddress();
public void setAddress();
}
public class firsta{

    public static class HomeAddress implements Address{
        public String HA;
        public void setAddress(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter HomeAddress");
        HA= kb.nextLine();
        
    }
        public void getAddress(){
            System.out.println("Your home address is:" + HA);
        } 
    }

    public static class OfficeAddress implements Address{
        public String OA;
        public void setAddress(){
        Scanner kbx = new Scanner(System.in);
        System.out.println("Enter OfficeAddress");
        OA= kbx.nextLine();
        
    }
        public void getAddress(){
            System.out.println("Your office address is:" + OA);
        } 
    }

    public static class SchoolAddress implements Address{
        public String SA;
        public void setAddress(){
        Scanner kbs = new Scanner(System.in);
        System.out.println("Enter SchoolAddress");
        SA= kbs.nextLine();
        
    }
        public void getAddress(){
            System.out.println("Your school address is:" + SA);
        } 
    }
 public static void main(String[] args) {
    Address address = new HomeAddress();
    address.setAddress();
    address.getAddress();
 
Address office = new OfficeAddress();
office.setAddress();
office.getAddress();

Address school = new SchoolAddress();
school.setAddress();
school.getAddress();

}   


}