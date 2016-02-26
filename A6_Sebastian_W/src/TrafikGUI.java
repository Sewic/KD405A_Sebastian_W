import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class TrafikGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFrom;
	private JTextField textTo;
	private JTextField textStation;
	private ArrayList<Station> searchStations;
	private JTextArea textAreaStation;
	private JTextArea textResa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {

					TrafikGUI frame = new TrafikGUI();
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
	public TrafikGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 472);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFrom = new JTextField();
		textFrom.setBounds(22, 54, 121, 20);
		contentPane.add(textFrom);
		textFrom.setColumns(10);

		textTo = new JTextField();
		textTo.setColumns(10);
		textTo.setBounds(22, 112, 121, 20);
		contentPane.add(textTo);

		JLabel lblNewLabel = new JLabel("Till:");
		lblNewLabel.setBounds(22, 87, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblFrn = new JLabel("Fr\u00E5n:");
		lblFrn.setBounds(22, 29, 46, 14);
		contentPane.add(lblFrn);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(153, 52, 513, 114);
		contentPane.add(scrollPane);

		textResa = new JTextArea();
		textResa.setEditable(false);
		textResa.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		scrollPane.setViewportView(textResa);

		JButton btnResa = new JButton("Hitta resa");
		btnResa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textResa.setText("Hittar resor...");

				new ResThread().start();

			}
		});
		btnResa.setBounds(22, 143, 121, 23);
		contentPane.add(btnResa);

		textStation = new JTextField();
		textStation.setBounds(22, 263, 121, 20);
		contentPane.add(textStation);
		textStation.setColumns(10);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(153, 261, 513, 112);
		contentPane.add(scrollPane_1);

		textAreaStation = new JTextArea();
		textAreaStation.setEditable(false);
		textAreaStation.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		scrollPane_1.setViewportView(textAreaStation);

		JLabel lblSkStation = new JLabel("S\u00F6k station:");
		lblSkStation.setBounds(22, 238, 59, 14);
		contentPane.add(lblSkStation);

		JButton btnStation = new JButton("Hitta station\r\n");
		btnStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textAreaStation.setText("Hittar matchande stationer...");

				new StationThread().start();
			}
		});
		btnStation.setBounds(22, 294, 121, 23);
		contentPane.add(btnStation);

		JLabel lblSknetrafiken = new JLabel("Sk\u00E5netrafiken");
		lblSknetrafiken.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblSknetrafiken.setBounds(289, 17, 112, 32);
		contentPane.add(lblSknetrafiken);

	}

	private class ResThread extends Thread {
		@Override
		public void run() {

			String from = textFrom.getText();
			String to = textTo.getText();
			String resan = Constants.getURL(from, to, 10);
			int hour = Calendar.HOUR_OF_DAY;
			int minute = Calendar.MINUTE;

			Journeys journeys = Parser.getJourneys(resan);
			textResa.setText("");
			for (Journey journey : journeys.getJourneys()) {

				System.out.print(journey.getStartStation() + " - ");
				System.out.print(journey.getEndStation());
				DecimalFormat decimalFormat = new DecimalFormat("00");
				String time = decimalFormat.format(journey.getDepDateTime().get(hour)) + ":"
						+ decimalFormat.format(journey.getDepDateTime().get(minute));

				textResa.append("Your transportation at: " + journey.getStartStation() + " departs to "
						+ journey.getEndStation() + " at " + time + " which is in " + journey.getTimeToDeparture()
						+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late" + "\n");
			}

		}
	}

	private class StationThread extends Thread {
		@Override
		public void run() {

			String info = textStation.getText();
			searchStations = new ArrayList<Station>();
			searchStations.addAll(Parser.getStationsFromURL(info));
			textAreaStation.setText("");
			for (Station s : searchStations) {
				textAreaStation.append(s.getStationName() + " number:" + s.getStationNbr() + "\n");
			}

		}
	}

}
