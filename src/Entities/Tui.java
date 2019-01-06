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
		do {
			choice = keyboard.nextLine();
			System.out.println("You chose + " + choice + " is this correct? Y/N?");
			yn = keyboard.nextLine();
		} while (!yn.equalsIgnoreCase("y") || !yn.equalsIgnoreCase("n"));
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
				
				break;
			case "2":

				break;
			case "3":

				break;

			case "default":
				break;

			}
		} while (selected.equalsIgnoreCase("default"));

	}




}
