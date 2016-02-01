package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI extends JFrame {
	

	private JPanel contentPane;
	private JTextArea textArea;
	private Calculator calculator;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 257, 369);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		calculator = new Calculator();
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 11, 221, 50);
		contentPane.add(textArea);
		
		JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.clear();
				textArea.setText(String.valueOf(calculator.getResult()));
		
			}
		});
		btnClear.setBounds(178, 72, 53, 23);
		contentPane.add(btnClear);
		
		JButton button = new JButton("9");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(9);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button.setBounds(10, 140, 108, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(8);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_1.setBounds(123, 140, 108, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(7);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_2.setBounds(10, 174, 108, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(6);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_3.setBounds(123, 174, 108, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(5);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_4.setBounds(10, 208, 108, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(4);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_5.setBounds(123, 208, 108, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(3);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_6.setBounds(10, 242, 108, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(2);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_7.setBounds(123, 242, 108, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(1);
				textArea.setText(String.valueOf(calculator.getOperand()));
				
			}
		});
		button_8.setBounds(10, 276, 108, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(0);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_9.setBounds(123, 276, 108, 23);
		contentPane.add(button_9);
		
		JButton btnNewButton = new JButton("*");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.mult();
				textArea.setText(String.valueOf(calculator.getResult()));
			}
		});
		btnNewButton.setBounds(122, 106, 53, 23);
		contentPane.add(btnNewButton);
		
		JButton button_10 = new JButton("=");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.equals();
				textArea.setText(String.valueOf(calculator.getResult()));
				
				
			}
		});
		button_10.setBounds(178, 106, 53, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.plus();
				textArea.setText(String.valueOf(calculator.getResult()));
				
			}
		});
		button_11.setBounds(9, 106, 53, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.minus();
				textArea.setText(String.valueOf(calculator.getResult()));
			}
		});
		button_12.setBounds(65, 106, 53, 23);
		contentPane.add(button_12);
		
		
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE.setBounds(122, 72, 53, 23);
		contentPane.add(btnE);
		
		JButton button_14 = new JButton(".");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(".");
			}
		});
		button_14.setBounds(65, 72, 53, 23);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("/");
			}
		});
		button_15.setBounds(10, 72, 53, 23);
		contentPane.add(button_15);
	}
}
