package oop3;

import oop.Board;
import oop.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BoardTest {

    private Board board;
    @BeforeEach
    public void initializer(){
        board = new Board();
    }
    @Test
    public void testValidMove(){
        assertTrue(board.validMove(0,0));
    }

    @Test
    public void testCheckWin(){
        board.move(1,  Cell.O);
        board.move(5,  Cell.O);
        board.move(9,  Cell.O);
        assertTrue(board.checkWinner(Cell.O));

    }
    @Test
    public void testGameIsOver(){
        assertFalse(board.gameIsOver());
    }

    @Test
    public  void testThatGameIsOver(){
        assertFalse(board.gameIsOver());

        board.move(1,  Cell.O);
        board.move(2,  Cell.X);
        board.move(3,  Cell.O);
        board.move(4,  Cell.O);
        board.move(5,  Cell.X);
        board.move(6,  Cell.O);
        board.move(7,  Cell.X);
        board.move(8,  Cell.O);
        board.move(9,  Cell.X);
        assertTrue(board.gameIsOver());
        assertTrue(board.gameIsOver());

    }


    @Test
    public void checkIfTheBoardIsFull_theBoardIsFull(){
        Board board = new Board();
        board.move(1,  Cell.O);
        board.move(2,  Cell.X);
        board.move(3,  Cell.O);
        board.move(4,  Cell.O);
        board.move(5,  Cell.X);
        board.move(6,  Cell.O);
        board.move(7,  Cell.X);
        board.move(8,  Cell.O);
        board.move(9,  Cell.X);
        assertTrue(board.isFull());
    }

    @Test
    public  void testThatBoardCanBeReset(){
        Board board = new Board();
        assertFalse(board.gameIsOver());

        board.move(1,  Cell.O);
        board.move(2,  Cell.X);
        board.move(3,  Cell.O);
        board.move(4,  Cell.O);
        board.move(5,  Cell.X);
        board.move(6,  Cell.O);
        board.move(7,  Cell.X);
        board.move(8,  Cell.O);
        board.move(9,  Cell.X);
        assertTrue(board.gameIsOver());

        board.resetBoard();
        assertFalse(board.isFull());

    }
    @Test
    public void checkIfItIsDraw(){
        board.move(1,  Cell.O);
        board.move(2,  Cell.X);
        board.move(3,  Cell.O);
        board.move(4,  Cell.O);
        board.move(5,  Cell.X);
        board.move(6,  Cell.O);
        board.move(7,  Cell.X);
        board.move(8,  Cell.O);
        board.move(9,  Cell.X);
        assertTrue(board.checkDraw());
    }

}