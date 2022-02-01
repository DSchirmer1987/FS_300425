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
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JList;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblkonto;
	private JLabel lblFutter;
	private JLabel lblSilo;
	private JLabel lblRunde;
	private JButton btnNewRound;
	private JPanel pnlStatus;
	private MainTabbedPane mtp;

	public JLabel getLblkonto() {
		return lblkonto;
	}

	public JLabel getLblFutter() {
		return lblFutter;
	}

	public JLabel getLblSilo() {
		return lblSilo;
	}

	public JLabel getLblRunde() {
		return lblRunde;
	}

	public MainTabbedPane getMtp() {
		return mtp;
	}

	public JButton getBtnNewRound() {
		return btnNewRound;
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 480);
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
		btnNewRound.setIconTextGap(0);
		btnNewRound.setMargin(new Insets(2, 2, 2, 2));
		btnNewRound.setFont(new Font("Arial", Font.PLAIN, 16));
		pnlStatus.add(btnNewRound);
		
		mtp = new MainTabbedPane();
		contentPane.add(mtp, BorderLayout.CENTER);

	}

}
