package kalah.controller;

import kalah.model.House;
import kalah.model.Player;

public interface CaptureRule {
	void capture(Player p, House house);
}
