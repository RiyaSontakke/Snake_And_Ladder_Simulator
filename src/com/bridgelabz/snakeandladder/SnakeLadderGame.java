package com.bridgelabz.snakeandladder;

public class SnakeLadderGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posA = 0;
		System.out.println("Snake and Laddar Simulation Game");
		int dieA = (int) Math.floor(Math.random() * 10) % 6 + 1;
		int UpOrDownA = (int) Math.floor(Math.random() * 10) % 2 + 1;
	    switch (UpOrDownA) {
	        case 1:
		             posA += dieA; // ladder block
		    break;

	        case 2:
		             posA -= dieA; // snake block
		    break;
	        default:
	
	     }

	}

}
