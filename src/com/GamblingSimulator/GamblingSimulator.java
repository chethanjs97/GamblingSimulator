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
	public static void WinOrLoose50Percent() {
		Random Number = new Random();

		int tempStack = STACK;
		while (tempStack > 50 && tempStack < 150) {
			int randomNo = Number.nextInt(2);

			if (randomNo == 0) {
				tempStack = tempStack + BET;
				Win = BET;
				System.out.println("Gambler Is Winner" + Win);
			} else {
				tempStack = tempStack - BET;
				Loose = BET;
				System.out.println("Gamler is not winner" + Loose);
			}
		}
		System.out.println("Total Stack is : " + tempStack);
	}

	public static void main(String[] args) {

		System.out.println("Welcome To Gambling Simulator");
		
		checkWinOrLoose();
		WinOrLoose50Percent();

	}

}