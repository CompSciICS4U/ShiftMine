package mainShift;

import java.awt.BorderLayout; 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
//import net.miginfocom.swing.MigLayout;
import oppMineShift.Rotate_Tile;

//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.FormSpecs;
//import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;

public class FrmMineShift extends JFrame {

	private JPanel contentPane;
	private JLabel lblMoveLeft;
	
	int count = 4; // Move counter (3 moves per turn)
	int team = 1; // Team Tracker
	int turn = 1; // Total Turn 
	
	boolean Has_Rotated = false; //this is used so plays can't rotate tiles more then once a turn
	int Player_Input = 0; //initialization
	
	ImageIcon icon = new ImageIcon(FrmMineShift.class.getResource("/Kaleb.jpg")); // Image to use
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					FrmMineShift frame = new FrmMineShift();
					frame.setVisible(true);
					
				} 
				catch (Exception e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		});
		
	}
	
	String [] board = {"      1          2          3          4",
			 "  +---+---+  +---+---+  +---+---+",
			 "  |   |   |  |   |   |  |   |   |",
			 "A +---+---+  +---+---+  +---+---+",
			 "  |   |   |  |   |   |  |   |   |",
			 "  +---+---+  +---+---+  +---+---+",
			 "             +---+---+  +---+---+  +---+---+",
			 "             |   |   |  |   |   |  |   |   |",
			 "             +---+---+  +---+---+  +---+---+",
			 "             |   |   |  |   |   |  |   |   |",
			 "             +---+---+  +---+---+  +---+---+"};

	static String [][] TP = {{"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "},//walls for A1
			 				 {"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "},//walls for A2
			 				 {"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "},//walls for A3
			 				 {"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "},//walls for B2
			 				 {"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "},//walls for B3
			 				 {"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "}};//walls for B4

	static String [][] SP = {{" "," "," "," "},//Stones in A1
							 {" "," "," "," "},//Stones in A2
							 {" "," "," "," "},//Stones in A3
							 {" "," "," "," "},//Stones in B2
							 {" "," "," "," "},//Stones in B3
							 {" "," "," "," "}};//Stones in B4
	
	private JTextField txt_Player_Input1;
	private JTextField txt_Player_Input2;
	


	public FrmMineShift() {
		
		setTitle("Mine Shift");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Mine Shift");
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblTitle.setBounds(10, 11, 246, 46);
		contentPane.add(lblTitle);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 67, 430, 240);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(12, 1, 0, 0));
		
		JLabel lbl_1 = new JLabel("      1          2          3          4");
		lbl_1.setFont(new Font("Consolas", Font.PLAIN, 17));
		panel.add(lbl_1);
		
		JLabel lbl_2 = new JLabel("  +   +   +  +   +   +  +   +   +");
		lbl_2.setFont(new Font("Consolas", Font.PLAIN, 17));
		panel.add(lbl_2);
		
		JLabel lbl_3 = new JLabel(" ");
		lbl_3.setFont(new Font("Consolas", Font.PLAIN, 17));
		panel.add(lbl_3);
		
		JLabel lbl_4 = new JLabel("A +   +   +  +   +   +  +   +   +");
		lbl_4.setFont(new Font("Consolas", Font.PLAIN, 17));
		panel.add(lbl_4);
		
		JLabel lbl_5 = new JLabel(" ");
		lbl_5.setFont(new Font("Consolas", Font.PLAIN, 17));
		panel.add(lbl_5);
		
		JLabel lbl_6 = new JLabel("  +   +   +  +   +   +  +   +   +");
		lbl_6.setFont(new Font("Consolas", Font.PLAIN, 17));
		panel.add(lbl_6);
		
		JLabel lbl_7 = new JLabel("             +   +   +  +   +   +  +   +   +");
		lbl_7.setFont(new Font("Consolas", Font.PLAIN, 17));
		panel.add(lbl_7);
		
		JLabel lbl_8 = new JLabel(" ");
		lbl_8.setFont(new Font("Consolas", Font.PLAIN, 17));
		panel.add(lbl_8);
		
		JLabel lbl_9 = new JLabel("B            +   +   +  +   +   +  +   +   +");
		lbl_9.setFont(new Font("Consolas", Font.PLAIN, 17));
		panel.add(lbl_9);
		
		JLabel lbl_10 = new JLabel(" ");
		lbl_10.setFont(new Font("Consolas", Font.PLAIN, 17));
		panel.add(lbl_10);
		
		JLabel lbl_11 = new JLabel("             +   +   +  +   +   +  +   +   +");
		lbl_11.setFont(new Font("Consolas", Font.PLAIN, 17));
		panel.add(lbl_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(610, 373, 150, 147);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(7, 1, 0, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("      1");
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		
		JLabel lblNewLabel_9_1 = new JLabel("  +---+---+");
		panel_1.add(lblNewLabel_9_1);
		lblNewLabel_9_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		
		JLabel lblNewLabel_4_1 = new JLabel("  |[1]|[2]|");
		panel_1.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2_1 = new JLabel("A +---+---+");
		panel_1.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		
		JLabel lblNewLabel_10_1 = new JLabel("  |[3]|[4]|");
		panel_1.add(lblNewLabel_10_1);
		lblNewLabel_10_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		
		JLabel lblNewLabel_6_1 = new JLabel("  +---+---+");
		panel_1.add(lblNewLabel_6_1);
		lblNewLabel_6_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 317, 590, 236);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(new GridLayout(8, 1, 0, 0));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Rules");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("1. Player 1 Controls M, N, W, V & PLayer 2 Controls B, D, Q, P");
		lblNewLabel_9_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1_1.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("2. First press Play, then pick either \"Move a letter\" or \"Rotate a Tile\"");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("3. each player has 3 moves per turn & Letters can only move one space");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("4. Letter can't overlap, or jump over each other [didn't have time to do]");
		lblNewLabel_10_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1_1.add(lblNewLabel_10_1_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("5. the player how get all there letter to the opposing players starting ");
		lblNewLabel_6_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1_1.add(lblNewLabel_6_1_1_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("location wins.");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1_1.add(lblNewLabel_6_1_1);
		
		JLabel lbl_Input_1_ex = new JLabel(" N");
		lbl_Input_1_ex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Input_1_ex.setBounds(610, 191, 150, 30);
		contentPane.add(lbl_Input_1_ex);
		
		JLabel lbl_Input_2_ex = new JLabel(" A2_1 or B3_4");
		lbl_Input_2_ex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Input_2_ex.setBounds(610, 260, 150, 30);
		contentPane.add(lbl_Input_2_ex);
		
		// Tracking how many moves left
		lblMoveLeft = new JLabel("Move Left: 3");
		lblMoveLeft.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoveLeft.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMoveLeft.setBounds(610, 26, 150, 33);
		contentPane.add(lblMoveLeft);
		
		// Tracking whose turn it is 
		JLabel lblTurn = new JLabel("Turn: Team 1"); // Team # (total # of turn)
		lblTurn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTurn.setBounds(450, 26, 163, 33);
		contentPane.add(lblTurn);
		
			txt_Player_Input1 = new JTextField();
			txt_Player_Input1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_Player_Input1.setBounds(450, 191, 150, 30);
		contentPane.add(txt_Player_Input1);
		txt_Player_Input1.setColumns(10);
		
		txt_Player_Input2 = new JTextField();
		txt_Player_Input2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_Player_Input2.setColumns(10);
		txt_Player_Input2.setBounds(450, 260, 150, 30);
		contentPane.add(txt_Player_Input2);
		
		JLabel lbl_Input_1 = new JLabel("What letter would you like to move?");
		lbl_Input_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Input_1.setBounds(450, 161, 310, 30);
		contentPane.add(lbl_Input_1);
		
		JLabel lbl_Input_2 = new JLabel("Where would you like to move it to?");
		lbl_Input_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Input_2.setBounds(450, 231, 310, 30);
		contentPane.add(lbl_Input_2);
		
		// Turn the Tile - 1 per turn (90 degrees - cw or ccw)
		JButton btn_Rotate_Tile = new JButton("Rotate a Tile");
		btn_Rotate_Tile.setEnabled(false);
		btn_Rotate_Tile.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_Rotate_Tile.setBounds(610, 114, 150, 37);
		contentPane.add(btn_Rotate_Tile);
		
		JButton btn_Move = new JButton("Move");
		btn_Move.setEnabled(false);
		btn_Move.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_Move.setBounds(610, 317, 150, 46);
		contentPane.add(btn_Move);
		
		// Move the stone
		JButton btn_Move_Stone = new JButton("Move a letter");
		btn_Move_Stone.setEnabled(false);
		btn_Move_Stone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_Move_Stone.setBounds(450, 114, 150, 37);
		contentPane.add(btn_Move_Stone);
		
		btn_Rotate_Tile.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				
				//sets the text box about what type of input is needed
				lbl_Input_1.setText("What tile would you like to move?");
				lbl_Input_2.setText("Clockwise or counter clockwise?");
				
				//sets hints
				lbl_Input_1_ex.setText(" A2");
				lbl_Input_2_ex.setText(" CW or CCW");
				
				//clears inputs for new selection
				txt_Player_Input1.setText("");
				txt_Player_Input2.setText("");
				
				//sets what type of move the player has picked
				Player_Input = 2;
				
				//this turns off the move type selection buttons so they can't be pressed again
				btn_Move_Stone.setEnabled(false);
				btn_Rotate_Tile.setEnabled(false);

				//this reenables the Move button
				btn_Move.setEnabled(true);
				
				
				for(int i = 0; i < 1; i++) {
					count--; // Total move -1
					lblMoveLeft.setText("Move Left: " + count);
					btn_Rotate_Tile.setEnabled(false); // Once per turn
					Has_Rotated = true;
				}
				
				// Change Turn
				if(count == 0) {
					if(team == 1) { // If team 1's turn is over
						team++; // Change to team 2
						turn++; 
						lblTurn.setText("Turn: Team " + team + " (" + turn + ")");
						btn_Rotate_Tile.setEnabled(true);
						btn_Move_Stone.setEnabled(true);
						count = 3;
						lblMoveLeft.setText("Move Left: " + count);
						Has_Rotated = false;
					}
					else if(team == 2) { // If team 2's turn is over
						team--; // change to team 1
						turn++; 
						lblTurn.setText("Turn: Team " + team + " (" + turn + ")");
						btn_Rotate_Tile.setEnabled(true);
						btn_Move_Stone.setEnabled(true);
						count = 3;
						lblMoveLeft.setText("Move Left: " + count);
						Has_Rotated = false;
					}
				}
			}
		});
		
		btn_Move_Stone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				//sets the text box about what type of input is needed
				lbl_Input_1.setText("What stone would you like to move?");
				lbl_Input_2.setText("Where would you like to move it to?");
				
				//sets hints
				lbl_Input_1_ex.setText(" N");
				lbl_Input_2_ex.setText(" A2_1 or B3_4");

				//clears inputs for new selection
				txt_Player_Input1.setText("");
				txt_Player_Input2.setText("");
				
				//sets what type of move the player has picked
				Player_Input = 1;
				
				//this turns off the move type selection buttons so they can't be pressed again
				btn_Move_Stone.setEnabled(false);
				btn_Rotate_Tile.setEnabled(false);
				
				//this reenables the Move button
				btn_Move.setEnabled(true);
				
				// Combination of Moves - 3 total per turn
				if(count == 1) {  
					for(int i = 0; i < 1; i++) {
						count--;
						lblMoveLeft.setText("Move Left: " + count);
						if(count == 0) {
							btn_Move_Stone.setEnabled(false);
						}
					}
				}
				else if (count == 2) {
					for(int i = 0; i < 1; i++) {
						count--;
						lblMoveLeft.setText("Move Left: " + count);
						if(count == 0) {
							btn_Move_Stone.setEnabled(false);
						}
					}
				}
				else if (count == 3) {
					for(int i = 0; i < 1; i++) {
						count--;
						lblMoveLeft.setText("Move Left: " + count);
						if(count == 0) {
							btn_Move_Stone.setEnabled(false);
						}
					}
				}
				else if (count == 4) {
					for(int i = 0; i < 1; i++) {
						count--;
						lblMoveLeft.setText("Move Left: " + count);
						if(count == 0) {
							btn_Move_Stone.setEnabled(false);
						}
					}
				}
				
				// Change Turn
				if(count == 0) {
					if(team == 1) { // If team 1's turn is over
						team++;
						turn++; 
						lblTurn.setText("Turn: Team " + team + " (" + turn + ")");
						btn_Rotate_Tile.setEnabled(true);
						btn_Move_Stone.setEnabled(true);
						count = 3;
						lblMoveLeft.setText("Move Left: " + count);
					}
					else if(team == 2) { // If team 2's turn is over
						team--;
						turn++; 
						lblTurn.setText("Turn: Team " + team + " (" + turn + ")");
						btn_Rotate_Tile.setEnabled(true);
						btn_Move_Stone.setEnabled(true);
						count = 3;
						lblMoveLeft.setText("Move Left: " + count);
					}
				}
			}
		});
		btn_Move.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//getting plays inputs
				String Player_Input1 = txt_Player_Input1.getText();
				String Player_Input2 = txt_Player_Input2.getText();
				
				//sends those inputs to the Mind_Shift method
				board = Mind_Shift.main_Shift(Player_Input,Player_Input1,Player_Input2);
				
				//this outputs the returned strings from 
				lbl_1.setText(board[0]);
				lbl_2.setText(board[1]);
				lbl_3.setText(board[2]);
				lbl_4.setText(board[3]);
				lbl_5.setText(board[4]);
				lbl_6.setText(board[5]);
				lbl_7.setText(board[6]);
				lbl_8.setText(board[7]);
				lbl_9.setText(board[8]);
				lbl_10.setText(board[9]);
				lbl_11.setText(board[10]);

				//this determines if the player has already rotated a tile once
				if (Has_Rotated == true) {
					btn_Move_Stone.setEnabled(true);
				}else {
					btn_Move_Stone.setEnabled(true);
					btn_Rotate_Tile.setEnabled(true);
				}
				
				//this clears the text inputs and disables the Move button
				txt_Player_Input1.setText("");
				txt_Player_Input2.setText("");
				btn_Move.setEnabled(false);
				
			}
		});
		// Start the Game
		JButton btnPlay = new JButton("Play");
		btnPlay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPlay.setBounds(450, 67, 150, 37);
		contentPane.add(btnPlay);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
			//this button initializes the game when the player presses start	
				
				//this enables both move selection buttons
				btn_Move_Stone.setEnabled(true);
				btn_Rotate_Tile.setEnabled(true);
				
				
				//sends those inputs to the Mind_Shift method
				board = Mind_Shift.main_Shift(0,"a","a");
				
				//this outputs the returned strings from 
				lbl_1.setText(board[0]);
				lbl_2.setText(board[1]);
				lbl_3.setText(board[2]);
				lbl_4.setText(board[3]);
				lbl_5.setText(board[4]);
				lbl_6.setText(board[5]);
				lbl_7.setText(board[6]);
				lbl_8.setText(board[7]);
				lbl_9.setText(board[8]);
				lbl_10.setText(board[9]);
				lbl_11.setText(board[10]);
				
				
				btnPlay.setEnabled(false);
				//JOptionPane.showMessageDialog(null, "mine shift rules", "Mine Shift", JOptionPane.INFORMATION_MESSAGE, icon);
				
			}
			
		});
		
		// Reset the Game
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnReset.setBounds(610, 67, 150, 37);
		contentPane.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				
				count = 3;
				team = 1;
				turn = 1; 
				lblTurn.setText("Turn: Team " + team + " (" + turn + ")");
				lblMoveLeft.setText("Move Left: " + count);
				btn_Rotate_Tile.setEnabled(true);
				btn_Move_Stone.setEnabled(true);
				
			}
			
		});
		
		
	}
}
