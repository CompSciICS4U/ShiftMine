package oppMineShift;

public class Move_Stone {
	//constants
		//tile id's				 	//	1 1 2 2 1 1 2 2  2 1 2 1 
									//	0 1 2 3 4 5 6 7  8 9 10 11 
			final Integer [] TID_0_0 = {0,0,0,0,0,0,0,0, 0,0,0,0}; 
			final Integer [] TID_0_1 = {1,1,2,2,1,1,2,2, 2,1,2,1};

			final Integer [] TID_1_0 = {0,0,0,0,0,0,0,0, 2,1,2,1}; 

			final Integer [] TID_2_0 = {0,0,0,0,0,0,2,2, 0,1,0,1};
				final Integer [] TID_2_1 = {1,1,0,0,0,0,0,0, 2,0,2,0}; 
				final Integer [] TID_2_2 = {0,0,2,2,0,0,0,0, 0,1,0,1}; 
				final Integer [] TID_2_3 = {0,0,0,0,1,1,0,0, 2,0,2,0};

			final Integer [] TID_3_0 = {0,0,2,2,0,0,2,2, 0,0,0,0};
				final Integer [] TID_3_1 = {1,1,0,0,1,1,0,0, 0,0,0,0};

			final Integer [] TID_4_0 = {0,0,0,0,1,1,2,2, 0,0,0,0};
				final Integer [] TID_4_1 = {1,1,0,0,0,0,2,2, 0,0,0,0};
				final Integer [] TID_4_2 = {1,1,2,2,0,0,0,0, 0,0,0,0};
				final Integer [] TID_4_3 = {0,0,2,2,1,1,0,0, 0,0,0,0};

			final Integer [] TID_5_0 = {0,0,0,0,0,0,0,2, 0,1,2,1};
				final Integer [] TID_5_1 = {0,1,0,0,0,0,0,0, 2,0,2,1};
				final Integer [] TID_5_2 = {0,0,0,2,0,0,0,0, 2,1,0,1};
				final Integer [] TID_5_3 = {0,0,0,0,0,1,0,0, 2,1,2,0};
			final Integer [] TID_6_0 = {0,0,2,0,0,0,0,0, 0,1,2,1};
				final Integer [] TID_6_1 = {0,0,0,0,1,0,0,0, 2,0,2,1};
				final Integer [] TID_6_2 = {0,0,0,0,0,0,2,0, 2,1,0,1};
				final Integer [] TID_6_3 = {1,0,0,0,0,0,0,0, 2,1,2,0};

			final Integer [] TID_7_0 = {0,0,0,0,1,0,0,2, 0,0,2,1};
				final Integer [] TID_7_1 = {0,1,0,0,0,0,2,0, 2,0,0,1};
				final Integer [] TID_7_2 = {1,0,0,2,0,0,0,0, 2,1,0,0};
				final Integer [] TID_7_3 = {0,0,2,0,0,1,0,0, 0,1,2,0};


	final  String [][] TM = {{"A1_1","A1_2","A1_3","A1_4"},{"A2_1","A2_2","A2_3","A2_4"},{"A3_1","A3_2","A3_3","A3_4"},
														   {"B2_1","B2_2","B2_3","B2_4"},{"B3_1","B3_2","B3_3","B3_4"},{"B4_1","B4_2","B4_3","B4_4"}};

	final  String [] TM1 = {"A1","A2","A3","B2","B3","B4"};
	
	//Start of main method
	public String[][] outerwalls (String Selected_Stone, String stone_Ending_location, String[] P1_SP, String[] P2_SP, String [] TID_S) {
		
				
	//other variables
		System.out.println("Selected_Stone "+Selected_Stone);
		System.out.println("stone_Ending_location "+stone_Ending_location);
		System.out.println("TID_S[0]:"+TID_S[0]+" TID_S[1]:"+TID_S[1]+" TID_S[2]:"+TID_S[2]+" TID_S[3]:"+TID_S[3]+" TID_S[4]:"+TID_S[4]+" TID_S[5]:"+TID_S[5]);
		System.out.println("TID_S[0]:"+TID_S[0]+" TID_S[1]:"+TID_S[1]+" TID_S[2]:"+TID_S[2]+" TID_S[3]:"+TID_S[3]+" TID_S[4]:"+TID_S[4]+" TID_S[5]:"+TID_S[5]);

		String [][] Output = {{"A4_1","A4_2","A4_3","A4_4"},{"B1_1","B1_2","B1_3","B1_4"},{"q"}};

		String ends = stone_Ending_location;
		
		boolean Can_Stone_Move = true;
		boolean Stone_Jump = false;
		boolean Walled = false;
		boolean InnerWalls = false;
		boolean Diagonal = true;
		
		boolean End_OuterWall = false;
		boolean Start_OuterWall = false;
		boolean Start_Can_Move = false;
		boolean End_Can_Move = false;

		int X = 0;
		int Out = 0;
		int K=0;
		int F=0;
		int G=0;
		
		String stone_Starting_location = P1_SP[0];	
		
		Output[0] = P1_SP;
		Output[1] = P2_SP;

		int diff=0;
		int SD =0,ED=0;
		
		Integer [] Now_TID = TID_0_1;
		Integer [] Starting_TID = TID_0_1; 
		Integer [] Ending_TID = TID_0_1; 

	//this turns the inputed letter into a Starting & ending location
		if 		 ((Selected_Stone.equals("M"))||(Selected_Stone.equals("m"))){X = 0;Out = 0; stone_Starting_location = P1_SP[0];
		}else if ((Selected_Stone.equals("N"))||(Selected_Stone.equals("n"))){X = 1;Out = 0; stone_Starting_location = P1_SP[1];
		}else if ((Selected_Stone.equals("W"))||(Selected_Stone.equals("w"))){X = 2;Out = 0; stone_Starting_location = P1_SP[2];
		}else if ((Selected_Stone.equals("V"))||(Selected_Stone.equals("v"))){X = 3;Out = 0; stone_Starting_location = P1_SP[3];
		}
		else if  ((Selected_Stone.equals("B"))||(Selected_Stone.equals("b"))){X = 0;Out = 1; stone_Starting_location = P2_SP[0];
		}else if ((Selected_Stone.equals("D"))||(Selected_Stone.equals("d"))){X = 1;Out = 1; stone_Starting_location = P2_SP[1];
		}else if ((Selected_Stone.equals("P"))||(Selected_Stone.equals("p"))){X = 2;Out = 1; stone_Starting_location = P2_SP[2];
		}else if ((Selected_Stone.equals("Q"))||(Selected_Stone.equals("q"))){X = 3;Out = 1; stone_Starting_location = P2_SP[3];
		}
		
		//this sets the start variable to the determined start location
		String start = stone_Starting_location;
		
		//System.out.println("start2 "+start +" ends2 "+ends);
//----------------------------------------------------------------------------------------
		//this check if the player try's to jump over a tile
	//long Jumping
		if ((start.contains("A1"))&&((ends.contains("A2"))||(ends.contains("A1")))){
			Stone_Jump = true;
		}else if (start.contains("A2")){
			if ((ends.contains("A1"))||(ends.contains("B2"))||(ends.contains("A3"))||(ends.contains("A2"))){
				Stone_Jump = true;
			}
		}else if (start.contains("A3")){
			if ((ends.contains("A2"))||(ends.contains("B3"))||(ends.contains("A3"))){
				Stone_Jump = true;
			}
		}else if (start.contains("B2")){
			if ((ends.contains("A2"))||(ends.contains("B3"))||(ends.contains("B2"))){
				Stone_Jump = true;
			}
		}else if (start.contains("B3")){
			if ((ends.contains("B2"))||(ends.contains("A3"))||(ends.contains("B4"))||(ends.contains("B3"))){
				Stone_Jump = true;
			}
		}else if ((start.contains("B4"))&&((ends.contains("B3"))||(ends.contains("B4")))){
			Stone_Jump = true;
		}
		
//----------------------------------------------------------------------------------------	
		//this checks if the player is moving sole in a single tile
	//inner Walls
		///*
		if ((start.contains("A1"))&&(ends.contains("A1"))){
			K=0;
			InnerWalls = true;
		}else if ((start.contains("A2"))&&(ends.contains("A2"))){
			K=1;
			InnerWalls = true;
		}else if ((start.contains("A3"))&&(ends.contains("A3"))){
			K=2;
			InnerWalls = true;
		}else if ((start.contains("B2"))&&(ends.contains("B2"))){
			K=3;
			InnerWalls = true;
		}else if ((start.contains("B3"))&&(ends.contains("B3"))){
			K=4;
			InnerWalls = true;
		}else if ((start.contains("B4"))&&(ends.contains("B4"))){
			K=5;
			InnerWalls = true;
		}

		//this sets Now_TID to the tile id that the player is moving in
		if (TID_S[K].contains("_1_0")) {
			Now_TID = TID_1_0;			
		}else if (TID_S[K].contains("_2_0")) {
			Now_TID = TID_2_0;			
		}else if (TID_S[K].contains("_2_1")) {
			Now_TID = TID_2_1;			
		}else if (TID_S[K].contains("_2_2")) {
			Now_TID = TID_2_2;			
		}else if (TID_S[K].contains("_2_3")) {
			Now_TID = TID_2_3;	
		}
		else if (TID_S[K].contains("_3_0")) {
			Now_TID = TID_3_0;			
		}else if (TID_S[K].contains("_3_1")) {
			Now_TID = TID_3_1;			
		}
		else if (TID_S[K].contains("_4_0")) {
			Now_TID = TID_4_0;			
		}else if (TID_S[K].contains("_4_1")) {
			Now_TID = TID_4_1;			
		}else if (TID_S[K].contains("_4_2")) {
			Now_TID = TID_4_2;			
		}else if (TID_S[K].contains("_4_3")) {
			Now_TID = TID_4_3;			
		}
		else if (TID_S[K].contains("_5_0")) {
			Now_TID = TID_5_0;			
		}else if (TID_S[K].contains("_5_1")) {
			Now_TID = TID_5_1;			
		}else if (TID_S[K].contains("_5_2")) {
			Now_TID = TID_5_2;			
		}else if (TID_S[K].contains("_5_3")) {
			Now_TID = TID_5_3;			
		}
		else if (TID_S[K].contains("_6_0")) {
			Now_TID = TID_6_0;			
		}else if (TID_S[K].contains("_6_1")) {
			Now_TID = TID_6_1;			
		}else if (TID_S[K].contains("_6_2")) {
			Now_TID = TID_6_2;			
		}else if (TID_S[K].contains("_6_3")) {
			Now_TID = TID_6_3;			
		}
		else if (TID_S[K].contains("_7_0")) {
			Now_TID = TID_7_0;			
		}else if (TID_S[K].contains("_7_1")) {
			Now_TID = TID_7_1;			
		}else if (TID_S[K].contains("_7_2")) {
			Now_TID = TID_7_2;			
		}else if (TID_S[K].contains("_7_3")) {
			Now_TID = TID_7_3;			
		}

		//this checks if the move the player wants to make intersects with a wall
	if (InnerWalls == true) {
		if 		 ((start.contains("_1"))&&(ends.contains("_2"))&&(Now_TID[8] == 0)) {
			Walled = true;
			System.out.println("[w8]");
		}else if ((start.contains("_2"))&&(ends.contains("_4"))&&(Now_TID[9] == 0)) {
			Walled = true;
			System.out.println("[w9] ");
		}else if ((start.contains("_4"))&&(ends.contains("_3"))&&(Now_TID[10] == 0)) {
			Walled = true;
			System.out.println("[w10] ");
		}else if ((start.contains("_3"))&&(ends.contains("_1"))&&(Now_TID[11] == 0)) {
			Walled = true;
			System.out.println("[w11] ");
		}
		else if  ((start.contains("_2"))&&(ends.contains("_1"))&&(Now_TID[8] == 0)) {
			Walled = true;
			System.out.println("[w8]");
		}else if ((start.contains("_4"))&&(ends.contains("_2"))&&(Now_TID[9] == 0)) {
			Walled = true;
			System.out.println("[w9] ");
		}else if ((start.contains("_3"))&&(ends.contains("_4"))&&(Now_TID[10] == 0)) {
			Walled = true;
			System.out.println("[w10] ");
		}else if ((start.contains("_1"))&&(ends.contains("_3"))&&(Now_TID[11] == 0)) {
			Walled = true;
			System.out.println("[w11] ");
		}
	}else {
		Walled = true;
	}
		
//*/
//----------------------------------------------------------------------------------------
	//this checks if the player is trying to move diagonally in a tile
	//diagonal
		if ((start.contains("_1"))&&(ends.contains("_4"))) {
			Diagonal = false;
		}else if ((start.contains("_2"))&&(ends.contains("_3"))) {
			Diagonal = false;
		}else if ((start.contains("_3"))&&(ends.contains("_2"))) {
			Diagonal = false;
		}else if ((start.contains("_4"))&&(ends.contains("_1"))) {
			Diagonal = false;
		}
//----------------------------------------------------------------------------------------
		//outer Walls

		
	//this calculating SD,ED and Diff
		if (start.contains("_1")){
			SD=1;
		}else if (start.contains("_2")){
			SD=2;
		}else if (start.contains("_3")){
			SD=3;
		}else if (start.contains("_4")){
			SD=4;
		}

		if (ends.contains("_1")){
			ED=1;
		}else if (ends.contains("_2")){
			ED=2;
		}else if (ends.contains("_3")){
			ED=3;
		}else if (ends.contains("_4")){
			ED=4;
		}
		
		diff = SD-ED;
		
//stone moving stuff (outerwalls)
		
		//this determines if the player is trying to move between tiles
	if (InnerWalls == false){
		if 		 (start.contains("A1")){G=0;Start_OuterWall = true;
		}else if (start.contains("A2")){G=1;Start_OuterWall = true;
		}else if (start.contains("A3")){G=2;Start_OuterWall = true;
		}else if (start.contains("B2")){G=3;Start_OuterWall = true;
		}else if (start.contains("B3")){G=4;Start_OuterWall = true;
		}else if (start.contains("B4")){F=5;Start_OuterWall = true;
		}
		if 		 (ends.contains("A1")){F=0;End_OuterWall = true;
		}else if (ends.contains("A2")){F=1;End_OuterWall = true;
		}else if (ends.contains("A3")){F=2;End_OuterWall = true;
		}else if (ends.contains("B2")){F=3;End_OuterWall = true;
		}else if (ends.contains("B3")){F=4;End_OuterWall = true;
		}else if (ends.contains("B4")){F=5;End_OuterWall = true;
		}

}else {
	Start_Can_Move = true;
	End_Can_Move = true;
}

		
	//for start location
	if (Start_OuterWall == true){
		
	//this sets the Starting_TID to the correct tile id
		if (TID_S[G].equals("TID_2_0")) {Starting_TID = TID_2_0;			
		}else if (TID_S[G].equals("TID_2_1")) {Starting_TID = TID_2_1;			
		}else if (TID_S[G].equals("TID_2_2")) {Starting_TID = TID_2_2;			
		}else if (TID_S[G].equals("TID_2_3")) {Starting_TID = TID_2_3;	
		}
		else if (TID_S[G].equals("TID_3_0")) {Starting_TID = TID_3_0;			
		}else if (TID_S[G].equals("TID_3_1")) {Starting_TID = TID_3_1;			
		}
		else if (TID_S[G].equals("TID_4_0")) {Starting_TID = TID_4_0;			
		}else if (TID_S[G].equals("TID_4_1")) {Starting_TID = TID_4_1;			
		}else if (TID_S[G].equals("TID_4_2")) {Starting_TID = TID_4_2;			
		}else if (TID_S[G].equals("TID_4_3")) {Starting_TID = TID_4_3;			
		}
		else if (TID_S[G].equals("TID_5_0")) {Starting_TID = TID_5_0;			
		}else if (TID_S[G].equals("TID_5_1")) {Starting_TID = TID_5_1;			
		}else if (TID_S[G].equals("TID_5_2")) {Starting_TID = TID_5_2;			
		}else if (TID_S[G].equals("TID_5_3")) {Starting_TID = TID_5_3;			
		}
		else if (TID_S[G].equals("TID_6_0")) {Starting_TID = TID_6_0;			
		}else if (TID_S[G].equals("TID_6_1")) {Starting_TID = TID_6_1;			
		}else if (TID_S[G].equals("TID_6_2")) {Starting_TID = TID_6_2;			
		}else if (TID_S[G].equals("TID_6_3")) {Starting_TID = TID_6_3;			
		}
		else if (TID_S[G].equals("TID_7_0")) {Starting_TID = TID_7_0;			
		}else if (TID_S[G].equals("TID_7_1")) {Starting_TID = TID_7_1;			
		}else if (TID_S[G].equals("TID_7_2")) {Starting_TID = TID_7_2;			
		}else if (TID_S[G].equals("TID_7_3")) {Starting_TID = TID_7_3;			
		}
		
		//this checks if there is a wall in the path of the players move (only checks walls for the starting location tile)
			if (((start.contains("_1"))&&(diff==-2))&&(Starting_TID[0] == 0)){Start_Can_Move = true;
			}else if (((start.contains("_2"))&&(diff==-2))&&(Starting_TID[1] == 0)){Start_Can_Move = true;
			}else if (((start.contains("_2"))&&(diff==1))&&(Starting_TID[2] == 0)){Start_Can_Move = true;
			}else if (((start.contains("_4"))&&(diff==1))&&(Starting_TID[3] == 0)){Start_Can_Move = true;
			}else if (((start.contains("_4"))&&(diff==2))&&(Starting_TID[4] == 0)){Start_Can_Move = true;
			}else if (((start.contains("_3"))&&(diff==2))&&(Starting_TID[5] == 0)){Start_Can_Move = true;
			}else if (((start.contains("_3"))&&(diff==-1))&&(Starting_TID[6] == 0)){Start_Can_Move = true;
			}else if (((start.contains("_1"))&&(diff==-1))&&(Starting_TID[7] == 0)){Start_Can_Move = true;
			}
		}

	//for end location
	if (End_OuterWall == true){
		
		//this sets the Ending_TID to the correct tile id
		if (TID_S[F].equals("TID_2_0")) {Ending_TID = TID_2_0;			
		}else if (TID_S[F].equals("TID_2_1")) {Ending_TID = TID_2_2;			
		}else if (TID_S[F].equals("TID_2_2")) {Ending_TID = TID_2_2;			
		}else if (TID_S[F].equals("TID_2_3")) {Ending_TID = TID_2_3;	
		}
		else if (TID_S[F].equals("TID_3_0")) {Ending_TID = TID_3_0;			
		}else if (TID_S[F].equals("TID_3_1")) {Ending_TID = TID_3_1;			
		}
		else if (TID_S[F].equals("TID_4_0")) {Ending_TID = TID_4_0;			
		}else if (TID_S[F].equals("TID_4_1")) {Ending_TID = TID_4_1;			
		}else if (TID_S[F].equals("TID_4_2")) {Ending_TID = TID_4_2;			
		}else if (TID_S[F].equals("TID_4_3")) {Ending_TID = TID_4_3;			
		}
		else if (TID_S[F].equals("TID_5_0")) {Ending_TID = TID_5_0;			
		}else if (TID_S[F].equals("TID_5_1")) {Ending_TID = TID_5_1;			
		}else if (TID_S[F].equals("TID_5_2")) {Ending_TID = TID_5_2;			
		}else if (TID_S[F].equals("TID_5_3")) {Ending_TID = TID_5_3;			
		}
		else if (TID_S[F].equals("TID_6_0")) {Ending_TID = TID_6_0;			
		}else if (TID_S[F].equals("TID_6_1")) {Ending_TID = TID_6_1;			
		}else if (TID_S[F].equals("TID_6_2")) {Ending_TID = TID_6_2;			
		}else if (TID_S[F].equals("TID_6_3")) {Ending_TID = TID_6_3;			
		}
		else if (TID_S[F].equals("TID_7_0")) {Ending_TID = TID_7_0;			
		}else if (TID_S[F].equals("TID_7_1")) {Ending_TID = TID_7_1;			
		}else if (TID_S[F].equals("TID_7_2")) {Ending_TID = TID_7_2;			
		}else if (TID_S[F].equals("TID_7_3")) {Ending_TID = TID_7_3;			
		}
		
		//this checks if there is a wall in the path of the players move (only checks walls for the destination location tile)
			if (((ends.contains("_1"))&&(diff==2))&&(Ending_TID[0] == 0)){End_Can_Move = true;
			}else if (((ends.contains("_2"))&&(diff==2))&&(Ending_TID[1] == 0)){End_Can_Move = true;
			}else if (((ends.contains("_2"))&&(diff==-1))&&(Ending_TID[2] == 0)){End_Can_Move = true;
			}else if (((ends.contains("_4"))&&(diff==-1))&&(Ending_TID[3] == 0)){End_Can_Move = true;
			}else if (((ends.contains("_4"))&&(diff==-2))&&(Ending_TID[4] == 0)){End_Can_Move = true;
			}else if (((ends.contains("_3"))&&(diff==-2))&&(Ending_TID[5] == 0)){End_Can_Move = true;
			}else if (((ends.contains("_3"))&&(diff==1))&&(Ending_TID[6] == 0)){End_Can_Move = true;
			}else if (((ends.contains("_1"))&&(diff==1))&&(Ending_TID[7] == 0)){End_Can_Move = true;
		}
	}
		
//----------------------------------------------------------------------------------------
	//all of these output Error [type of Error] and prevents the player from moving
		//outer walls
		if (Start_Can_Move == false){
			Can_Stone_Move = false;
			System.out.println("Error [Outer walls Start_move]");
		}
		//outer walls
		if (End_Can_Move == false){
			Can_Stone_Move = false;
			System.out.println("Error [Outer walls End_move]");
		}

		//Diagonal
		if (Diagonal == false){
			Can_Stone_Move = false;
			System.out.println("Error [Diagonal]");
		}

		//inner walls
		if (Walled == false){
			Can_Stone_Move = false;
			System.out.println("Error [Walled]");
		}

		//long Jumping
		if (Stone_Jump == false){
			Can_Stone_Move = false;
			System.out.println("Error [long Jumping]");
		}

		// Stone stacking
		if ((ends.equals(P1_SP[0]))||(ends.equals(P1_SP[1]))||(ends.equals(P1_SP[2]))||(ends.equals(P1_SP[3]))||(ends.equals(P1_SP[3]))){
			Can_Stone_Move = false;
			System.out.println("Error [Stone stacking]");
		}else if ((ends.equals(P2_SP[0]))||(ends.equals(P2_SP[1]))||(ends.equals(P2_SP[2]))||(ends.equals(P2_SP[3]))||(ends.equals(P2_SP[3]))){
				Can_Stone_Move = false;
				System.out.println("Error [Stone stacking]");
		}
		//----------------------------------------------------------------------------------------
	// this sets the new stone positions to the Output variable
		if 		 ((ends.equals(TM[0][0]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[0][0];
		}else if ((ends.equals(TM[0][1]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[0][1];
		}else if ((ends.equals(TM[0][2]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[0][2];
		}else if ((ends.equals(TM[0][3]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[0][3];
		}
		else if  ((ends.equals(TM[1][0]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[1][0];
		}else if ((ends.equals(TM[1][1]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[1][1];
		}else if ((ends.equals(TM[1][2]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[1][2];
		}else if ((ends.equals(TM[1][3]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[1][3];
		}
		else if  ((ends.equals(TM[2][0]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[2][0];
		}else if ((ends.equals(TM[2][1]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[2][1];
		}else if ((ends.equals(TM[2][2]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[2][2];
		}else if ((ends.equals(TM[2][3]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[2][3];
		}
		else if  ((ends.equals(TM[3][0]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[3][0];
		}else if ((ends.equals(TM[3][1]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[3][1];
		}else if ((ends.equals(TM[3][2]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[3][2];
		}else if ((ends.equals(TM[3][3]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[3][3];
		}
		else if  ((ends.equals(TM[4][0]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[4][0];
		}else if ((ends.equals(TM[4][1]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[4][1];
		}else if ((ends.equals(TM[4][2]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[4][2];
		}else if ((ends.equals(TM[4][3]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[4][3];
		}
		else if  ((ends.equals(TM[5][0]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[5][0];
		}else if ((ends.equals(TM[5][1]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[5][1];
		}else if ((ends.equals(TM[5][2]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[5][2];
		}else if ((ends.equals(TM[5][3]))&&(Can_Stone_Move == true)){Output[Out][X] = TM[5][3];
		}
		
		
		
		
		
		//this returners the output to Mind_Shift
		return Output;
		
	}
	
	
}
