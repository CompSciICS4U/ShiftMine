package mineShift;

import javax.swing.JFrame; 
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
player one turn

1 - slide stone
2 - rotate tile
what type of move? 1

1 selected
	What stone would you like to move? M
	Where would you like to move it to? A2_1

2 selected
	What tile would you like to move? A1
	Clockwise of counter clockwise? CW

 */

public class ConfirmDialog {
	
	JFrame j;
	
	 ConfirmDialog() {
		
		j = new JFrame();
		
		String option = JOptionPane.showInputDialog(j, "Choose type of Move (1 - Slide Stone, 2 - Rotate Tile)");

		int optionint = Integer.parseInt(option);
		
		if (optionint == 1) {
			
			String SlideStone = JOptionPane.showInputDialog(j, "Choose Which Stone to Move");
			
		}
		else if (optionint == 2) {
			
			String RotateTile = JOptionPane.showInputDialog(j, "Choose Which Tile to Rotate");
			
		}	
		
	}
	

}
