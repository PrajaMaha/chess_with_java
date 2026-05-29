package Calculations;

public class TilePackage {
    private boolean playerColour;
    private String startingTileS;
    private String endingTileS;
    private int startingTileI;
    private int endingTileI;

    private long distance;

    private TilePackage(boolean playerColour, String startingTileS, String endingTileS) {
        this.playerColour = playerColour;
        this.startingTileS = startingTileS;
        this.endingTileS = endingTileS;
    }

    public String getStartingTileS() {
        return startingTileS;
    }
    public String getEndingTileS() {
        return endingTileS;
    }

    public long getStartingTileI() {
        return startingTileI;
    }
    public void setStartingTileI(int StartingTileI) {
        this.startingTileI = StartingTileI;
    }
    public long getEndingTileI() {
        return endingTileI;
    }
    public void setEndingTileI(int endingTileI) {
        this.endingTileI = endingTileI;
    }

    public long getDistance() {
        return distance;
    }
    public void setDistance(long distance) {
        this.distance = distance;
    }

    public boolean getPlayerColour() {
        return this.playerColour;
    }
}
