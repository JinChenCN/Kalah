package kalah.view;

import com.qualitascorpus.testsupport.IO;
import com.qualitascorpus.testsupport.MockIO;

import kalah.KalahConstants;
import kalah.model.Model;
import kalah.model.Player;
import kalah.setting.GameSetting;

public class DefaultView implements View {
	private IO io;
	private Model model;
	
	public DefaultView (Model model, IO io) {
		this.io = io;
		this.model = model;
	}
	
    public DefaultView(Model model, MockIO mockIO) {
        this.model = model;
        this.io = (IO) mockIO;
	}

	@Override
	public void printBoard() {
		Player p1 = model.getPlayers().get(0);
		Player p2 = model.getPlayers().get(1);
		
		String seedsOfP1 = String.format(KalahConstants.BOARD_SEEDS_P1,
				p1.getStore().getSeeds(),
				p1.getHouses().get("1").getSeeds(), 
				p1.getHouses().get("2").getSeeds(),
				p1.getHouses().get("3").getSeeds(), 
				p1.getHouses().get("4").getSeeds(), 
				p1.getHouses().get("5").getSeeds(), 
				p1.getHouses().get("6").getSeeds() );
		
		String seedsOfP2 = String.format(KalahConstants.BOARD_SEEDS_P2, 
				p2.getHouses().get("6").getSeeds(), 
				p2.getHouses().get("5").getSeeds(),
				p2.getHouses().get("4").getSeeds(), 
				p2.getHouses().get("3").getSeeds(), 
				p2.getHouses().get("2").getSeeds(), 
				p2.getHouses().get("1").getSeeds(), 
				p2.getStore().getSeeds() );
		
		io.println(KalahConstants.BOARD_BOARDER);
		io.println(seedsOfP2);
		io.println(KalahConstants.BOARD_SEPERATOR);
		io.println(seedsOfP1);
		io.println(KalahConstants.BOARD_BOARDER);
	}

	@Override
	public void printGameEnded() {
		printGameFinished();
		for (Player player : model.getPlayers()) {
            io.println(String.format(KalahConstants.PLAYER_SCORE, player.getId(), player.getScore()));
        }
        int winner = model.getWinner();
        if (winner == -1) {
            io.println(KalahConstants.PLAYER_SCORE);
        } else {
            io.println(String.format(KalahConstants.WIN, winner));
        }
		
	}
	
    private void printGameFinished() {
        printBoard();
        io.println(KalahConstants.GAME_OVER);
        printBoard();
    }

	@Override
	public void printGameQuit() {
        io.println(KalahConstants.GAME_OVER);
        printBoard();	
	}

	@Override
	public void printHouseEmpty() {
        io.println(KalahConstants.HOUSE_EMPTY);		
	}

	@Override
	public int getInput(Player player) {
        String prompt = String.format(KalahConstants.GETINPUT_PROMPT, player.getId());        
        int input;
        input = io.readInteger(prompt, 1, GameSetting.houseNum, KalahConstants.INPUT_QUIT, KalahConstants.QUIT);
        return input;
	}

}
