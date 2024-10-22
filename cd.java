import java.util.Scanner;

public class cd {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number between 1 and 7
        System.out.print("Enter a number (1-7) to get the day of the week: ");
        int day = scanner.nextInt();

        // Use switch to determine the day
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        // Close the scanner
        scanner.close();
    }
}
