package boardgame;

public class Board {


    private int rows;
    private int columns;

    public int getRows() {
        return rows;
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    private Piece[][] pieces;

    public Board(int column, int rows) {
        this.columns = columns;
        this.rows = rows;
        pieces = new Piece[rows][columns];
    }
}
