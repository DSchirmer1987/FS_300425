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
	private JList pflanzenListe;
	private JList produktListe;
	private JList tierListe;
	private JList produktAnzahl;
	private JList tierAnzahl;
	private JList pflanzenAnzahl;
	
	public UebersichtPanel() {
		setLayout(new GridLayout(1, 0, 5, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Pflanzen");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		pflanzenListe = new JList();
		pflanzenListe.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pflanzenListe.setModel(new AbstractListModel() {
			String[] values = new String[] {"Karotte", "Chinakohl", "Kartoffel"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(pflanzenListe, BorderLayout.CENTER);
		
		pflanzenAnzahl = new JList();
		pflanzenAnzahl.setModel(new AbstractListModel() {
			String[] values = new String[] {"0", "1", "24"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(pflanzenAnzahl, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Tiere");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1, BorderLayout.NORTH);
		
		tierListe = new JList();
		tierListe.setModel(new AbstractListModel() {
			String[] values = new String[] {"Kuh", "Schaf", "Schwein"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel_1.add(tierListe, BorderLayout.CENTER);
		
		tierAnzahl = new JList();
		tierAnzahl.setModel(new AbstractListModel() {
			String[] values = new String[] {"1", "2", "3"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel_1.add(tierAnzahl, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Produkte");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2, BorderLayout.NORTH);
		
		produktListe = new JList();
		panel_2.add(produktListe, BorderLayout.CENTER);
		
		produktAnzahl = new JList();
		produktAnzahl.setModel(new AbstractListModel() {
			String[] values = new String[] {"2", "3", "4"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
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
