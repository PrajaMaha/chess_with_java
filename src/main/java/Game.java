package src.main.java;

import src.main.java.Board.Board;

public class Game {
    public static void main(String[] args) {
        Board new_board = new Board();
        PrintBoard printer = new PrintBoard();
        FlipBoard boardFlip = new FlipBoard();

        long chess_board = new_board.getFull_board();

        System.out.println(Long.toBinaryString(chess_board));
        System.out.println();
        

        printer.printBoard(chess_board, "white");

        chess_board = boardFlip.flipBoard(chess_board);

        printer.printBoard(chess_board, "black");
    }
}
