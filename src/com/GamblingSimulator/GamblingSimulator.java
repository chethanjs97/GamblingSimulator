package com.GamblingSimulator;

import java.util.Random;

public class GamblingSimulator {
	public static final int STACK = 100;
	public static final int BET = 1;
	public static int win = 0;
	public static int loose = 0;
	static Random Number = new Random();
	static int randomNumber = Number.nextInt(2);
	public static void checkWinOrLoose() {
		
		
		if (randomNumber == 0) {
			win = BET;
			System.out.println("Gambler Is Winner " + win);
		} else {
			loose = BET;
			System.out.println("Gamler is not winner " + loose);
		}
	}
	public static void WinOrLoose50Percent() {
		
		int newStack = STACK;
		while (newStack > 50 && newStack < 150) {
			

			if (randomNumber == 0) {
				newStack = newStack + BET;
				win = BET;
				System.out.println("Gambler Is Winner" + win);
			} else {
				newStack = newStack - BET;
				loose = BET;
				System.out.println("Gamler is not winner" + loose);
			}
		}
		System.out.println("Total Stack is : " + newStack);
	}

	public static void main(String[] args) {

		System.out.println("Welcome To Gambling Simulator");
		
		checkWinOrLoose();
		WinOrLoose50Percent();

	}

}