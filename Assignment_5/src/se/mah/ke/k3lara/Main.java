package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField humanName;
	private JTextField dogName;
	private JTextArea infoTextArea;
	private String setHumanName = "";
	private String setDogName = "";
	private Human human;
	private Dog dog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 52, 278, 47);
		contentPane.add(scrollPane);

		JTextArea infoTextArea_1 = new JTextArea();
		scrollPane.setViewportView(infoTextArea_1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(26, 151, 278, 47);
		contentPane.add(scrollPane_1);

		JTextArea errorTextArea = new JTextArea();
		scrollPane_1.setViewportView(errorTextArea);

		JLabel lblNewLabel = new JLabel("Error message");
		lblNewLabel.setBounds(26, 125, 74, 14);
		contentPane.add(lblNewLabel);

		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(26, 27, 46, 14);
		contentPane.add(lblInfo);

		humanName = new JTextField();
		humanName.setBounds(317, 45, 86, 20);
		contentPane.add(humanName);
		humanName.setColumns(10);

		dogName = new JTextField();
		dogName.setBounds(317, 110, 86, 20);
		contentPane.add(dogName);
		dogName.setColumns(10);
		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/** initalize the SettingHumanName method */
				SettingHumanName();
				String text = setHumanName;
				/**
				 * limits the characters of the human name to atleast 3 letters
				 */
				if (setHumanName.length() > 2) {
					human = new Human(text);
				} else {
					errorTextArea.append("WRONG, NAME NEEDS ATLEAST 3 CHARACTERS.");
				}

			}
		});
		btnNewButton.setBounds(314, 11, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Buy Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/** Initialize the SettingDogName method */
				SettingDogName();
				String text = setDogName;
				/**
				 * If a human name doesn't exist then an error message will
				 * appear
				 */
				if (setHumanName.length() > 0) {
					human.buyDog(new Dog(text));
				} else {
					errorTextArea.setText("WRONG, CREATE A HUMAN FIRST");
				}

			}
		});
		btnNewButton_1.setBounds(314, 76, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton("GetInfo");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				infoTextArea_1.setText(human.getInfo());

				errorTextArea.setText("");
			}
		});
		btnNewButton_3.setBounds(314, 152, 86, 46);
		contentPane.add(btnNewButton_3);

	}

	/** Converts a string to the assigned textField */
	private void SettingHumanName() {

		setHumanName = humanName.getText();

	}

	private void SettingDogName() {
		setDogName = dogName.getText();
	}

}
