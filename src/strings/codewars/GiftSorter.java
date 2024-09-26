package strings.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GiftSorter {
//    Write a function called sortGiftCode/sort_gift_code/SortGiftCode that accepts a string containing up to 26 unique
//    alphabetical characters, and returns a string containing the same characters in alphabetical order.
//Examples (Input -- => Output):
//            "abcdef"                      -- => "abcdef"
//            "pqksuvy"                     -- => "kpqsuvy"
//            "zyxwvutsrqponmlkjihgfedcba"  -- => "abcdefghijklmnopqrstuvwxyz"
    public static String sortGiftCode(String code){
        List<Character> letters = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (char letter : code.toCharArray()) {
            letters.add(letter);
        }

        List<Character> newList = letters.stream().sorted().collect(Collectors.toList());
        for ( char letter : newList) {
            builder.append(letter);
        }

        return builder.toString();
        // or just
//        return Arrays.stream(code.split("")).sorted().collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        String code = "pqksuvy";

        System.out.println(sortGiftCode(code));
    }
}
