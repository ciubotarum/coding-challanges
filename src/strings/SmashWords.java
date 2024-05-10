package strings;

public class SmashWords {
//    Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation,
//    but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!
//    ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'

    public static String smash(String... words) {
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word).append(" ");
        }

        String sentence = builder.toString();
        return sentence.trim();
    }

    public static void main(String[] args) {
        String[] words = {"hello" ,"world", "this", "is", "great"};
        System.out.println(smash(words));
    }
}
