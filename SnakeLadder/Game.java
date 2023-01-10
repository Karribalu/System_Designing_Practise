package SnakeLadder;

import java.util.*;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playerList = new LinkedList<>();
    Player winner;

    public Game() {
        intializeGame();
    }

    private void intializeGame() {
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        playerList.add(player1);
        playerList.add(player2);
    }

    public void startGame() {
        while (winner == null) {
            Player playerTurn = findPlayerTurn();
            System.out
                    .println("Player turn is: " + playerTurn.id + " Current Position is " + playerTurn.currentPosition);

            int diceNumber = dice.rollDice();
            int playerNewPosition = playerTurn.currentPosition + diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            System.out.println("Player turn is: " + playerTurn.id + " new Position is " + playerTurn.currentPosition);

            if (playerNewPosition >= board.cells.length * board.cells.length - 1) {
                winner = playerTurn;
            }
        }

        System.out.println("Winner is " + winner.id);
    }

    private Player findPlayerTurn() {
        Player playerTurns = playerList.removeFirst();
        playerList.addLast(playerTurns);

        return playerTurns;
    }

    private int jumpCheck(int playerPosition) {
        if (playerPosition > board.cells.length * board.cells.length - 1) {
            return playerPosition;
        }

        Cell cell = board.getCell(playerPosition);
        if (cell.jump != null && cell.jump.start == playerPosition) {
            String jumpBy = cell.jump.start < cell.jump.end ? "ladder" : "snake";
            System.out.println("Jump done by: " + jumpBy);

            return cell.jump.end;
        }

        return playerPosition;
    }
}
