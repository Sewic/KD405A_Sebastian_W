package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;
	private ArrayList<Animal> myAnimals = new ArrayList<Animal>();
	private Dog dog;
	private Snake snake;
	private Cat cat;
	private JTextArea infoField;

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
		setBounds(100, 100, 583, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/**
		 * Adds object of dogs, cats and snakes to the abstract animal
		 * ArrayList.
		 */
		myAnimals.add(new Dog("'Orven'", 32, "'Dogus Dogusir'", false));
		myAnimals.add(new Cat("'Blomman'", 7, "'Catus Catilis'", 13));
		myAnimals.add(new Snake("'Slingran'", true, "'Snakus Snakili'"));
		myAnimals.add(new Dog("'Buster'", 7, "'Dogus Dogusir'", true));
		myAnimals.add(new Snake("'Sven'", false, "'Snakus Snakili'"));
		myAnimals.add(new Cat("'Alessa'", 3, "'Catus Catilis'", 15));
		myAnimals.add(new Dog("'Mörten'", 12, "'Dogus Dogusir'", false));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 101, 512, 279);
		contentPane.add(scrollPane);

		JTextArea infoField = new JTextArea();
		infoField.setEditable(false);
		scrollPane.setViewportView(infoField);

		JLabel lblNewLabel = new JLabel("My Animal ArrayList.");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		lblNewLabel.setBounds(32, 76, 238, 14);
		contentPane.add(lblNewLabel);
		String text = infoField.getText();

		/**
		 * Iterates through the ArrayLists size. And prints the abstract GetInfo
		 * method to my textField.
		 */
		for (int i = 0; i < myAnimals.size(); i++) {
			infoField.append(myAnimals.get(i).GetInfo());
		}

		// infoField.append(text);
	}
}
