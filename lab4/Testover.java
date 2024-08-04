package lab4;
class Parent {
    // creating print method
    void print() {
        System.out.println("Hi I am parent");
    }
    }
    class Child extends Parent {
    // overriding print method
    void print() {System.out.println("Hi I am children");}}
    //Class to illustrate compile-time polymorphism
    class Overload {
    // Creating a statement method
    void statement(String name) {System.out.println("Hi myself "
    + name);}
    // overloading statement method
    void statement(String fname, String lname) {
    System.out.println("Hi myself " + fname + " " + lname);}}
    public class Testover {
    public static void main(String[] args) {
    // creating instance of parent
    Parent obj1;obj1 = new Parent(); obj1.print();
    obj1 = new Child();obj1.print();
    // creating instance of overload
    Overload obj2 = new Overload();
    obj2.statement("Sourajit.");
    obj2.statement("Sourajit", "Behera.");
    }}