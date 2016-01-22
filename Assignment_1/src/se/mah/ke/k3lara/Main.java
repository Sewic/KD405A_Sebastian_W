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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtxx;
	private JTextField txtNordenskildsgatan;
	private JTextField textField_2;
	private JTextField txtNamesnamesfieldcom;
	private JLabel textField_4;
	private JTextField txtMalm;
	private JTextField textField;
	private JTable table;
	/**
	 * @wbp.nonvisual location=837,199
	 */
	private final JButton button = new JButton("New button");

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
		setResizable(false);
		setTitle("Wictorin Gym");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 456);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchive = new JMenu("Archive");
		menuBar.add(mnArchive);
		
		JMenuItem mntmPrint = new JMenuItem("Print...");
		mntmPrint.setIcon(new ImageIcon(Main.class.getResource("/com/sun/java/swing/plaf/windows/icons/UpFolder.gif")));
		mnArchive.add(mntmPrint);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon(Main.class.getResource("/javax/swing/plaf/metal/icons/ocean/paletteClose-pressed.gif")));
		mnArchive.add(mntmExit);
		
		JMenu mnMember = new JMenu("Member");
		menuBar.add(mnMember);
		
		JMenuItem mntmNewMember = new JMenuItem("New Member");
		mntmNewMember.setIcon(new ImageIcon(Main.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		mnMember.add(mntmNewMember);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Find Member");
		mntmNewMenuItem.setIcon(new ImageIcon(Main.class.getResource("/javax/swing/plaf/metal/icons/ocean/expanded.gif")));
		mnMember.add(mntmNewMenuItem);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setIcon(null);
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.setIcon(new ImageIcon(Main.class.getResource("/com/sun/java/swing/plaf/motif/icons/Inform.gif")));
		mnHelp.add(mntmAbout);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mntmHelp.setIcon(new ImageIcon(Main.class.getResource("/com/sun/java/swing/plaf/motif/icons/Question.gif")));
		mnHelp.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUnregister = new JButton("Unregister");
		btnUnregister.setToolTipText("Are you sure?");
		btnUnregister.setForeground(Color.RED);
		btnUnregister.setBackground(Color.DARK_GRAY);
		btnUnregister.setBounds(530, 351, 89, 23);
		contentPane.add(btnUnregister);
		
		JTextArea txtrManagingGymmemberships = new JTextArea();
		txtrManagingGymmemberships.setFont(new Font("Yu Gothic UI Semilight", Font.ITALIC, 9));
		txtrManagingGymmemberships.setText("... Managing gym-memberships \r\n   since 2016.");
		txtrManagingGymmemberships.setBounds(505, 231, 189, 37);
		contentPane.add(txtrManagingGymmemberships);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 11, 141, 385);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Hugh Muscle"},
				{"Jane Muscle"},
				{"Frida Freoj"},
				{"Sten Stalk"},
				{"Stone Mork"},
				{"Hela Horenson"},
				{"K\u00E5tre Larra"},
				{"Names Namesfield"},
			},
			new String[] {
				"Members"
			}
		));
		scrollPane.setViewportView(table);
		
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSave.setBounds(410, 351, 89, 23);
		contentPane.add(btnSave);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(154, 29, 186, 196);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(0, 0, 25, 25);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 166, 173);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/images/workoutman.jpg")));
		
		JLabel lblMemberSince = new JLabel("Member since:");
		lblMemberSince.setBounds(10, 179, 69, 14);
		panel.add(lblMemberSince);
		lblMemberSince.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblMemberSince.setBackground(Color.WHITE);
		
		textField_4 = new JLabel();
		textField_4.setBounds(78, 176, 86, 20);
		panel.add(textField_4);
		textField_4.setFont(new Font("Tahoma", Font.ITALIC, 9));
		textField_4.setText("2016-01-20");
		
		JLabel lblNamesNamesfield = new JLabel("Hugh Muscle");
		lblNamesNamesfield.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 16));
		lblNamesNamesfield.setBounds(160, 236, 153, 23);
		contentPane.add(lblNamesNamesfield);
		
		JLabel lblAge = new JLabel("Date Of Birth:");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblAge.setBounds(161, 280, 79, 14);
		contentPane.add(lblAge);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblAdress.setBounds(324, 280, 37, 14);
		contentPane.add(lblAdress);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblPhone.setBounds(161, 330, 34, 14);
		contentPane.add(lblPhone);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblEmail.setBounds(161, 355, 32, 14);
		contentPane.add(lblEmail);
		
		txtxx = new JTextField();
		txtxx.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtxx.setText("19820112-42**");
		txtxx.setBounds(228, 277, 86, 20);
		contentPane.add(txtxx);
		txtxx.setColumns(10);
		
		txtNordenskildsgatan = new JTextField();
		txtNordenskildsgatan.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtNordenskildsgatan.setText("Northen-Shield Way 1");
		txtNordenskildsgatan.setBounds(363, 278, 136, 20);
		contentPane.add(txtNordenskildsgatan);
		txtNordenskildsgatan.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setText("07624235124");
		textField_2.setBounds(196, 327, 118, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		txtNamesnamesfieldcom = new JTextField();
		txtNamesnamesfieldcom.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtNamesnamesfieldcom.setText("names.field@field.com");
		txtNamesnamesfieldcom.setBounds(193, 352, 121, 20);
		contentPane.add(txtNamesnamesfieldcom);
		txtNamesnamesfieldcom.setColumns(10);
		
		txtMalm = new JTextField();
		txtMalm.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtMalm.setText("21622");
		txtMalm.setBounds(371, 327, 128, 20);
		contentPane.add(txtMalm);
		txtMalm.setColumns(10);
		
		JLabel lblZip = new JLabel("ZIP Code:");
		lblZip.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblZip.setBounds(324, 330, 48, 14);
		contentPane.add(lblZip);
		
		JLabel lblCity = new JLabel("Sex:");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCity.setBounds(160, 305, 23, 14);
		contentPane.add(lblCity);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField.setText("Malm\u00F6");
		textField.setColumns(10);
		textField.setBounds(349, 302, 150, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("City:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		label_1.setBounds(324, 305, 23, 14);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/images/Wictorn.png")));
		lblNewLabel_1.setBounds(395, 29, 672, 407);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		rdbtnNewRadioButton.setBounds(196, 301, 55, 22);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnF = new JRadioButton("Female");
		rdbtnF.setFont(new Font("Tahoma", Font.PLAIN, 8));
		rdbtnF.setBounds(259, 301, 55, 22);
		contentPane.add(rdbtnF);
		
		JLabel lblBeta = new JLabel("BETA 1.1");
		lblBeta.setBounds(591, 0, 48, 15);
		contentPane.add(lblBeta);
		lblBeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBeta.setFont(new Font("Verdana Pro Light", Font.ITALIC, 11));
		
	}
}
