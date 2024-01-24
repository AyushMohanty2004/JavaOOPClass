package lab2;
public class test {
    class A{
        static int x=10;
        public void ad(){
            int x=100; 
            //static int x=100;//a local variable cannot be defined with static keyword
            //an instance variable can never be static
        }
        public static void main(String[] args) {
            System.out.println(x);
        }
    }
    
}
