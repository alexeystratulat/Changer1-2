package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ResourseServerWindow {

	private JFrame frmFillRequiredValues;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frmFillRequiredValues = new JFrame();
		frmFillRequiredValues.setResizable(false);
		frmFillRequiredValues.setTitle("Fill required values");
	
		frmFillRequiredValues.setBackground(SystemColor.desktop);
		frmFillRequiredValues.getContentPane().setLayout(null);
		
		JLabel lblServersIp = new JLabel("Server's IP");
		lblServersIp.setBounds(10, 11, 167, 14);
		frmFillRequiredValues.getContentPane().add(lblServersIp);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 61, 167, 14);
		frmFillRequiredValues.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 111, 167, 14);
		frmFillRequiredValues.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(10, 30, 224, 20);
		frmFillRequiredValues.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 80, 224, 20);
		frmFillRequiredValues.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 130, 224, 20);
		frmFillRequiredValues.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("next >");
		btnNewButton.setForeground(SystemColor.activeCaptionText);
		btnNewButton.setBounds(145, 187, 89, 23);
		frmFillRequiredValues.getContentPane().add(btnNewButton);
		
		JButton btnOptions = new JButton("options");
		btnOptions.setBounds(10, 187, 89, 23);
		frmFillRequiredValues.getContentPane().add(btnOptions);
		frmFillRequiredValues.setVisible(true);
	}
}
