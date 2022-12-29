package chess;

import boardgame.Position;

public class ChessPosition {

    private char colunm;
    private int row;

    public ChessPosition(char colunm, int row) {
        if (colunm < 'a' || colunm > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
        }
        this.colunm = colunm;
        this.row = row;
    }

    public char getColunm() {
        return colunm;
    }


    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        return new Position(8 - row, colunm - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + colunm + row;
    }
}
