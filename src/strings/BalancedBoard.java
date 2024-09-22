package strings;

public class BalancedBoard {
//    There is a board made of two rows and N columns. The board is represented by two strings, row1 and row2,
//    made of characters 'R', 'W' and/or '?'. A board is balanced if, in each row and in each column, the number of
//    characters 'R' is equal to the number of characters 'W'. For example, the following board is balanced:
//
//            ?RW?WR
//            ?WR?RW
//
//    and the following board is not balanced:
//
//    W?WR?
//    R??W?
//
//  (there are two characters 'W' and one character 'R' in the first row).
//
//    The question marks ('?') can be replaced with 'W' or 'R'. What is the minimum number of replacements
//    needed to balance the board?
//
//    Write a function:
//    class Solution { public int solution(String row1, String row2); }
//    that, given two strings row1 and row2 made of N characters each, returns the minimum number of replacements
//    needed to balance the board. If it is not possible to balance the board, the function should return -1.
//
//    Examples:
//
//    1. For row1 = "W?WR?" and row2 = "R??W?", the board initially looks as follows:
//
//    W?WR?
//    R??W?
//
//    The last question mark in the first row and the second question mark in the second row can be replaced with 'R'.
//    The last question mark in the second row can be replaced with 'W'. After these replacements, the board is
//    balanced and looks as follows:
//
//    W?WRR
//    R?RWW
//
//    The function should return 3.
//
//    2. For row1 = "R?R??" and row2 = "??W??", five replacements are needed to balance the board:
//
//    R?RWW
//    W?WRR
//
//    The function should return 5.
//
//            3. For row1 = "RR?" and row2 = "?R?", it is not possible to balance the board. The function should return -1.
//
//            4. For row1 = "WWW??" and row2 = "RRR??", it is not possible to balance the board. The function should return -1.
//
//            5. For row1 = "?RW?WR" and row2 = "?WR?RW", the board is already balanced. The function should return 0.

    public static int solution(String row1, String row2) {
        // Implement your solution here
        int WCounterRow1 = 0;
        int RCounterRow2 = 0;
        int RCounterRow1 = 0;
        int WCounterRow2 = 0;

        int replacementCounter = 0;
        int columnWithBothUnknown = 0;

        for (int i = 0; i < row1.length(); i++) {
            char chRow1 = row1.charAt(i);
            char chRow2 = row2.charAt(i);

            if (chRow1 != '?' && chRow2 != '?') {
                if (chRow1 == chRow2) {
                    return -1;
                } else {
                    if (chRow1 == 'R') {
                        RCounterRow1++;
                    }
                    if (chRow1 == 'W') {
                        WCounterRow1++;
                    }
                    if (chRow2 == 'R') {
                        RCounterRow2++;
                    }
                    if (chRow2 == 'W') {
                        WCounterRow2++;
                    }

                }
                
            } else if (chRow1 != '?' || chRow2 != '?') {
                replacementCounter++;
                if (chRow1 == '?' && chRow2 == 'R') {
                    RCounterRow1++;

                }
                if (chRow1 == '?' && chRow2 == 'W') {
                    WCounterRow2++;
                    RCounterRow1++;
                }
                if (chRow2 == '?' && chRow1 == 'R') {
                    RCounterRow1++;
                    WCounterRow2++;
                }
                if (chRow2 == '?' && chRow1 == 'W') {
                    RCounterRow2++;
                    WCounterRow1++;
                }

            } else {
                columnWithBothUnknown++;
            }
        }
        int imbalanceRow1 = RCounterRow1 - WCounterRow1;
        int imbalanceRow2 = RCounterRow2 - WCounterRow2;


        int imbalance = Math.abs(imbalanceRow1);
        if (columnWithBothUnknown < imbalance) {
            return -1;
        }

        replacementCounter += 2 * imbalance;


        return replacementCounter;
    }

    public static void main(String[] args) {
        String row1 = "W?WR?";
        String row2 = "R??W?";

        System.out.println(solution(row1, row2));
    }
}

