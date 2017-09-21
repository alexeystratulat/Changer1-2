package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class ResourseServerWindow {

	private JFrame frmFillRequiredValues;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResourseServerWindow window = new ResourseServerWindow();
					window.frmFillRequiredValues.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ResourseServerWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFillRequiredValues = new JFrame();
		frmFillRequiredValues.setTitle("Fill required values");
		frmFillRequiredValues.setResizable(false);
		frmFillRequiredValues.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Dropbox\\pictures\\15.png"));
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
	}
}
