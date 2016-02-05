package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BikeMain extends JFrame {

	private JPanel contentPane;
	private static BikeStore store;
	private JTextField SizeField;
	private JTextField PriceField;
	private JTextField ColorField;
	private int setPrice = 0;
	private int setSize = 0;
	private String setColor = "color";
	private Bike bike;
	ArrayList<Bike> bikeStore = new ArrayList<Bike>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeMain frame = new BikeMain();
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
	public BikeMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		store = new BikeStore("Basses cykelaffär");
		for (int i = 0; i < 10; i++) {
			Bike b = new Bike("Black", 22, 1700);
			store.addBike("", 21, 1200);

		}

		PriceField = new JTextField();
		PriceField.setBounds(64, 108, 86, 20);
		contentPane.add(PriceField);
		PriceField.setColumns(10);

		SizeField = new JTextField();
		SizeField.setBounds(64, 139, 86, 20);
		contentPane.add(SizeField);
		SizeField.setColumns(10);

		ColorField = new JTextField();
		ColorField.setBounds(64, 170, 86, 20);
		contentPane.add(ColorField);
		ColorField.setColumns(10);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(189, 106, 335, 322);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
		scrollPane.setViewportView(textArea);

		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(27, 173, 46, 14);
		contentPane.add(lblColor);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(27, 111, 46, 14);
		contentPane.add(lblPrice);

		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(27, 142, 46, 14);
		contentPane.add(lblSize);

		/** Declares a button that creates a bike object into my ArrayList. */
		JButton btnNewButton = new JButton("ADD BIKE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
				BringColor();
				if (Constants.getCheckedColor(setColor) == true) {
					BringPrice();
					BringSize();
					setPrice = checkPrice(setPrice);
					setSize = checkSize(setSize);

					/**
					 * Adds a bike with chosen values that is put into the
					 * textFields. Else it prints an error message that guides
					 * you to making the right inputs.
					 */

					bikeStore.add(new Bike(setColor, setPrice, setSize));
					for (int i = 0; i < bikeStore.size(); i++) {
						textArea.append((i + 1) + "\n" + "Color: " + bikeStore.get(i).GetColor() + "\t" + "Price: "
								+ bikeStore.get(i).GetSize() + "SEK" + "\t" + "Tum: " + bikeStore.get(i).GetPrice()
								+ "\n");
					}
				} else {
					textArea.setText("Available colors (case sensitive): Black, Blue, Green, Indigo, White." + "\n"
							+ "Prices will not extend over 30.000 and size will not go over 28 tum.");
				}

			}

		});
		btnNewButton.setBounds(61, 201, 89, 23);
		contentPane.add(btnNewButton);

	}

	/** Converts price variable into a string on my textField. */
	private void BringPrice() {
		String text = PriceField.getText();
		setPrice = Integer.parseInt(text);
	}

	/** Converts size variable into a string on my textField. */
	private void BringSize() {
		String text = SizeField.getText();
		setSize = Integer.parseInt(text);
	}

	/** Brings the color into my textField. */
	private void BringColor() {
		setColor = ColorField.getText();

	}

	/** Returns price variable into my limitations from the constants class. */
	public int checkPrice(int exPrice) {
		if (exPrice < Constants.getMinPrice()) {
			exPrice = Constants.getMinPrice();
			return exPrice;
		} else if (exPrice > Constants.getMaxPrice()) {
			exPrice = Constants.getMaxPrice();
			return exPrice;
		} else {
			return exPrice;
		}
	}

	/** Returns price variable into my limitations from the constants class. */
	public int checkSize(int exSize) {
		if (exSize < Constants.getMinSize()) {
			exSize = Constants.getMinSize();
			return exSize;
		} else if (exSize > Constants.getMaxSize()) {
			exSize = Constants.getMaxSize();
			return exSize;
		} else {
			return exSize;
		}
	}
}
