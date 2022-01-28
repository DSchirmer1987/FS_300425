package bhs.view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainTabbedPane extends JTabbedPane{
	private Dimension tabSize;
	private JPanel pnlUebersicht;
	private JPanel pnlStall;
	private JPanel pnlFeld;
	private JPanel pnlZucht;
	private JPanel pnlMarkt;
	private JTabbedPane tabMarkt;
	private JLabel[] tabs;
	
	public MainTabbedPane() {
		this.tabSize = new Dimension(150, 50);
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
		for (JLabel jLabel : tabs) {
			jLabel = new JLabel();
			jLabel.setPreferredSize(tabSize);
		}
		for (int i = 0; i < tabTitles.length; i++) {
			this.tabs[i].setText(tabTitles[i]);
			this.setTabComponentAt(i, this.tabs[i]);
		}
	}
}
