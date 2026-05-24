public class FlipBoard {
    public long flipBoard(long totalBoard) {
        long mask = 0x8000000000000000L;
        long flippedBoard = 0L;
        long tempVal = 0L;

        int shiftCounter = 63;
        for (int i = 0; i < 32; i ++) {
            tempVal = totalBoard & mask;
            
            flippedBoard |= tempVal >>> shiftCounter;

            mask >>>= 1;
            shiftCounter -= 2;
        }

        shiftCounter = 1;
        for (int i = 0; i < 32; i ++) {
            tempVal = totalBoard & mask;
            
            flippedBoard |= tempVal << shiftCounter;

            // if (shiftCounter != 0)
            mask >>>= 1;
            shiftCounter += 2;
        }
 
        return flippedBoard;
    }
}
