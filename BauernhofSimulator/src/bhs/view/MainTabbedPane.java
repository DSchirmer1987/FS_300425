package bhs.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainTabbedPane extends JTabbedPane{
	private Dimension tabSize;
	private JPanel pnlUebersicht = new JPanel();
	private JPanel pnlStall = new JPanel();
	private JPanel pnlFeld = new JPanel();
	private JPanel pnlZucht = new JPanel();
	private Marktpanel pnlMarkt = new Marktpanel();
	private JTabbedPane tabMarkt;
	private JLabel[] tabs;
	
	public MainTabbedPane() {
		this.tabSize = new Dimension(150, 50);
		this.setTabPlacement(JTabbedPane.LEFT);
		this.add(pnlUebersicht);
		this.add(pnlStall);
		this.add(pnlFeld);
		this.add(pnlZucht);
		this.add(pnlMarkt);
		String[] tabTitles = {"Übersicht", "Stall", "Felder", "Zucht", "Markt"};
		this.setTabs(tabTitles);
	}
	
	private void setTabs(String[] tabTitles) {
		this.tabs = new JLabel[tabTitles.length];
		System.out.println(Arrays.toString(tabs));
		for (int i = 0; i < tabTitles.length; i++) {
			this.tabs[i] = new JLabel();
			this.tabs[i].setPreferredSize(tabSize);
			this.tabs[i].setFont(new Font("Arial", Font.PLAIN, 16));
			this.tabs[i].setText(tabTitles[i]);
			this.setTabComponentAt(i, this.tabs[i]);
		}
	}
}
