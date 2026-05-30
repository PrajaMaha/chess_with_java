package src.main.java.SelfDefinedErrors;

public class InvalidTileError extends RuntimeException {
    private boolean playerColour;
    private String errorTile;

    public InvalidTileError(String message, String tile, boolean playerColour) {
        super(message);
        this.errorTile = tile;
        this.playerColour = playerColour;
    }

    public String getErrorTile() {
        return this.errorTile;
    }

    public boolean getPlayerColour() {
        return playerColour;
    }
}
