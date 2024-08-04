package practice;
class Demothrows
{
static void throwOne() throws IllegalAccessException
{
System.out.println("Inside themethod throwOne()");
throw new IllegalAccessException("second");
}

public static void main(String args[])
{
try
{
throwOne();
}
catch(IllegalAccessException e)
{
System.out.println("Caught:"+e);
}
}
}