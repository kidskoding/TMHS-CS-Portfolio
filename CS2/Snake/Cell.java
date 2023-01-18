package Snake;
public class Cell {
    private int row, col;
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public int getRow() { return row; }
    public int getCol() { return col; }
    public String toString() { return "("+row+","+col+")"; }
}