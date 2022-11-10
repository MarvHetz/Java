package tankstelle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

import uis.AdminGUI;
import uis.Anzeige;
import uis.GUI;
import uis.HandyApp;
import uis.Zapfsaeule;

public class Controller
{
	private AdminGUI adminGUI;
	private Anzeige anzeige;
	private HandyApp handyApp;
	private DefaultListModel<Sprit> sprittpreise;
	private Zapfsaeule zapfsaeule;

	public Controller()
	{
		sprittpreise = new DefaultListModel<Sprit>();
	}

	public void aendern(Sprit sprit, String name, double preis)
	{
		sprit.setName(name);
		sprit.setPreis(preis);
	}

	public void hinzufuegen(String name, double preis)
	{
		sprittpreise.addElement(new Sprit(name, preis));
	}

	public void loeschen(Sprit zuloeschen)
	{
		sprittpreise.removeElement(zuloeschen);
	}

	public void oeffneAdminGUI()
	{
		adminGUI = new AdminGUI(this);
		adminGUI.setzeModel(sprittpreise);
		adminGUI.setzeActionListener(new aendernActionListener(adminGUI), new hinzufuegenActionListener(adminGUI),
				new loeschenActionListener(adminGUI));
	}

	public void oeffneAnzeige()
	{
		anzeige = new Anzeige();
		anzeige.setzeModel(sprittpreise);
	}

	public void oeffneHandyApp()
	{
		handyApp = new HandyApp(this);
		handyApp.setzeModel(sprittpreise);
	}

	public void oeffneZapfsaeule()
	{
		zapfsaeule = new Zapfsaeule(this);
		zapfsaeule.setzeModel(sprittpreise);
	}

	public double tanken(int menge, Sprit sprit)
	{
		return menge * sprit.getPreis();
	}

	class aendernActionListener implements ActionListener
	{
		private GUI gui;

		public aendernActionListener(GUI gui)
		{
			this.gui = gui;
		}

		@Override
		public void actionPerformed(ActionEvent e)
		{
			aendern(gui.getSprit(), gui.getSpritName(), gui.getPreis());
		}
	}

	class hinzufuegenActionListener implements ActionListener
	{
		private GUI gui;

		public hinzufuegenActionListener(GUI gui)
		{
			this.gui = gui;
		}

		@Override
		public void actionPerformed(ActionEvent e)
		{
			hinzufuegen(gui.getSpritName(), gui.getPreis());
		}
	}

	class loeschenActionListener implements ActionListener
	{
		private GUI gui;

		public loeschenActionListener(GUI gui)
		{
			this.gui = gui;
		}

		@Override
		public void actionPerformed(ActionEvent e)
		{
			loeschen(gui.getSprit());
		}
	}
}
