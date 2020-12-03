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

	public static int WinOrLoose50Percent() {

		int newStack = STACK;
		while (newStack > 50 && newStack < 150) {

			if (randomNumber == 0) {
				newStack = newStack + BET;
				win = BET;
				System.out.println("Gambler Is Winner" + win);
			} else {
				newStack = newStack - BET;
				loose = BET;
				System.out.println("Gamler is not winner :" + loose);
			}
		}
		System.out.println("Total Stack is : " + newStack);
		return newStack;
	}

	public static void TotalMoney() {
		int day = 20;
		int totalMoney = 0;
		for (int i = 0; i <= day; i++) {
			int temp = WinOrLoose50Percent();
			if (temp - STACK > 50) {
				totalMoney = totalMoney + (temp - STACK);
				System.out.println("Win day " + i + "Money Won is" + totalMoney);
			} else {
				totalMoney = totalMoney + (STACK - temp);
				System.out.println("loose day" + i + "Money Loss  is " + totalMoney);
			}
		}

	}

	public static void main(String[] args) {

		System.out.println("Welcome To Gambling Simulator");

		checkWinOrLoose();
		WinOrLoose50Percent();
		TotalMoney();
	}

}