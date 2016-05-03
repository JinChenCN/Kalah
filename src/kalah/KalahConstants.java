package kalah;

public class KalahConstants {
	public static final String GETINPUT_PROMPT = "Player P%d's turn - Specify house number or 'q' to quit: ";
	public static final int INPUT_QUIT = -1;
    public static final String QUIT = "q";
    public static final String HOUSE_EMPTY = "House is empty. Move again.";
    
    public static final String BOARD_BOARDER = "+----+-------+-------+-------+-------+-------+-------+----+";
    public static final String BOARD_SEEDS_P2 = "| P2 | 6[%s] | 5[%s] | 4[%s] | 3[%s] | 2[%s] | 1[%s] | %s |";
    public static final String BOARD_SEPERATOR = "|    |-------+-------+-------+-------+-------+-------|    |";
    public static final String BOARD_SEEDS_P1 = "| %s | 1[%s] | 2[%s] | 3[%s] | 4[%s] | 5[%s] | 6[%s] | P1 |";
    
    public static final String GAME_OVER = "Game over";
    
    public static final String PLAYER_SCORE = "\tplayer %d:%d";
    public static final String WIN = "Player %d wins!";
    
    
    public static final int TIE = -1;
    public static final String OUTPUT_TIE = "A tie!";
}
