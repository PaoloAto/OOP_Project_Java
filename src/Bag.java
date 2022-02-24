
public class Bag {
	private Boat boat;
	private TackleBox tacklebox;
	private Rod rod;
	
	public Bag() {
		this.boat = new Boat("Row Boat",0,5);
		this.tacklebox = new TackleBox("Basic Tackle Box",0,5);
		this.rod = new Rod("Old Rod",0,0,0);
		
	}

	public Boat getBoat() {
		return boat;
	}

	public void setBoat(Boat boat) {
		this.boat = boat;
	}

	public TackleBox getTacklebox() {
		return tacklebox;
	}

	public void setTacklebox(TackleBox tacklebox) {
		this.tacklebox = tacklebox;
	}

	public Rod getRod() {
		return rod;
	}

	public void setRod(Rod rod) {
		this.rod = rod;
	}
}
