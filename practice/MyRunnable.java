package practice;

class MyRunnable implements Runnable
{
public void run()
{
for(int i =0; i<10; i++)
{
System.out.println("child thread");
}
}
}
class ThreadDemo8
{
public static void main(String args[])
{
MyRunnable r = new MyRunnable();
Thread t = new Thread();
Thread t1 = new Thread(r); //
//t1.start(); // Starting of a Thread
//t1.run();
r.run();
for(int i=0; i<5;i++)
{
System.out.println("main thread");
}
}
}
