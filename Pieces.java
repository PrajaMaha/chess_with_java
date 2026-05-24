

public abstract class Pieces {
    private String pieceName;
    private int pieceValue;
    private Boolean pieceStatus;
    // private 
    
    /**
     * @param pieceName
     * @param pieceValue
     * @param pieceStatus
     */
    public Pieces(String pieceName, int pieceValue, Boolean pieceStatus) {
        this.pieceName = pieceName;
        this.pieceValue = pieceValue;
        this.pieceStatus = pieceStatus;
    }

    /**
     * @return The name of the Piece (pawn, rook, knight, etc.)
     */
    public String getPieceName() {
        return pieceName;
    }

    /**
     * @return the value of each piece
     */
    public int getPieceValue() {
        return pieceValue;
    }

    /**
     * @return the status of the piece (where True if still active or False if captured)
     */
    public Boolean getPieceStatus() {
        return pieceStatus;
    }

    /**
     * @param pieceStatus alters the piece status whether if it captured or resued
     */
    public void setPieceStatus(Boolean pieceStatus) {
        this.pieceStatus = pieceStatus;
    } 

    // public abstract 

    

}
