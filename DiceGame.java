import java.util.Scanner;
import java.util.Random;

public class DiceGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String player1 = "Player 1";
        String player2 = "Player 2";

        System.out.println("Welcome to the Dice Game!");

        int round = 1;
        int player1Total = 0;
        int player2Total = 0;

        while (round <= 5) {

            System.out.println("\nRound " + round);

            // Player 1's turn
            int dice = random.nextInt(6) + 1;
            System.out.println(player1 + " rolled: " + dice);
            player1Total += dice;

            // Player 2's turn
            dice = random.nextInt(6) + 1;
            System.out.println(player2 + " rolled: " + dice);
            player2Total += dice;

            round++;
        }

        System.out.println("\nFinal Scores:");
        System.out.println(player1 + ": " + player1Total);
        System.out.println(player2 + ": " + player2Total);

        if (player1Total > player2Total) {
            System.out.println("\nCongratulations " + player1 + "! You won the game.");
        } else if (player2Total > player1Total) {
            System.out.println("\nCongratulations " + player2 + "! You won the game.");
        } else {
            System.out.println("\nIt's a tie! Play again to determine the winner.");
        }

        scanner.close();
    }
}