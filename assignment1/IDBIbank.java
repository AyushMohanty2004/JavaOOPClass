package assignment1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;
public class IDBIbank {
class Account{
    int acc_number;
    String acc_type;
    String name;
    int curr_balnce;
void check_bal(int curr_balnce){
    System.out.println("Current balance is"+ curr_balnce);

}
int deposit(int curr_balnce , int dep_money ){
    int new_bal= curr_balnce+dep_money;
System.out.println("new balance"+ new_bal);
    return 0;
}
int withdrawl(int curr_balnce , int with_bal ){
    int new2_bal= curr_balnce-with_bal;
System.out.println("new balance"+ new2_bal);
    return 0;
}
Scanner sc = new Scanner(System.in); 
Account(){
    System.out.println("enter name and account type");
name = sc.nextLine();

acc_type = sc.nextLine();
acc_number=acc_number+1;
}

}

 class StandardAccount{
    int withdrawl(int curr_balnce , int with_bal, double penalty ){
        penalty=0.05;
        if(500000>curr_balnce){
         System.out.println();  
        
        int new3_bal= (int) (curr_balnce-(penalty*with_bal));
    System.out.println("new balance"+ new3_bal);
        
    }
    else if(100000>curr_balnce){
        int newx_bal= curr_balnce-with_bal;
        System.out.println("new balance"+ newx_bal);
    }
    else{
        return 0;
    }  
    return 0;
 }   

class PremiumAccount{
    int withdrawl(int curr_balnce,long money,int with_bal){
money=1000000;
if (money>curr_balnce) {
    int newz_bal= curr_balnce-with_bal;
        System.out.println("new balance"+ newz_bal);
}
return 0;   
}
    
}

}}

