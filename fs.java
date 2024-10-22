public class fs {

    public static void main(String[] args) {
        String str = "  Hello, Java!  ";

        // Length
        System.out.println("Length: " + str.length());

        // Trim
        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed);

        // Substring
        String sub = trimmed.substring(7);
        System.out.println("Substring: " + sub);

        // Replace
        String replaced = trimmed.replace("Java", "World");
        System.out.println("Replaced: " + replaced);

        // To Upper Case
        System.out.println("Uppercase: " + replaced.toUpperCase());
    }
}