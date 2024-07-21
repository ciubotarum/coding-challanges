package arrays.lists;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import java.util.Arrays;

@RunWith(Enclosed.class)
public class CureCancer {
//    Now you are a doctor.
//    You are working with a patient's body which has many cells.
//    The patient's body is a matrix where every row represents a cell.
//    Each cell contains just uppercase and lowercase letters,
//    and every cell in the body should be the same.
//    Oh no! It seems that one of the cells have mutated!
//    It is your job to locate the mutation so that the chemo specialists can fix it!
//            return the location [i,j] within the matrix...
//    before it's too late! :(
//
//    example:
//
//    cellscellscellscodecodecells
//    cellscellscellscodecodecells
//    cellscellscellscodecodecells
//    cellscellscellscodecodecells
//    cellscellscellscodecodecells
//    cellscellscellscodecodecells
//    cellscellscellscodecodecells
//    cellscellscellscodecodecells
//    cellscellscellscodecodecells
//    cellscellscellscodecadecells <- here it is! [20, 9]
//    cellscellscellscodecodecells
//    cellscellscellscodecodecells
//    cellscellscellscodecodecells
//    cellscellscellscodecodecells

    public static int[] mutationLocation(char[][] body) {

        // My code
//        for (int column = 0; column < body[0].length; column++) {
//            for (int row = 0; row < body.length - 2; row++) {
//
//                if (body[0][column] != body[1][column] && body[row][column] != body[2][column]) {
//                    return new int[]{0 , column};
//                } else if (body[row][column] != body[row + 1][column]) {
//                    return new int[]{row + 1, column};
//                } else if (body[body.length - 1][column] != body[0][column]) {
//                    return new int[]{body.length - 1, column};
//                }
//
//            }
//        }
//        // If no mutation is found, return an empty array
//        return new int[]{};

        // code to pass the time limit test

        int rows = body.length;
        int cols = body[0].length;

        // Compare first two rows with the last row to determine the majority row
        char[] referenceRow;
        if (compareRows(body[0], body[1]) || compareRows(body[0], body[rows - 1])) {
            referenceRow = body[0];
        } else {
            referenceRow = body[1];
        }

        // Find the row that does not match the reference row
        for (int row = 0; row < rows; row++) {
            if (!compareRows(body[row], referenceRow)) {
                // Find the exact column where the mutation is
                for (int col = 0; col < cols; col++) {
                    if (body[row][col] != referenceRow[col]) {
                        return new int[]{row, col};
                    }
                }
            }
        }

        return new int[]{};
    }

    // Helper method to compare two rows
    private static boolean compareRows(char[] row1, char[] row2) {
        for (int i = 0; i < row1.length; i++) {
            if (row1[i] != row2[i]) {
                return false;
            }
        }
        return true;
    }


    public static class SolutionTest {
        @Test
        public void testSomething1() {
            char[][] body =  {
                    "thisssAsmallerPerson".toCharArray(),
                    "thisIsAsmallerPerson".toCharArray(),
                    "thisIsAsmallerPerson".toCharArray(),
                    "thisIsAsmallerPerson".toCharArray()
            };
            int[] answer = CureCancer.mutationLocation(body);
            assertEquals(Arrays.toString(new int[]{0,4}), Arrays.toString(answer));
        }
        @Test
        public void testSomething2() {
            char[][] body =  {
                    "thisIsAsmallerPerson".toCharArray(),
                    "thisIsAsmallerPerson".toCharArray(),
                    "thisIsAsmallerPerson".toCharArray(),
                    "thisssAsmallerPerson".toCharArray()
            };
            int[] answer = CureCancer.mutationLocation(body);
            assertEquals(Arrays.toString(new int[]{3,4}), Arrays.toString(answer));
        }
        @Test
        public void testSomething3() {
            char[][] body =  {
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuff1thinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray(),
                    "someGreaTstuffIthinkThisIs".toCharArray()
            };
            int[] answer = CureCancer.mutationLocation(body);
            assertEquals(Arrays.toString(new int[]{9,14}), Arrays.toString(answer));
        }
    }
}
