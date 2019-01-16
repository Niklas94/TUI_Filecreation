package Interfaces;

import Controller.FileController;

public interface iTui {

	public String chooseAction();
	public String chooseFileName();
	public String chooseFileToLoad();
	public String writeToFile();

    void contentOfFile(String output);
    //public void options(String options);
	
}
