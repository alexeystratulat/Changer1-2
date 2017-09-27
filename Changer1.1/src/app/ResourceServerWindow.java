package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import org.ini4j.Ini; 
import org.ini4j.InvalidFileFormatException; 
import org.ini4j.Profile.Section;



import javax.swing.JLabel;
import javax.swing.JTextField;





import javax.swing.JButton;
import java.awt.FlowLayout;

public class ResourceServerWindow {

	private JFrame frmFillRequiredValues;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	private String resFileName = "resources.ini";
	private String mainProgramFolder = "C:\\Changer1.1";
	Ini resources;
	
	
	public ResourceServerWindow(Ini resources) throws InvalidFileFormatException, IOException {
		resources = this.resources;				
		
	}

	public void initialize() throws InvalidFileFormatException, IOException {
		//
		CreatingDirectory dir = new CreatingDirectory();
		dir.createDir();
		//
		CreatingResourcesFiles resFile = new CreatingResourcesFiles(mainProgramFolder,resFileName);
		try {
			resFile.creatingFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		resources = new Ini(new File(mainProgramFolder+"\\"+resFileName));
		
		
		
		
		frmFillRequiredValues = new JFrame();
		
		
		frmFillRequiredValues.setBounds(100, 100, 209, 273);
		frmFillRequiredValues.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFillRequiredValues.getContentPane().setLayout(null);
		
		JLabel lblIpAddress = new JLabel("IP address");
		lblIpAddress.setBounds(10, 30, 181, 14);
		frmFillRequiredValues.getContentPane().add(lblIpAddress);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 80, 181, 14);
		frmFillRequiredValues.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 130, 181, 14);
		frmFillRequiredValues.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(10, 50, 181, 20);
		frmFillRequiredValues.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(resources.get("auth", "IPaddres"));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 100, 181, 20);
		frmFillRequiredValues.getContentPane().add(textField_1);
		textField_1.setText(resources.get("auth", "Username"));
		
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 150, 181, 20);
		frmFillRequiredValues.getContentPane().add(textField_2);
		textField_2.setText(resources.get("auth", "Password"));
		
		JButton btnNewButton = new JButton("next >");
		btnNewButton.setBounds(121, 210, 72, 23);
		frmFillRequiredValues.getContentPane().add(btnNewButton);
		frmFillRequiredValues.setLocationRelativeTo(null);
		frmFillRequiredValues.setResizable(false);
		
		frmFillRequiredValues.setVisible(true);
	}
}
