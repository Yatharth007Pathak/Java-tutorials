public class bd {

    public static void main(String[] args) {
        int a = 12, b =7;

        int div = a/b;
        System.out.println(div);

        double divi = a/b;
        System.out.println(divi);

        double divis = (double)a/b;
        System.out.println(divis);

        double diviso = a/(double)b;
        System.out.println(diviso);
    }
}

/*
Code Breakdown:

public class bd {: Declares a public class named bd.

public static void main(String[] args) {: Defines the main method, which is the entry point of the program.

int a = 12, b = 7;: Declares two integer variables, a and b, and initializes them with the values 12 and 7, respectively.

int div = a/b;:
Performs integer division of a by b.
Since both a and b are integers, the result is also an integer.
Integer division truncates the decimal part, so 12 / 7 equals 1.

System.out.println(div);:
Prints the result of the integer division, which is 1.

double divi = a/b;:
Performs integer division of a by b and assigns the result to a double variable.
Since the division 12 / 7 is performed using integers, divi will still be 1.0 because integer division does not include the fractional part.

System.out.println(divi);:
Prints the result of the integer division cast to double, which is 1.0.

double divis = (double)a/b;:
Casts a to double before performing the division.
This makes the division a floating-point operation.
12 as a double is 12.0, so 12.0 / 7 gives approximately 1.7142857142857142.

System.out.println(divis);:
Prints the result of the floating-point division, which is approximately 1.7142857142857142.

double diviso = a/(double)b;:
Casts b to double before performing the division.
This also makes the division a floating-point operation.
7 as a double is 7.0, so 12 / 7.0 gives approximately 1.7142857142857142.

System.out.println(diviso);:
Prints the result of the floating-point division, which is approximately 1.7142857142857142.

Summary of Output:
div: Result of integer division 12 / 7, which is 1.
divi: Result of integer division cast to double, which is 1.0.
divis: Result of floating-point division where a is cast to double before division, which is approximately 1.7142857142857142.
diviso: Result of floating-point division where b is cast to double before division, which is approximately 1.7142857142857142.
*/