public class Coordinate {
    public static int row = 6;
    public static int column = 7;


    public Coordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public int lastToken(Board board, int column) {
        int rowNum = row-1;
        while(rowNum >=0 && board.isEmpty(new Coordinate(rowNum, column))) {
            rowNum--;
        }
        return rowNum;
    }

    public static Coordinate introduceColumn() {
        Console console = new Console();
        return new Coordinate(6, console.readInt("  Enter column to drop a token: "));
    }
}