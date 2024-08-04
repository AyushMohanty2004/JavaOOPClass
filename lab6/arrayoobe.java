import java.util.Scanner;

public class arrayoobe {
    public static void main(String[] args) {
        int array[]= new int[4];
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the numbers");
            for (int i = 0; i < 4; i++) {
                array[i]=sc.nextInt();
            }for (int j : array) {
                System.out.println(array[j]);    
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        sc.close();
    }
    
}
