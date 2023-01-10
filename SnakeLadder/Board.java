package SnakeLadder;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    Board(int boardSize, int numberOfSnakes, int numberOfLadders) {
        intializeCells(boardSize);
        addSnakesLadders(cells, numberOfSnakes, numberOfLadders);
    }

    private void intializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            Arrays.fill(cells[i], new Cell());
        }

    }

    private void addSnakesLadders(Cell[][] cells, int numberOfLadders, int numberOfSnakes) {
        while (numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if (snakeTail >= snakeHead)
                continue;
            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;

            numberOfSnakes--;
        }

        while (numberOfLadders > 0) {
            int ladderHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if (ladderHead >= ladderTail)
                continue;
            Jump ladderObj = new Jump();
            ladderObj.start = ladderHead;
            ladderObj.end = ladderHead;

            Cell cell = getCell(ladderHead);
            cell.jump = ladderObj;

            numberOfLadders--;
        }

    }

    public Cell getCell(int position) {
        int boardRow = position / cells.length;
        int boardColumn = position % cells.length;

        return cells[boardRow][boardColumn];
    }
}
