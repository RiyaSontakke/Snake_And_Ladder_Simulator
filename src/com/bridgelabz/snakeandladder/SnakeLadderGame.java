package com.bridgelabz.snakeandladder;

public class SnakeLadderGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posA = 0;
		System.out.println("Snake and Laddar Simulation Game");
		while (posA == 100) {
		    int dieA = (int) Math.floor(Math.random() * 10) % 6 + 1;
		    int UpOrDownA = (int) Math.floor(Math.random() * 10) % 2 + 1;
	        switch (UpOrDownA) {
	        case 1:
		             posA += dieA;
		    break;

	        case 2:
		             if (posA <= 0) {
							posA -= 0; 

							System.out.println("Player A is Knocked Out . Need inside Game");

						} else if (posA > 0) {

							posA -= dieA; // snake block
							if (posA < 0)
								posA = 0;
							break;
						}
	        default:
	
	     }

	}

}
}