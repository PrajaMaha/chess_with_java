package src.main.java;
public class PrintBoard {

    /*
    White
        8 | 0 0 0 0 0 0 0 0
        7 | 0 0 0 0 0 0 0 0
        6 | 0 0 0 0 0 0 0 0
        5 | 0 0 0 0 0 0 0 0
        4 | 0 0 0 0 0 0 0 0
        3 | 0 0 0 0 0 0 0 0
        2 | 0 0 0 0 0 0 0 0
        1 | 0 0 0 0 0 0 0 0
        -------------------
            a b c d e f g h

    Black
        1 | 0 0 0 0 0 0 0 0
        2 | 0 0 0 0 0 0 0 0
        3 | 0 0 0 0 0 0 0 0
        4 | 0 0 0 0 0 0 0 0
        5 | 0 0 0 0 0 0 0 0
        6 | 0 0 0 0 0 0 0 0
        7 | 0 0 0 0 0 0 0 0
        8 | 0 0 0 0 0 0 0 0
        -------------------
            h g f e d c b a
    */

    /**
     * @param totalBoard, the bit board
     * @param boardColor, depending on which colour player is looking at the board
     */
    public void printBoard(long totalBoard, String boardColor) {
        int rowCounter;
        if (boardColor == "white")
            rowCounter = 8;
        else
            rowCounter = 1;

        StringBuilder printOut = new StringBuilder(199);
        printOut.append(rowCounter + " |");

        long mask = 0x8000000000000000L;
        for (int i = 1; i <= 64; i ++) {
            long holder = totalBoard & mask;
            if (holder != 0)
                printOut.append(" 1");
            else 
                printOut.append(" ·");

            mask >>>= 1;
        
            if (i % 8 != 0) {
                continue;
            }

            printOut.append("\n");
            
            if (boardColor == "white") 
                rowCounter --;
            else if (boardColor == "black") 
                rowCounter ++;

            if (rowCounter != 0 && rowCounter != 9)
                printOut.append(rowCounter + " |");

        }

        if (boardColor == "white")      
            printOut.append("-------------------\n" + "    a b c d e f g h\n");
        else
            printOut.append("-------------------\n" + "    h g f e d c b a\n");

        System.out.println(printOut);
    }
}
