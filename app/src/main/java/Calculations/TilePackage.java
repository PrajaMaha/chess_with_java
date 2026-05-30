package Calculations;

public class TilePackage {
    private boolean playerColour;
    private String startTileS;
    private String endTileS;
    private int startTileI;
    private int endTileI;

    private long distance;

    public TilePackage(boolean playerColour, String startTileS, String endTileS) {
        this.playerColour = playerColour;
        this.startTileS = startTileS;
        this.endTileS = endTileS;
    }

    public String getStartTileS() {
        return startTileS;
    }
    public String getEndTileS() {
        return endTileS;
    }

    public long getStartTileI() {
        return startTileI;
    }
    public void setStartTileI(int StartTileI) {
        this.startTileI = StartTileI;
    }
    public long getEndTileI() {
        return endTileI;
    }
    public void setEndTileI(int endTileI) {
        this.endTileI = endTileI;
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
