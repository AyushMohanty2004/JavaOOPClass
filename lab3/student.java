package lab3;
import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll number: ");
        roll = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = scanner.nextDouble();
    }

    void displayDetails() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i].inputDetails();
        }

        System.out.println("\nDetails of Students:");
        for (Student student : students) {
            student.displayDetails();
            System.out.println();
        }

        double lowestCgpa = students[0].cgpa;
        String lowestCgpaStudentName = students[0].name;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCgpa) {
                lowestCgpa = students[i].cgpa;
                lowestCgpaStudentName = students[i].name;
            }
        }

        System.out.println("\nStudent with the lowest CGPA: " + lowestCgpaStudentName);
    }
}