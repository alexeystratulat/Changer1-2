package app;

import java.io.File;

public class CreatingDirectory {
	public String mainProgramFolder;
	public CreatingDirectory(String mainProgramFolder) {
		this.mainProgramFolder =mainProgramFolder;
	}

	public void createDir() {

		File theDir = new File(mainProgramFolder);

		if (!theDir.exists()) {
			System.out.println("working dir not exist ");

			theDir.mkdir();

			System.out.println("Dir is created");
		}

	}
}
