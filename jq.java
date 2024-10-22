/*
Anonymous Class with a Listener (Common Use Case)
In GUI applications like Swing, anonymous classes are often used to handle events, such as button clicks. 
Here’s a simple example using ActionListener.
*/

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jq {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anonymous Class Example");
        JButton button = new JButton("Click Me");

        // Adding an ActionListener using an anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/*
Here's a line-by-line breakdown of the code:

import javax.swing.JButton;
Imports the JButton class from the javax.swing package, which is used to create buttons in the GUI.

import javax.swing.JFrame;
Imports the JFrame class from the javax.swing package, which is used to create a window for the GUI.

import java.awt.event.ActionEvent;
Imports the ActionEvent class from the java.awt.event package, which represents an action event (like a button click).

import java.awt.event.ActionListener;
Imports the ActionListener interface from the java.awt.event package. 
Classes that implement this interface can respond to action events, such as button clicks.

public class jq {
Declares a public class named jq, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

JFrame frame = new JFrame("Anonymous Class Example");
Creates a new JFrame object named frame with the title "Anonymous Class Example". 
This is the window where components (like buttons) will be added.

JButton button = new JButton("Click Me");
Creates a new JButton object named button with the label "Click Me". This button will be added to the JFrame.

button.addActionListener(new ActionListener() {
Adds an ActionListener to the button.
An anonymous class is created that implements the ActionListener interface to handle the button click event.

@Override
Indicates that the actionPerformed() method overrides the method in the ActionListener interface.

public void actionPerformed(ActionEvent e) {
Implements the actionPerformed() method from the ActionListener interface. This method will be called when the button is clicked.

System.out.println("Button clicked!");
Prints "Button clicked!" to the console when the button is clicked.

}
Ends the actionPerformed() method.

});
Ends the anonymous class and completes the call to button.addActionListener().

frame.add(button);
Adds the button to the frame (window). Now, when the frame is displayed, it will show the button inside it.

frame.setSize(300, 200);
Sets the size of the frame to 300 pixels wide and 200 pixels tall.

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Ensures that the program will exit when the window is closed.

frame.setVisible(true);
Makes the frame visible. Without this line, the window would not be shown on the screen.

}
Ends the main() method.

}
Ends the jq class.


Summary
The program creates a simple GUI with a button using Swing.
The button has an anonymous class that implements ActionListener, allowing it to handle the click event.
When the button is clicked, "Button clicked!" is printed to the console.
The JFrame window is set up, with the button added to it, and it becomes visible with the specified size.
*/