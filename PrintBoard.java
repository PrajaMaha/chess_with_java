public class PrintBoard {
    public void printBoard(long totalBoard, String boardColor) {
        int rowCounter;
        if (boardColor == "white") {
            rowCounter = 8;
        } else {
            rowCounter = 1;
        }

        StringBuilder printOut = new StringBuilder(199);
        printOut.append(rowCounter);
        printOut.append(" |");

        long mask = 0x8000000000000000L;
        for (int i = 1; i <= 64; i ++) {
            long holder = totalBoard & mask;
            if (holder != 0)
                printOut.append(" 1");
            else 
                printOut.append(" ·");

            if (i % 8 == 0) {
                printOut.append("\n");
                
                if (boardColor == "white") {
                    rowCounter --;
                    if (rowCounter != 0) {
                        printOut.append(rowCounter);
                        printOut.append(" |");
                    }
                } else if (boardColor == "black") {
                    rowCounter ++;
                    if (rowCounter != 9) {
                        printOut.append(rowCounter);
                        printOut.append(" |");
                    }
                }
            }

            mask >>>= 1;
        }

        printOut.append("-------------------\n");
        if (boardColor == "white")      
            printOut.append("    A B C D E F G H");
        else
            printOut.append("    H G F E D C B A");

        System.out.println(printOut + "\n");
    }
}
