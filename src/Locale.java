import java.util.Random;	
import java.util.Scanner;

public class Locale {
	private String sName;
	private int nFame;
	private char map[][];
	private Pokemon pokemon[] = new Pokemon [4];
	private Rarepokemon rarepokemon;
	private Boat boat;
	private Badge badge;
	private Treasure treasure;
	private TackleBox tacklebox;
//	private Bag bag;
	private Rod rod;
	private int spawn[] = new int[2]; //location of the port
	
	public Locale (String sName)
	{
		this.sName = sName;
		
		if(this.getsLocaleName().equalsIgnoreCase("Lake of Rage"))
		{			
			this.sName = "Lake of Rage";
			initializeMap(getsLocaleName());
			this.nFame = 0;
			badge = new Badge("Scale Badge");
			pokemon[0] = new Pokemon("Magikarp",40,50,10,-2,false);
			pokemon[1] = new Pokemon("Staryu",20,25,20,-5,false);
			pokemon[2] = new Pokemon("Tentacool",10,15,30,-10,false);
			pokemon[3] = new Pokemon("Red Gyarados",10,100,0,0,true);
			treasure = new Treasure("Pearl",1000);
			boat = new Boat("Row Boat",0,5);
			tacklebox = new TackleBox("Basic Tackle Box",0,5);
			rod = new Rod("Old Rod",0,0,0);
//			this.bag = new Bag();
			spawn[0] = 5; //row 
			spawn[1] = 5; //column
		}
		
		else if (this.getsLocaleName().equalsIgnoreCase("Union Cave")) {
			this.sName = "Union Cave";
			initializeMap(getsLocaleName());
			this.nFame = 0;
			badge = new Badge("Shell Badge");
			pokemon[0] = new Pokemon("Goldeen",40,50,10,-2,false);
			pokemon[1] = new Pokemon("Horsea",20,25,20,-5,false);
			pokemon[2] = new Pokemon("Shelder",10,15,30,-10,false);
			pokemon[3] = new Pokemon("Lapras",10,100,0,0,true);
			treasure = new Treasure("Stardust",2500);
			boat = new Boat("Row Boat",0,5);
			tacklebox = new TackleBox("Basic Tackle Box",0,5);
			rod = new Rod("Old Rod",0,0,0);
			spawn[0] = 10; //row 
			spawn[1] = 5; //column
		}
		
		else if (this.getsLocaleName().equalsIgnoreCase("Route 119")) {
			this.sName = "Route 119";
			initializeMap(getsLocaleName());
			this.nFame = 0;
			badge = new Badge("Coral Badge");
			pokemon[0] = new Pokemon("Remoraid",40,50,10,-2,false);
			pokemon[1] = new Pokemon("Quilfish",20,25,20,-5,false);
			pokemon[2] = new Pokemon("Carvanha",10,15,30,-10,false);
			pokemon[3] = new Pokemon("Feebas",10,100,0,0,true);
			treasure = new Treasure("Big Pearl",3000);
			boat = new Boat("Row Boat",0,5);
			tacklebox = new TackleBox("Basic Tackle Box",0,5);
			rod = new Rod("Old Rod",0,0,0);
			spawn[0] = 0; //row 
			spawn[1] = 0; //column
		}
		
		else if (this.getsLocaleName().equalsIgnoreCase("Fiores Sea")) {
			this.sName = "Fiores Sea";
			initializeMap(getsLocaleName());
			this.nFame = 0;
			badge = new Badge("Droplet Badge");
			pokemon[0] = new Pokemon("Frillish",40,50,10,-2,false);
			pokemon[1] = new Pokemon("Finneon",20,25,20,-5,false);
			pokemon[2] = new Pokemon("Alomomora",10,15,30,-10,false);
			pokemon[3] = new Pokemon("Manaphy",10,100,0,0,true);
			treasure = new Treasure("Nugget",4500);
			boat = new Boat("Row Boat",0,5);
			tacklebox = new TackleBox("Basic Tackle Box",0,5);
			rod = new Rod("Old Rod",0,0,0);
			spawn[0] = 10; //row 
			spawn[1] = 0; //column
		}
		
		else if (this.getsLocaleName().equalsIgnoreCase("Marine Cave")) {
			this.sName = "Marine Cave";
			initializeMap(getsLocaleName());
			this.nFame = 0;
			badge = new Badge("Legend Badge");
			pokemon[0] = new Pokemon("Chinchou",40,50,10,-2,false);
			pokemon[1] = new Pokemon("Wailmer",20,25,20,-5,false);
			pokemon[2] = new Pokemon("Relicanth",10,15,30,-10,false);
			pokemon[3] = new Pokemon("Kyogre",10,100,0,0,true);
			treasure = new Treasure("Nugget",4500);
			boat = new Boat("Row Boat",0,5);
			tacklebox = new TackleBox("Basic Tackle Box",0,5);
			rod = new Rod("Old Rod",0,0,0);
			spawn[0] = 10; //row 
			spawn[1] = 5; //column
		}
	}
	
	public String getsLocaleName () {
		return sName;
	}
	
//	public Bag getBag () {
//		return bag;
//	}
	

	
	public String getsPokemon(){
		return pokemon[0].getsName();
	}
	
	public Boat getBoat() {
		return boat;
	}

	public TackleBox getTacklebox() {
		return tacklebox;
	}

	public Rod getRod() {
		return rod;
	}

	public String getsRare()
	{
		return rarepokemon.getsName();
	}
	
	public String getsName() {
		return sName;
	}
	
	public int[] getSpawn(){
		return spawn;
	}
	
	public int getX(){
		return spawn[0];
	}
	
	public int getY(){
		return spawn[1];
	}
	
	public char getLocation(int row, int col){
		return map[row][col];
	}
	
	public int getnFame () {
		return nFame;
	}
	
	public int getBoatMoves() {
		return boat.getMoves();
	}
	
	public int getTackleBoxCasts() {
		return tacklebox.getnCasts();
	}
	
	public String getBadges() {
		return badge.getsName();
	}
	
	public float getRodEncounter(){
		return rod.getfEncounter();
	}
	
	public float getRodCapture(){
		return rod.getfCapture();
	}
	
	public char[][] getMap(){
		return this.map;
	}
	
	public void showMap(int currX,int currY){
		for(int row = 0 ; row < 11 ; row++)
			for(int col = 0 ; col < 11 ; col++){
				if(currY == col && currX == row) {
					System.out.print(" * ");
				}else {
				System.out.print(" "+map[row][col]+ " ");	
				}
				if(col == 10) {
					System.out.print("\n");
				}
			}
	}
	
	public void initializeMap(String sName){
		if(sName.equalsIgnoreCase("Lake of Rage")){
			map = new char[][]{
			{'U','U','U','U','U','U','U','U','U','U','U'},
			{'U','U','U','V','V','V','V','V','V','U','U'},
			{'U','U','V','V','D','D','D','D','D','U','U'},
			{'U','U','V','D','S','S','T','S','D','V','U'},
			{'U','V','D','D','S','S','S','S','D','V','U'},
			{'U','V','S','S','S','P','S','D','D','V','U'},
			{'U','V','D','D','S','S','S','D','D','V','U'},
			{'U','V','D','D','D','S','D','D','D','V','U'},
			{'U','V','V','D','D','D','D','D','V','V','U'},
			{'U','U','U','V','V','V','V','V','L','U','U'},
			{'U','U','U','U','U','U','U','U','U','U','U'}
			};
		}
		
		else if(sName.equalsIgnoreCase("Union Cave")){
	        map = new char [][]{
	        {'U','U','U','U','U','L','U','U','U','U','U'},  //Union Cave
	        {'U','U','V','V','V','V','V','V','V','U','U'},
	        {'U','V','V','V','V','V','V','V','V','V','U'},
	        {'U','V','D','D','D','D','D','D','D','V','U'},
	        {'U','D','D','D','D','D','D','T','D','D','U'},
	        {'U','D','D','D','D','D','D','D','D','D','U'},
	        {'U','D','S','S','S','S','S','S','S','D','U'},
	        {'U','D','S','T','S','S','S','S','S','D','U'},
	        {'U','S','S','S','S','S','S','S','S','S','U'},
	        {'U','U','S','S','S','S','S','S','S','U','U'},
	        {'U','U','U','U','U','P','U','U','U','U','U'}
			};
		}
		
		else if(sName.equalsIgnoreCase("Route 119")){
	        map = new char [][]{
	        {'P','S','S','S','S','D','D','U','U','U','U'},  //Route 119
	        {'U','S','S','S','S','D','T','U','U','U','U'},
	        {'U','S','S','S','S','D','D','U','U','U','U'},
	        {'U','S','S','S','L','D','D','U','U','U','U'},
	        {'U','D','D','D','D','D','D','U','U','U','U'},
	        {'U','D','D','D','D','D','D','U','U','U','U'},
	        {'U','D','V','T','V','V','V','U','U','U','U'},
	        {'U','U','U','V','V','V','V','V','V','U','U'},
	        {'U','U','U','U','V','V','V','V','V','U','U'},
	        {'U','U','U','U','V','V','V','V','V','V','U'},
	        {'U','U','U','U','V','V','V','V','V','V','U'}
	        };
		}
        
		else if(sName.equalsIgnoreCase("Fiores Sea")){
		map = new char [][]{
			 {'V','V','V','V','V','V','V','V','V','V','L'},  //Fiore's Sea
	         {'V','V','V','V','V','V','S','U','S','V','V'},
	         {'D','D','D','D','D','S','U','U','U','S','V'},
	         {'S','S','U','S','S','D','S','U','S','D','V'},
	         {'S','U','U','U','S','D','D','D','D','D','V'},
	         {'D','D','U','D','D','D','T','D','D','D','V'},
	         {'T','D','D','D','D','D','D','D','D','D','V'},
	         {'S','S','S','S','S','D','D','D','D','D','V'},
	         {'S','S','S','S','S','D','D','D','D','D','V'},
	         {'S','S','S','S','S','D','D','D','D','D','V'},
	         {'P','S','S','S','S','D','D','D','D','D','V'}
		};
		}
		
		else if(sName.equalsIgnoreCase("Marine Cave")){
		map = new char [][] {
			{'U','V','V','D','V','L','V','V','V','V','U'},    //Marine Cave
	        {'U','V','D','S','D','V','V','V','V','V','U'},
	        {'U','D','S','U','S','D','D','D','D','D','U'},
	        {'U','S','U','U','U','S','D','D','D','D','U'},
	        {'U','D','S','U','S','D','D','S','D','D','U'},
	        {'U','D','D','S','D','D','S','U','T','D','U'},
	        {'U','D','D','D','D','S','U','U','U','S','U'},
	        {'U','D','D','T','S','S','S','U','S','D','U'},
	        {'U','D','D','S','S','S','S','S','D','D','U'},
	        {'U','D','D','S','S','S','S','S','D','D','U'},
	        {'U','D','D','S','S','P','S','S','D','D','U'}
			};
		}
	}
	
	public Pokemon fishPokemon(int row, int col,int randCatch, int randEnc) {
		int temp;
		if(map[row][col] == 'S') {
			if(randEnc < getRodEncounter() + pokemon[0].getfEncounter()) { //gets the capture rate of the pokemon added with the rod
				System.out.println("Pokemon " + pokemon[0].getsName() + " has been encounterd");
				if(randCatch < getRodCapture() + pokemon[0].getfCatch()) {
					temp = pokemon[0].getnFame();
					nFame += temp;
					if(pokemon[0].getnFame() >= 0) { //so pokemon's fame will not be negative when caught
						pokemon[0].getnReduce();
					}
					
					System.out.println("Pokemon " + pokemon[0].getsName() + " was captured");
					System.out.println("Pokemon " + pokemon[0].getsName() + " new Fame is " + pokemon[0].getnFame());
					return pokemon[0];//returns the pokemon captured
				}
				else {
					System.out.println("Pokemon " + pokemon[0].getsName() + " was not captured");
				}
			}
			else {
				System.out.println("Pokemon " + pokemon[0].getsName() + " was not encountered");
			}
		}
		else if(map[row][col] == 'D') {
			if(randEnc < getRodEncounter() + pokemon[1].getfEncounter()) { //gets the capture rate of the pokemon added with the rod
				System.out.println("Pokemon " + pokemon[1].getsName() + " has been encounterd");
				if(randCatch < getRodCapture() + pokemon[1].getfCatch()) {
					temp = pokemon[1].getnFame();
					nFame += temp;
					if(pokemon[1].getnFame() >= 0) {
						pokemon[1].getnReduce();
					}
					System.out.println("Pokemon " + pokemon[1].getsName() + " was captured");
					System.out.println("Pokemon " + pokemon[1].getsName() + " new Fame is " + pokemon[1].getnFame());
					return pokemon[1];//returns the pokemon captured
				}
				else {
					System.out.println("Pokemon " + pokemon[1].getsName() + " was not captured");
				}
			}
			else {
				System.out.println("Pokemon " + pokemon[1].getsName() + " was not encountered");
			}
		}
		else if(map[row][col] == 'V') {
			if(randEnc < getRodEncounter() + pokemon[2].getfEncounter()) { //gets the capture rate of the pokemon added with the rod
				System.out.println("Pokemon " + pokemon[2].getsName() + " has been encounterd");
				if(randCatch < getRodCapture() + pokemon[2].getfCatch()) {
					temp = pokemon[2].getnFame();
					nFame += temp;
					if(pokemon[2].getnFame() >= 0) {
						pokemon[2].getnReduce();
					}
					System.out.println("Pokemon " + pokemon[2].getsName() + " was captured");
					System.out.println("Pokemon " + pokemon[2].getsName() + " new Fame is " + pokemon[2].getnFame());
					return pokemon[2];//returns the pokemon captured
				}
				else {
					System.out.println("Pokemon " + pokemon[2].getsName() + " was not captured");
				}
			}
			else {
				System.out.println("Pokemon " + pokemon[2].getsName() + " was not encountered");
			}
		}
		else if(map[row][col] == 'L') {
			System.out.println("Rare Pokemon " + pokemon[3].getsName() + " has been encounterd");
			if(randCatch < getRodCapture() + pokemon[3].getfCatch()) {
				System.out.println("Rare Pokemon " + pokemon[3].getsName() + " was captured");
				return pokemon[3];//returns the pokemon captured
			}
			else {
				System.out.println("Pokemon " + pokemon[3].getsName() + " was not captured");
			}
		}
		return null;
	}
	
//	public Rarepokemon fishRare(int row,int col,int randCatch) {
//		if(map[row][col] == 'L') {
//			System.out.println("Rare Pokemon " + rarepokemon.getsName() + " has been encounterd");
//			if(randCatch < getRodCapture() + rarepokemon.getfCatch()) {
//				System.out.println("Rare Pokemon " + rarepokemon.getsName() + " was captured");
//				System.out.println("Badge " + badge.getsName() + "was earned");
//				return rarepokemon;
//			}
//			else {
//				System.out.	println("Rare Pokemon " + rarepokemon.getsName() + " was not captured");
//			}
//		}
//		return null;
//	}
	
	public Treasure fishTreasure(){
		return treasure;
	}
	
	public void showShopItems () {
		int upgrade,error = 0,item;
		do {
			System.out.println("Choose the upgrade you need");
			System.out.println("[1] Category -  Rod");
			System.out.println("[2] Category Customization - Lure");
			System.out.println("[3] Category Customization - Line");
			System.out.println("[4] Category Customization - Reel");
			System.out.println("[5] Category TackleBox");
			System.out.println("[6] Category Boat");
			System.out.println("[7] Category Extras");
			Scanner sc = new Scanner (System.in);
			upgrade = sc.nextInt();
			if(upgrade == 1) {
				System.out.println("Item			|Price		|Encounter		|Capture");
				System.out.println("[1] Good Rod		|3000		|+10			|+5");
				System.out.println("[2] Super Rod		|8000		|+15			|+20");
				System.out.println("[3] Master Rod		|20000		|+20			|+40");
				System.out.println("Choose number of item");
				Scanner rod = new Scanner (System.in);
				item = rod.nextInt();
				switch(item) {
					case 1:this.rod = new Rod("Good Rod",3000,5,10); break;
					case 2:this.rod = new Rod("Super Rod",8000,20,15);break;
					case 3:this.rod = new Rod("Master Rod",20000,40,20);break;
					default:System.out.println("Invalid entry");break;
				}
			}
			else if(upgrade == 2) {
				System.out.println("Item			|Price		|Encounter		|Capture");
				System.out.println("Great Lure		|500		|+5			|+5");
				System.out.println("Ultra Lure		|700		|+10			|+20");
				System.out.println("Master Lure		|900		|+30			|+7");
				Scanner lure = new Scanner (System.in);
				item = lure.nextInt();
				switch(item) {
//					case 1:
//					case 2:
//					case 3:
//					default:System.out.println("Invalid entry");break;
				}
			}
			else if(upgrade == 3) {
				System.out.println("Item			|Price		|Encounter		|Capture");
				System.out.println("Great Line		|700		|+0			|+10");
				System.out.println("Ultra Line		|800		|+0			|+15");
				System.out.println("Master Line		|900		|+0			|+25");
				Scanner line = new Scanner (System.in);
				item = line.nextInt();
				switch(item) {
//					case 1:
//					case 2:
//					case 3:
//					default:System.out.println("Invalid entry");break;
				}
			}
			
			else if(upgrade == 4) {
				System.out.println("Item			|Price		|Encounter		|Capture");
				System.out.println("Great Reel		|800		|+10			|+10");
				System.out.println("Ultra Reel		|950		|+18			|+18");
				System.out.println("Master Reel		|1000		|+21			|+21");
				Scanner reel = new Scanner (System.in);
				item = reel.nextInt();
				switch(item) {
//					case 1:
//					case 2:
//					case 3:
//					default:System.out.println("Invalid entry");break;
				}
			}
			
			else if(upgrade == 5) {
				System.out.println("Item			|Price		|Casts");
				System.out.println("Good TackleBox		|1500		|+8");
				System.out.println("Super TackleBox		|2000		|+10");
				System.out.println("Master TackleBox	|2500		|+15");
				Scanner box = new Scanner (System.in);
				item = box.nextInt();
				switch(item) {
					case 1:this.tacklebox = new TackleBox("Good Tackle Box",1500,8);break;
					case 2:this.tacklebox = new TackleBox("Super Tackle Box",2000,10);break;
					case 3:this.tacklebox = new TackleBox("Master Tackle Box",2500,15);break;
					default:System.out.println("Invalid entry");break;
				}
			}
			
			else if(upgrade == 6) {
				System.out.println("Item			|Price		|Moves");
				System.out.println("Speed Boat		|1500		|+10");
				System.out.println("Sharpedo Boat		|2000		|+15");
				Scanner boat = new Scanner (System.in);
				item = boat.nextInt();
				switch(item) {
					case 1:this.boat = new Boat("Speed Boat",1500,10);
					case 2:this.boat = new Boat("Sharpedo Boat",2000,15);
				default:System.out.println("Invalid entry");break;
				}
			}
			
			else if(upgrade == 7) {
				System.out.println("Item			|Price		|Perk");
				System.out.println("Team Aqua Engine	|1500		|Moves are halfed");
				Scanner engine = new Scanner (System.in);
				item = engine.nextInt();
				switch(item) {
//					case 1:
//					default:System.out.println("Invalid entry");break;
				}
			}
			else {
				System.out.println("Invalid input try again");
				error = 1;
			}
		}while(error == 1);
	}
}
