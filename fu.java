public class fu {
    
    public static void main(String[] args) {
        String str = "  Java Programming is Fun!  ";

        // Trim and print length
        String trimmedStr = str.trim();
        System.out.println("Trimmed: '" + trimmedStr + "'");
        System.out.println("Length: " + trimmedStr.length());

        // Replace and check if contains
        String replacedStr = trimmedStr.replace("Fun", "Awesome");
        System.out.println("Replaced: " + replacedStr);
        System.out.println("Contains 'Awesome': " + replacedStr.contains("Awesome"));

        // Convert to char array and print each character
        char[] charArray = trimmedStr.toCharArray();
        System.out.print("Characters: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }

        // Substring and Uppercase
        String subStr = trimmedStr.substring(5, 16);
        System.out.println("\nSubstring: " + subStr);
        System.out.println("Uppercase: " + subStr.toUpperCase());
    }
}