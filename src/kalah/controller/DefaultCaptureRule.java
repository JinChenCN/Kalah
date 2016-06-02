package kalah.controller;

import kalah.model.House;
import kalah.model.PitBase;
import kalah.model.Player;

public class DefaultCaptureRule implements Rule{

	@Override
	public void execute(Player p, PitBase pit) {
		House house = (House)pit;
		House oppositeHouse = house.getOppositeHouse();
		p.getStore().add(oppositeHouse.getSeeds()+1);
		house.clear();
		oppositeHouse.clear();
	}

}
