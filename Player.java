package com.amazon.hfchotel.test.snakeAndLadder;

import java.util.List;

public class Player extends Dice {

    private String playerId;
    private String playerColor;
    private int playerPosition;
    private boolean hasWon;

    public Player(final String playerId, final String playerColor, final int playerPosition) {

        this.playerId = playerId;
        this.playerColor = playerColor;
        this.playerPosition = playerPosition;
        this.hasWon = false;
    }

    public String getPlayerId() {

        return playerId;
    }

    public void setPlayerId(final String playerId) {

        this.playerId = playerId;
    }

    public String getPlayerColor() {

        return playerColor;
    }

    public void setPlayerColor(final String playerColor) {

        this.playerColor = playerColor;
    }

    public int getPlayerPosition() {

        return playerPosition;
    }

    public void setPlayerPosition(final int playerPosition) {

        this.playerPosition = playerPosition;
    }

    public boolean isHasWon() {

        return this.playerPosition >= 100;
    }

    public void setHasWon(final boolean hasWon) {

        this.hasWon = hasWon;
    }

    synchronized public void move(Game game, final int diceValue) {

        int currentPosition = this.playerPosition;
        int diceValuePosition = currentPosition + diceValue;
        int finalPosition = currentPosition + diceValuePosition;
        Board board = game.getBoard();
        List<Ladder> ladders = board.getLadderList();
        for (int i = 0; i < ladders.size(); i++) {
            if (ladders.get(i).start == diceValuePosition) {
                finalPosition = ladders.get(i).end;
                break;
            }
        }
        List<Snake> snakes = board.getSnakeList();
        for (int i = 0; i < snakes.size(); i++) {
            if (snakes.get(i).end == diceValuePosition) {
                finalPosition = snakes.get(i).start;
                break;
            }
        }
        this.setPlayerPosition(finalPosition);
    }
}
