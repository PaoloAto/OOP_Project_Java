import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import net.codejava.swing.CustomOutputStream;
import java.awt.TextArea;

public class GUI {

	private game Game;
	private JFrame frame;
	private JPanel grid[][] = new JPanel[11][11];
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6; 
	private JLabel label_1;
	private PrintStream printstream;
	private JLabel Day;
	private JLabel TackleCount;
	private JLabel TackleName;
	private JLabel BoatMoves;
	private JLabel BoatName; 
	private JLabel PlayerLocation;
	private JLabel CurrTile;
	private JLabel Money;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JLabel Fame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					Locale locale = new Locale("Lake of Rage");
					Player player = new Player("Paolo");
					game Game = new game (locale,player);
					window.setGame(Game);
					Game.setGUI(window);
					Game.updateMap();
					window.initPlayer();
					Game.updateInfo();
					Game.setStream(window.getStream());
					
//					Locale.initializeMap();	
//					Game.welcome(player);
//					Game.menu(locale,player);
		//			window.grid();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		panel_2 = new JPanel();
		
		panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
									.addGap(322))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1081, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(56)
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(112)
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(225)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1301, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 1494, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 676, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(17)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		
		Day = new JLabel("New label");
		
		TackleCount = new JLabel("New label");
		
		TackleName = new JLabel("New label");
		
		BoatMoves = new JLabel("New label");
		
		BoatName = new JLabel("New label");
		
		PlayerLocation = new JLabel("New label");
		
		CurrTile = new JLabel("New label");
		
		Money = new JLabel("New label");
		
		Fame = new JLabel("New label");
		
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(32)
					.addComponent(Day, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TackleCount, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(8)
							.addComponent(TackleName, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)))
					.addGap(12)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(BoatMoves, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
						.addComponent(BoatName, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(PlayerLocation, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(CurrTile, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(Money, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addComponent(Fame, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(28)
							.addComponent(Day, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(BoatMoves, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(BoatName, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(TackleCount, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(TackleName, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addComponent(CurrTile, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addComponent(PlayerLocation, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addComponent(Money, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addComponent(Fame, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel_5.setLayout(gl_panel_5);
		panel_4.setLayout(null);
		
		TextArea textOutput = new TextArea();
		textOutput.setBounds(0, 0, 252, 676);
		panel_4.add(textOutput);
		panel_1.setLayout(new GridLayout(11, 11, 0, 0));
		
		JButton btnNewButton_5 = new JButton("A");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game.movePlayer('A');
			}
		});
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.movePlayer('W');
			}
		});
		
		JButton btnS = new JButton("D");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.movePlayer('D');
			}
		});
		
		JButton btnNewF = new JButton("F");
		btnNewF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.playerFish('F');
			}
		});
		
		JButton btnS_1 = new JButton("S");
		btnS_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game.movePlayer('S');
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnW)
						.addComponent(btnS_1)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(btnNewButton_5)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewF)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnS)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(59)
					.addComponent(btnW)
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewF)
						.addComponent(btnNewButton_5)
						.addComponent(btnS))
					.addGap(18)
					.addComponent(btnS_1)
					.addContainerGap(84, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		panel.setLayout(new GridLayout(0, 5, 0, 0));
		
		btnNewButton = new JButton("LakeOfRage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("UnionCave");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Route119");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("FioresSea");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("MarineCave");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_4);
		
		frame.getContentPane().setLayout(groupLayout);
		
		ImageIcon icon = new ImageIcon(new ImageIcon("resources/player.gif").getImage().getScaledInstance(38, 38, Image.SCALE_DEFAULT));
        label_1 = new JLabel();
        label_1.setIcon(icon);
        
        printstream= new PrintStream(new CustomOutputStream(textOutput));
	}
	
		 public void GridUpdate(char Panel[][]) {
	           panel_1.removeAll();
	            for(int i = 0 ; i < 11 ; i++)
	                for(int j = 0 ; j < 11 ; j++) {
	                  
	                    if (Panel[i][j] == 'S')
	                        this.grid[i][j] = new Shallow();
	                    else if (Panel[i][j] == 'D')
	                        this.grid[i][j] = new Deep();
	                    else if (Panel[i][j] == 'V')
	                        this.grid[i][j] = new VeryDeep();
	                    else if (Panel[i][j] == 'U')
	                        this.grid[i][j] = new OutofBounds();
	                    else if (Panel[i][j] == 'P')
	                        this.grid[i][j] = new Port();
	                    else if (Panel[i][j] == 'L')
	                        this.grid[i][j] = new Rare();
	                    else if (Panel[i][j] == 'T')
	                        this.grid[i][j] = new Treasure();
	       
	                   panel_1.add(this.grid[i][j]);
	                }  
	        }

	
	public void resetView() {
		this.frame.validate();
		this.frame.repaint();
		
	}
		 
	public void removeSprite (int row,int col) {
		grid[row][col].remove(label_1);
	}
	
	public void initPlayer() {
		grid[Game.getLocale().getSpawn()[0]][Game.getLocale().getSpawn()[1]].add(label_1);
	}
	
	public void movePlayer(int row,int col) {
		grid[row][col].add(label_1);
	}
	
	class Deep extends JPanel{

        Image background = new ImageIcon("resources/deep.png").getImage(); 

        public void paintComponent(Graphics g) { 
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
       }
    }
	
	class Shallow extends JPanel{

        Image background = new ImageIcon("resources/shallow.png").getImage(); 

        public void paintComponent(Graphics g) { 
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
       }
    }
	
	class VeryDeep extends JPanel{

        Image background = new ImageIcon("resources/very_deep.png").getImage(); 

        public void paintComponent(Graphics g) { 
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
       }
    }
	
	class OutofBounds extends JPanel{

        Image background = new ImageIcon("resources/Rock.png").getImage(); 

        public void paintComponent(Graphics g) { 
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
       }
    }
	
	class Rare extends JPanel{

        Image background = new ImageIcon("resources/Rare.png").getImage(); 

        public void paintComponent(Graphics g) { 
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
       }
    }
	
	class Treasure extends JPanel{

        Image background = new ImageIcon("resources/Treasure.png").getImage(); 

        public void paintComponent(Graphics g) { 
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
       }
    }
	
	class Port extends JPanel{

        Image background = new ImageIcon("resources/port.png").getImage(); 

        public void paintComponent(Graphics g) { 
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
       }
    }
	
	public void setGame(game Game) {
		this.Game = Game;
	}
	
	 public PrintStream getStream() {
		 return printstream;
	 }
	 
	 public void setDay(int days){
		 Day.setText("Day:" + days);
	 }
	 
	 public void setTackle(int tackle){
		 TackleCount.setText("Casts:" + tackle);
	 }
	 
	 public void setBoat(int moves){
		 BoatMoves.setText("Moves:" + moves);
	 }
	 
	 public void setTackleName(String tName){
		 TackleName.setText("Box Name:" + tName);
	 }
	 
	 public void setBoatName(String bName){
		 BoatName.setText("Box Name:" + bName);
	 }
	 
	 public void setLocation(int locX,int locY){
		 PlayerLocation.setText("Coordinates:" + locX + "," + locY);
	 }
	 
	 public void CurrTile(char tile){
		 CurrTile.setText("Location:" + tile);
	 }
	 
	 public void Money (float money) {
		 Money.setText("Money:" + money);
	 }
	
	 public void fixPLayer(int portX,int portY,int currX,int currY) {
		 this.removeSprite(portX, portY);
		 this.movePlayer(currX,currY);
	 }
	 
	 public void fame(int fame) {
		 Fame.setText("Fame:" + fame);
	 }
	 
	 public void addDay(int day) {
		 
	 }
	 
}

