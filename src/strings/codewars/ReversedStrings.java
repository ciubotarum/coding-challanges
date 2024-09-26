package strings.codewars;

public class ReversedStrings {
//    Complete the solution so that it reverses the string passed into it.
//
//            'world'  =>  'dlrow'
//            'word'   =>  'drow'

    public static String solution(String str) {
        StringBuilder builder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        String str = "world";

        System.out.println(solution(str));
    }
}
