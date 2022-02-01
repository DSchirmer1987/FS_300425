package bhs.view.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListSelectionModel;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;

public class UebersichtPanel extends JPanel {
	private JList<String> pflanzenListe;
	private JList<String> produktListe;
	private JList<String> tierListe;
	private JList<Integer> produktAnzahl;
	private JList<Integer> tierAnzahl;
	private JList<Integer> pflanzenAnzahl;
	
	public JList<String> getPflanzenListe() {
		return pflanzenListe;
	}

	public JList<String> getProduktListe() {
		return produktListe;
	}

	public JList<String> getTierListe() {
		return tierListe;
	}

	public JList<Integer> getProduktAnzahl() {
		return produktAnzahl;
	}

	public JList<Integer> getTierAnzahl() {
		return tierAnzahl;
	}

	public JList<Integer> getPflanzenAnzahl() {
		return pflanzenAnzahl;
	}

	public UebersichtPanel() {
		setLayout(new GridLayout(1, 0, 5, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Pflanzen");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		pflanzenListe = new JList<String>();
		pflanzenListe.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(pflanzenListe, BorderLayout.CENTER);
		
		pflanzenAnzahl = new JList<Integer>();
		panel.add(pflanzenAnzahl, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Tiere");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1, BorderLayout.NORTH);
		
		tierListe = new JList<String>();
		panel_1.add(tierListe, BorderLayout.CENTER);
		
		tierAnzahl = new JList<Integer>();
		panel_1.add(tierAnzahl, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Produkte");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2, BorderLayout.NORTH);
		
		produktListe = new JList<String>();
		panel_2.add(produktListe, BorderLayout.CENTER);
		
		produktAnzahl = new JList<Integer>();
		panel_2.add(produktAnzahl, BorderLayout.EAST);
		
		pflanzenListe.setSelectionModel(new DisabledItemSelection());
		pflanzenAnzahl.setSelectionModel(new DisabledItemSelection());
		tierListe.setSelectionModel(new DisabledItemSelection());
		tierAnzahl.setSelectionModel(new DisabledItemSelection());
		produktListe.setSelectionModel(new DisabledItemSelection());
		produktAnzahl.setSelectionModel(new DisabledItemSelection());
	}
	
	private class DisabledItemSelection extends DefaultListSelectionModel {
		public void setSelectionInterval(int index0, int index1) {
			super.setSelectionInterval(-1, -1);
		}
	}
}
