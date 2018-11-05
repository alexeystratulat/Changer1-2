package app;

import javax.swing.JFrame;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import org.ini4j.Ini;

import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class WindowForEditing {

	private String pathToFile;
	private Ini resources;
	private PrintWriter writer = null;
	private FileReader reader = null;
	private Scanner read;

	private JFrame frame;
	private JTextArea textToShow;

	public WindowForEditing(String pathToFile, Ini resources) {
		this.pathToFile = pathToFile;
		this.resources = resources;

		System.out.println(pathToFile + "\\" + resources.get("path", "nameOfConfigFile").toString());

	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 659, 845);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(535, 763, 98, 32);
		frame.getContentPane().add(btnNewButton);

		textToShow = new JTextArea();
		show();
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(616, 11, 17, 733);
		frame.getContentPane().add(scrollBar);
		textToShow.setBounds(10, 11, 623, 733);
		frame.getContentPane().add(textToShow);

		frame.setVisible(true);
	}

	
	public void show() {

		try {

			FileReader reader;

			reader = new FileReader(pathToFile + "\\" + resources.get("path", "nameOfConfigFile").toString());

			Scanner s = new Scanner(reader);

			while (s.hasNext()) {
				if (s.hasNextInt()) {
					textToShow.append(s.nextLine() + "\n"); 
				} else {
					textToShow.append(s.nextLine() + "\n"); 
				}
			}
		} catch (FileNotFoundException ex) {
			System.err.println(ex);
		}

	}
}
