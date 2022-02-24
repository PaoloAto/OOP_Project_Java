
public class Lure extends Upgrades {
public Lure(int lureNum) {
		
		if(lureNum == 1) {
			this.setName("Great Lure");
			this.setPrice(500);
			this.setfEncounter(5);
			this.setfCapture(5);
		}
		
		if(lureNum == 2) {
			this.setName("Ultra Lure");
			this.setPrice(700);
			this.setfEncounter(10);
			this.setfCapture(5);
		}
		
		if(lureNum == 3) {
			this.setName("Master Lure");
			this.setPrice(900);
			this.setfEncounter(30);
			this.setfCapture(7);
		}
	}
}

