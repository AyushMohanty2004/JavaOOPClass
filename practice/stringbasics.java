package practice;

public class stringbasics {
    public static void main(String[] args) {
        
    String name1 = "GOOD";
String name2 = "GoOD" ;
String name3 = new String("Ayush");
System.out.println(name3);
char ch[]={'b','o','o','b','i','e'};
String grab = new String(ch, 0, 4);
System.out.println(grab);
    if(name1.equalsIgnoreCase(name2))
{
System.out.println("The names are the same");
}
String gg = grab.concat(name1);
System.out.println(gg);
String MSD = 4+3+"Thala for a reason" +7+7;
System.out.println(MSD);
    
}
}
