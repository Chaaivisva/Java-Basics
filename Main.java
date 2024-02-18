interface Gamezone {
    void findWinner(String sequence);
}

class CoinGame implements Gamezone {
    @Override
    public void findWinner(String sequence) {
        char[] chars = sequence.toCharArray();
        int n = chars.length;
        int p1Coins = 0, p2Coins = 0;

        for (int i = 0; i < n; ) {
            if (chars[i] == 'A') {
                i++;
            } else if (chars[i] == 'B') {
                int j = i;
                while (j < n && chars[j] == 'B') {
                    chars[j++] = 'O';
                    p1Coins++;
                }
                i = j;
            }
            if (i == n) break;

            if (chars[i] == 'B') {
                i++;
            } else if (chars[i] == 'A') {
                int j = i;
                while (j < n && chars[j] == 'A') {
                    chars[j++] = 'O';
                    p2Coins++;
                }
                i = j;
            }
        }

        System.out.println("Player 1's coins: " + p1Coins);
        System.out.println("Player 2's coins: " + p2Coins);

        if (p1Coins > p2Coins) {
            System.out.println("Player 1 wins!");
        } else if (p1Coins < p2Coins) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Game tied!");
        }
    }
}

class Player {
    public void playGame(String sequence) {
        Gamezone game = new CoinGame();
        game.findWinner(sequence);
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        

        String sequence1 = "AAAABBBAAAB";
        System.out.println("Initial input string: " + sequence1);
        player.playGame(sequence1);

        String sequence2 = "BBAAB";
        System.out.println("\nInitial input string: " + sequence2);
        player.playGame(sequence2);
    }
}
