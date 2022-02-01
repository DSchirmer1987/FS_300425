package bhs.view.panels;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class StallPanel extends JPanel {
	private JList schweinListe;
	private JList schafListe;
	private JList kuhListe;
	private JButton btnMelken;
	private JButton btnScheren;
	private JButton btnSchlachten;

	public JList getSchweinListe() {
		return schweinListe;
	}

	public JList getSchafListe() {
		return schafListe;
	}

	public JList getKuhListe() {
		return kuhListe;
	}

	public JButton getBtnMelken() {
		return btnMelken;
	}

	public JButton getBtnScheren() {
		return btnScheren;
	}

	public JButton getBtnSchlachten() {
		return btnSchlachten;
	}

	/**
	 * Create the panel.
	 */
	public StallPanel() {
		setLayout(new GridLayout(1, 0, 5, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Kuh");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		kuhListe = new JList();
		panel.add(kuhListe, BorderLayout.CENTER);
		
		btnMelken = new JButton("Melken");
		panel.add(btnMelken, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Schaf");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1, BorderLayout.NORTH);
		
		schafListe = new JList();
		panel_1.add(schafListe, BorderLayout.CENTER);
		
		btnScheren = new JButton("Scheren");
		panel_1.add(btnScheren, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Schwein");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2, BorderLayout.NORTH);
		
		schweinListe = new JList();
		panel_2.add(schweinListe, BorderLayout.CENTER);
		
		btnSchlachten = new JButton("Schlachten");
		panel_2.add(btnSchlachten, BorderLayout.SOUTH);

	}

}
