package assignment1;

class D
{
void eat()
{System.out.println("Chole Bhature...");}
}
class M extends D
{
void bar()
{System.out.println("Tikki...");}
}
class K extends D
{
void mun()
{System.out.println("Dairy Milk...");}
}
class Hierinhexp
{
public static void main(String args[])
{
K kk=new K();
M mm= new M();
kk.mun();
mm.bar();
kk.eat(); }}
