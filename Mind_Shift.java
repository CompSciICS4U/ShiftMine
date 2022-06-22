package mainShift;

import java.util.Random;

import oppMineShift.Move_Stone;
import oppMineShift.Rotate_Tile;

public class Mind_Shift {

	//Constants
	final static String [] TID_w = {"TID_0_0","TID_0_1",
									"TID_1_0",
									"TID_2_0","TID_2_1","TID_2_2","TID_2_3",
									"TID_3_0","TID_3_1",
									"TID_4_0","TID_4_1","TID_4_2","TID_4_3",
									"TID_6_0","TID_6_1","TID_6_2","TID_6_3",
									"TID_6_0","TID_6_1","TID_6_2","TID_6_3",
									"TID_7_0","TID_7_1","TID_7_2","TID_7_3"};

	final static Integer [][] TID = {{0,0,0,0,0,0,0,0, 0,0,0,0},{1,1,2,2,1,1,2,2, 2,1,2,1},
									 {0,0,0,0,0,0,0,0, 2,1,2,1},
									 {0,0,0,0,0,0,2,2, 0,1,0,1},{1,1,0,0,0,0,0,0, 2,0,2,0},{0,0,2,2,0,0,0,0, 0,1,0,1},{0,0,0,0,1,1,0,0, 2,0,2,0},
									 {0,0,2,2,0,0,2,2, 0,0,0,0},{1,1,0,0,1,1,0,0, 0,0,0,0},
									 {0,0,0,0,1,1,2,2, 0,0,0,0},{1,1,0,0,0,0,2,2, 0,0,0,0},{1,1,2,2,0,0,0,0, 0,0,0,0},{0,0,2,2,1,1,0,0, 0,0,0,0},
									 {0,0,0,0,0,0,0,2, 0,1,2,1},{0,1,0,0,0,0,0,0, 2,0,2,1},{0,0,0,2,0,0,0,0, 2,1,0,1},{0,0,0,0,0,1,0,0, 2,1,2,0},
									 {0,0,2,0,0,0,0,0, 0,1,2,1},{0,0,0,0,1,0,0,0, 2,0,2,1},{0,0,0,0,0,0,2,0, 2,1,0,1},{1,0,0,0,0,0,0,0, 2,1,2,0},
									 {0,0,0,0,1,0,0,2, 0,0,2,1},{0,1,0,0,0,0,2,0, 2,0,0,1},{1,0,0,2,0,0,0,0, 2,1,0,0},{0,0,2,0,0,1,0,0, 0,1,2,0}};

	final static String [][] TM = {{"A1_1","A1_2","A1_3","A1_4"},{"A2_1","A2_2","A2_3","A2_4"},{"A3_1","A3_2","A3_3","A3_4"},
														  {"B2_1","B2_2","B2_3","B2_4"},{"B3_1","B3_2","B3_3","B3_4"},{"B4_1","B4_2","B4_3","B4_4"}};
	
	static String [] F_output1 = {"1","2","3","4","5","6","7","8","9","10","11"};
	
	
	//variables -----------------------------------------
	
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

	static	Integer [] A1_TID = TID[0];//A1
	static	Integer [] A2_TID = TID[0];//A2
	static	Integer [] A3_TID = TID[0];//A3
	static	Integer [] B2_TID = TID[0];//B2
	static	Integer [] B3_TID = TID[0];//B3
	static	Integer [] B4_TID = TID[0];//B4

	static	String [] TID_S = {TID_w[0], //A1
							   TID_w[0], //A2
							   TID_w[0], //A3
							   TID_w[0], //B2
							   TID_w[0], //B3
							   TID_w[0]};//B4
	
	static	String [] P1_SP = {"A1_1","A1_2","A1_3","A1_4"}; //P1 stone positions
	static	String [] P1_SL = {"M","N","W","V"}; 			 //P1 stone Letter

	static	String [] P2_SP = {"B4_1","B4_2","B4_3","B4_4"}; //P2 stone positions
	static	String [] P2_SL = {"B","D","P","Q"}; 			 //P2 stone Letter
	


	
//Start of Mind_Shift
	public static String [] main_Shift(Integer Player_Input, String Input_1, String Input_2) {

		//more variables
			int upperbound = 22;
			int u = 2;
			int B = 0;
			int ran =0;
		
			String stone_Ending_location = "A1_1";
			String Selected_Stone = "a";
			String Tile_to_Rotate_TID = "a"; 
			String Tile_to_Rotate = "a";
			String Rotation_Direction = "a";
			String [][] Rotated_Tile_s = {{"A4_1","A4_2","A4_3","A4_4"},{"B1_1","B1_2","B1_3","B1_4"},{"q","s"}};
			String [][] Mover_output = {{"A4_1","A4_2","A4_3","A4_4"},{"B1_1","B1_2","B1_3","B1_4"},{"q","s"}};

		//calling Currency_Converter class
		Move_Stone Mover = new Move_Stone();
		Rotate_Tile Rotate = new Rotate_Tile();
		Random rand = new Random();
		
		
		
	//
		if (Player_Input == 0) {
	

		//this randomized the starting layout of the board
			rand.nextInt(upperbound);
			while ( B < 6) {
				ran = rand.nextInt(upperbound)+2;
				if (B == 0) {
					A1_TID = TID[ran]; 
					TID_S [0] = TID_w[ran];
				}else if (B == 1) {
					A2_TID = TID[ran]; 
					TID_S [1] = TID_w[ran];
				}else if (B == 2) {
					A3_TID = TID[ran]; 
					TID_S [2] = TID_w[ran];
				}else if (B == 3) {
					B2_TID = TID[ran]; 
					TID_S [3] = TID_w[ran];
				}else if (B == 4) {
					B3_TID = TID[ran]; 
					TID_S [4] = TID_w[ran];
				}else if (B == 5) {
					B4_TID = TID[ran]; 
					TID_S [5] = TID_w[ran];
				}
					
				B++;
			}//end of while loop
		
	//start of tile moving move type
		}else if (Player_Input == 1) {
	
			//this sends the player inputs to the Move_Stone method
				Mover_output = Mover.outerwalls(Input_1, Input_2, P1_SP, P2_SP, TID_S);
				
				
				//this sets the returned values from Move_stone to the P1_SP & P2_SP  variables
				P1_SP[0] = Mover_output [0][0];
				P1_SP[1] = Mover_output [0][1];
				P1_SP[2] = Mover_output [0][2];
				P1_SP[3] = Mover_output [0][3];

				P2_SP[0] = Mover_output [1][0];
				P2_SP[1] = Mover_output [1][1];
				P2_SP[2] = Mover_output [1][2];
				P2_SP[3] = Mover_output [1][3];
				
				
		}else if (Player_Input == 2) {

				//this turns the players input into a more easily used string
					if ((Input_1.equals("A1"))||(Input_1.equals("a1"))){
						Tile_to_Rotate_TID = TID_S[0];
						Tile_to_Rotate = "A1";
					}else if ((Input_1.equals("A2"))||(Input_1.equals("a2"))){
						Tile_to_Rotate_TID = TID_S[1];
						Tile_to_Rotate = "A2";
					}else if ((Input_1.equals("A3"))||(Input_1.equals("a3"))){
						Tile_to_Rotate_TID = TID_S[2];
						Tile_to_Rotate = "A3";
					}else if ((Input_1.equals("B2"))||(Input_1.equals("b2"))){
						Tile_to_Rotate_TID = TID_S[3];
						Tile_to_Rotate = "B2";
					}else if ((Input_1.equals("B3"))||(Input_1.equals("b3"))){
						Tile_to_Rotate_TID = TID_S[4];
						Tile_to_Rotate = "B3";
					}else if ((Input_1.equals("B4"))||(Input_1.equals("b4"))){
						Tile_to_Rotate_TID = TID_S[5];
						Tile_to_Rotate = "B4";
					}else {
						System.out.println("Error [Tile selection]");//this errors if the player put in a non valid tile to rotate
					}//end of else

				//this turns the players input into a more easily used string
					if ((Input_2.equals("CW"))||(Input_2.equals("cw"))||(Input_2.equals("Cw"))||(Input_2.equals("cW"))||(Input_2.equals("CCW"))||(Input_2.equals("Ccw"))
											 ||(Input_2.equals("CCw"))||(Input_2.equals("CcW"))||(Input_2.equals("cCW"))||(Input_2.equals("ccW"))||(Input_2.equals("ccw"))){
					Rotation_Direction = Input_2;

					}else {
						System.out.println("Error [Rotation Direction]");//this errors if the player put in a non valid Rotation Direction
					}//end of else

				//this send the players input to another method that returners the rotated tile id's and stone's location
					Rotated_Tile_s = Rotate.Rotate(Tile_to_Rotate, Tile_to_Rotate_TID, P1_SP, P2_SP, Rotation_Direction);
					

					//this sets the returned values from Rotate_Tile to the P1_SP & P2_SP variables
					P1_SP[0] = Rotated_Tile_s[0][0];
					P1_SP[1] = Rotated_Tile_s[0][1];
					P1_SP[2] = Rotated_Tile_s[0][2];
					P1_SP[3] = Rotated_Tile_s[0][3];
					
					P2_SP[0] = Rotated_Tile_s[1][0];
					P2_SP[1] = Rotated_Tile_s[1][1];
					P2_SP[2] = Rotated_Tile_s[1][2];
					P2_SP[3] = Rotated_Tile_s[1][3];
					
					
			//this sets the returned values from Rotate_Tile to the appropriate _TID (A1_TID) & TID_S
				while ( u < 24) {
					if (Tile_to_Rotate == "A1"){
						if	(Rotated_Tile_s[2][0] == TID_w[u]){
							A1_TID = TID[u]; 
							TID_S [0] = TID_w[u];
						}//end of if
					}else if (Tile_to_Rotate == "A2"){
						if	(Rotated_Tile_s[2][0] == TID_w[u]){
							A2_TID = TID[u]; 
							TID_S [1] = TID_w[u];
						}//end of if
					}else if (Tile_to_Rotate == "A3"){
						if	(Rotated_Tile_s[2][0] == TID_w[u]){
							A3_TID = TID[u]; 
							TID_S [2] = TID_w[u];
						}//end of if
					}else if (Tile_to_Rotate == "B2"){
						if	(Rotated_Tile_s[2][0] == TID_w[u]){
							B2_TID = TID[u]; 
							TID_S [3] = TID_w[u];
						}//end of if
					}else if (Tile_to_Rotate == "B3"){
						if	(Rotated_Tile_s[2][0] == TID_w[u]){
							B3_TID = TID[u]; 
							TID_S [4] = TID_w[u];
						}//end of if
					}else if (Tile_to_Rotate == "B4"){
						if	(Rotated_Tile_s[2][0] == TID_w[u]){
							B4_TID = TID[u]; 
							TID_S [5] = TID_w[u];
						}//end of if
					}//end of else if
						
					u++;
					}//end of while loop
				
				
				}//end of else if (Player_Input == 2)
				
				
		//this send the tile id's & stone's location to another method that will return them into strings
			TP = TileGenerator(A1_TID,A2_TID,A3_TID,B2_TID,B3_TID,B4_TID);
			SP = StoneGenerator(P1_SP,P1_SL,P2_SP,P2_SL);


		//this turne's the tile id's and the stones locations into a string to be displayed to the players
			F_output1[0]  = "      1          2          3          4";
			F_output1[1]  = "  +"+TP[0][0]+"+"+TP[0][1]+"+  +"+TP[1][0]+"+"+TP[1][1]+"+  +"+TP[2][0]+"+"+TP[2][1]+"+";
			F_output1[2]  = "  "+TP[0][7]+" "+SP[0][0]+" "+TP[0][8]+" "+SP[0][1]+" "+TP[0][2]+"  "+TP[1][7]+" "+SP[1][0]+" "+TP[1][8]+" "+SP[1][1]+" "+TP[1][2]+"  "+TP[2][7]+" "+SP[2][0]+" "+TP[2][8]+" "+SP[2][1]+" "+TP[2][2]+" ";
			F_output1[3]  = "A +"+TP[0][11]+"+"+TP[0][9]+"+  +"+TP[1][11]+"+"+TP[1][9]+"+  +"+TP[2][11]+"+"+TP[2][9]+"+";
			F_output1[4]  = "  "+TP[0][6]+" "+SP[0][2]+" "+TP[0][10]+" "+SP[0][3]+" "+TP[0][3]+"  "+TP[1][6]+" "+SP[1][2]+" "+TP[1][10]+" "+SP[1][3]+" "+TP[1][3]+"  "+TP[2][6]+" "+SP[2][2]+" "+TP[2][10]+" "+SP[2][3]+" "+TP[2][3]+" ";
			F_output1[5]  = "  +"+TP[0][5]+"+"+TP[0][4]+"+  +"+TP[1][5]+"+"+TP[1][4]+"+  +"+TP[2][5]+"+"+TP[2][4]+"+";
			
			F_output1[6]  = "             +"+TP[3][0]+"+"+TP[3][1]+"+  +"+TP[4][0]+"+"+TP[4][1]+"+  +"+TP[5][0]+"+"+TP[5][1]+"+";
			F_output1[7]  = "             "+TP[3][7]+" "+SP[3][0]+" "+TP[3][8]+" "+SP[3][1]+" "+TP[3][2]+"  "+TP[4][7]+" "+SP[4][0]+" "+TP[4][8]+" "+SP[4][1]+" "+TP[4][2]+"  "+TP[5][7]+" "+SP[5][0]+" "+TP[5][8]+" "+SP[5][1]+" "+TP[5][2]+"";
			F_output1[8]  = "B            +"+TP[3][11]+"+"+TP[3][9]+"+  +"+TP[4][11]+"+"+TP[4][9]+"+  +"+TP[5][11]+"+"+TP[5][9]+"+";
			F_output1[9]  = "             "+TP[3][6]+" "+SP[3][2]+" "+TP[3][10]+" "+SP[3][3]+" "+TP[3][3]+"  "+TP[4][6]+" "+SP[4][2]+" "+TP[4][10]+" "+SP[4][3]+" "+TP[4][3]+"  "+TP[5][6]+" "+SP[5][2]+" "+TP[5][10]+" "+SP[5][3]+" "+TP[5][3]+"";
			F_output1[10] = "             +"+TP[3][5]+"+"+TP[3][4]+"+  +"+TP[4][5]+"+"+TP[4][4]+"+  +"+TP[5][5]+"+"+TP[5][4]+"+";
					
				
			//this active's game over when a player wins
				if ((P1_SP[0].contains("B4"))&&(P1_SP[1].contains("B4"))&&(P1_SP[2].contains("B4"))&&(P1_SP[3].contains("B4"))) {
					GameOver.EndScreen();
					
				}else if ((P2_SP[0].contains("A1"))&&(P2_SP[1].contains("A1"))&&(P2_SP[2].contains("A1"))&&(P2_SP[3].contains("A1"))) {
					GameOver.EndScreen();
					
				}//end of else if
				
				
				//this returners F_output1 to FrmMineShift
				return F_output1;	
}
	
	
	
	
	
public static String[][] TileGenerator(Integer [] A1_TID, Integer [] A2_TID, Integer [] A3_TID, Integer [] B2_TID, Integer [] B3_TID, Integer [] B4_TID) {
		//variable
		String [][] TP = {{"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "},//A1
						  {"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "},//A2
						  {"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "},//A3
						  {"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "},//B2
						  {"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "},//B3
						  {"   ","   "," "," ","   ","   "," "," "," ","   "," ","   "}};//B4
		
		//this turns the inputed tile id's into usable strings
				 //tile Generation ----------------------------------------------------------
			// Generating tiles for A1
			for (int x=0; x<12;x++) {
				if (A1_TID[x]==1) {
					TP[0][x]= "---";
				}else if (A1_TID[x]==2) {
					TP[0][x]= "|";
				}//end of else if
			}//end of for loop
			// Generating tiles for A2
			for (int x=0; x<12;x++) {
				if (A2_TID[x]==1) {
					TP[1][x]= "---";
				}else if (A2_TID[x]==2) {
					TP[1][x]= "|";
				}//end of else if
			}//end of for loop
			// Generating tiles for A3
			for (int x=0; x<12;x++) {
				if (A3_TID[x]==1) {
					TP[2][x]= "---";
				}else if (A3_TID[x]==2) {
					TP[2][x]= "|";
				}//end of else if
			}//end of for loop
			// Generating tiles for B2
			for (int x=0; x<12;x++) {
				if (B2_TID[x]==1) {
					TP[3][x]= "---";
				}else if (B2_TID[x]==2) {
					TP[3][x]= "|";
				}//end of else if	
			}//end of for loop
			// Generating tiles for B3
			for (int x=0; x<12;x++) {
				if (B3_TID[x]==1) {
					TP[4][x]= "---";
				}else if (B3_TID[x]==2) {
					TP[4][x]= "|";
				}//end of else if	
			}//end of for loop
			// Generating tiles for B4
			for (int x=0; x<12;x++) {
				if (B4_TID[x]==1) {
					TP[5][x]= "---";
				}else if (B4_TID[x]==2) {
					TP[5][x]= "|";
				}//end of else if	
			}//end of tiles -----------------------------------------------
			
			//this return them
		return TP;
		
	}//end of TileGenerator
	

public static String[][] StoneGenerator(String [] P1_SP, String [] P1_SL, String [] P2_SP, String [] P2_SL) {

	//variable
		String [][] SP = {{" "," "," "," "},{" "," "," "," "},{" "," "," "," "},
				{" "," "," "," "},{" "," "," "," "},{" "," "," "," "}};
		
		//this turns the inputed stones location into usable strings
		//Stone generation -----------------------------------------------
				// stone position for P1
					for (int x=0; x<6;x++) {
						for (int y=0; y<4;y++) {
							if (TM[x][y]==P1_SP[0]) {
								SP[x][y]=P1_SL[0];
								
							}if (TM[x][y]==P1_SP[1]) {
								SP[x][y]=P1_SL[1];
								
							}if (TM[x][y]==P1_SP[2]) {
								SP[x][y]=P1_SL[2];
								
							}if (TM[x][y]==P1_SP[3]) {
								SP[x][y]=P1_SL[3];
							}//end of if
						}//end of the second for loop
					}//end of the first for loop
					
					// stone position for P2
					for (int x=0; x<6;x++) {
						for (int y=0; y<4;y++) {
							if (TM[x][y]==P2_SP[0]) {
								SP[x][y]=P2_SL[0];
								
							}if (TM[x][y]==P2_SP[1]) {
								SP[x][y]=P2_SL[1];
							
							}if (TM[x][y]==P2_SP[2]) {
								SP[x][y]=P2_SL[2];
											
							}if (TM[x][y]==P2_SP[3]) {
								SP[x][y]=P2_SL[3];
							}//end of if
						}//end of the second for loop
					}//end of the first for loop
		
		//this return them		
		return SP;
		
	}//end of StoneGenerator

}
