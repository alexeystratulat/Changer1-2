package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Checkbox;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;

import org.ini4j.Ini;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TheMostWindow {
	private String mainProgramFolder;
	private String listName;
	private Ini resources;
	private String resFileName;
	private String selectedItem; // name of choisen combobox
	ArrayList<Servers> listOfServers;
	Connect ckeckConnection;

	private JFrame frame;

	JCheckBox chckbxCheckBox, chckbxCheckBox_1,chckbxCheckBox_2,chckbxCheckBox_3,chckbxCheckBox_4,chckbxCheckBox_5;
	JLabel label,label_1,label_2,label_3,label_4,label_5;
	JLabel lblconnecton,lblconnecton_1,lblconnecton_2,lblconnecton_3,lblconnecton_4,lblconnecton_5;
	 

	public TheMostWindow(Ini resources, String listName, String resFileName, String selectedItem,
			ArrayList<Servers> listOfServers, String mainProgramFolder) {
		this.resources = resources;
		this.listName = listName;
		this.resFileName = resFileName;
		this.mainProgramFolder = mainProgramFolder;
		this.selectedItem = selectedItem;
		this.listOfServers = listOfServers;
		System.out.println(resources.get("auth", "Username").toString());
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel(selectedItem);
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

		// 1st server
		chckbxCheckBox = new JCheckBox(listOfServers.get(0).getServerName().toString());
		chckbxCheckBox.setBounds(10, 77, 97, 23);
		//
		label = new JLabel(listOfServers.get(0).getIpAdress().toString());
		label.setBounds(30, 53, 101, 14);
		//
		//
		// 2nd
		chckbxCheckBox_1 = new JCheckBox(listOfServers.get(1).getServerName().toString());
		chckbxCheckBox_1.setBounds(10, 177, 97, 23);
		//
		label_1 = new JLabel(listOfServers.get(1).getIpAdress().toString());
		label_1.setBounds(30, 153, 101, 14);
		
		// 3nd
		chckbxCheckBox_2 = new JCheckBox(listOfServers.get(2).getServerName().toString());
		chckbxCheckBox_2.setBounds(10, 277, 97, 23);
		label_2 = new JLabel(listOfServers.get(2).getIpAdress().toString());
		label_2.setBounds(30, 253, 101, 14);
		// 4nd
		chckbxCheckBox_3 = new JCheckBox(listOfServers.get(3).getServerName().toString());
		chckbxCheckBox_3.setBounds(10, 377, 97, 23);
		
		label_3 = new JLabel(listOfServers.get(3).getIpAdress().toString());
		label_3.setBounds(30, 353, 101, 14);
		//5
		chckbxCheckBox_4 = new JCheckBox(listOfServers.get(4).getServerName().toString());
		chckbxCheckBox_4.setBounds(10, 477, 97, 23);
		label_4 = new JLabel(listOfServers.get(4).getIpAdress().toString());
		label_4.setBounds(30, 453, 101, 14);
		//6
		chckbxCheckBox_5 = new JCheckBox(listOfServers.get(5).getServerName().toString());
		chckbxCheckBox_5.setBounds(10, 577, 97, 23);
		label_5 = new JLabel(listOfServers.get(5).getIpAdress().toString());
		label_5.setBounds(30, 553, 101, 14);

		//
		serv1();
		serv2();
		serv3();
		serv4();
		serv5();
		serv6();

		JButton button = new JButton("<< Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				WindowOne w1 = new WindowOne(resources, listName, resFileName, mainProgramFolder);

				w1.initialize();

				frame.setVisible(false);

			}
		});
		button.setBounds(685, 655, 89, 23);
		frame.getContentPane().add(button);

		frame.setVisible(true);
	}

	private void serv1() {

		frame.getContentPane().add(chckbxCheckBox);
		//
		frame.getContentPane().add(label);
		//
		lblconnecton = new JLabel("1connecton...");
		lblconnecton.setBounds(30, 115, 131, 14);
		frame.getContentPane().add(lblconnecton);

		Thread thread1 = new Thread() {
			public void run() {
				System.out.println(resources.get("auth", "Username").toString());
				Connect ckeckConnection = new Connect(listOfServers.get(0), resources.get("auth", "Username"),
						resources.get("auth", "Password"), mainProgramFolder, resources);
				lblconnecton.setText(ckeckConnection.checkConnection());

			}
		};
		thread1.start();

		JButton btnNewButton = new JButton("button1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(677, 60, 97, 23);
		frame.getContentPane().add(btnNewButton);

	}

	private void serv2() {		
		
		frame.getContentPane().add(chckbxCheckBox_1);
		//		
		frame.getContentPane().add(label_1);	
		//
		lblconnecton_1 = new JLabel("2connecton...");
		lblconnecton_1.setBounds(30, 215, 131, 14);
		frame.getContentPane().add(lblconnecton_1);
		Thread thread1 = new Thread() {
			public void run() {
				System.out.println(resources.get("auth", "Username").toString());
				Connect ckeckConnection = new Connect(listOfServers.get(1), resources.get("auth", "Username"),
						resources.get("auth", "Password"), mainProgramFolder, resources);
				lblconnecton_1.setText(ckeckConnection.checkConnection());
				
			}
		};
		thread1.start();

		JButton btnButton = new JButton("button2");
		btnButton.setBounds(677, 160, 97, 23);
		frame.getContentPane().add(btnButton);
		
		
		
		

	}

	private void serv3() {
		
		
		frame.getContentPane().add(chckbxCheckBox_2);		
		
		frame.getContentPane().add(label_2);

		JLabel lblconnecton_2 = new JLabel("3connecton...");
		lblconnecton_2.setBounds(30, 315, 131, 14);
		frame.getContentPane().add(lblconnecton_2);

		JButton btnButton_1 = new JButton("button3");
		btnButton_1.setBounds(677, 260, 97, 23);
		frame.getContentPane().add(btnButton_1);

	}

	private void serv4() {
		
		
		frame.getContentPane().add(chckbxCheckBox_3);

		
		
		frame.getContentPane().add(label_3);

		JLabel lblconnecton_3 = new JLabel("4connecton...");
		lblconnecton_3.setBounds(30, 415, 131, 14);
		frame.getContentPane().add(lblconnecton_3);

		JButton btnButton_2 = new JButton("button4");
		btnButton_2.setBounds(677, 360, 97, 23);
		frame.getContentPane().add(btnButton_2);

	}

	private void serv5() {
		
		
		frame.getContentPane().add(chckbxCheckBox_4);

		
		
		frame.getContentPane().add(label_4);

		JLabel lblconnecton_4 = new JLabel("5connecton...");
		lblconnecton_4.setBounds(30, 515, 131, 14);
		frame.getContentPane().add(lblconnecton_4);

		JButton btnButton_3 = new JButton("button5");
		btnButton_3.setBounds(677, 460, 97, 23);
		frame.getContentPane().add(btnButton_3);

	}

	private void serv6() {
		
		
		frame.getContentPane().add(chckbxCheckBox_5);

		
		
		frame.getContentPane().add(label_5);

		JLabel lblconnecton_5 = new JLabel("6connecton...");
		lblconnecton_5.setBounds(30, 615, 131, 14);
		frame.getContentPane().add(lblconnecton_5);

		JButton btnButton_4 = new JButton("button6");
		btnButton_4.setBounds(677, 560, 97, 23);
		frame.getContentPane().add(btnButton_4);

	}
}
