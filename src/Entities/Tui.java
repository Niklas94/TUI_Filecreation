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
		
		return keyboard.nextLine();
	}
	
	


}
