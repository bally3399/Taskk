package oop;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();
        Board board = new Board();

        System.out.println("Welcome to My Tic-Tac_Toe game");
        Player firstPlayer = new Player("Player 1", Cell.X);
        Player secondPlayer = new Player("Player 2", Cell.O);

        while (true) {
            if (ticTacToe.validate(scanner, board, firstPlayer)) break;
            if (ticTacToe.validate(scanner, board, secondPlayer)) break;
        }

    }

    private boolean validate(Scanner scanner, Board board, Player player) {
        displayBoard(board);
        getMove(scanner, board, player);
        if (checkWin(board, player)) {
            System.out.println(player.getName() + " wins!");
            return true;

        }
        //if (board.isFull()) {
          //  System.out.println("Board is full");
            //return true;
        //}
        if (checkDraw(board)) {
            System.out.println("It's a draw!");
            return true;
        }
        return false;
    }

    private boolean checkDraw(Board board) {
        return board.isFull() && !board.checkWinner(Cell.X) && !board.checkWinner(Cell.O);
    }

    private boolean checkWin(Board board, Player player) {
        return board.checkWinner(player.getCell());
    }

    private void displayBoard(Board board) {
        System.out.println("current Board: ");
        board.displayBoard();
    }

    private void getMove(Scanner scanner, Board board, Player player) {
        System.out.println(player.getName() + "'s turn:");
        System.out.print("Enter a number from 1 to 9 to place your symbol: ");
        int position = scanner.nextInt();

        if (position < 1 || position > 9) {
            throw new IllegalArgumentException("Invalid position. Please enter a number from 1 to 9.");
        }
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;

        if (board.validMove(row, col)) {
            board.move(position, player.getCell());
        } else {
            System.out.println("Invalid move. Please choose another position.");
            getMove(scanner, board, player);
        }
    }
}

