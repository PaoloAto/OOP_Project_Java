import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class game {
private int ndays;
private Locale locale;
private Player player;
private GUI gui;
private int nTackleCasts;
private int nBoatMoves;
private int nTacklCast;
private ArrayList <String> finished;
private int port;

	
	public game(Locale locale,Player player) {

		
		this.locale = locale;
		this.player = player;
		player.setLocation(locale.getSpawn());
		player.setMoney();
		nTackleCasts = locale.getTackleBoxCasts();
		nBoatMoves = locale.getBoatMoves();
		port = nBoatMoves;
		finished = new ArrayList();
	
		
	}

	public void welcome (Player player) {
		System.out.println("Welcome Player: " + player.getsName() + "\n");
	}
	
	public void menu(Locale locale,Player player)
	{
	
		int row,col,i=0,x=0;
		int random,port;
		int nTackleCasts,nBoatMoves,fame,reduce,newFame,error=0;
		ArrayList <String> finished = new ArrayList();
		char cMoves,change;
		int move [] = new int [2];
		String loc;
		gui.setDay(this.getNdays());
		gui.setBoatName(locale.getBoat().getsName());
		gui.setTackleName(locale.getTacklebox().getsName());
		gui.setLocation(player.getRow(), player.getColumn());
		gui.CurrTile(locale.getLocation(player.getRow(), player.getColumn()));
		
	}
	
	public int getNdays() {
		return ndays;
	}
	
	public void setGUI(GUI gui) {
		this.gui = gui;
	}
	
	public void updateMap() {
		gui.GridUpdate(locale.getMap());
	}
	
	public Locale getLocale () {
		return this.locale;
	}
	public void movePlayer(char input) {
		
		if(input == 'W' || input == 'w') {
			if(nTackleCasts > 0 && nBoatMoves > 0) {	
				if(locale.getLocation(player.getRow()-1,player.getColumn()) != 'U') { //up
					player.playerMove(input);
					gui.resetView();
					gui.movePlayer(player.getRow(),player.getColumn());
					gui.removeSprite(player.getRow()-1,player.getColumn());
					gui.setLocation(player.getRow(), player.getColumn());
					gui.CurrTile(locale.getLocation(player.getRow(), player.getColumn()));
					nBoatMoves--;	
					gui.setBoat(this.nBoatMoves);
				}
			}
			else {
				this.port();	
			}
		}
		if(input == 'A' || input == 'a') {
			if(nTackleCasts > 0 && nBoatMoves > 0) {
				if(locale.getLocation(player.getRow(),player.getColumn()-1) != 'U') { //left
					player.playerMove(input);
					gui.resetView();
					gui.movePlayer(player.getRow(),player.getColumn());
					gui.removeSprite(player.getRow(),player.getColumn()+1);
					gui.setLocation(player.getRow(), player.getColumn());
					gui.CurrTile(locale.getLocation(player.getRow(), player.getColumn()));
					nBoatMoves--;	
					gui.setBoat(this.nBoatMoves);
				}
			}
			else {
				this.port();
			}

		}
		if(input == 'S' || input == 's') {
			if(nTackleCasts > 0 && nBoatMoves >0) {
				if(locale.getLocation(player.getRow()+1,player.getColumn()) != 'U') { //down
					player.playerMove(input);
					gui.resetView();
					gui.movePlayer(player.getRow(),player.getColumn());
					gui.removeSprite(player.getRow()-1,player.getColumn());
					gui.setLocation(player.getRow(), player.getColumn());
					gui.CurrTile(locale.getLocation(player.getRow(), player.getColumn()));
					nBoatMoves--;	
					gui.setBoat(this.nBoatMoves);
				}
			}
			else {
				this.port();
			}
		}
		if(input == 'D' || input == 'd' ) {
			if(nTackleCasts > 0 && nBoatMoves >0) {
				if(locale.getLocation(player.getRow(),player.getColumn()+1) != 'U') { //right
					player.playerMove(input);
					gui.resetView();
					gui.movePlayer(player.getRow(),player.getColumn());
					gui.removeSprite(player.getRow(),player.getColumn()-1);
					gui.setLocation(player.getRow(), player.getColumn());
					gui.CurrTile(locale.getLocation(player.getRow(), player.getColumn()));
					nBoatMoves--;	
					gui.setBoat(this.nBoatMoves);
				}
			}
			else {
				this.port();
			}
		}
	}
	
	public void port() {
	this.setDay(this.getNdays()+1);
	//gui.addDay(this.getNdays());
	gui.setBoat(locale.getBoat().getMoves());
	gui.setTackle(locale.getTacklebox().getnCasts());
	nTackleCasts = locale.getTacklebox().getnCasts();
	nBoatMoves = locale.getBoat().getMoves();
	gui.resetView();
	gui.fixPLayer(player.getRow(),player.getColumn(), locale.getX(), locale.getY());
	player.setRow(locale.getX());
	player.setColumn(locale.getY());
	}
	
	public void setStream(PrintStream ps) {
		System.setOut(ps);
	}
	
	public void setDay(int ndays) {
		this.ndays = ndays;
	}
	
	public void updateInfo() {
		gui.setDay(this.getNdays());
		gui.setBoat(nBoatMoves);
		gui.setTackle(nTackleCasts);
		gui.setBoatName(locale.getBoat().getsName());
		gui.setTackleName(locale.getTacklebox().getsName());
		gui.setLocation(player.getRow(), player.getColumn());
		gui.CurrTile(locale.getLocation(player.getRow(), player.getColumn()));
		gui.Money(player.getMoney());
		
	}
	
	public void playerFish(char input) {
		int random;
		if(locale.getLocation(player.getRow(), player.getColumn()) == 'T'){
			if(nTackleCasts > 0 ) {
				Random treasure = new Random ();
				random = treasure.nextInt(100);
				if(random  < 25) {
					System.out.println("Treasure has been reeled");
					player.addTreasure(locale.fishTreasure());
					player.addMoney(0);
					
				}
				else {
					System.out.println("Treasure has not been reeled");
				}
				nTackleCasts--;
				gui.setTackle(this.nTackleCasts );
			}
			else {
				this.port();
			}
		}
		else if(locale.getLocation(player.getRow(), player.getColumn()) != 'P' && locale.getLocation(player.getRow(), player.getColumn()) != 'L') {
			if(nTackleCasts > 0 ) {
				Random Capture = new Random ();
			 	Random Encounter = new Random ();	
				Pokemon pokemon = locale.fishPokemon(player.getRow(), player.getColumn(), Capture.nextInt(100), Encounter.nextInt(100)); //gets the pokemon if ecnountered and captured
				if(pokemon != null) {
					System.out.println("Pokemon added to list");
					player.addPokemon(pokemon);
				}
				nTackleCasts--;
				gui.setTackle(this.nTackleCasts);
			}
			else {
				this.port();
			}
		}
		else if(locale.getLocation(player.getRow(), player.getColumn()) == 'L') {
			if(nTackleCasts > 0 ) {
				if(locale.getnFame() >= 100) {
					Random Legendary = new Random ();
					Pokemon pokemon = locale.fishPokemon(player.getRow(), player.getColumn(), Legendary.nextInt(100), 100);//100 since sure encounter
					if(pokemon != null) {
						System.out.println("Rare Pokemon added to list");
						System.out.println(locale.getBadges() + " received");
						player.addPokemon(pokemon);
						player.addBadge(locale.getBadges());
						finished.add(locale.getsLocaleName());
					}
				}
				else {
					System.out.println("Your fame is not 100 yet");
				}
				nTackleCasts--;
				gui.setTackle(this.nTackleCasts);
			}
			else {
				this.port();
			}
		}
	}
	
}
