package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.ini4j.Ini;

public class Editor {
	private String pathToFile;
	private Ini resources;
	private PrintWriter writer = null;
	private FileReader reader = null;
	private Scanner read;
////////////
	public Editor(String pathToFile, Ini resources) {
		this.pathToFile = pathToFile;
		this.resources = resources;

		System.out.println(
				pathToFile + "constructor Editor          " + resources.get("path", "nameOfConfigFile").toString());

	}

	public void makingVportal_au() {
		
		try {

			reader = new FileReader(pathToFile + "\\" + resources.get("path", "nameOfConfigFile").toString());

			read = new Scanner(reader);
			String line;

			writer = new PrintWriter(pathToFile + "\\" + resources.get("path", "nameOfAlternativeConfigFile"));
			
			while ((line = read.nextLine()) != null) {

				
				 writer.println(line);

				

			}
			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			System.out.println("Alternative Vportal is created by Editor " + pathToFile + "\\"
					+ resources.get("path", "nameOfStandartConfigFile"));
			writer.close();
			read.close();
			
			try {
				reader.close();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}

		}

	}

	public void makingVportal_st() {

		try {

			reader = new FileReader(pathToFile + "\\" + resources.get("path", "nameOfConfigFile").toString());

			read = new Scanner(reader);
			String line;

			writer = new PrintWriter(pathToFile + "\\" + resources.get("path", "nameOfStandartConfigFile"));
			
			while ((line = read.nextLine()) != null) {

				
				 writer.println(line);

			

			}
			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			System.out.println("Alternative Vportal is created by Editor " + pathToFile + "\\"
					+ resources.get("path", "nameOfStandartConfigFile"));
			writer.close();
			read.close();
			
			try {
				reader.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}
	
	
public String compareFiles() {
		
		File vportalFile = new File(pathToFile + "\\" + resources.get("path", "nameOfStandartConfigFile"));
		File vportal_stFile = new File(pathToFile + "\\" + resources.get("path", "nameOfStandartConfigFile"));
		File vportal_auFile = new File(pathToFile + "\\" + resources.get("path", "nameOfAlternativeConfigFile"));		
		
		
		System.out.println("Comparing: " + pathToFile + "\\" + resources.get("path", "nameOfConfigFile").toString()+": "+ vportalFile.length());
		System.out.println("Comparing: " + pathToFile + "\\" + resources.get("path", "nameOfStandartConfigFile").toString()+": "+ vportal_stFile.length());
		System.out.println("Comparing: " + pathToFile + "\\" + resources.get("path", "nameOfAlternativeConfigFile").toString()+": "+ vportal_auFile.length());
	

		if (vportalFile.length() == vportal_stFile.length()) {

			return "manual prompts";

		}

		if (vportalFile.length() == vportal_auFile.length()) {

			return "automated prompts";

		}

		return "unknown";

	}

	
	
	
	
	
	
	
	
	

}
