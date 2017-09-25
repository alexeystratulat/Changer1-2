package app;

import java.io.File;

public class CreatingDirectory {

	public void createDir() {

		File theDir = new File("C:\\Changer1.1");

		if (!theDir.exists()) {
			System.out.println("working dir not exist ");

			theDir.mkdir();

			System.out.println("Dir is created");
		}

	}
}
