package lab4;

class MyClass {
    private int value;

    // Parameterized constructor
    public MyClass(int value) {
        System.out.println("HI");
    }

    // Default constructor, calls the parameterized constructor with default value
    public MyClass() {
        this(value);

        
    }

    public static void main(String[] args) {
        System.out.println("My name is khan");
    }

    // ... other methods
public static void main(String[] args) {
    MyClass object = new MyClass(); // Creates an instance without arguments
System.out.println(object.value); // This will print "10"
}

}