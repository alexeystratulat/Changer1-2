package app;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreatingResourcesFiles {

	String folder;
	String file;

	public CreatingResourcesFiles(String folder, String file) {
		this.folder = folder;
		this.file = file;

	}

	public void creatingFile() throws IOException {

		File settingsFile = new File(folder+"\\"+file);

		if (!settingsFile.exists()) {

			
				settingsFile.createNewFile();			
			 PrintWriter writer = new PrintWriter(folder+"\\"+file,
			 "UTF-8");
			 writer.println("[auth]");
			 writer.println("IPaddres = ");
			 writer.println("Username = ");
			 writer.println("Password = ");
			 
			 
			 
			 
			 
			 
			 
			 writer.close();

			System.out.println(folder+"\\"+file);
		}
	}

}
