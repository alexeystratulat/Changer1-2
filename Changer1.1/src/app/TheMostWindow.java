package app;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;

import org.ini4j.Ini;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
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
	int ForCheckboxDistance2, forLableIPDistance2, forConnectionDistance2, forTypeOfPromptsDistance2,
			forEditButtonDistance2;

	private JFrame frame;

	JButton[] editButton = new JButton[10];
	JCheckBox[] CheckBoxes = new JCheckBox[10];
	// JCheckBox chckbxCheckBox, chckbxCheckBox_1, chckbxCheckBox_2,
	// chckbxCheckBox_3, chckbxCheckBox_4, chckbxCheckBox_5;
	JLabel label, label_1, label_2, label_3, label_4, label_5;
	JLabel lblconnecton, lblconnecton_1, lblconnecton_2, lblconnecton_3, lblconnecton_4, lblconnecton_5;
	JLabel typeOfprompts, typeOfprompts_1, typeOfprompts_2, typeOfprompts_3, typeOfprompts_4, typeOfprompts_5;

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

		System.out.println(listOfServers.size());
		
		forConnectionDistance2 = 115;
		ForCheckboxDistance2 = 77;
		forLableIPDistance2 = 53;
		forTypeOfPromptsDistance2 = 115;
		forEditButtonDistance2 = 77;
		for (int counter = 0; counter < listOfServers.size(); counter++) {

			showServers(listOfServers.get(counter), counter, ForCheckboxDistance2, forLableIPDistance2,
					forConnectionDistance2, forTypeOfPromptsDistance2, forEditButtonDistance2);
			ForCheckboxDistance2 += 100;
			forLableIPDistance2 += 100;
			forConnectionDistance2 += 100;
			forTypeOfPromptsDistance2 += 100;
			forEditButtonDistance2 += 100;

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

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

		JButton switchToManualButton = new JButton("Switch to manual");
		switchToManualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.out.println("Bytton is typed");

			}
		});
		switchToManualButton.setBounds(185, 655, 170, 23);
		frame.getContentPane().add(switchToManualButton);

		JButton switchToManualAutomation = new JButton("Switch to automation");
		switchToManualAutomation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.out.println("Bytton is typed");

			}
		});
		switchToManualAutomation.setBounds(385, 655, 170, 23);
		frame.getContentPane().add(switchToManualAutomation);

	}

	//
	private void showServers(final Servers server, final int counter, int ForCheckboxDistance2, int forLableIPDistance2,
			int forConnectionDistance2, int forTypeOfPromptsDistance2, int forEditButtonDistance2) {
		CheckBoxes[counter] = new JCheckBox(server.getServerName().toString());

		CheckBoxes[counter].setBounds(10, ForCheckboxDistance2, 97, 23);
		//
		//
		label = new JLabel(server.getIpAdress().toString());
		label.setBounds(30, forLableIPDistance2, 101, 14);

		frame.getContentPane().add(CheckBoxes[counter]);
		//
		frame.getContentPane().add(label);
		//
		lblconnecton = new JLabel("connecton...");
		lblconnecton.setBounds(30, forConnectionDistance2, 131, 14);
		lblconnecton.setForeground(Color.BLUE);
		//
		typeOfprompts = new JLabel("typeOfprompts...!");
		typeOfprompts.setBounds(150, forTypeOfPromptsDistance2, 131, 14);
		//
		frame.getContentPane().add(lblconnecton);
		frame.getContentPane().add(typeOfprompts);
		System.out.println("======" + server.getIpAdress().toString());

		Thread thread1 = new Thread() {
			public void run() {

				System.out.println("CheckConnection = " + server.getIpAdress().toString());
				ckeckConnection = new Connect(server, resources.get("auth", "Username"),
						resources.get("auth", "Password"), mainProgramFolder, resources);
				lblconnecton.setText(ckeckConnection.checkConnection());

			}
		};
		thread1.start();

		editButton[counter] = new JButton("edit");
		editButton[counter].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.out.println("BUTTON TYPED");
				System.out.println(CheckBoxes[counter].isSelected());
			}
		});
		editButton[counter].setBounds(677, forEditButtonDistance2, 97, 23);
		frame.getContentPane().add(editButton[counter]);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private void toShowBlock3() {
		//
		String pahtForVportal = theDir + "\\" + nameOfCheckBox3;

		checkBox3 = new JCheckBox(nameOfCheckBox3);
		checkBox3.setBounds(26, 155, 97, 23);
		frmChangePrompts.getContentPane().add(checkBox3);

		JTextPane nameOfServ3 = new JTextPane();
		nameOfServ3.setText(massOfIp[2].toString());
		nameOfServ3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nameOfServ3.setBackground(SystemColor.menu);
		nameOfServ3.setBounds(129, 155, 97, 20);
		frmChangePrompts.getContentPane().add(nameOfServ3);
		//
		statusOfServ3 = new JLabel("connection...");
		statusOfServ3.setFont(new Font("Linux Biolinum G", Font.BOLD, 14));
		statusOfServ3.setBounds(36, 188, 159, 14);
		frmChangePrompts.getContentPane().add(statusOfServ3);
		//
		promptsForServ3 = new JLabel("");
		promptsForServ3.setEnabled(true);
		promptsForServ3.setFont(new Font("Linux Biolinum G", Font.PLAIN, 12));
		promptsForServ3.setBounds(236, 155, 123, 23);
		frmChangePrompts.getContentPane().add(promptsForServ3);
		//
		Thread thread = new Thread() {
			public void run() {
				Connect conn = new Connect(massOfIp[2], pahtForVportal);
				statusOfServ3.setText(conn.checkConnection());
				// enabled button in case of connection established
				if (statusOfServ3.getText().toString().equals("connected")) {
					statusOfServ3.setForeground(Color.BLUE);
					buttonPromptsToAutoEnabled = true;
					buttonPromptsToManualEnable = true;
					btnSwitch.setEnabled(buttonPromptsToAutoEnabled);
					buttonSwitchToManual.setEnabled(buttonPromptsToManualEnable);
					// checking enadled prompts
					Comparing checkingEnabledPrompts = new Comparing(pahtForVportal);
					if (checkingEnabledPrompts.compareFiles().equals("automated prompts")) {
						promptsForServ3.setForeground(Color.BLUE);

					}
					if (checkingEnabledPrompts.compareFiles().equals("manual prompts")) {
						promptsForServ3.setForeground(Color.RED);

					}
					if (checkingEnabledPrompts.compareFiles().equals("unknown")) {
						promptsForServ3.setForeground(Color.ORANGE);

					}

					promptsForServ3.setText(checkingEnabledPrompts.compareFiles());
				}
				if (statusOfServ3.getText().toString().equals("connection error!")) {
					statusOfServ3.setForeground(Color.RED);

				}

			}
		};
		thread.start();
		// creating directory
		File directoryForServ1 = new File(pahtForVportal);

		if (!directoryForServ1.exists()) {
			System.out.println("creating directory ");

			directoryForServ1.mkdir();
		}

	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	

}
