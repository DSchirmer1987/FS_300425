package bhs.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblkonto;
	private JLabel lblFutter;
	private JLabel lblSilo;
	private JLabel lblRunde;
	private JButton btnNewRound;
	private JPanel pnlUebersicht;
	private JPanel pnlStall;
	private JPanel pnlFeld;
	private JPanel pnlZucht;
	private JPanel pnlMarkt;
	private JTabbedPane tabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 5, 0, 0));
		
		lblkonto = new JLabel("Kontostand: xx");
		panel_1.add(lblkonto);
		
		lblFutter = new JLabel("Futterverbrauch: xx");
		panel_1.add(lblFutter);
		
		lblSilo = new JLabel("Silobestand: xx");
		panel_1.add(lblSilo);
		
		lblRunde = new JLabel("Runde: xx/XX");
		panel_1.add(lblRunde);
		
		btnNewRound = new JButton("Neue Runde");
		panel_1.add(btnNewRound);
		
		tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		
		pnlUebersicht = new JPanel();
		tabbedPane.addTab("Übersicht", null, pnlUebersicht, null);
		
		pnlStall = new JPanel();
		tabbedPane.addTab("Stall", null, pnlStall, null);
		
		pnlFeld = new JPanel();
		tabbedPane.addTab("Felder", null, pnlFeld, null);
		
		pnlZucht = new JPanel();
		tabbedPane.addTab("Zucht", null, pnlZucht, null);
		
		pnlMarkt = new JPanel();
		tabbedPane.addTab("Markt", null, pnlMarkt, null);
	}

}
