package lab7;

class mythread1 extends Thread {
public void run(){
    System.out.println("That's what she said");
}
}    /**
     * Innerthreads
     */
    class Innerthreads implements Runnable{
    public void run(){
        System.out.println("Bears, Beets, Battlestar Gallactica");
    }
        
    }

public class threads{
    public static void main(String[] args) {
mythread1 michael = new mythread1();
michael.start();

Innerthreads jim = new Innerthreads();
Thread dwight = new Thread(jim);
dwight.start();
    }
}