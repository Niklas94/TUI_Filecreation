package Controller;

import Entities.Tui;
import Interfaces.iFileController;
import Interfaces.iMainMenu;
import Interfaces.iTui;

import java.io.IOException;

public class MainMenu implements iMainMenu {

	iTui Tui;
	iFileController Fc;
	String action, fileName;
	
	public MainMenu() {
		
		Tui = new Tui();
		Fc = new FileController();
		
	}

	@Override
	public void select(String option) {
		
		
		
		
	}

	public void begin() throws IOException {

		switch(Tui.chooseAction()) {
			case "CREATE":
				fileName = Tui.chooseFileName();
				Fc.createFile(fileName);
				break;
			case "LOAD":
				fileName = Tui.chooseFileToLoad();
				if(Fc.chooseFileToLoad(fileName))
					Tui.contentOfFile(Fc.contentOfFile(fileName));
				break;
			case "WRITE":
				fileName = Tui.chooseFileToLoad();
				Fc.writeToFile(Tui.chooseFileToLoad(), Tui.writeToFile());
				break;
			case "EXIT":
				break;
			default:
				break;
		}


	}


	
	
	
	
}
