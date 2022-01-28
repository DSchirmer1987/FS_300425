package bhs.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

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
	private JTabbedPane tabMain;
	private JPanel pnlMarktBestand;
	private JTabbedPane tabMarkt;
	private JPanel pnlMarktAnkauf;
	private JPanel pnlMarktVerkauf;
	private JPanel pnlStatus;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		pnlStatus = new JPanel();
		contentPane.add(pnlStatus, BorderLayout.NORTH);
		pnlStatus.setLayout(new GridLayout(0, 5, 0, 0));
		
		lblkonto = new JLabel("Kontostand: xx");
		pnlStatus.add(lblkonto);
		
		lblFutter = new JLabel("Futterverbrauch: xx");
		pnlStatus.add(lblFutter);
		
		lblSilo = new JLabel("Silobestand: xx");
		pnlStatus.add(lblSilo);
		
		lblRunde = new JLabel("Runde: xx/XX");
		pnlStatus.add(lblRunde);
		
		btnNewRound = new JButton("Neue Runde");
		pnlStatus.add(btnNewRound);
		
		tabMain = new JTabbedPane(JTabbedPane.LEFT);
		tabMain.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(tabMain, BorderLayout.CENTER);
		
		pnlUebersicht = new JPanel();
		tabMain.addTab("Übersicht", null, pnlUebersicht, null);
		JLabel lblTabUebersicht = new JLabel("Übersicht");
		lblTabUebersicht.setPreferredSize(new Dimension(150, 50));
		lblTabUebersicht.setHorizontalAlignment(SwingConstants.CENTER);
		tabMain.setTabComponentAt(0, lblTabUebersicht);
		
		pnlStall = new JPanel();
		tabMain.addTab("Stall", null, pnlStall, null);
		
		pnlFeld = new JPanel();
		tabMain.addTab("Felder", null, pnlFeld, null);
		
		pnlZucht = new JPanel();
		tabMain.addTab("Zucht", null, pnlZucht, null);
		
		pnlMarkt = new JPanel();
		tabMain.addTab("Markt", null, pnlMarkt, null);
		pnlMarkt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		pnlMarkt.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		pnlMarktBestand = new JPanel();
		panel.add(pnlMarktBestand);
		
		tabMarkt = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabMarkt);
		
		pnlMarktAnkauf = new JPanel();
		tabMarkt.addTab("Ankauf", null, pnlMarktAnkauf, null);
		
		pnlMarktVerkauf = new JPanel();
		tabMarkt.addTab("Verkauf", null, pnlMarktVerkauf, null);
	}

}
