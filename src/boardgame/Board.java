package boardgame;

public class Board {


    private int rows;
    private int columns;
    private Piece[][] pieces;

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public Piece[][] getPieces() {
        return pieces;
    }


    public Piece piece(int row, int column){
        return pieces[row][column];
    }

    public Board(int column, int rows) {
        this.columns = columns;
        this.rows = rows;
        pieces = new Piece[rows][columns];
    }
}
