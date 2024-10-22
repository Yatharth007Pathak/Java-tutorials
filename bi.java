// The Scanner class in Java can be used to read various types of input from the user. 

import java.util.Scanner;

public class bi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Double input
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Boolean input
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Character input
        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0);

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Student: " + isStudent);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}