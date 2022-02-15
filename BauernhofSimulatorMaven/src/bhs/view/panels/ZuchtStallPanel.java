package bhs.view.panels;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ZuchtStallPanel extends JPanel {
	
	private JButton btnZucht;
	private JComboBox cbTier;
	private Integer counter;
	private JLabel lblZuchtstall;
	private static Integer staticCounter = 1;
	
	public JButton getBtnZucht() {
		return btnZucht;
	}

	public JComboBox getCbTier() {
		return cbTier;
	}

	public JLabel getLblZuchtstall() {
		return lblZuchtstall;
	}

	public ZuchtStallPanel() {
		super();
		this.counter = staticCounter;
		this.setLayout(new BorderLayout(0,0));
		this.lblZuchtstall = new JLabel("Zuchtstall " + this.counter);
		lblZuchtstall.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(lblZuchtstall, BorderLayout.NORTH);
		JPanel centerPanel = new JPanel();
		this.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(0, 1, 0, 0));
		btnZucht = new JButton("Zucht starten");
		cbTier = new JComboBox<>();
		centerPanel.add(cbTier);
		centerPanel.add(btnZucht);
		this.staticCounter++;
		this.setVisible(false);
	}
}
