package oop;

public class Board {
    private Cell[][] board;
    private static final int size = 3;

    public Board() {
        board = new Cell[size][size];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int index = 0; index < size; index++) {
            for (int idx = 0; idx < size; idx++) {
                board[index][idx] = Cell.EMPTY;
            }
        }
    }

    public boolean move(int position, Cell player) {
        int row = (position - 1) / size;
        int column = (position - 1) % size;

        if (row < 0 || row >= size || column < 0 || board[row][column] != Cell.EMPTY) {
            return false;
        }
        board[row][column] = player;
        return true;
    }

    public boolean validMove(int row, int column) {
        return row >= 0 && row < size && column >= 0 && column < size;
    }

    public boolean checkWinner(Cell player) {
        for (int index = 0; index < size; index++) {
            if (board[index][0] == player && board[index][1] == player && board[index][2] == player) return true;

            if (board[0][index] == player && board[1][index] == player && board[2][index] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }

    public boolean gameIsOver() {
        return checkWinner(Cell.X) || checkWinner(Cell.O) || isFull();
    }

    public boolean isFull() {
        for (int count = 0; count < size; count++) {
            for (int idx = 0; idx < size; idx++) {
                if (board[count][idx] == Cell.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public void displayBoard() {
        for (int index = 0; index < size; index++) {
            for (int idx = 0; idx < size; idx++) {
                System.out.print(board[index][idx] + " ");
            }
            System.out.println();
        }
    }

    public void resetBoard() {
        for (int index = 0; index < 3; index++) {
            for (int idx = 0; idx < 3; idx++) {
                board[index][idx] = Cell.EMPTY;
            }
        }

    }

    public boolean checkDraw() {
        if (!isFull()) {
            return false;
        }
        return !checkWinner(Cell.X) && !checkWinner(Cell.O);
    }
}
