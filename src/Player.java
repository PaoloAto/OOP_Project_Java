import java.util.ArrayList;

public class Player {
	private String sName;
	private ArrayList <Pokemon> pokemons = new ArrayList <> ();
	private ArrayList<String> badges = new ArrayList<>();
	private ArrayList<Treasure> treasures = new ArrayList<>();
	private ArrayList<Rarepokemon> rarepokemons = new ArrayList<>();
	private float money; //money of the player
	private int [] coordinates = new int [2]; // row[0] and column[1] location of the player
	
	
	public Player (String sName) {
		this.sName = sName;
		this.money = 0;
	}
	
	public String getsName() {
		return sName;
	}
	
	public float getMoney() {
		return money;
	}
	
	public void setMoney() {
		this.money = 0;
	}
	
	public void addMoney(int i) {
		this.money += treasures.get(i).getfPrice();
	}
	
	public void addPokemon (Pokemon pokemon) {
		pokemons.add(pokemon);
	}
	
	public void listPokemon () {
		int i = 0;
		System.out.println("List of Pokemon Caught:\n");
		while(i < pokemons.size()) {
			System.out.println("Pokemon: " + pokemons.get(i).getsName());
			i++;
		}
	}
	
	public void addTreasure (Treasure treasure) {
		treasures.add(treasure);
	}
	
	public void listTreasure () {
		int i = 0;
		System.out.println("List of Treasures Reeled:\n");
		while(i < treasures.size()) {
			System.out.println("Treasure: " + treasures.get(i).getsName());
			i++;
		}
	}
	
	public void addBadge(String badge) {
		badges.add(badge);
	}
	
	public void listBadges() {
		int i = 0;
		System.out.println("List of Badges Collected:\n");
		while(i < badges.size()) {
			System.out.println("Badge: " + badges.get(i));
			i++;
		}
	}
	
	public void setLocation(int coordinates[]){
		this.coordinates[0] = coordinates[0];
		this.coordinates[1] = coordinates[1];
	}
	
	public int getRow(){
		return coordinates[0];
	}
	
	public int getColumn(){
		return coordinates[1];
	}
	
	public void setRow(int coordinates ){
		this.coordinates[0] = coordinates;
	}
	
	public void setColumn(int coordinates){
		this.coordinates[1] = coordinates;
	}
	
	public void playerMove (char input) {
		if(input == 'W' || input == 'w') {
			coordinates[0] -= 1;
		}
		else if(input == 'A' || input == 'a') {
			coordinates[1] -= 1;
		}
		else if(input == 'S' || input == 's') {
			coordinates[0] += 1;
		}
		else if(input == 'D' || input == 'd') {
			coordinates[1] += 1;
		}
	}
	
}
