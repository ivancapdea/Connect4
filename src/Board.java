public class Board {

    private Color[][] colors;

    Board() {
        this.colors = new Color[Coordinate.row][Coordinate.column];
        this.reset();
    }

    void reset() {
        for (int i = 0; i < Coordinate.row; i++) {
            for (int j = 0; j < Coordinate.column; j++) {
                this.colors[i][j] = Color.NULL;
            }
        }
    }

    public void printBoard() {
        Console console = new Console();
        console.writeln("  ");
        for (int i = 0; i < Coordinate.row; i++) {
            console.write(i + " ");
        }
        console.writeln();
        for (int i = 0; i < Coordinate.row; i++) {
            console.write(i);
            for (int j = 0; j < Coordinate.column; j++) {
                console.write(" " + getColor(new Coordinate(i, j)));
            }
            console.writeln();
        }
        console.writeln();
    }

    private Color getColor(Coordinate coordinate) {
        return this.colors[coordinate.getRow()][coordinate.getColumn()];
    }

    boolean isOccupied(Coordinate coordinate, Color color) {
        return this.getColor(coordinate) == color;
    }

    boolean isEmpty(Coordinate coordinate) {
        return this.isOccupied(coordinate, Color.NULL);
    }

    void putToken(Coordinate coordinate, Color color) {
        if(coordinate.introduceColumn().getColumn() < coordinate.column && coordinate.introduceColumn().getColumn() >= 0) {
            this.colors[coordinate.lastToken(new Board(), coordinate.introduceColumn().getColumn())][coordinate.getColumn()] = color;
        }
    }
}