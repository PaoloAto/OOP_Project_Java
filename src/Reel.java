
public class Reel extends Upgrades {
	public Reel(int reelNum) {
			
			if(reelNum == 1) {
				this.setName("Great Reel");
				this.setPrice(800);
				this.setfEncounter(10);
				this.setfCapture(10);
			}
			
			if(reelNum == 2) {
				this.setName("Ultra Reel");
				this.setPrice(9500);
				this.setfEncounter(18);
				this.setfCapture(18);
			}
			
			if(reelNum == 3) {
				this.setName("Master Reel");
				this.setPrice(1000);
				this.setfEncounter(21);
				this.setfCapture(21);
			}
		}
}
