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

	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frmFillRequiredValues = new JFrame();
		frmFillRequiredValues.setResizable(false);
		frmFillRequiredValues.setTitle("Fill required values");
	
		frmFillRequiredValues.setBackground(SystemColor.desktop);
		frmFillRequiredValues.getContentPane().setLayout(null);
		frmFillRequiredValues.setVisible(true);
	}
}
