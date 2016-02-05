package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DropMode;
import java.util.Random;
public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House[] houses;
	private House house;
	private House house2;
	private House house3;
	private ArrayList<House> myHouseList = new ArrayList<House>();
    private Random rand = new Random();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 0, 299, 261);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea.setWrapStyleWord(true);
		textArea.setColumns(1);
		scrollPane.setViewportView(textArea);
		textArea.setRows(100);
		
		
		house = new House(1801, 440);
		house2 = new House(1994, 600);
		house3 = new House(2001, 911);
		System.out.println("#1");
		System.out.println("This house is this many kvm: " + String.valueOf(house.getSize()));
		System.out.println("This house is built this year: " + String.valueOf(house.getYearBuilt()));
		System.out.println("#2");
		System.out.println("This house is this many kvm: " + String.valueOf(house2.getSize()));
		System.out.println("This house is built this year: " + String.valueOf(house2.getYearBuilt()));
		System.out.println("#3");
		System.out.println("This house is this many kvm: " + String.valueOf(house3.getSize()));
		System.out.println("This house is built this year: " + String.valueOf(house3.getYearBuilt()));
		
		textArea.append( "\n"+ "Uppgift 1.2" + "\n");
		textArea.append("#1: ");
		textArea.append("This house is this many kvm: " + String.valueOf(house.getSize())+ "\n");
		textArea.append("This house is built this year: " + String.valueOf(house.getYearBuilt())+ "\n");
		textArea.append("#2: ");
		textArea.append("This house is this many kvm: " + String.valueOf(house2.getSize()) + "\n");
		textArea.append("This house is built this year: " + String.valueOf(house2.getYearBuilt())+ "\n");
		textArea.append("#3: ");
		textArea.append("This house is this many kvm: " + String.valueOf(house3.getSize())+ "\n");
		textArea.append("This house is built this year: " + String.valueOf(house3.getYearBuilt())+ "\n");
		
		houses = new House[10];
		houses[0] = new House(1899, 249);
		houses[1] = new House(1949, 49);
		houses[2] = new House(1849, 29);
		houses[3] = new House(1911, 240);
		houses[4] = new House(2014, 256);
		houses[5] = new House(1945, 549);
		houses[6] = new House(1966, 429);
		houses[7] = new House(1865, 149);
		houses[8] = new House(1923, 849);
		houses[9] = new House(1801, 749);
		textArea.append("\n"+ "Uppgift 1.3" + "\n");
		for(int i = 0; i < 10; i++){
			textArea.append(("\n"+ "#" +(+i+1) + "\n") + "This house is this many kvm: " + String.valueOf(houses[i].getSize())+ "\n" + ("This house is built this year: " + String.valueOf(houses[i].getYearBuilt())));
			
		} 
		textArea.append("\n"+ "Uppgift 1.4" + "\n");
		for(int i = 0; i < 100; i++){
			myHouseList.add(new House(rand.nextInt(2015), rand.nextInt(1000)));
			
		
		} 
		for(House house : myHouseList){
		System.out.println("yearBuilt: " + house.getYearBuilt() + " houseSize: " + house.getSize());
		textArea.append("yearBuilt: " + house.getYearBuilt() +"\n" + " houseSize: " + house.getSize());
	}
}
}
