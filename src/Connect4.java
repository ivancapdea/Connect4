public class Connect4 {
    private Board board;
    private Turn turn;

    Connect4() {
        this.board = new Board();
        this.turn = new Turn(this.board);
    }
}
