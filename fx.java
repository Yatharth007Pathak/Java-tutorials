public class fx {

    public static void main(String[] args) {
        
        String sentence = "I love Java, Java is a good language.";

        String words[] = sentence.split(" ");
        for(String word: words) {
            System.out.println(word);
        }

        System.out.println();

        String subSentences[] = sentence.split(",");
        for(String subSentence: subSentences) {
            System.out.println(subSentence);
        }
    
    }
}