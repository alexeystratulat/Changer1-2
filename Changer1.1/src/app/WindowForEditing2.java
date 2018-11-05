package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.ini4j.Ini;
import javax.swing.JButton;

public class WindowForEditing2 {

	private JFrame frame;
	private String pathToFile;
	private Ini resources;
	private PrintWriter writer = null;
	private FileReader reader = null;
	private Scanner read;
	private JTextArea txtrText;
	private JButton button;
	private JButton btnApply;
	private String serverName;
	private String selectedItem;

	public WindowForEditing2(String pathToFile, Ini resources, String serverName,String selectedItem) {

		this.pathToFile = pathToFile;
		this.resources = resources;
		this.serverName = serverName;
		this.selectedItem = selectedItem;

		System.out.println(pathToFile + "\\" + resources.get("path", "nameOfConfigFile").toString());

	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 710, 827);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(selectedItem + "  "+ serverName);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 674, 712);
		frame.getContentPane().add(scrollPane);

		txtrText = new JTextArea();
		scrollPane.setViewportView(txtrText);
		
		button = new JButton("<< Back");
		button.setBounds(595, 754, 89, 23);
		frame.getContentPane().add(button);
		
		btnApply = new JButton("apply");
		btnApply.setBounds(464, 754, 89, 23);
		frame.getContentPane().add(btnApply);
		frame.setVisible(true);
		show();

	}

	private void show() {

		FileReader reader = null;

		try {
			reader = new FileReader(pathToFile + "\\" + resources.get("path", "nameOfConfigFile").toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scanner s = new Scanner(reader);

		while (s.hasNext()) {
			if (s.hasNextInt()) {
				txtrText.append(s.nextLine() + "\n");
			} else {
				txtrText.append(s.nextLine() + "\n");
			}
		}

	}

}
