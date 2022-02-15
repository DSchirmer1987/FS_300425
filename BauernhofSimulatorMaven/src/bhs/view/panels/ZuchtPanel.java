package bhs.view.panels;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class ZuchtPanel extends JPanel {
	private ZuchtStallPanel[] zuchtStaelle = new ZuchtStallPanel[15];
	
	public ZuchtStallPanel[] getZuchtStaelle() {
		return zuchtStaelle;
	}
	
	/**
	 * Create the panel.
	 */
	public ZuchtPanel() {
		setLayout(new GridLayout(0, 5, 0, 0));
		
		for(int i = 0; i < 15; i++) {
			zuchtStaelle[i] = new ZuchtStallPanel();
			add(zuchtStaelle[i]);
		}
	}
}
