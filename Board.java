package com.amazon.hfchotel.test.snakeAndLadder;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int[] board;
    private int begining;
    private int target;
    private List<Ladder> ladderList;
    private List<Snake> snakeList;

    Board(final List<Snake> snakes, final List<Ladder> ladders) {

        board = new int[101];
        begining = 0;
        target = 100;
        ladderList = ladders;
        snakeList = snakes;
    }


    public int[] getBoard() {

        return board;
    }

    public void setBoard(final int[] board) {

        this.board = board;
    }

    public int getBegining() {

        return begining;
    }

    public void setBegining(final int begining) {

        this.begining = begining;
    }

    public int getTarget() {

        return target;
    }

    public void setTarget(final int target) {

        this.target = target;
    }

    public List<Ladder> getLadderList() {

        return ladderList;
    }

    public void setLadderList(final List<Ladder> ladderList) {

        this.ladderList = ladderList;
    }

    public List<Snake> getSnakeList() {

        return snakeList;
    }

    public void setSnakeList(final List<Snake> snakeList) {

        this.snakeList = snakeList;
    }
}
