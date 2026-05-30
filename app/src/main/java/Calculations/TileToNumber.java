package Calculations;

import SelfDefinedErrors.InvalidTileError;

public class TileToNumber {

    public TilePackage tileToNumber(TilePackage returnPackage) throws InvalidTileError {
        try {
            tileCheck(returnPackage);
        } catch (InvalidTileError e) {
            throw e;
        }

        String startTileS = returnPackage.getStartTileS();
        char startfile = startTileS.charAt(0);
        int startrank = Character.getNumericValue(startTileS.charAt(1)) - 1;

        // The startrank multiplication jumps ranks, while to get the right startfile
        int startTileI = (startrank * 8) + (8 - (startfile - 96));
        returnPackage.setStartTileI(startTileI);

        String endTileS = returnPackage.getEndTileS();
        char endfile = endTileS.charAt(0);
        int endrank = Character.getNumericValue(endTileS.charAt(1)) - 1;

        int endTileI = (endrank * 8) + (8 - (endfile - 96));
        returnPackage.setEndTileI(endTileI);

        returnPackage.setDistance(endTileI - startTileI);

        return returnPackage;
    }

    private boolean tileCheck(TilePackage returnPackage) throws InvalidTileError {
        boolean playerColour = returnPackage.getPlayerColour();

        String startTileS = returnPackage.getStartTileS();
        String endTileS = returnPackage.getEndTileS();
        if (startTileS.length() != 2) {
            String errorMsg = "Invalid Start Tile Length.";
            throw new InvalidTileError(errorMsg, startTileS, playerColour);
        }
        if (endTileS.length() != 2) {
            String errorMsg = "Invalid End Tile Length.";
            throw new InvalidTileError(errorMsg, endTileS, playerColour);
        }

        char startfile = startTileS.charAt(0);
        int startrank = Character.getNumericValue(startTileS.charAt(1));
        if (startrank < 0) {
            String errorMsg = "Invalid Start Rank Character.";
            throw new InvalidTileError(errorMsg, startTileS, playerColour);
        }

        if (startfile < 97 || startfile > 104) {
            String errorMsg = "Invalid Start File.";
            throw new InvalidTileError(errorMsg, startTileS, playerColour);
        }
        if (startrank < 1 || startrank > 8) {
            String errorMsg = "Invalid Start Rank.";
            throw new InvalidTileError(errorMsg, startTileS, playerColour);
        }

        char endfile = endTileS.charAt(0);
        int endrank = Character.getNumericValue(endTileS.charAt(1));
        if (endrank < 0) {
            String errorMsg = "Invalid End Rank Character.";
            throw new InvalidTileError(errorMsg, endTileS, playerColour);
        }

        if (endfile < 97 || endfile > 104) {
            String errorMsg = "Invalid End File.";
            throw new InvalidTileError(errorMsg, endTileS, playerColour);
        }
        if (endrank < 1 || endrank > 8) {
            String errorMsg = "Invalid End Rank.";
            throw new InvalidTileError(errorMsg, endTileS, playerColour);
        }

        if (startTileS.contentEquals(endTileS)) {
            String errorMsg = "Start Tile Equals End Tile.";
            throw new InvalidTileError(errorMsg, startTileS, playerColour);
        }

        return true;
    }
}
