

public abstract class Pieces {
    private String pieceName;
    private int pieceValue;
    private Boolean pieceStatus;
    // private 
    
    public Pieces(String pieceName, int pieceValue, Boolean pieceStatus) {
        this.pieceName = pieceName;
        this.pieceValue = pieceValue;
        this.pieceStatus = pieceStatus;
    }

    public String getPieceName() {
        return pieceName;
    }

    public int getPieceValue() {
        return pieceValue;
    }

    public Boolean getPieceStatus() {
        return pieceStatus;
    }

    public void setPieceStatus(Boolean pieceStatus) {
        this.pieceStatus = pieceStatus;
    } 

    // public abstract 

    

}
