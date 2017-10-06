package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Environment�hoice {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Environment�hoice window = new Environment�hoice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Environment�hoice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 415, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNext = new JButton("NEXT >");
		btnNext.setBounds(270, 440, 89, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setEnabled(false);
		btnSettings.setBounds(39, 440, 89, 23);
		frame.getContentPane().add(btnSettings);
	}
}
