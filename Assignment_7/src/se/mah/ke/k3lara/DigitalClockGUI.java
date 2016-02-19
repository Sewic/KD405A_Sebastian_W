package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private ClockLogic clockLogic;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblKlockanr;
	private JLabel lblAlarmet;
	private JLabel lblAlarmStatus;
	private int setAlarm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DigitalClockGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Warn.gif")));
		setTitle("AlarmClock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 207, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(106, 207, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblHour = new JLabel("HOUR:");
		lblHour.setBounds(10, 193, 46, 14);
		contentPane.add(lblHour);

		JLabel lblMinute = new JLabel("MINUTE:");
		lblMinute.setBounds(106, 193, 46, 14);
		contentPane.add(lblMinute);

		JButton btnSetalarm = new JButton("SetAlarm");
		btnSetalarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int hours;
				int minute;
				try {
					hours = Integer.parseInt(textField.getText());
					minute = Integer.parseInt(textField_1.getText());
					clockLogic.setAlarm(hours, minute);
				} catch(NumberFormatException ex) {
					System.out.println("wrong!");
				}
				
			}
		});
		btnSetalarm.setBounds(202, 206, 89, 23);
		contentPane.add(btnSetalarm);

		JButton btnClearalarm = new JButton("ClearAlarm");
		btnClearalarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clockLogic.clearAlarm();
			}
		});
		btnClearalarm.setBounds(301, 206, 89, 23);
		contentPane.add(btnClearalarm);

		lblKlockanr = new JLabel("00:00:00");
		lblKlockanr.setFont(new Font("Vladimir Script", Font.PLAIN, 60));
		lblKlockanr.setBounds(93, 11, 240, 111);
		contentPane.add(lblKlockanr);

		lblAlarmet = new JLabel("No alarm is set.");
		lblAlarmet.setFont(new Font("Sitka Subheading", Font.BOLD, 11));
		lblAlarmet.setBounds(93, 105, 222, 20);
		contentPane.add(lblAlarmet);
		
		lblAlarmStatus = new JLabel("Not yet...");
		lblAlarmStatus.setFont(new Font("Sitka Subheading", Font.PLAIN, 30));
		lblAlarmStatus.setBounds(93, 123, 123, 48);
		contentPane.add(lblAlarmStatus);
	
	
		clockLogic = new ClockLogic(this);
		
	}

	public void setTimeOnLabel(String time) {
		lblKlockanr.setText(time);
			
		
	}
	public void setAlarmTimeOnLabel(String alarmTime) {
		lblAlarmet.setText(alarmTime);
	}

	public void activateAlarm(Boolean activate) {
		
		if(activate == true){
			lblAlarmStatus.setText("ALARM IS ACTIVATED");
			Toolkit.getDefaultToolkit().beep();
			
		} else {
			lblAlarmStatus.setText("Not yet...");
			
		}

	}
}
