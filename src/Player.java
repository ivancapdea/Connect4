public class Player {
    private Color color;
    private Board board;

    Player(Color color, Board board) {
        this.color = color;
        this.board = board;
    }


    public void putToken(Board board) {
        Coordinate c1;
        Console console = new Console();
        console.writeln("Turn: "+color+"");
        c1 = Coordinate.introduceColumn();
        board.putToken(c1, color);
    }
}