// This code replaces certain characters in a string and demonstrates converting it to uppercase and lowercase.

public class fz {
    
    public static void main(String[] args) {
        String sentence = "Java programming is fun";

        // Replace words in a string
        String replacedSentence = sentence.replace("fun", "awesome");
        System.out.println("Replaced Sentence: " + replacedSentence); // Output: Java programming is awesome

        // Convert to uppercase
        String upperCaseSentence = sentence.toUpperCase();
        System.out.println("Uppercase Sentence: " + upperCaseSentence); // Output: JAVA PROGRAMMING IS FUN

        // Convert to lowercase
        String lowerCaseSentence = sentence.toLowerCase();
        System.out.println("Lowercase Sentence: " + lowerCaseSentence); // Output: java programming is fun
    
    }
}