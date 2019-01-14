package Controller;

import Interfaces.iFileController;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileController implements iFileController {

	BufferedWriter bw;

    @Override
    public boolean createFile(String fileName) throws IOException {
        File newFile = new File("C:\\Users\\NiklasThielemann\\Desktop\\" + fileName + ".txt");
        if (!newFile.exists()) {
            newFile.createNewFile();
            return true;
        }
        return false;
    }

    @Override
    public boolean chooseFileToLoad(String fileName) {
        File newFile = new File("C:\\Users\\NiklasThielemann\\Desktop\\" + fileName);
        if (newFile.exists()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean writeToFile(String fileName, String input) {
        File newFile = new File("C:\\Users\\NiklasThielemann\\Desktop\\" + fileName);
        if (newFile.exists()) {
            return true;
        }
        return false;
    }

    public enum options {
		CREATE, LOAD, WRITE, EXIT, UNKNOWN
	}

	
	
	
}
