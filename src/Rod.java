
public class Rod {
	private String sName;
	private float fCost;
	private float fCapture;
	private float fEncounter;
	private Lure lure;
	private Line line;
	private Reel reel;
	
	public Rod(String sName, float fCost, float fCapture, float fEncounter) {

		this.sName = sName;
		this.fCost = fCost;
		this.fCapture = fCapture;
		this.fEncounter = fEncounter;
		
	}

	public String getsName() {
		return sName;
	}

	public float getfCost() {
		return fCost;
	}

	public float getfCapture() {
		return fCapture;
	}

	public float getfEncounter() {
		return fEncounter;
	}
	
	
}
