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
		
		
		myAnimals.add(new Dog(32, "Dogus Dogusir", false, "Gubben"));
		myAnimals.add(new Cat(7, "Catus Catilis", 13));
		myAnimals.add(new Snake(true, "Snakus Snakili"));
		myAnimals.add(new Dog(7, "Dogus Dogusir", true, "Flubber"));
		myAnimals.add(new Snake(false, "Snakus Snakili"));
		myAnimals.add(new Cat(3, "Catus Catilis", 15));
		myAnimals.add(new Dog(12, "Dogus Dogusir", false, "Kraken"));
		
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
		
		for(int i = 0; i < myAnimals.size(); i++){
			infoField.append(myAnimals.get(i).GetInfo());
		}
		
	//infoField.append(text);
	}
}
