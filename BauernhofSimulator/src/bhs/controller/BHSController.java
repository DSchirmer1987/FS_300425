package bhs.controller;

import java.awt.EventQueue;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import bhs.view.MainFrame;

public class BHSController {
	private MainFrame frame;
	private JList<String> pflanzenListe;
	private JList<String> produktListe;
	private JList<String> tierListe;
	private JList<Integer> produktAnzahl;
	private JList<Integer> tierAnzahl;
	private JList<Integer> pflanzenAnzahl;
	private JLabel lblkonto;
	private JLabel lblFutter;
	private JLabel lblSilo;
	private JLabel lblRunde;
	private JButton btnNewRound;
	
	public BHSController() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					init();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void init() {
		this.frame = new MainFrame();
		this.pflanzenListe = frame.getMtp().getPnlUebersicht().getPflanzenListe();
		this.produktListe = frame.getMtp().getPnlUebersicht().getProduktListe();
		this.tierListe = frame.getMtp().getPnlUebersicht().getTierListe();
		this.pflanzenAnzahl = frame.getMtp().getPnlUebersicht().getPflanzenAnzahl();
		this.tierAnzahl = frame.getMtp().getPnlUebersicht().getTierAnzahl();
		this.produktAnzahl = frame.getMtp().getPnlUebersicht().getProduktAnzahl();
		this.lblkonto = frame.getLblkonto();
		this.lblFutter = frame.getLblFutter();
		this.lblSilo = frame.getLblSilo();
		this.lblRunde = frame.getLblRunde();
		this.btnNewRound = frame.getBtnNewRound();
		this.setPflanzen();
	}
	
	public void setPflanzen() {
//		Daten der Pflanzen holen
		String[] pflanzen = {"Chinakohl", "Karotten", "Birne", "Kartoffel", "Apfel"};
		Integer[] pflanzenAnzahl = {1,2,3,4,5};
		
		this.pflanzenListe.setModel(new AbstractListModel<String>() {
			String[] values = pflanzen;
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		this.pflanzenAnzahl.setModel(new AbstractListModel<Integer>() {
			Integer[] values = pflanzenAnzahl;
			public int getSize() {
				return values.length;
			}
			public Integer getElementAt(int index) {
				return values[index];
			}
		});
	}
}
