package kalah;

public class KalahConstants {
	public static final String GETINPUT_PROMPT = "Player P%d's turn - Specify house number or 'q' to quit: ";
	public static final int INPUT_QUIT = -1;
    public static final String QUIT = "q";
    public static final String HOUSE_EMPTY = "House is empty. Move again.";
    
    public static final String BOARD_BOARDER = "+----+-------+-------+-------+-------+-------+-------+----+";
    public static final String BOARD_SEEDS_P2 = "| P2 | 6[ %d] | 5[ %d] | 4[ %d] | 3[ %d] | 2[ %d] | 1[ %d] |  %d |";
    public static final String BOARD_SEPERATOR = "|    |-------+-------+-------+-------+-------+-------|    |";
    public static final String BOARD_SEEDS_P1 = "|  %d | 1[ %d] | 2[ %d] | 3[ %d] | 4[ %d] | 5[ %d] | 6[ %d] | P1 |";
    
    public static final String GAME_OVER = "Game over";
    
    public static final String PLAYER_SCORE = "\tplayer %d:%d";
    public static final String WIN = "Player %d wins!";
    
    
    public static final int TIE = -1;
}
