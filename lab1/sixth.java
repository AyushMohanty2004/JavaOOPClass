import java.util.Scanner;

public class sixth {
    public static String findingweekday(int day,int month,int year){
        /* WE ARE USING ZELLER KA CONGRUENCE*/
        int y= year - (14 - month)/12;
        int x =y + y/4 -y/100+y/400;
        int m= month + 12*((14-month)/12)-2;
int d=(day+x+(31*m)/12)%7;
String[] weekdays={"Sunday","Monday","tueday","wednesday","thursday","friday","saturday",};
return weekdays[d];    
}
    public static void main(String[] args) {
        Scanner myinp = new Scanner(System.in);
int day;
System.out.println("Enter day");
day=myinp.nextInt();

Scanner myinp1 = new Scanner(System.in);
int month;
System.out.println("Enter month");
month=myinp1.nextInt();

Scanner myinp2 = new Scanner(System.in);
int year;
System.out.println("Enter year");
year=myinp2.nextInt();

String weekday = findingweekday(day, month, year);
System.out.println("weekdAY IS:" + weekday);
    }
}
