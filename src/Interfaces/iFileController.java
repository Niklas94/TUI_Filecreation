package Interfaces;

import java.io.IOException;

public interface iFileController {

    public boolean createFile(String fileName) throws IOException;
    public boolean chooseFileToLoad(String fileName);
    public boolean writeToFile(String fileName, String input);

    String contentOfFile(String filename);
}
