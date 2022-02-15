package bhs.view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;

import bhs.view.panels.FeldPanel;
import bhs.view.panels.Marktpanel;
import bhs.view.panels.StallPanel;
import bhs.view.panels.UebersichtPanel;
import bhs.view.panels.ZuchtPanel;

public class MainTabbedPane extends JTabbedPane{
	private Dimension tabSize;
	private UebersichtPanel pnlUebersicht = new UebersichtPanel();
	private StallPanel pnlStall = new StallPanel();
	private FeldPanel pnlFeld = new FeldPanel();
	private ZuchtPanel pnlZucht = new ZuchtPanel();
	private Marktpanel pnlMarkt = new Marktpanel();
	private JTabbedPane tabMarkt;
	private JLabel[] tabs;
	
	public UebersichtPanel getPnlUebersicht() {
		return pnlUebersicht;
	}
	
	public StallPanel getPnlStall() {
		return pnlStall;
	}

	public FeldPanel getPnlFeld() {
		return pnlFeld;
	}

	public ZuchtPanel getPnlZucht() {
		return pnlZucht;
	}

	public Marktpanel getPnlMarkt() {
		return pnlMarkt;
	}

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
		for (int i = 0; i < tabTitles.length; i++) {
			this.tabs[i] = new JLabel();
			this.tabs[i].setPreferredSize(tabSize);
			this.tabs[i].setFont(new Font("Arial", Font.PLAIN, 16));
			this.tabs[i].setText(tabTitles[i]);
			this.setTabComponentAt(i, this.tabs[i]);
		}
	}
}
