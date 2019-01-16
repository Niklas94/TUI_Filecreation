package Entities;

import java.util.Scanner;

import Interfaces.iTui;

public class Tui implements iTui {

	Scanner keyboard;

	public Tui() {
		keyboard = new Scanner(System.in);
	}


	@Override
	public String chooseAction() {

		System.out.println("You have the following options: \nEnter \"1\" to create a new file." +
				" \nEnter \"2\" to load a file." +
				" \nEnter \"3\" to write to an existing file. " +
				" \nEnter \"4\" to exit the program.");
		String input = keyboard.nextLine();

		switch(input) {
			case "1":
				return "CREATE";
			case "2":
				return "LOAD";
			case "3":
				return "WRITE";
			case "4":
				return "EXIT";
			default:
				return "UNKNOWN";
		}
	}

	@Override
	public String chooseFileName() {

		String fileName;
		System.out.println("Enter a name of the file. Minimum 1 character and maximum 20 characters.");
		do {
			fileName = keyboard.nextLine();
			if (fileName.length() < 0 || fileName.length() > 20)
				System.out.println("File name must be between 1 and 20 characters");
		} while (fileName.length() > 0 && fileName.length() < 20);
		return fileName;

	}

	@Override
	public String chooseFileToLoad() {

		String fileName;
		System.out.println("Enter the name of the file you wish to load.");
		do {
			fileName = keyboard.nextLine();
			if (fileName.length() < 0 || fileName.length() > 20)
				System.out.println("File name must be between 1 and 20 characters");
		} while (fileName.length() > 0 && fileName.length() < 20);
		return fileName;

	}

	@Override
	public String writeToFile() {

		String input;
		System.out.println("Enter what you would like to add to the text file.");
		input = keyboard.nextLine();
		return input;

	}

	@Override
	public void contentOfFile(String fileName) {

		String output;
		System.out.println("The content of the file are: ");


	}


}
