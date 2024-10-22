/*
The switch statement allows us to select one of many code blocks to be executed based on the value of an expression. 
It is an alternative to using multiple if-else statements.

Syntax:
switch (expression) {
    case value1:
        // Code if expression equals value1
        break;
    case value2:
        // Code if expression equals value2
        break;
    default:
        // Code if none of the values match
        break;
}
*/

public class bx {
    
    public static void main(String[] args) {
        int day = 3;

        // Switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
