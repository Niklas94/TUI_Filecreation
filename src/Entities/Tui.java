package Entities;

import java.util.Scanner;

import Interfaces.iTui;

public class Tui implements iTui {

	Scanner keyboard; 

	public Tui() {

		keyboard = new Scanner(System.in);

	}

	@Override
	public String select() {

		String choice, yn;
		choice = keyboard.nextLine();
		System.out.println("You chose " + choice + " is this correct? Y/N?");
		do {
			System.out.println("Select y or n");
			yn = keyboard.nextLine();
		} while (!yn.equalsIgnoreCase("y") && !yn.equalsIgnoreCase("n"));
		
		if (yn.equalsIgnoreCase("n"))
			return "default";
		return choice;
	}

	public void options() {

		System.out.println("The following options are: \n1. Create file.\n2. Open file.\n3. Save file.\nEnter 1, 2 or 3 to choose any of these options.");
		String selected;
		do {
			selected = select();
			switch (selected) {
			case "1":
				System.out.println("1 switch");
				break;
			case "2":
				System.out.println("2 switch");
				break;
			case "3":
				System.out.println("3 switch");
				break;

			case "default":
				System.out.println("Default switch");
				break;

			}
		} while (selected.equalsIgnoreCase("default"));

	}




}
