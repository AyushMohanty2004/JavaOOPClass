package lab5;

/**
 * Motor
 */
interface Motor {
long capacity=69420;
    void run();
    void consume();
}
public class washingmachine implements Motor {
    public void run(){
        System.out.println("Washing machine is running");
    }
    
    public void consume(){
        System.out.println("Washing machine is in consumption mode");

    }
public static void main(String[] args) {
    washingmachine psy = new washingmachine();
    psy.run();
    psy.consume();
    System.out.println("Capacity of washing machine is "+ capacity);
}

}
