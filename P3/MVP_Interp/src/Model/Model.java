package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Model {
	private FileReader input;
	private File _file;
	
	public File getDataFile() {
		return _file;
	}
	
	public FileReader getInput() throws FileNotFoundException {
		input = new FileReader(_file);
		return input;
	}
}
