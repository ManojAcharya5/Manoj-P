package com.one;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Bowling game = new Bowling2();
		Scanner sc = new Scanner(System.in);
		String input;
		int points;

		for(int i=0; i<3; i++) {
			//Taking 3 players details
			System.out.println("Enter input");
			input = sc.nextLine();
			String[] values = input.split(" ");
			
			String name = values[0];
			points = Integer.parseInt(values[1]);
			//CAlling addPlayer method to store player name and scores/points
			game.addPlayer(name,points);
		}
		game.getWinner();
	}
}
