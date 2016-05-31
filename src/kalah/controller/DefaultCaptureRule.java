package kalah.controller;

import kalah.model.House;
import kalah.model.Player;

public class DefaultCaptureRule implements CaptureRule{

	@Override
	public void capture(Player p, House house) {
		House oppositeHouse = house.getOppositeHouse();
		p.getStore().add(oppositeHouse.getSeeds()+1);
		house.clear();
		oppositeHouse.clear();
	}

}
