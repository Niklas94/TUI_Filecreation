package Controller;

import Entities.Tui;
import Interfaces.iMainMenu;

public class MainMenu implements iMainMenu {

	Tui Tui;
	String option;
	
	public MainMenu() {
		
		Tui = new Tui();
		
	}

	@Override
	public void select(String option) {
		
		
		
		
	}

	public void begin() {
		// TODO Auto-generated method stub
		Tui.options();
		Tui.select();
		
	}


	
	
	
	
}
