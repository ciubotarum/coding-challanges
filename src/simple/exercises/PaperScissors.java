package simple.exercises;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class PaperScissors {
    //    In this kata, your task is to implement an extended version of the famous rock-paper-scissors game. The rules are as follows:
//
//    Scissors cuts Paper
//    Paper covers Rock
//    Rock crushes Lizard
//    Lizard poisons Spock
//    Spock smashes Scissors
//    Scissors decapitates Lizard
//    Lizard eats Paper
//    Paper disproves Spock
//    Spock vaporizes Rock
//    Rock crushes Scissors
//    Task:
//    Given two values from the above game, return the Player result as "Player 1 Won!", "Player 2 Won!", or "Draw!".
//
//    Inputs
//    Values will be given as one of "rock", "paper", "scissors", "lizard", "spock".

    private final static String USE_HACK = "me";
    public static String rpsls(String player1, String player2) {
        List<List<String>> games = List.of(
                List.of("scissors", "paper"),
                List.of( "paper", "rock"),
                List.of( "rock", "lizard"),
                List.of( "lizard", "spock"),
                List.of( "spock", "scissors"),
                List.of( "scissors", "lizard"),
                List.of( "lizard", "paper"),
                List.of( "paper", "spock"),
                List.of( "spock", "rock"),
                List.of( "rock", "scissors")
        );

        for (List<String> game : games) {
            String winner = decideWinner(player1, player2, game.get(0), game.get(1));
            if(winner != null){
                return winner;
            }
        }

        return "Draw!";
    }

    private static String decideWinner(String player1, String player2, String winner, String loser) {
        if (player1.equals(winner) && player2.equals(loser)) {
            return "Player 1 Won!";
        }
        if (player2.equals(winner) && player1.equals(loser)) {
            return "Player 2 Won!";
        }

        return null;
    }


    public static class SolutionTest {

        @Test
        public void player1Wins() {
            Assert.assertEquals("Player 1 Won!", PaperScissors.rpsls("rock", "lizard"));
            Assert.assertEquals("Player 1 Won!", PaperScissors.rpsls("paper", "rock"));
            Assert.assertEquals("Player 1 Won!", PaperScissors.rpsls("scissors", "lizard"));
            Assert.assertEquals("Player 1 Won!", PaperScissors.rpsls("lizard", "paper"));
            Assert.assertEquals("Player 1 Won!", PaperScissors.rpsls("spock", "rock"));
        }

        @Test
        public void player2Wins() {
            Assert.assertEquals("Player 2 Won!", PaperScissors.rpsls("lizard", "scissors"));
            Assert.assertEquals("Player 2 Won!", PaperScissors.rpsls("spock", "lizard"));
            Assert.assertEquals("Player 2 Won!", PaperScissors.rpsls("paper", "lizard"));
            Assert.assertEquals("Player 2 Won!", PaperScissors.rpsls("scissors", "spock"));
            Assert.assertEquals("Player 2 Won!", PaperScissors.rpsls("rock", "spock"));
        }

        @Test
        public void draws() {
            Assert.assertEquals("Draw!", PaperScissors.rpsls("rock", "rock"));
            Assert.assertEquals("Draw!", PaperScissors.rpsls("spock", "spock"));
        }
    }


}





