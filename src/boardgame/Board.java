package boardgame;

public class Board {


    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int columns, int rows) {
        if (rows < 1 || columns < 1)
            throw new BoardException("Error creating board: there must be at least one row and one column");

        this.columns = columns;
        this.rows = rows;
        this.pieces = new Piece[rows][columns];
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

    public Piece piece(int row, int column) {
        if (!positionExists(row, column))
            throw new BoardException("Position not on the board");

        return pieces[row][column];
    }

    public Piece piece(Position position){
        if ((!positionExists(position)))
            throw new BoardException("Position not on the board");

        return pieces[position.getRow()][position.getColumn()];
    }


    public void placePiece(Piece piece, Position position){
        if (thereIsAPiece(position))
            throw new BoardException("There is already a piece on the chosen position");

        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        return  piece(position) != null;
    }
}
