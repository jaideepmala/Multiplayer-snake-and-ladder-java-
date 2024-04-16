
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        Player player1 = new Player("1", "Red", 0);
        Player player2 = new Player("2", "Blue", 0);
        Player player3 = new Player("3", "Green", 0);
        Player player4 = new Player("4", "Yellow", 0);

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        List<Snake> snakes = new ArrayList<>();
        snakes.add(new Snake(16, 6));
        snakes.add(new Snake(47, 26));
        snakes.add(new Snake(49, 11));
        snakes.add(new Snake(56, 53));
        snakes.add(new Snake(62, 19));
        snakes.add(new Snake(64, 60));

        List<Ladder> ladders = new ArrayList<>();
        ladders.add(new Ladder(1, 38));
        ladders.add(new Ladder(4, 14));
        ladders.add(new Ladder(9, 31));
        ladders.add(new Ladder(21, 42));
        ladders.add(new Ladder(28, 84));

        Board board = new Board(snakes, ladders);

        Game game = new Game(board, players);
        game.start();
        int turns = 50;
        boolean weHaveAWinner = false;
        while (turns > 0) {
            for (Player player : players) {
                int diceFace = player.rollDice();
                player.move(game, diceFace);
                if (player.isHasWon()) {
                    System.out.println("Player " + player.getPlayerId() + " has won");
                    weHaveAWinner = true;
                    break;
                }
            }
            if (weHaveAWinner)
                break;
            turns--;
        }
        if(weHaveAWinner)
            System.out.println("We have a winner");
        else
            System.out.println("Game end");
    }

}
