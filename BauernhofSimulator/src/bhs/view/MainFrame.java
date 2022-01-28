package bhs.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblkonto;
	private JLabel lblFutter;
	private JLabel lblSilo;
	private JLabel lblRunde;
	private JButton btnNewRound;
	private JPanel pnlStatus;
	private MainTabbedPane mtp;

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
		lblkonto.setFont(new Font("Arial", Font.PLAIN, 16));
		pnlStatus.add(lblkonto);
		
		lblFutter = new JLabel("Futterverbrauch: xx");
		lblFutter.setFont(new Font("Arial", Font.PLAIN, 16));
		pnlStatus.add(lblFutter);
		
		lblSilo = new JLabel("Silobestand: xx");
		lblSilo.setFont(new Font("Arial", Font.PLAIN, 16));
		pnlStatus.add(lblSilo);
		
		lblRunde = new JLabel("Runde: xx/XX");
		lblRunde.setFont(new Font("Arial", Font.PLAIN, 16));
		pnlStatus.add(lblRunde);
		
		btnNewRound = new JButton("Neue Runde");
		btnNewRound.setFont(new Font("Arial", Font.PLAIN, 16));
		pnlStatus.add(btnNewRound);
		
		mtp = new MainTabbedPane();
		contentPane.add(mtp, BorderLayout.CENTER);

	}

}
