/*
In Java loops, there are several key components that dictate how the loop operates. 
Here’s a breakdown of the elements including initialization expressions, test expressions (conditions), 
update expressions, and the body of the loop:

Initialization Expression
This is where you declare and initialize the loop control variable(s). It typically occurs only once at the beginning of the loop.

Test Expression (Condition)
The test expression is a boolean condition evaluated before each iteration of the loop. 
If the condition is true, the loop continues; if false, the loop terminates.

Update Expression
The update expression modifies the loop control variable after each iteration of the loop. 
It usually involves incrementing or decrementing the control variable.

Body of the Loop
The body of the loop contains the statements that will be executed during each iteration as long as the test expression evaluates to true. 
This is where the main logic of the loop resides.
*/

public class cs {
    
    public static void main(String[] args) {
        // For loop example with all elements
        for (int i = 0; i < 10; i++) {  // Initialization: int i = 0, Condition: i < 10, Update: i++
            System.out.println("Current number: " + i);  // Body of the loop
        }
    }
}
