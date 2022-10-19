public class Turn {
    private Board board;
    static final int NUM_PLAYERS = 2;
    private Player[] players;
    private int actualPlayer;

    Turn(Board board) {
        this.board = board;
        this.players = new Player[Turn.NUM_PLAYERS];
        this.reset();
    }

    void reset() {
        for(int i=0; i < NUM_PLAYERS; i++) {
            this.players[i] = new Player(Color.getColor(i), this.board);
        }
    }

    void play() {
        this.players[this.actualPlayer].play();
    }
}