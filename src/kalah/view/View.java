package kalah.view;

import kalah.model.Player;

public interface View {
    void printBoard();

    void printGameEnded();

    void printGameQuit();

    void printHouseEmpty();

    int getInput(Player player);

}
