package src.main.java.Calculations;

import src.main.java.SelfDefinedErrors.InvalidTileError;

public class TileToNumber {
    // public int h1 = 0;
    // public int g1 = 1;
    // public int f1 = 2;
    // public int e1 = 3;
    // public int d1 = 4;
    // public int c1 = 5;
    // public int b1 = 6;
    // public int a1 = 7;

    public TilePackage tileToNumber(TilePackage returnPackage) throws InvalidTileError {
        try {
            tileCheck(returnPackage);
        } catch (InvalidTileError e) {
            throw e;
        }

        String startingTileS = returnPackage.getStartingTileS();
        char startingfile = startingTileS.charAt(0);
        int startingrank = Character.getNumericValue(startingTileS.charAt(1)) - 1;

        // The startingrank multiplication jumps ranks, while to get the right startingfile
        int startingTileI = (startingrank * 8) + (8 - (startingfile - 96));
        returnPackage.setStartingTileI(startingTileI);

        String endingTileS = returnPackage.getEndingTileS();
        char endingfile = endingTileS.charAt(0);
        int endingrank = Character.getNumericValue(endingTileS.charAt(1)) - 1;

        int endingTileI = (endingrank * 8) + (8 - (endingfile - 96));
        returnPackage.setStartingTileI(endingTileI);

        returnPackage.setDistance(startingTileI - endingTileI);

        return returnPackage;
    }

    public boolean tileCheck(TilePackage returnPackage) throws InvalidTileError {
        boolean playerColour = returnPackage.getPlayerColour();

        String startingTileS = returnPackage.getStartingTileS();
        String endingTileS = returnPackage.getEndingTileS();
        if (startingTileS.length() != 2) {
            String errorMsg = "Invalid Starting Tile Length.";
            throw new InvalidTileError(errorMsg, startingTileS, playerColour);
        }
        if (endingTileS.length() != 2) {
            String errorMsg = "Invalid Ending Tile Length.";
            throw new InvalidTileError(errorMsg, endingTileS, playerColour);
        }

        char file = startingTileS.charAt(0);
        int rank = Character.getNumericValue(startingTileS.charAt(1));
        if (rank < 0) {
            String errorMsg = "Invalid Rank Character.";
            throw new InvalidTileError(errorMsg, startingTileS, playerColour);
        }

        if (file < 97 || file > 104) {
            String errorMsg = "Invalid File.";
            throw new InvalidTileError(errorMsg, startingTileS, playerColour);
        }
        if (rank < 1 || rank > 8) {
            String errorMsg = "Invalid Rank.";
            throw new InvalidTileError(errorMsg, startingTileS, playerColour);
        }

        file = endingTileS.charAt(0);
        rank = Character.getNumericValue(endingTileS.charAt(1));
        if (rank < 0) {
            String errorMsg = "Invalid Rank Character.";
            throw new InvalidTileError(errorMsg, endingTileS, playerColour);
        }

        if (file < 97 || file > 104) {
            String errorMsg = "Invalid File.";
            throw new InvalidTileError(errorMsg, endingTileS, playerColour);
        }
        if (rank < 1 || rank > 8) {
            String errorMsg = "Invalid Rank.";
            throw new InvalidTileError(errorMsg, endingTileS, playerColour);
        }

        return true;
    }
}
