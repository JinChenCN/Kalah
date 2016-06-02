package kalah.controller;

import kalah.model.PitBase;
import kalah.model.Player;

public interface Rule {
	void execute(Player player, PitBase pit);
}
