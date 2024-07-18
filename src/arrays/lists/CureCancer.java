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
        // Loop through each row
        for (int row = 0; row < body.length - 2; row++) {
            // Loop through each column in the current row
            for (int column = 0; column < body[row].length; column++) {

                if (body[0][column] != body[1][column] && body[row][column] != body[2][column]) {
                    // Return the location of the mutation
                    return new int[]{0 , column};
                } else if (body[row][column] != body[row + 1][column]) {
                    return new int[]{row + 1, column};
                }

            }
        }
        // If no mutation is found, return an empty array
        return new int[]{};

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
