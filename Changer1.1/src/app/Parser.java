package app;

import java.io.File;
import java.io.IOException;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;





public class Parser {
	static String mainProgramFolder;
	static String listName;
	
	
	public Parser(String mainProgramFolder, String listName) {
		this.mainProgramFolder = mainProgramFolder;
		this.listName = listName;		
		

	}
	
	
	
	public static String[] parserForEnvIni() {
		try {
			Ini list = new Ini(new File(mainProgramFolder + "\\" + listName));

			String[] massToBeSent = new String[list.keySet().size()];

			int counter = 0;
			for (String sectionName : list.keySet()) {

				massToBeSent[counter] = sectionName.toString();
				counter++;

			}

			return massToBeSent;

		} catch (InvalidFileFormatException e) {
			System.err.println("\n" +  mainProgramFolder + "\\" + listName + "  - WRONG FORMAT FILE ! \n");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

}
}