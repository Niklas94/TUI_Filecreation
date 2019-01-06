package Controller;

import Entities.Tui;
import Interfaces.iMainMenu;

public class MainMenu implements iMainMenu {

	Tui Tui;
	FileController fc;
	String option;
	
	public MainMenu() {
		
		Tui = new Tui();
		fc = new FileController();
		
	}

	@Override
	public void select(String option) {
		
		
		
		
	}

	public void begin() {
		// TODO Auto-generated method stub
		Tui.options();
		FileController.work(Tui.select());
		
	}


	
	
	
	
}
