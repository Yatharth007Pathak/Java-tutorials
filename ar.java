public class ar {
    
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 20;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("b / a = " + (b / a)); // Division
        System.out.println("b % a = " + (b % a)); // Modulus
        a++; // Increment
        System.out.println("a++ = " + a);
        b--; // Decrement
        System.out.println("b-- = " + b);

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int c = 5, d = 3;  // In binary: c = 0101, d = 0011
        System.out.println("c & d: " + (c & d));   // Bitwise AND
        System.out.println("c | d: " + (c | d));   // Bitwise OR
        System.out.println("c ^ d: " + (c ^ d));   // Bitwise XOR
        System.out.println("~c: " + (~c));         // Bitwise Complement
        System.out.println("c << 2: " + (c << 2)); // Left shift
        System.out.println("c >> 2: " + (c >> 2)); // Right shift
        System.out.println("c >>> 2: " + (c >>> 2)); // Unsigned right shift

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int e = 10;
        e += 5;  // Equivalent to e = e + 5
        System.out.println("e += 5: " + e);
        e -= 3;  // Equivalent to e = e - 3
        System.out.println("e -= 3: " + e);
        e *= 2;  // Equivalent to e = e * 2
        System.out.println("e *= 2: " + e);
        e /= 2;  // Equivalent to e = e / 2
        System.out.println("e /= 2: " + e);
        e %= 3;  // Equivalent to e = e % 3
        System.out.println("e %= 3: " + e);

        // Conditional (Ternary) Operator
        System.out.println("\nConditional (Ternary) Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // instanceof Operator
        System.out.println("\ninstanceof Operator:");
        String str = "Hello, World!";
        boolean isString = str instanceof String;
        System.out.println("Is str an instance of String: " + isString);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int f = +10;  // Unary plus
        int g = -10;  // Unary minus
        System.out.println("+f: " + f);
        System.out.println("-g: " + g);
        f++;  // Increment
        System.out.println("f++: " + f);
        g--;  // Decrement
        System.out.println("g--: " + g);
        System.out.println("!x: " + (!x));  // Logical NOT

        // Special Operators
        System.out.println("\nSpecial Operators:");
        int[] arr = {1, 2, 3};  // Array
        System.out.println("First element of arr: " + arr[0]);  // Access element
    }
}


/*
Java provides a rich set of operators that can be used to perform various operations on variables and values. 
These operators can be categorized into several types based on their functionality.

1. Arithmetic Operators: Used to perform basic arithmetic operations.
Operator        Description	                           Example
+               Addition                               a + b
-	            Subtraction                            a - b
*	            Multiplication	                       a * b
/	            Division	                           a / b
%	            Modulus (remainder)	                   a % b
++	            Increment (adds 1)	                   a++ or ++a
--	            Decrement (subtracts 1)                a-- or --a


2. Relational (Comparison) Operators; Used to compare two values, returning a boolean (true or false).
Operator        Description                            Example
==	            Equal to	                           a == b
!=	            Not equal to	                       a != b
>	            Greater than	                       a > b
<	            Less than	                           a < b
>=	            Greater than or equal to               a >= b
<=	            Less than or equal to                  a <= b

3. Logical Operators: Used to perform logical operations on boolean values.
Operator	    Description	                           Example
&&	            Logical AND	                           a && b
||              Logical OR                             a || b
!	            Logical NOT                            !a

4. Bitwise Operators: Used to perform bit-level operations on integers.
Operator	    Description	                           Example
&	            Bitwise AND	                           a & b
|	            Bitwise OR                             a | b
^	            Bitwise XOR (exclusive OR)	           a ^ b
~               Bitwise Complement                     ~a
<<              Left shift                             a << 2
>>              Right shift                            a >> 2
>>>              Unsigned right shift                  a >>> 2

5. Assignment Operators: Used to assign values to variables.
Operator	     Description	                       Example
=	             Simple assignment       	           a = b
+=               Add and assign	                       a += b (i.e., a = a + b)
-=	             Subtract and assign                   a -= b
*=	             Multiply and assign                   a *= b
/=	             Divide and assign	                   a /= b
%=               Modulus and assign	                   a %= b

6. Conditional (Ternary) Operator: A shorthand for an if-else statement. 
It evaluates a condition and returns one of two values based on whether the condition is true or false.
Operator	     Description                	       Example
? :	             Conditional operator	               result = (a > b) ? a : b;

7. Instanceof Operator: Used to test whether an object is an instance of a specific class or subclass.
Operator	     Description	                       Example
instanceof	     Checks if an object is an instance    obj instanceof String 

8. Unary Operators
Used to perform operations on a single operand.
Operator	     Description	                       Example
+	             Unary plus	                           +a (indicates positive value, usually omitted)
-	             Unary minus (negation)                -a
++	             Increment	                           ++a or a++
--               Decrement	                           --a or a--
!	             Logical NOT                           !a

9. Shift Operators
Used to shift bits in binary form.
Operator      	 Description	                       Example
<<               Left shift                            a << 2 (shift left by 2 bits)
>>	             Right shift	                       a >> 2 (shift right by 2 bits)
>>>	             Unsigned right shift                  a >>> 2 (shift right by 2 bits, fills with 0)

10. Special Operators

new: Used to create new objects.
Example: MyClass obj = new MyClass();

. (dot operator): Used to access members of a class or object.
Example: obj.method();

[]: Used for accessing elements in arrays.
Example: int[] arr = {1, 2, 3}; int x = arr[0];
*/