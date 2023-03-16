package com.bridgelabz.snakeandladder;

public class SnakeLadderGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posA = 0;
		int dieRolls = 0;
		System.out.println("Snake and Laddar Simulation Game");
		while (true) {
			dieRolls++;
		    int dieA = (int) Math.floor(Math.random() * 10) % 6 + 1;
		    int UpOrDownA = (int) Math.floor(Math.random() * 10) % 2 + 1;
	        switch (UpOrDownA) {
	        case 1:
		             posA += dieA;
		             System.out.println("Ladder " + dieRolls + " getValue " + dieA + " Die Rolls " + posA + " final pos");
		    break;

	        case 2:
		             if (posA <= 0) {
							posA -= 0; 

						}
		             else if (posA > 0) {

							posA -= dieA;
							System.out.println("snake " + dieRolls + " getValue " + dieA + " Die Rolls " + posA + " final pos");
							break;
						}
	        default:
	        	if (posA == 100) {
					System.out.println("Game Over! Player A wins ");
					return;
				}
	
	     }

	}

}
}