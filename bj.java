// String Input: To read a line or a word as a String, we can use nextLine() or next().

import java.util.Scanner;

public class bj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a full line of text
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();  // Reads until a newline character

        // Read a single word
        System.out.print("Enter a word: ");
        String word = scanner.next();  // Reads until a space or newline

        System.out.println("Sentence: " + sentence);
        System.out.println("Word: " + word);

        scanner.close();
    }
}


// This code reads both a sentence and a word from the user.

/*
Enter a sentence: Hello world from Java!
Enter a word: Java
Sentence: Hello world from Java!
Word: Java
*/