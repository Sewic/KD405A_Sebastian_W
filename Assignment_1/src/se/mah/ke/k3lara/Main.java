package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
	//Test comment

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 467);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchive = new JMenu("Archive");
		menuBar.add(mnArchive);
		
		JMenuItem mntmPrint = new JMenuItem("Print...");
		mnArchive.add(mntmPrint);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnArchive.add(mntmExit);
		
		JMenu mnMember = new JMenu("Member");
		menuBar.add(mnMember);
		
		JMenuItem mntmNewMember = new JMenuItem("New Member");
		mnMember.add(mntmNewMember);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Find Member");
		mnMember.add(mntmNewMenuItem);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mnHelp.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 108, 385);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(573, 373, 89, 23);
		contentPane.add(btnSave);
	}
}
