package oppMineShift;

public class Rotate_Tile {

    public String[][] Rotate (String Tile_to_Rotate, String Tile_to_Rotate_TID, String[] P1_SP, String[] P2_SP, String Rotation_Direction){

    	//variables
		String [][] output = {{"A4_1","A4_2","A4_3","A4_4"},{"B1_1","B1_2","B1_3","B1_4"},{"TID_5_0"}};
    	
    	String [] P1_SP_O = P1_SP;
		String [] P2_SP_O = P2_SP;

		String Rotated_Tile = "TID_0_0";

		String [] tile_L = {"A1","A2","A3","B2","B3","B4"};


//This rotates tile id's  clockwise
if ((Rotation_Direction.equals("CW"))||(Rotation_Direction.equals("cw"))){
	for (int x=0; x < 6; x++){
		if (Tile_to_Rotate == tile_L[x]){
			if 		(Tile_to_Rotate_TID == "TID_2_0"){Rotated_Tile = "TID_2_1";}
			else if (Tile_to_Rotate_TID == "TID_2_1"){Rotated_Tile = "TID_2_2";}
			else if (Tile_to_Rotate_TID == "TID_2_2"){Rotated_Tile = "TID_2_3";}
			else if (Tile_to_Rotate_TID == "TID_2_3"){Rotated_Tile = "TID_2_0";}

			else if (Tile_to_Rotate_TID == "TID_3_0"){Rotated_Tile = "TID_3_1";}
			else if (Tile_to_Rotate_TID == "TID_3_1"){Rotated_Tile = "TID_3_0";}

			else if (Tile_to_Rotate_TID == "TID_4_0"){Rotated_Tile = "TID_4_1";}
			else if (Tile_to_Rotate_TID == "TID_4_1"){Rotated_Tile = "TID_4_2";}
			else if (Tile_to_Rotate_TID == "TID_4_2"){Rotated_Tile = "TID_4_3";}
			else if (Tile_to_Rotate_TID == "TID_4_3"){Rotated_Tile = "TID_4_0";}
			
			else if (Tile_to_Rotate_TID == "TID_5_0"){Rotated_Tile = "TID_5_1";}
			else if (Tile_to_Rotate_TID == "TID_5_1"){Rotated_Tile = "TID_5_2";}
			else if (Tile_to_Rotate_TID == "TID_5_2"){Rotated_Tile = "TID_5_3";}
			else if (Tile_to_Rotate_TID == "TID_5_3"){Rotated_Tile = "TID_5_0";}

			else if (Tile_to_Rotate_TID == "TID_6_0"){Rotated_Tile = "TID_6_1";}
			else if (Tile_to_Rotate_TID == "TID_6_1"){Rotated_Tile = "TID_6_2";}
			else if (Tile_to_Rotate_TID == "TID_6_2"){Rotated_Tile = "TID_6_3";}
			else if (Tile_to_Rotate_TID == "TID_6_3"){Rotated_Tile = "TID_6_0";}

			else if (Tile_to_Rotate_TID == "TID_7_0"){Rotated_Tile = "TID_7_1";}
			else if (Tile_to_Rotate_TID == "TID_7_1"){Rotated_Tile = "TID_7_2";}
			else if (Tile_to_Rotate_TID == "TID_7_2"){Rotated_Tile = "TID_7_3";}
			else if (Tile_to_Rotate_TID == "TID_7_3"){Rotated_Tile = "TID_7_0";}
		}
	}
}
//This rotates tile id's counter clockwise
if ((Rotation_Direction.equals("CCW"))||(Rotation_Direction.equals("ccw"))){
	for (int x=0; x < 6; x++){
		if (Tile_to_Rotate == tile_L[x]){
			if 		(Tile_to_Rotate_TID == "TID_2_0"){Rotated_Tile = "TID_2_3";}
			else if (Tile_to_Rotate_TID == "TID_2_1"){Rotated_Tile = "TID_2_0";}
			else if (Tile_to_Rotate_TID == "TID_2_2"){Rotated_Tile = "TID_2_1";}
			else if (Tile_to_Rotate_TID == "TID_2_3"){Rotated_Tile = "TID_2_2";}
	
			else if (Tile_to_Rotate_TID == "TID_3_0"){Rotated_Tile = "TID_3_1";}
			else if (Tile_to_Rotate_TID == "TID_3_1"){Rotated_Tile = "TID_3_0";}
	
			else if (Tile_to_Rotate_TID == "TID_4_0"){Rotated_Tile = "TID_4_3";}
			else if (Tile_to_Rotate_TID == "TID_4_1"){Rotated_Tile = "TID_4_0";}
			else if (Tile_to_Rotate_TID == "TID_4_2"){Rotated_Tile = "TID_4_1";}
			else if (Tile_to_Rotate_TID == "TID_4_3"){Rotated_Tile = "TID_4_2";}
			
			else if (Tile_to_Rotate_TID == "TID_5_0"){Rotated_Tile = "TID_5_3";}
			else if (Tile_to_Rotate_TID == "TID_5_1"){Rotated_Tile = "TID_5_2";}
			else if (Tile_to_Rotate_TID == "TID_5_2"){Rotated_Tile = "TID_5_1";}
			else if (Tile_to_Rotate_TID == "TID_5_3"){Rotated_Tile = "TID_5_2";}
	
			else if (Tile_to_Rotate_TID == "TID_6_0"){Rotated_Tile = "TID_6_3";}
			else if (Tile_to_Rotate_TID == "TID_6_1"){Rotated_Tile = "TID_6_0";}
			else if (Tile_to_Rotate_TID == "TID_6_2"){Rotated_Tile = "TID_6_1";}
			else if (Tile_to_Rotate_TID == "TID_6_3"){Rotated_Tile = "TID_6_2";}
	
			else if (Tile_to_Rotate_TID == "TID_7_0"){Rotated_Tile = "TID_7_3";}
			else if (Tile_to_Rotate_TID == "TID_7_1"){Rotated_Tile = "TID_7_0";}
			else if (Tile_to_Rotate_TID == "TID_7_2"){Rotated_Tile = "TID_7_1";}
			else if (Tile_to_Rotate_TID == "TID_7_3"){Rotated_Tile = "TID_7_2";}
			}
		}


}

////This rotates the stones clockwise
if ((Rotation_Direction.equals("CW"))||(Rotation_Direction.equals("cw"))){
	if (Tile_to_Rotate == "A1"){
		//M
		if 		(P1_SP [0] == "A1"+"_1"){P1_SP_O[0] = "A1"+"_2";}
		else if (P1_SP [0] == "A1"+"_2"){P1_SP_O[0] = "A1"+"_4";}
		else if (P1_SP [0] == "A1"+"_3"){P1_SP_O[0] = "A1"+"_1";}
		else if (P1_SP [0] == "A1"+"_4"){P1_SP_O[0] = "A1"+"_3";}
		//N
		if 		(P1_SP [1] == "A1"+"_1"){P1_SP_O[1] = "A1"+"_2";}
		else if (P1_SP [1] == "A1"+"_2"){P1_SP_O[1] = "A1"+"_4";}
		else if (P1_SP [1] == "A1"+"_3"){P1_SP_O[1] = "A1"+"_1";}
		else if (P1_SP [1] == "A1"+"_4"){P1_SP_O[1] = "A1"+"_3";}
		//W
		if 		(P1_SP [2] == "A1"+"_1"){P1_SP_O[2] = "A1"+"_2";}
		else if (P1_SP [2] == "A1"+"_2"){P1_SP_O[2] = "A1"+"_4";}
		else if (P1_SP [2] == "A1"+"_3"){P1_SP_O[2] = "A1"+"_1";}
		else if (P1_SP [2] == "A1"+"_4"){P1_SP_O[2] = "A1"+"_3";}
		//V
		if 		(P1_SP [3] == "A1"+"_1"){P1_SP_O[3] = "A1"+"_2";}
		else if (P1_SP [3] == "A1"+"_2"){P1_SP_O[3] = "A1"+"_4";}
		else if (P1_SP [3] == "A1"+"_3"){P1_SP_O[3] = "A1"+"_1";}
		else if (P1_SP [3] == "A1"+"_4"){P1_SP_O[3] = "A1"+"_3";}

		//b
		if 		(P2_SP [0] == "A1"+"_1"){P2_SP_O[0] = "A1"+"_2";}
		else if (P2_SP [0] == "A1"+"_2"){P2_SP_O[0] = "A1"+"_4";}
		else if (P2_SP [0] == "A1"+"_3"){P2_SP_O[0] = "A1"+"_1";}
		else if (P2_SP [0] == "A1"+"_4"){P2_SP_O[0] = "A1"+"_3";}
		//d
		if 		(P2_SP [1] == "A1"+"_1"){P2_SP_O[1] = "A1"+"_2";}
		else if (P2_SP [1] == "A1"+"_2"){P2_SP_O[1] = "A1"+"_4";}
		else if (P2_SP [1] == "A1"+"_3"){P2_SP_O[1] = "A1"+"_1";}
		else if (P2_SP [1] == "A1"+"_4"){P2_SP_O[1] = "A1"+"_3";}
		//p
		if 		(P2_SP [2] == "A1"+"_1"){P2_SP_O[2] = "A1"+"_2";}
		else if (P2_SP [2] == "A1"+"_2"){P2_SP_O[2] = "A1"+"_4";}
		else if (P2_SP [2] == "A1"+"_3"){P2_SP_O[2] = "A1"+"_1";}
		else if (P2_SP [2] == "A1"+"_4"){P2_SP_O[2] = "A1"+"_3";}
		//q
		if 		(P2_SP [3] == "A1"+"_1"){P2_SP_O[3] = "A1"+"_2";}
		else if (P2_SP [3] == "A1"+"_2"){P2_SP_O[3] = "A1"+"_4";}
		else if (P2_SP [3] == "A1"+"_3"){P2_SP_O[3] = "A1"+"_1";}
		else if (P2_SP [3] == "A1"+"_4"){P2_SP_O[3] = "A1"+"_3";}
	}
	else if (Tile_to_Rotate == "A2"){
		//M
		if 		(P1_SP [0] == "A2"+"_1"){P1_SP_O[0] = "A2"+"_2";}
		else if (P1_SP [0] == "A2"+"_2"){P1_SP_O[0] = "A2"+"_4";}
		else if (P1_SP [0] == "A2"+"_3"){P1_SP_O[0] = "A2"+"_1";}
		else if (P1_SP [0] == "A2"+"_4"){P1_SP_O[0] = "A2"+"_3";}
		//N
		if 		(P1_SP [1] == "A2"+"_1"){P1_SP_O[1] = "A2"+"_2";}
		else if (P1_SP [1] == "A2"+"_2"){P1_SP_O[1] = "A2"+"_4";}
		else if (P1_SP [1] == "A2"+"_3"){P1_SP_O[1] = "A2"+"_1";}
		else if (P1_SP [1] == "A2"+"_4"){P1_SP_O[1] = "A2"+"_3";}
		//W
		if 		(P1_SP [2] == "A2"+"_1"){P1_SP_O[2] = "A2"+"_2";}
		else if (P1_SP [2] == "A2"+"_2"){P1_SP_O[2] = "A2"+"_4";}
		else if (P1_SP [2] == "A2"+"_3"){P1_SP_O[2] = "A2"+"_1";}
		else if (P1_SP [2] == "A2"+"_4"){P1_SP_O[2] = "A2"+"_3";}
		//V
		if 		(P1_SP [3] == "A2"+"_1"){P1_SP_O[3] = "A2"+"_2";}
		else if (P1_SP [3] == "A2"+"_2"){P1_SP_O[3] = "A2"+"_4";}
		else if (P1_SP [3] == "A2"+"_3"){P1_SP_O[3] = "A2"+"_1";}
		else if (P1_SP [3] == "A2"+"_4"){P1_SP_O[3] = "A2"+"_3";}

		//b
		if 		(P2_SP [0] == "A2"+"_1"){P2_SP_O[0] = "A2"+"_2";}
		else if (P2_SP [0] == "A2"+"_2"){P2_SP_O[0] = "A2"+"_4";}
		else if (P2_SP [0] == "A2"+"_3"){P2_SP_O[0] = "A2"+"_1";}
		else if (P2_SP [0] == "A2"+"_4"){P2_SP_O[0] = "A2"+"_3";}
		//d
		if 		(P2_SP [1] == "A2"+"_1"){P2_SP_O[1] = "A2"+"_2";}
		else if (P2_SP [1] == "A2"+"_2"){P2_SP_O[1] = "A2"+"_4";}
		else if (P2_SP [1] == "A2"+"_3"){P2_SP_O[1] = "A2"+"_1";}
		else if (P2_SP [1] == "A2"+"_4"){P2_SP_O[1] = "A2"+"_3";}
		//p
		if 		(P2_SP [2] == "A2"+"_1"){P2_SP_O[2] = "A2"+"_2";}
		else if (P2_SP [2] == "A2"+"_2"){P2_SP_O[2] = "A2"+"_4";}
		else if (P2_SP [2] == "A2"+"_3"){P2_SP_O[2] = "A2"+"_1";}
		else if (P2_SP [2] == "A2"+"_4"){P2_SP_O[2] = "A2"+"_3";}
		//q
		if 		(P2_SP [3] == "A2"+"_1"){P2_SP_O[3] = "A2"+"_2";}
		else if (P2_SP [3] == "A2"+"_2"){P2_SP_O[3] = "A2"+"_4";}
		else if (P2_SP [3] == "A2"+"_3"){P2_SP_O[3] = "A2"+"_1";}
		else if (P2_SP [3] == "A2"+"_4"){P2_SP_O[3] = "A2"+"_3";}
	}
	else if (Tile_to_Rotate == "A3"){
		//M
		if 		(P1_SP [0] == "A3"+"_1"){P1_SP_O[0] = "A3"+"_2";}
		else if (P1_SP [0] == "A3"+"_2"){P1_SP_O[0] = "A3"+"_4";}
		else if (P1_SP [0] == "A3"+"_3"){P1_SP_O[0] = "A3"+"_1";}
		else if (P1_SP [0] == "A3"+"_4"){P1_SP_O[0] = "A3"+"_3";}
		//N
		if 		(P1_SP [1] == "A3"+"_1"){P1_SP_O[1] = "A3"+"_2";}
		else if (P1_SP [1] == "A3"+"_2"){P1_SP_O[1] = "A3"+"_4";}
		else if (P1_SP [1] == "A3"+"_3"){P1_SP_O[1] = "A3"+"_1";}
		else if (P1_SP [1] == "A3"+"_4"){P1_SP_O[1] = "A3"+"_3";}
		//W
		if 		(P1_SP [2] == "A3"+"_1"){P1_SP_O[2] = "A3"+"_2";}
		else if (P1_SP [2] == "A3"+"_2"){P1_SP_O[2] = "A3"+"_4";}
		else if (P1_SP [2] == "A3"+"_3"){P1_SP_O[2] = "A3"+"_1";}
		else if (P1_SP [2] == "A3"+"_4"){P1_SP_O[2] = "A3"+"_3";}
		//V
		if 		(P1_SP [3] == "A3"+"_1"){P1_SP_O[3] = "A3"+"_2";}
		else if (P1_SP [3] == "A3"+"_2"){P1_SP_O[3] = "A3"+"_4";}
		else if (P1_SP [3] == "A3"+"_3"){P1_SP_O[3] = "A3"+"_1";}
		else if (P1_SP [3] == "A3"+"_4"){P1_SP_O[3] = "A3"+"_3";}

		//b
		if 		(P2_SP [0] == "A3"+"_1"){P2_SP_O[0] = "A3"+"_2";}
		else if (P2_SP [0] == "A3"+"_2"){P2_SP_O[0] = "A3"+"_4";}
		else if (P2_SP [0] == "A3"+"_3"){P2_SP_O[0] = "A3"+"_1";}
		else if (P2_SP [0] == "A3"+"_4"){P2_SP_O[0] = "A3"+"_3";}
		//d
		if 		(P2_SP [1] == "A3"+"_1"){P2_SP_O[1] = "A3"+"_2";}
		else if (P2_SP [1] == "A3"+"_2"){P2_SP_O[1] = "A3"+"_4";}
		else if (P2_SP [1] == "A3"+"_3"){P2_SP_O[1] = "A3"+"_1";}
		else if (P2_SP [1] == "A3"+"_4"){P2_SP_O[1] = "A3"+"_3";}
		//p
		if 		(P2_SP [2] == "A3"+"_1"){P2_SP_O[2] = "A3"+"_2";}
		else if (P2_SP [2] == "A3"+"_2"){P2_SP_O[2] = "A3"+"_4";}
		else if (P2_SP [2] == "A3"+"_3"){P2_SP_O[2] = "A3"+"_1";}
		else if (P2_SP [2] == "A3"+"_4"){P2_SP_O[2] = "A3"+"_3";}
		//q
		if 		(P2_SP [3] == "A3"+"_1"){P2_SP_O[3] = "A3"+"_2";}
		else if (P2_SP [3] == "A3"+"_2"){P2_SP_O[3] = "A3"+"_4";}
		else if (P2_SP [3] == "A3"+"_3"){P2_SP_O[3] = "A3"+"_1";}
		else if (P2_SP [3] == "A3"+"_4"){P2_SP_O[3] = "A3"+"_3";}
	}
	else if (Tile_to_Rotate == "B2"){
		//M
		if 		(P1_SP [0] == "B2"+"_1"){P1_SP_O[0] = "B2"+"_2";}
		else if (P1_SP [0] == "B2"+"_2"){P1_SP_O[0] = "B2"+"_4";}
		else if (P1_SP [0] == "B2"+"_3"){P1_SP_O[0] = "B2"+"_1";}
		else if (P1_SP [0] == "B2"+"_4"){P1_SP_O[0] = "B2"+"_3";}
		//N
		if 		(P1_SP [1] == "B2"+"_1"){P1_SP_O[1] = "B2"+"_2";}
		else if (P1_SP [1] == "B2"+"_2"){P1_SP_O[1] = "B2"+"_4";}
		else if (P1_SP [1] == "B2"+"_3"){P1_SP_O[1] = "B2"+"_1";}
		else if (P1_SP [1] == "B2"+"_4"){P1_SP_O[1] = "B2"+"_3";}
		//W
		if 		(P1_SP [2] == "B2"+"_1"){P1_SP_O[2] = "B2"+"_2";}
		else if (P1_SP [2] == "B2"+"_2"){P1_SP_O[2] = "B2"+"_4";}
		else if (P1_SP [2] == "B2"+"_3"){P1_SP_O[2] = "B2"+"_1";}
		else if (P1_SP [2] == "B2"+"_4"){P1_SP_O[2] = "B2"+"_3";}
		//V
		if 		(P1_SP [3] == "B2"+"_1"){P1_SP_O[3] = "B2"+"_2";}
		else if (P1_SP [3] == "B2"+"_2"){P1_SP_O[3] = "B2"+"_4";}
		else if (P1_SP [3] == "A3"+"_3"){P1_SP_O[3] = "B2"+"_1";}
		else if (P1_SP [3] == "B2"+"_4"){P1_SP_O[3] = "B2"+"_3";}

		//b
		if 		(P2_SP [0] == "B2"+"_1"){P2_SP_O[0] = "B2"+"_2";}
		else if (P2_SP [0] == "B2"+"_2"){P2_SP_O[0] = "B2"+"_4";}
		else if (P2_SP [0] == "B2"+"_3"){P2_SP_O[0] = "B2"+"_1";}
		else if (P2_SP [0] == "B2"+"_4"){P2_SP_O[0] = "B2"+"_3";}
		//d
		if 		(P2_SP [1] == "B2"+"_1"){P2_SP_O[1] = "B2"+"_2";}
		else if (P2_SP [1] == "B2"+"_2"){P2_SP_O[1] = "B2"+"_4";}
		else if (P2_SP [1] == "B2"+"_3"){P2_SP_O[1] = "B2"+"_1";}
		else if (P2_SP [1] == "B2"+"_4"){P2_SP_O[1] = "B2"+"_3";}
		//p
		if 		(P2_SP [2] == "B2"+"_1"){P2_SP_O[2] = "B2"+"_2";}
		else if (P2_SP [2] == "B2"+"_2"){P2_SP_O[2] = "B2"+"_4";}
		else if (P2_SP [2] == "B2"+"_3"){P2_SP_O[2] = "B2"+"_1";}
		else if (P2_SP [2] == "B2"+"_4"){P2_SP_O[2] = "B2"+"_3";}
		//q
		if 		(P2_SP [3] == "B2"+"_1"){P2_SP_O[3] = "B2"+"_2";}
		else if (P2_SP [3] == "B2"+"_2"){P2_SP_O[3] = "B2"+"_4";}
		else if (P2_SP [3] == "B2"+"_3"){P2_SP_O[3] = "B2"+"_1";}
		else if (P2_SP [3] == "B2"+"_4"){P2_SP_O[3] = "B2"+"_3";}
	}
	else if (Tile_to_Rotate == "B3"){
		//M
		if 		(P1_SP [0] == "B3"+"_1"){P1_SP_O[0] = "B3"+"_2";}
		else if (P1_SP [0] == "B3"+"_2"){P1_SP_O[0] = "B3"+"_4";}
		else if (P1_SP [0] == "B3"+"_3"){P1_SP_O[0] = "B3"+"_1";}
		else if (P1_SP [0] == "B3"+"_4"){P1_SP_O[0] = "B3"+"_3";}
		//N
		if 		(P1_SP [1] == "B3"+"_1"){P1_SP_O[1] = "B3"+"_2";}
		else if (P1_SP [1] == "B3"+"_2"){P1_SP_O[1] = "B3"+"_4";}
		else if (P1_SP [1] == "B3"+"_3"){P1_SP_O[1] = "B3"+"_1";}
		else if (P1_SP [1] == "B3"+"_4"){P1_SP_O[1] = "B3"+"_3";}
		//W
		if 		(P1_SP [2] == "B3"+"_1"){P1_SP_O[2] = "B3"+"_2";}
		else if (P1_SP [2] == "B3"+"_2"){P1_SP_O[2] = "B3"+"_4";}
		else if (P1_SP [2] == "B3"+"_3"){P1_SP_O[2] = "B3"+"_1";}
		else if (P1_SP [2] == "B3"+"_4"){P1_SP_O[2] = "B3"+"_3";}
		//V
		if 		(P1_SP [3] == "B3"+"_1"){P1_SP_O[3] = "B3"+"_2";}
		else if (P1_SP [3] == "B3"+"_2"){P1_SP_O[3] = "B3"+"_4";}
		else if (P1_SP [3] == "A3"+"_3"){P1_SP_O[3] = "B3"+"_1";}
		else if (P1_SP [3] == "B3"+"_4"){P1_SP_O[3] = "B3"+"_3";}

		//b
		if 		(P2_SP [0] == "B3"+"_1"){P2_SP_O[0] = "B3"+"_2";}
		else if (P2_SP [0] == "B3"+"_2"){P2_SP_O[0] = "B3"+"_4";}
		else if (P2_SP [0] == "B3"+"_3"){P2_SP_O[0] = "B3"+"_1";}
		else if (P2_SP [0] == "B3"+"_4"){P2_SP_O[0] = "B3"+"_3";}
		//d
		if 		(P2_SP [1] == "B3"+"_1"){P2_SP_O[1] = "B3"+"_2";}
		else if (P2_SP [1] == "B3"+"_2"){P2_SP_O[1] = "B3"+"_4";}
		else if (P2_SP [1] == "B3"+"_3"){P2_SP_O[1] = "B3"+"_1";}
		else if (P2_SP [1] == "B3"+"_4"){P2_SP_O[1] = "B3"+"_3";}
		//p
		if 		(P2_SP [2] == "B3"+"_1"){P2_SP_O[2] = "B3"+"_2";}
		else if (P2_SP [2] == "B3"+"_2"){P2_SP_O[2] = "B3"+"_4";}
		else if (P2_SP [2] == "B3"+"_3"){P2_SP_O[2] = "B3"+"_1";}
		else if (P2_SP [2] == "B3"+"_4"){P2_SP_O[2] = "B3"+"_3";}
		//q
		if 		(P2_SP [3] == "B3"+"_1"){P2_SP_O[3] = "B3"+"_2";}
		else if (P2_SP [3] == "B3"+"_2"){P2_SP_O[3] = "B3"+"_4";}
		else if (P2_SP [3] == "B3"+"_3"){P2_SP_O[3] = "B3"+"_1";}
		else if (P2_SP [3] == "B3"+"_4"){P2_SP_O[3] = "B3"+"_3";}
	}
	else if (Tile_to_Rotate == "B4"){
		//M
		if 		(P1_SP [0] == "B4"+"_1"){P1_SP_O[0] = "B4"+"_2";}
		else if (P1_SP [0] == "B4"+"_2"){P1_SP_O[0] = "B4"+"_4";}
		else if (P1_SP [0] == "B4"+"_3"){P1_SP_O[0] = "B4"+"_1";}
		else if (P1_SP [0] == "B4"+"_4"){P1_SP_O[0] = "B4"+"_3";}
		//N
		if 		(P1_SP [1] == "B4"+"_1"){P1_SP_O[1] = "B4"+"_2";}
		else if (P1_SP [1] == "B4"+"_2"){P1_SP_O[1] = "B4"+"_4";}
		else if (P1_SP [1] == "B4"+"_3"){P1_SP_O[1] = "B4"+"_1";}
		else if (P1_SP [1] == "B4"+"_4"){P1_SP_O[1] = "B4"+"_3";}
		//W
		if 		(P1_SP [2] == "B4"+"_1"){P1_SP_O[2] = "B4"+"_2";}
		else if (P1_SP [2] == "B4"+"_2"){P1_SP_O[2] = "B4"+"_4";}
		else if (P1_SP [2] == "B4"+"_3"){P1_SP_O[2] = "B4"+"_1";}
		else if (P1_SP [2] == "B4"+"_4"){P1_SP_O[2] = "B4"+"_3";}
		//V
		if 		(P1_SP [3] == "B4"+"_1"){P1_SP_O[3] = "B4"+"_2";}
		else if (P1_SP [3] == "B4"+"_2"){P1_SP_O[3] = "B4"+"_4";}
		else if (P1_SP [3] == "A4"+"_3"){P1_SP_O[3] = "B4"+"_1";}
		else if (P1_SP [3] == "B4"+"_4"){P1_SP_O[3] = "B4"+"_3";}

		//b
		if 		(P2_SP [0] == "B4"+"_1"){P2_SP_O[0] = "B4"+"_2";}
		else if (P2_SP [0] == "B4"+"_2"){P2_SP_O[0] = "B4"+"_4";}
		else if (P2_SP [0] == "B4"+"_3"){P2_SP_O[0] = "B4"+"_1";}
		else if (P2_SP [0] == "B4"+"_4"){P2_SP_O[0] = "B4"+"_3";}
		//d
		if 		(P2_SP [1] == "B4"+"_1"){P2_SP_O[1] = "B4"+"_2";}
		else if (P2_SP [1] == "B4"+"_2"){P2_SP_O[1] = "B4"+"_4";}
		else if (P2_SP [1] == "B4"+"_3"){P2_SP_O[1] = "B4"+"_1";}
		else if (P2_SP [1] == "B4"+"_4"){P2_SP_O[1] = "B4"+"_3";}
		//p
		if 		(P2_SP [2] == "B4"+"_1"){P2_SP_O[2] = "B4"+"_2";}
		else if (P2_SP [2] == "B4"+"_2"){P2_SP_O[2] = "B4"+"_4";}
		else if (P2_SP [2] == "B4"+"_3"){P2_SP_O[2] = "B4"+"_1";}
		else if (P2_SP [2] == "B4"+"_4"){P2_SP_O[2] = "B4"+"_3";}
		//q
		if 		(P2_SP [3] == "B4"+"_1"){P2_SP_O[3] = "B4"+"_2";}
		else if (P2_SP [3] == "B4"+"_2"){P2_SP_O[3] = "B4"+"_4";}
		else if (P2_SP [3] == "B4"+"_3"){P2_SP_O[3] = "B4"+"_1";}
		else if (P2_SP [3] == "B4"+"_4"){P2_SP_O[3] = "B4"+"_3";}
	}
}

//This rotates the stones counter clockwise
if ((Rotation_Direction.equals("CCW"))||(Rotation_Direction.equals("ccw"))){
	if (Tile_to_Rotate == "A1"){
		//M
		if 		(P1_SP [0] == "A1"+"_1"){P1_SP_O[0] = "A1"+"_3";}
		else if (P1_SP [0] == "A1"+"_2"){P1_SP_O[0] = "A1"+"_1";}
		else if (P1_SP [0] == "A1"+"_3"){P1_SP_O[0] = "A1"+"_4";}
		else if (P1_SP [0] == "A1"+"_4"){P1_SP_O[0] = "A1"+"_2";}
		//N
		if 		(P1_SP [1] == "A1"+"_1"){P1_SP_O[1] = "A1"+"_3";}
		else if (P1_SP [1] == "A1"+"_2"){P1_SP_O[1] = "A1"+"_1";}
		else if (P1_SP [1] == "A1"+"_3"){P1_SP_O[1] = "A1"+"_4";}
		else if (P1_SP [1] == "A1"+"_4"){P1_SP_O[1] = "A1"+"_2";}
		//W
		if 		(P1_SP [2] == "A1"+"_1"){P1_SP_O[2] = "A1"+"_3";}
		else if (P1_SP [2] == "A1"+"_2"){P1_SP_O[2] = "A1"+"_1";}
		else if (P1_SP [2] == "A1"+"_3"){P1_SP_O[2] = "A1"+"_4";}
		else if (P1_SP [2] == "A1"+"_4"){P1_SP_O[2] = "A1"+"_2";}
		//V
		if 		(P1_SP [3] == "A1"+"_1"){P1_SP_O[3] = "A1"+"_3";}
		else if (P1_SP [3] == "A1"+"_2"){P1_SP_O[3] = "A1"+"_1";}
		else if (P1_SP [3] == "A1"+"_3"){P1_SP_O[3] = "A1"+"_4";}
		else if (P1_SP [3] == "A1"+"_4"){P1_SP_O[3] = "A1"+"_2";}

		//b
		if 		(P2_SP [0] == "A1"+"_1"){P2_SP_O[0] = "A1"+"_3";}
		else if (P2_SP [0] == "A1"+"_2"){P2_SP_O[0] = "A1"+"_1";}
		else if (P2_SP [0] == "A1"+"_3"){P2_SP_O[0] = "A1"+"_4";}
		else if (P2_SP [0] == "A1"+"_4"){P2_SP_O[0] = "A1"+"_2";}
		//d
		if 		(P2_SP [1] == "A1"+"_1"){P2_SP_O[1] = "A1"+"_3";}
		else if (P2_SP [1] == "A1"+"_2"){P2_SP_O[1] = "A1"+"_1";}
		else if (P2_SP [1] == "A1"+"_3"){P2_SP_O[1] = "A1"+"_4";}
		else if (P2_SP [1] == "A1"+"_4"){P2_SP_O[1] = "A1"+"_2";}
		//p
		if 		(P2_SP [2] == "A1"+"_1"){P2_SP_O[2] = "A1"+"_3";}
		else if (P2_SP [2] == "A1"+"_2"){P2_SP_O[2] = "A1"+"_1";}
		else if (P2_SP [2] == "A1"+"_3"){P2_SP_O[2] = "A1"+"_4";}
		else if (P2_SP [2] == "A1"+"_4"){P2_SP_O[2] = "A1"+"_2";}
		//q
		if 		(P2_SP [3] == "A1"+"_1"){P2_SP_O[3] = "A1"+"_3";}
		else if (P2_SP [3] == "A1"+"_2"){P2_SP_O[3] = "A1"+"_1";}
		else if (P2_SP [3] == "A1"+"_3"){P2_SP_O[3] = "A1"+"_4";}
		else if (P2_SP [3] == "A1"+"_4"){P2_SP_O[3] = "A1"+"_2";}
	}
	else if (Tile_to_Rotate == "A2"){
		//M
		if 		(P1_SP [0] == "A2"+"_1"){P1_SP_O[0] = "A2"+"_3";}
		else if (P1_SP [0] == "A2"+"_2"){P1_SP_O[0] = "A2"+"_1";}
		else if (P1_SP [0] == "A2"+"_3"){P1_SP_O[0] = "A2"+"_4";}
		else if (P1_SP [0] == "A2"+"_4"){P1_SP_O[0] = "A2"+"_2";}
		//N
		if 		(P1_SP [1] == "A2"+"_1"){P1_SP_O[1] = "A2"+"_3";}
		else if (P1_SP [1] == "A2"+"_2"){P1_SP_O[1] = "A2"+"_1";}
		else if (P1_SP [1] == "A2"+"_3"){P1_SP_O[1] = "A2"+"_4";}
		else if (P1_SP [1] == "A2"+"_4"){P1_SP_O[1] = "A2"+"_2";}
		//W
		if 		(P1_SP [2] == "A2"+"_1"){P1_SP_O[2] = "A2"+"_3";}
		else if (P1_SP [2] == "A2"+"_2"){P1_SP_O[2] = "A2"+"_1";}
		else if (P1_SP [2] == "A2"+"_3"){P1_SP_O[2] = "A2"+"_4";}
		else if (P1_SP [2] == "A2"+"_4"){P1_SP_O[2] = "A2"+"_2";}
		//V
		if 		(P1_SP [3] == "A2"+"_1"){P1_SP_O[3] = "A2"+"_3";}
		else if (P1_SP [3] == "A2"+"_2"){P1_SP_O[3] = "A2"+"_1";}
		else if (P1_SP [3] == "A2"+"_3"){P1_SP_O[3] = "A2"+"_4";}
		else if (P1_SP [3] == "A2"+"_4"){P1_SP_O[3] = "A2"+"_2";}

		//b
		if 		(P2_SP [0] == "A2"+"_1"){P2_SP_O[0] = "A2"+"_3";}
		else if (P2_SP [0] == "A2"+"_2"){P2_SP_O[0] = "A2"+"_1";}
		else if (P2_SP [0] == "A2"+"_3"){P2_SP_O[0] = "A2"+"_4";}
		else if (P2_SP [0] == "A2"+"_4"){P2_SP_O[0] = "A2"+"_2";}
		//d
		if 		(P2_SP [1] == "A2"+"_1"){P2_SP_O[1] = "A2"+"_3";}
		else if (P2_SP [1] == "A2"+"_2"){P2_SP_O[1] = "A2"+"_1";}
		else if (P2_SP [1] == "A2"+"_3"){P2_SP_O[1] = "A2"+"_4";}
		else if (P2_SP [1] == "A2"+"_4"){P2_SP_O[1] = "A2"+"_2";}
		//p
		if 		(P2_SP [2] == "A2"+"_1"){P2_SP_O[2] = "A2"+"_3";}
		else if (P2_SP [2] == "A2"+"_2"){P2_SP_O[2] = "A2"+"_1";}
		else if (P2_SP [2] == "A2"+"_3"){P2_SP_O[2] = "A2"+"_4";}
		else if (P2_SP [2] == "A2"+"_4"){P2_SP_O[2] = "A2"+"_2";}
		//q
		if 		(P2_SP [3] == "A2"+"_1"){P2_SP_O[3] = "A2"+"_3";}
		else if (P2_SP [3] == "A2"+"_2"){P2_SP_O[3] = "A2"+"_1";}
		else if (P2_SP [3] == "A2"+"_3"){P2_SP_O[3] = "A2"+"_4";}
		else if (P2_SP [3] == "A2"+"_4"){P2_SP_O[3] = "A2"+"_2";}
	}
	else if (Tile_to_Rotate == "A3"){
		//M
		if 		(P1_SP [0] == "A3"+"_1"){P1_SP_O[0] = "A3"+"_3";}
		else if (P1_SP [0] == "A3"+"_2"){P1_SP_O[0] = "A3"+"_1";}
		else if (P1_SP [0] == "A3"+"_3"){P1_SP_O[0] = "A3"+"_4";}
		else if (P1_SP [0] == "A3"+"_4"){P1_SP_O[0] = "A3"+"_2";}
		//N
		if 		(P1_SP [1] == "A3"+"_1"){P1_SP_O[1] = "A3"+"_3";}
		else if (P1_SP [1] == "A3"+"_2"){P1_SP_O[1] = "A3"+"_1";}
		else if (P1_SP [1] == "A3"+"_3"){P1_SP_O[1] = "A3"+"_4";}
		else if (P1_SP [1] == "A3"+"_4"){P1_SP_O[1] = "A3"+"_2";}
		//W
		if 		(P1_SP [2] == "A3"+"_1"){P1_SP_O[2] = "A3"+"_3";}
		else if (P1_SP [2] == "A3"+"_2"){P1_SP_O[2] = "A3"+"_1";}
		else if (P1_SP [2] == "A3"+"_3"){P1_SP_O[2] = "A3"+"_4";}
		else if (P1_SP [2] == "A3"+"_4"){P1_SP_O[2] = "A3"+"_2";}
		//V
		if 		(P1_SP [3] == "A3"+"_1"){P1_SP_O[3] = "A3"+"_3";}
		else if (P1_SP [3] == "A3"+"_2"){P1_SP_O[3] = "A3"+"_1";}
		else if (P1_SP [3] == "A3"+"_3"){P1_SP_O[3] = "A3"+"_4";}
		else if (P1_SP [3] == "A3"+"_4"){P1_SP_O[3] = "A3"+"_2";}

		//b
		if 		(P2_SP [0] == "A3"+"_1"){P2_SP_O[0] = "A3"+"_3";}
		else if (P2_SP [0] == "A3"+"_2"){P2_SP_O[0] = "A3"+"_1";}
		else if (P2_SP [0] == "A3"+"_3"){P2_SP_O[0] = "A3"+"_4";}
		else if (P2_SP [0] == "A3"+"_4"){P2_SP_O[0] = "A3"+"_2";}
		//d
		if 		(P2_SP [1] == "A3"+"_1"){P2_SP_O[1] = "A3"+"_3";}
		else if (P2_SP [1] == "A3"+"_2"){P2_SP_O[1] = "A3"+"_1";}
		else if (P2_SP [1] == "A3"+"_3"){P2_SP_O[1] = "A3"+"_4";}
		else if (P2_SP [1] == "A3"+"_4"){P2_SP_O[1] = "A3"+"_2";}
		//p
		if 		(P2_SP [2] == "A3"+"_1"){P2_SP_O[2] = "A3"+"_3";}
		else if (P2_SP [2] == "A3"+"_2"){P2_SP_O[2] = "A3"+"_1";}
		else if (P2_SP [2] == "A3"+"_3"){P2_SP_O[2] = "A3"+"_4";}
		else if (P2_SP [2] == "A3"+"_4"){P2_SP_O[2] = "A3"+"_2";}
		//q
		if 		(P2_SP [3] == "A3"+"_1"){P2_SP_O[3] = "A3"+"_3";}
		else if (P2_SP [3] == "A3"+"_2"){P2_SP_O[3] = "A3"+"_1";}
		else if (P2_SP [3] == "A3"+"_3"){P2_SP_O[3] = "A3"+"_4";}
		else if (P2_SP [3] == "A3"+"_4"){P2_SP_O[3] = "A3"+"_2";}
	}
	else if (Tile_to_Rotate == "B2"){
		//M
		if 		(P1_SP [0] == "B2"+"_1"){P1_SP_O[0] = "B2"+"_3";}
		else if (P1_SP [0] == "B2"+"_2"){P1_SP_O[0] = "B2"+"_1";}
		else if (P1_SP [0] == "B2"+"_3"){P1_SP_O[0] = "B2"+"_4";}
		else if (P1_SP [0] == "B2"+"_4"){P1_SP_O[0] = "B2"+"_2";}
		//N
		if 		(P1_SP [1] == "B2"+"_1"){P1_SP_O[1] = "B2"+"_3";}
		else if (P1_SP [1] == "B2"+"_2"){P1_SP_O[1] = "B2"+"_1";}
		else if (P1_SP [1] == "B2"+"_3"){P1_SP_O[1] = "B2"+"_4";}
		else if (P1_SP [1] == "B2"+"_4"){P1_SP_O[1] = "B2"+"_2";}
		//W
		if 		(P1_SP [2] == "B2"+"_1"){P1_SP_O[2] = "B2"+"_3";}
		else if (P1_SP [2] == "B2"+"_2"){P1_SP_O[2] = "B2"+"_1";}
		else if (P1_SP [2] == "B2"+"_3"){P1_SP_O[2] = "B2"+"_4";}
		else if (P1_SP [2] == "B2"+"_4"){P1_SP_O[2] = "B2"+"_2";}
		//V
		if 		(P1_SP [3] == "B2"+"_1"){P1_SP_O[3] = "B2"+"_3";}
		else if (P1_SP [3] == "B2"+"_2"){P1_SP_O[3] = "B2"+"_1";}
		else if (P1_SP [3] == "A3"+"_3"){P1_SP_O[3] = "B2"+"_4";}
		else if (P1_SP [3] == "B2"+"_4"){P1_SP_O[3] = "B2"+"_2";}

		//b
		if 		(P2_SP [0] == "B2"+"_1"){P2_SP_O[0] = "B2"+"_3";}
		else if (P2_SP [0] == "B2"+"_2"){P2_SP_O[0] = "B2"+"_1";}
		else if (P2_SP [0] == "B2"+"_3"){P2_SP_O[0] = "B2"+"_4";}
		else if (P2_SP [0] == "B2"+"_4"){P2_SP_O[0] = "B2"+"_2";}
		//d
		if 		(P2_SP [1] == "B2"+"_1"){P2_SP_O[1] = "B2"+"_3";}
		else if (P2_SP [1] == "B2"+"_2"){P2_SP_O[1] = "B2"+"_1";}
		else if (P2_SP [1] == "B2"+"_3"){P2_SP_O[1] = "B2"+"_4";}
		else if (P2_SP [1] == "B2"+"_4"){P2_SP_O[1] = "B2"+"_2";}
		//p
		if 		(P2_SP [2] == "B2"+"_1"){P2_SP_O[2] = "B2"+"_3";}
		else if (P2_SP [2] == "B2"+"_2"){P2_SP_O[2] = "B2"+"_1";}
		else if (P2_SP [2] == "B2"+"_3"){P2_SP_O[2] = "B2"+"_4";}
		else if (P2_SP [2] == "B2"+"_4"){P2_SP_O[2] = "B2"+"_2";}
		//q
		if 		(P2_SP [3] == "B2"+"_1"){P2_SP_O[3] = "B2"+"_3";}
		else if (P2_SP [3] == "B2"+"_2"){P2_SP_O[3] = "B2"+"_1";}
		else if (P2_SP [3] == "B2"+"_3"){P2_SP_O[3] = "B2"+"_4";}
		else if (P2_SP [3] == "B2"+"_4"){P2_SP_O[3] = "B2"+"_2";}
	}
	else if (Tile_to_Rotate == "B3"){
		//M
		if 		(P1_SP [0] == "B3"+"_1"){P1_SP_O[0] = "B3"+"_3";}
		else if (P1_SP [0] == "B3"+"_2"){P1_SP_O[0] = "B3"+"_1";}
		else if (P1_SP [0] == "B3"+"_3"){P1_SP_O[0] = "B3"+"_4";}
		else if (P1_SP [0] == "B3"+"_4"){P1_SP_O[0] = "B3"+"_2";}
		//N
		if 		(P1_SP [1] == "B3"+"_1"){P1_SP_O[1] = "B3"+"_3";}
		else if (P1_SP [1] == "B3"+"_2"){P1_SP_O[1] = "B3"+"_1";}
		else if (P1_SP [1] == "B3"+"_3"){P1_SP_O[1] = "B3"+"_4";}
		else if (P1_SP [1] == "B3"+"_4"){P1_SP_O[1] = "B3"+"_2";}
		//W
		if 		(P1_SP [2] == "B3"+"_1"){P1_SP_O[2] = "B3"+"_3";}
		else if (P1_SP [2] == "B3"+"_2"){P1_SP_O[2] = "B3"+"_1";}
		else if (P1_SP [2] == "B3"+"_3"){P1_SP_O[2] = "B3"+"_4";}
		else if (P1_SP [2] == "B3"+"_4"){P1_SP_O[2] = "B3"+"_2";}
		//V
		if 		(P1_SP [3] == "B3"+"_1"){P1_SP_O[3] = "B3"+"_3";}
		else if (P1_SP [3] == "B3"+"_2"){P1_SP_O[3] = "B3"+"_1";}
		else if (P1_SP [3] == "A3"+"_3"){P1_SP_O[3] = "B3"+"_4";}
		else if (P1_SP [3] == "B3"+"_4"){P1_SP_O[3] = "B3"+"_2";}

		//b
		if 		(P2_SP [0] == "B3"+"_1"){P2_SP_O[0] = "B3"+"_3";}
		else if (P2_SP [0] == "B3"+"_2"){P2_SP_O[0] = "B3"+"_1";}
		else if (P2_SP [0] == "B3"+"_3"){P2_SP_O[0] = "B3"+"_4";}
		else if (P2_SP [0] == "B3"+"_4"){P2_SP_O[0] = "B3"+"_2";}
		//d
		if 		(P2_SP [1] == "B3"+"_1"){P2_SP_O[1] = "B3"+"_3";}
		else if (P2_SP [1] == "B3"+"_2"){P2_SP_O[1] = "B3"+"_1";}
		else if (P2_SP [1] == "B3"+"_3"){P2_SP_O[1] = "B3"+"_4";}
		else if (P2_SP [1] == "B3"+"_4"){P2_SP_O[1] = "B3"+"_2";}
		//p
		if 		(P2_SP [2] == "B3"+"_1"){P2_SP_O[2] = "B3"+"_3";}
		else if (P2_SP [2] == "B3"+"_2"){P2_SP_O[2] = "B3"+"_1";}
		else if (P2_SP [2] == "B3"+"_3"){P2_SP_O[2] = "B3"+"_4";}
		else if (P2_SP [2] == "B3"+"_4"){P2_SP_O[2] = "B3"+"_2";}
		//q
		if 		(P2_SP [3] == "B3"+"_1"){P2_SP_O[3] = "B3"+"_3";}
		else if (P2_SP [3] == "B3"+"_2"){P2_SP_O[3] = "B3"+"_1";}
		else if (P2_SP [3] == "B3"+"_3"){P2_SP_O[3] = "B3"+"_4";}
		else if (P2_SP [3] == "B3"+"_4"){P2_SP_O[3] = "B3"+"_2";}
	}
	else if (Tile_to_Rotate == "B4"){
		//M
		if 		(P1_SP [0] == "B4"+"_1"){P1_SP_O[0] = "B4"+"_3";}
		else if (P1_SP [0] == "B4"+"_2"){P1_SP_O[0] = "B4"+"_1";}
		else if (P1_SP [0] == "B4"+"_3"){P1_SP_O[0] = "B4"+"_4";}
		else if (P1_SP [0] == "B4"+"_4"){P1_SP_O[0] = "B4"+"_2";}
		//N
		if 		(P1_SP [1] == "B4"+"_1"){P1_SP_O[1] = "B4"+"_3";}
		else if (P1_SP [1] == "B4"+"_2"){P1_SP_O[1] = "B4"+"_1";}
		else if (P1_SP [1] == "B4"+"_3"){P1_SP_O[1] = "B4"+"_4";}
		else if (P1_SP [1] == "B4"+"_4"){P1_SP_O[1] = "B4"+"_2";}
		//W
		if 		(P1_SP [2] == "B4"+"_1"){P1_SP_O[2] = "B4"+"_3";}
		else if (P1_SP [2] == "B4"+"_2"){P1_SP_O[2] = "B4"+"_1";}
		else if (P1_SP [2] == "B4"+"_3"){P1_SP_O[2] = "B4"+"_4";}
		else if (P1_SP [2] == "B4"+"_4"){P1_SP_O[2] = "B4"+"_2";}
		//V
		if 		(P1_SP [3] == "B4"+"_1"){P1_SP_O[3] = "B4"+"_3";}
		else if (P1_SP [3] == "B4"+"_2"){P1_SP_O[3] = "B4"+"_1";}
		else if (P1_SP [3] == "A4"+"_3"){P1_SP_O[3] = "B4"+"_4";}
		else if (P1_SP [3] == "B4"+"_4"){P1_SP_O[3] = "B4"+"_2";}

		//b
		if 		(P2_SP [0] == "B4"+"_1"){P2_SP_O[0] = "B4"+"_3";}
		else if (P2_SP [0] == "B4"+"_2"){P2_SP_O[0] = "B4"+"_1";}
		else if (P2_SP [0] == "B4"+"_3"){P2_SP_O[0] = "B4"+"_4";}
		else if (P2_SP [0] == "B4"+"_4"){P2_SP_O[0] = "B4"+"_2";}
		//d
		if 		(P2_SP [1] == "B4"+"_1"){P2_SP_O[1] = "B4"+"_3";}
		else if (P2_SP [1] == "B4"+"_2"){P2_SP_O[1] = "B4"+"_1";}
		else if (P2_SP [1] == "B4"+"_3"){P2_SP_O[1] = "B4"+"_4";}
		else if (P2_SP [1] == "B4"+"_4"){P2_SP_O[1] = "B4"+"_2";}
		//p
		if 		(P2_SP [2] == "B4"+"_1"){P2_SP_O[2] = "B4"+"_3";}
		else if (P2_SP [2] == "B4"+"_2"){P2_SP_O[2] = "B4"+"_1";}
		else if (P2_SP [2] == "B4"+"_3"){P2_SP_O[2] = "B4"+"_4";}
		else if (P2_SP [2] == "B4"+"_4"){P2_SP_O[2] = "B4"+"_2";}
		//q
		if 		(P2_SP [3] == "B4"+"_1"){P2_SP_O[3] = "B4"+"_3";}
		else if (P2_SP [3] == "B4"+"_2"){P2_SP_O[3] = "B4"+"_1";}
		else if (P2_SP [3] == "B4"+"_3"){P2_SP_O[3] = "B4"+"_4";}
		else if (P2_SP [3] == "B4"+"_4"){P2_SP_O[3] = "B4"+"_2";}
	}
	

	}

//This sets the output variable to the rotated input
	output [2][0] = Rotated_Tile;

	output [0][0] = P1_SP_O[0];
	output [0][1] = P1_SP_O[1];
	output [0][2] = P1_SP_O[2];
	output [0][3] = P1_SP_O[3];

	output [1][0] = P2_SP_O[0];
	output [1][1] = P2_SP_O[1];
	output [1][2] = P2_SP_O[2];
	output [1][3] = P2_SP_O[3];

		//this returners the output to Mind_Shift
    return  output;
    }

}
