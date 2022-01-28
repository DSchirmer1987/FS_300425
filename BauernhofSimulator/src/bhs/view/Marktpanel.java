package bhs.view;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Marktpanel extends JPanel {
	private JTabbedPane tabMarkt = new JTabbedPane(JTabbedPane.TOP);
	private JPanel pnlMarktBestand = new JPanel();
	private JPanel pnlMarktAnkauf = new JPanel();
	private JPanel pnlMarktVerkauf = new JPanel();
	
	public Marktpanel() {
		this.setLayout(new GridLayout(0, 1, 0, 0));
		this.add(pnlMarktBestand);
		this.add(tabMarkt);
		this.tabMarkt.addTab("Ankauf", pnlMarktAnkauf);
		this.tabMarkt.addTab("Verkauf", pnlMarktVerkauf);
	}
}
