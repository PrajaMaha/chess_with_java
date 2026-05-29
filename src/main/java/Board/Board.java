package src.main.java.Board;

public class Board {
    /*
    White
        Pawn     Rook     Knight   Bishop   Queen    King
        00000000 00000000 00000000 00000000 00000000 00000000
        00000000 00000000 00000000 00000000 00000000 00000000
        00000000 00000000 00000000 00000000 00000000 00000000
        00000000 00000000 00000000 00000000 00000000 00000000
        00000000 00000000 00000000 00000000 00000000 00000000
        00000000 00000000 00000000 00000000 00000000 00000000
        11111111 00000000 00000000 00000000 00000000 00000000
        00000000 10000001 01000010 00100100 00010000 00001000
    */
    private long w_pawn   = 0b0000000000000000000000000000000000000000000000001111111100000000L;
    private long w_rook   = 0b0000000000000000000000000000000000000000000000000000000010000001L;
    private long w_knight = 0b0000000000000000000000000000000000000000000000000000000001000010L;
    private long w_bishop = 0b0000000000000000000000000000000000000000000000000000000000100100L;
    private long w_queen  = 0b0000000000000000000000000000000000000000000000000000000000010000L;
    private long w_king   = 0b0000000000000000000000000000000000000000000000000000000000001000L;

    private long w_board = w_pawn | w_rook | w_knight | w_bishop | w_queen | w_king;

    /*
    Black
        Pawn     Rook     Knight   Bishop   Queen    King
        00000000 10000001 01000010 00100100 00010000 00001000
        11111111 00000000 00000000 00000000 00000000 00000000
        00000000 00000000 00000000 00000000 00000000 00000000
        00000000 00000000 00000000 00000000 00000000 00000000
        00000000 00000000 00000000 00000000 00000000 00000000
        00000000 00000000 00000000 00000000 00000000 00000000
        00000000 00000000 00000000 00000000 00000000 00000000
        00000000 00000000 00000000 00000000 00000000 00000000
    */
    private long b_pawn   = 0b0000000011111111000000000000000000000000000000000000000000000000L;
    private long b_rook   = 0b1000000100000000000000000000000000000000000000000000000000000000L;
    private long b_knight = 0b0100001000000000000000000000000000000000000000000000000000000000L;
    private long b_bishop = 0b0010010000000000000000000000000000000000000000000000000000000000L;
    private long b_queen  = 0b0001000000000000000000000000000000000000000000000000000000000000L;
    private long b_king   = 0b0000100000000000000000000000000000000000000000000000000000000000L;

    private long b_board = b_pawn | b_rook | b_knight | b_bishop | b_queen | b_king;

    private long full_board = w_board | b_board;

    public long getWhitePawns() {
        return w_pawn;
    }


    public long getW_pawn() {
        return w_pawn;
    }

    public long getW_rook() {
        return w_rook;
    }

    public long getW_knight() {
        return w_knight;
    }

    public long getW_bishop() {
        return w_bishop;
    }

    public long getW_queen() {
        return w_queen;
    }

    public long getW_king() {
        return w_king;
    }

    public long getW_board() {
        return w_board;
    }

    public long getB_pawn() {
        return b_pawn;
    }

    public long getB_rook() {
        return b_rook;
    }

    public long getB_knight() {
        return b_knight;
    }

    public long getB_bishop() {
        return b_bishop;
    }

    public long getB_queen() {
        return b_queen;
    }

    public long getB_king() {
        return b_king;
    }

    public long getB_board() {
        return b_board;
    }

    public long getFull_board() {
        return full_board;
    }

    // public static void main(String[] args) {
    //     Board new_board = new Board();
    //     PrintBoard printer = new PrintBoard();
    //     FlipBoard boardFlip = new FlipBoard();

    //     long chess_board = new_board.getBoard();

    //     System.out.println(Long.toBinaryString(chess_board));
    //     System.out.println();
        

    //     printer.printBoard(chess_board, "white");

    //     chess_board = boardFlip.flipBoard(chess_board);

    //     printer.printBoard(chess_board, "black");
    // }
}
