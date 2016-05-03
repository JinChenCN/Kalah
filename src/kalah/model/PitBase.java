package kalah.model;

public class PitBase implements Pit {
	private final int initialSeeds;
	private int seeds;
	
	public PitBase(int seeds) {
		this.seeds = seeds;
		this.initialSeeds = seeds;
	}
	
	public void setSeeds(int seeds) {
		this.seeds = seeds;
	}
	
	public int getSeeds() {
		return this.seeds;
	}
	
	public void clear() {
		this.seeds = 0;
	}
	
	public void add(int i) {
		this.seeds = seeds + i;
	}
	
	public int getBegingingSeeds() {
		return this.initialSeeds;
	}

}
