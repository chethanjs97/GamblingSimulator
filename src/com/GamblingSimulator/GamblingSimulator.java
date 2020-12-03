package com.GamblingSimulator;

import java.util.Random;

public class GamblingSimulator {
	public static final int STACK = 100;
	public static final int BET = 1;
	public static int Win = 0;
	public static int Loose = 0;

	public static void checkWinOrLoose() {
		Random Number = new Random();
		int randomNumber = Number.nextInt(2);
		if (randomNumber == 0) {
			Win = BET;
			System.out.println("Gambler Is Winner " + Win);
		} else {
			Loose = BET;
			System.out.println("Gamler is not winner " + Loose);
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome To Gambling Simulator");
		
		checkWinOrLoose();

	}

}