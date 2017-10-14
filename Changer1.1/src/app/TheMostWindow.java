package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TheMostWindow {

	private JFrame frame;

public TheMostWindow() {
	
	
	
	
	
}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("name of environment");
		lblNewLabel.setBounds(338, 11, 177, 14);
		frame.getContentPane().add(lblNewLabel);
		//
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 40, 764, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 140, 764, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 240, 764, 2);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 340, 764, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 440, 764, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(10, 540, 764, 2);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(10, 640, 764, 2);
		frame.getContentPane().add(separator_7);
		//
		JCheckBox chckbxNewCheckBox = new JCheckBox("check all");
		chckbxNewCheckBox.setBounds(10, 7, 111, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		//
		//
		//
		serv1();
		serv2();
		serv3();
		serv4();
		serv5();
		serv6();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		frame.setVisible(true);
	}
	
	private void serv1(){
		JCheckBox chckbxCheckBox = new JCheckBox("check box1");
		chckbxCheckBox.setBounds(10, 77, 97, 23);
		frame.getContentPane().add(chckbxCheckBox);
		//
		JLabel label = new JLabel("192.192.192.192");
		label.setBounds(30, 53, 101, 14);
		frame.getContentPane().add(label);
			//
		JLabel lblconnecton = new JLabel("1connecton...");
		lblconnecton.setBounds(30, 115, 91, 14);
		frame.getContentPane().add(lblconnecton);
		
		JButton btnNewButton = new JButton("button1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(677, 60, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
	
	private void serv2(){
		JCheckBox chckbxCheckBox_1 = new JCheckBox("check box2");
		chckbxCheckBox_1.setBounds(10, 177, 97, 23);
		frame.getContentPane().add(chckbxCheckBox_1);
		
		JLabel label_1 = new JLabel("192.192.192.192");
		label_1.setBounds(30, 153, 101, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lblconnecton_1 = new JLabel("2connecton...");
		lblconnecton_1.setBounds(30, 215, 91, 14);
		frame.getContentPane().add(lblconnecton_1);
		
		JButton btnButton = new JButton("button2");
		btnButton.setBounds(677, 160, 97, 23);
		frame.getContentPane().add(btnButton);
		
		
	}
	private void serv3(){
		JCheckBox chckbxCheckBox_2 = new JCheckBox("check box3");
		chckbxCheckBox_2.setBounds(10, 277, 97, 23);
		frame.getContentPane().add(chckbxCheckBox_2);
		
		JLabel label_2 = new JLabel("192.192.192.192");
		label_2.setBounds(30, 253, 101, 14);
		frame.getContentPane().add(label_2);
		
		JLabel lblconnecton_2 = new JLabel("3connecton...");
		lblconnecton_2.setBounds(30, 315, 91, 14);
		frame.getContentPane().add(lblconnecton_2);
		
		JButton btnButton_1 = new JButton("button3");
		btnButton_1.setBounds(677, 260, 97, 23);
		frame.getContentPane().add(btnButton_1);
		
		
		
	}
	private void serv4(){
		JCheckBox chckbxCheckBox_3 = new JCheckBox("check box4");
		chckbxCheckBox_3.setBounds(10, 377, 97, 23);
		frame.getContentPane().add(chckbxCheckBox_3);
		
		JLabel label_3 = new JLabel("192.192.192.192");
		label_3.setBounds(30, 353, 101, 14);
		frame.getContentPane().add(label_3);
		
		JLabel lblconnecton_3 = new JLabel("4connecton...");
		lblconnecton_3.setBounds(30, 415, 91, 14);
		frame.getContentPane().add(lblconnecton_3);
		
		JButton btnButton_2 = new JButton("button4");
		btnButton_2.setBounds(677, 360, 97, 23);
		frame.getContentPane().add(btnButton_2);
		
		
		
	}
	private void serv5(){
		JCheckBox chckbxCheckBox_4 = new JCheckBox("check box5");
		chckbxCheckBox_4.setBounds(10, 477, 97, 23);
		frame.getContentPane().add(chckbxCheckBox_4);

		JLabel label_4 = new JLabel("192.192.192.192");
		label_4.setBounds(30, 453, 101, 14);
		frame.getContentPane().add(label_4);
		
		JLabel lblconnecton_4 = new JLabel("5connecton...");
		lblconnecton_4.setBounds(30, 515, 91, 14);
		frame.getContentPane().add(lblconnecton_4);
		
		JButton btnButton_3 = new JButton("button5");
		btnButton_3.setBounds(677, 460, 97, 23);
		frame.getContentPane().add(btnButton_3);
		
	}
	private void serv6(){
		JCheckBox chckbxCheckBox_5 = new JCheckBox("check box6");
		chckbxCheckBox_5.setBounds(10, 577, 97, 23);
		frame.getContentPane().add(chckbxCheckBox_5);
		
		JLabel label_5 = new JLabel("192.192.192.192");
		label_5.setBounds(30, 553, 101, 14);
		frame.getContentPane().add(label_5);
		
		JLabel lblconnecton_5 = new JLabel("6connecton...");
		lblconnecton_5.setBounds(30, 615, 91, 14);
		frame.getContentPane().add(lblconnecton_5);	
		
		
		JButton btnButton_4 = new JButton("button6");
		btnButton_4.setBounds(677, 560, 97, 23);
		frame.getContentPane().add(btnButton_4);
		
		
	}
}
