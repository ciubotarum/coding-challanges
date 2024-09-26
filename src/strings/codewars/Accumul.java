package strings.codewars;

public class Accumul {
//    This time no story, no theory. The examples below show you how to write function accum:
//
//    Examples:
//    accum("abcd") -> "A-Bb-Ccc-Dddd"
//    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//    accum("cwAt") -> "C-Ww-Aaa-Tttt"
//    The parameter of accum is a string which includes only letters from a..z and A..Z.

    public static String accum(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                newString += s.substring(0, 1).toUpperCase() + "-";
            } else if (i > 0 && i < s.length() - 1) {
                newString += s.substring(i, i + 1).toUpperCase() + s.substring(i, i + 1).toLowerCase().repeat(i) + "-";
            } else {
                newString += s.substring(i, i + 1).toUpperCase() + s.substring(i, i + 1).toLowerCase().repeat(i);
            }

        }
        return newString;

//        var chars = s.split("");
//
//        return IntStream.range(0, chars.length)
//                .mapToObj(i -> chars[i].toUpperCase() + chars[i].toLowerCase().repeat(i))
//                .collect(Collectors.joining("-"));
    }

    public static void main(String[] args) {
        String s = "ZpglnRxqenU";

        System.out.println(accum(s));
    }
}
