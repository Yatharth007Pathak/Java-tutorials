// Program that takes a score from the user and determines the grade based on that score.

import java.util.Scanner;

public class ca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the score
        System.out.print("Enter the score (0-100): ");
        int score = scanner.nextInt();

        scanner.close();

        // Nested if-else to determine the grade
        if (score >= 90) {
            if (score >= 95) {
                System.out.println("Grade: A+");
            } else {
                System.out.println("Grade: A");
            }
        } else if (score >= 80) {
            if (score >= 85) {
                System.out.println("Grade: B+");
            } else {
                System.out.println("Grade: B");
            }
        } else if (score >= 70) {
            if (score >= 75) {
                System.out.println("Grade: C+");
            } else {
                System.out.println("Grade: C");
            }
        } else if (score >= 60) {
            if (score >= 65) {
                System.out.println("Grade: D+");
            } else {
                System.out.println("Grade: D");
            }
        } else {
            System.out.println("Grade: F");
        }
    }
}
