package com.bridgelabz.snakeandladder;

public class SnakeLadderGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posB = 0;
		int bflag = 1;
		int posA = 0;
		int aflag = 1;
		int dieRolls = 0;
		System.out.println("Snake and Laddar Simulation Game");
		while (true) {
			if (posA == 100) {
				System.out.println("Game Over! Player A wins with " + dieRolls + " Die Rolls");
			}
			dieRolls++;
		    int dieA = (int) Math.floor(Math.random() * 10) % 6 + 1;
		    if (aflag == 1) {
				int UpOrDownA = (int) Math.floor(Math.random() * 10) % 2 + 1;
		   
	        switch (UpOrDownA) {
	        case 1:
		             posA += dieA;
		             dieA = (int) Math.floor(Math.random() * 10) % 6 + 1; 
						posA += dieA;
		    break;

	        case 2:
		             if (posA <= 0) {
							posA -= 0; 
							aflag = 0;
						}
		             else if (posA > 0) {
							posA -= dieA;
							if (posA < 0)
								posA = 0;
							break;
						}
	        default:
	        }
	        if (aflag == 0) {
				aflag = 1;
				posA = 1;
				
			}

			if (posB == 100) {
				System.out.println("Game Over! Player B wins with " + dieRolls + " Die Rolls");
				break;
			}
			dieRolls++;

			int dieB = (int) Math.floor(Math.random() * 10) % 6 + 1;
			if (bflag == 1) {
				int UpOrDownB = (int) Math.floor(Math.random() * 10) % 2 + 1;

				switch (UpOrDownB) {
				case 1:

					posB += dieB; // ladder block
					dieB = (int) Math.floor(Math.random() * 10) % 6 + 1; // again play
					posB += dieB;
					
					break;

				case 2:
					if (posB <= 0) {
						posB -= 0; // restart from zero
						bflag = 0;
					
					} else if (posB > 0) {

						posB -= dieB; // snake block
						if (posB < 0)
							posB = 0;
						
						break;
					}
				default:

				}

			}
			if (bflag == 0) {
				bflag = 1;
				posA = 1;
			}
		    }
		    if (posB == 100) {
				System.out.println("Game Over! Player B wins with " + dieRolls + " Die Rolls");
		    }
		    dieRolls++;

			int dieB = (int) Math.floor(Math.random() * 10) % 6 + 1;
			if (bflag == 1) {
				int UpOrDownB = (int) Math.floor(Math.random() * 10) % 2 + 1;
				switch(UpOrDownB) {
				case 1:
					posB += dieB; // ladder block
					dieB = (int) Math.floor(Math.random() * 10) % 6 + 1; // again play
					posB += dieB;
					break;
				case 2:
					if (posB <= 0) {
						posB -= 0; // restart from zero
						bflag = 0;
					
					} else if (posB > 0) {

						posB -= dieB; // snake block
						if (posB < 0)
							posB = 0;
						
						break;
					}
					default:
						
				}
				
				}
			if (bflag == 0) {
				bflag = 1;
				posB = 1;
		    
	}
		}
	}
}

	