import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;

    public Game(final Board board, final List<Player> players) {

        this.board = board;
        this.players = players;
    }

    public Board getBoard() {

        return board;
    }

    public void setBoard(final Board board) {

        this.board = board;
    }

    public List<Player> getPlayers() {

        return players;
    }

    public void setPlayers(final List<Player> players) {

        this.players = players;
    }

    public synchronized void start(){
        System.out.println("Started game");
    }
}
