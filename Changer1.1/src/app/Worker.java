package app;

import java.io.IOException;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;

public class Worker {
	static Ini resources;
	
	public static void main(String[] args) throws InvalidFileFormatException, IOException {
		
		
		ResourceServerWindow RseWindow = new ResourceServerWindow(resources);
		RseWindow.initialize();

		
		
		
	}

}
