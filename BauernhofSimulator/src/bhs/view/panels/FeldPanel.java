package bhs.view.panels;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class FeldPanel extends JPanel {
	private JList feldListe;
	private JButton btnPflanzen;
	private JComboBox cbPflanze;
	private JButton bntErnten;

	public JList getFeldListe() {
		return feldListe;
	}

	public JButton getBtnPflanzen() {
		return btnPflanzen;
	}

	public JComboBox getCbPflanze() {
		return cbPflanze;
	}

	public JButton getBntErnten() {
		return bntErnten;
	}

	/**
	 * Create the panel.
	 */
	public FeldPanel() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Felder");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		feldListe = new JList();
		panel.add(feldListe, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Feldaktionen");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		bntErnten = new JButton("Ernten");
		panel_2.add(bntErnten);
		
		JLabel lblNewLabel_2 = new JLabel("Bepflanzung");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2);
		
		cbPflanze = new JComboBox();
		panel_2.add(cbPflanze);
		
		btnPflanzen = new JButton("Bepflanzen");
		panel_2.add(btnPflanzen);

	}

}
