package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

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
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 100, 181, 20);
		frmFillRequiredValues.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 150, 181, 20);
		frmFillRequiredValues.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("next >");
		btnNewButton.setBounds(121, 210, 72, 23);
		frmFillRequiredValues.getContentPane().add(btnNewButton);
		frmFillRequiredValues.setLocationRelativeTo(null);
		frmFillRequiredValues.setResizable(false);
		
		frmFillRequiredValues.setVisible(true);
	}
}
