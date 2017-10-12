package app;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Profile.Section;





public class Parser {
	static String mainProgramFolder;
	static String listName;
	
	
	static String serversIp = "AMS-UP(POD1)";

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
			System.err.println("\n" + mainProgramFolder + "\\" + listName + "  - WRONG FORMAT FILE ! \n");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	
	public static ArrayList<Servers> parserIniForIP() throws InvalidFileFormatException, IOException {
		ArrayList<Servers> list = new ArrayList<Servers>();
		

		Ini listOfIP ;
		listOfIP = new Ini(new File(mainProgramFolder+ "\\"+listName ));

		Section section = listOfIP.get(serversIp);

			for (String optionKey : section.keySet()) {

				// System.out.println(optionKey.toString());
				// System.out.println(section.toString());

			//	list.add(new Servers(optionKey.toString(), section.get(optionKey), Main.settings.get("server", "user"),
				//		Main.settings.get("server", "password")));
				
				
				list.add(new Servers(optionKey.toString(), section.get(optionKey), "user",
						"password"));

			}

			
			return list;

		

		

	
	
	
	}
}