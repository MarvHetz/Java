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
	private ActionListener aendernActionListener;
	private Anzeige anzeige;
	private HandyApp handyApp;
	private DefaultListModel<Sprit> sprittpreise;

	private Zapfsaeule zapfsaeule;

	public Controller()
	{
		sprittpreise = new DefaultListModel<>();
	}

	public void aendern(Sprit sprit, String name, double preis)
	{
		sprit.setName(name);
		sprit.setPreis(preis);
	}

	public void aendernAnlegen(GUI gui)
	{
		aendernActionListener = new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				aendern(gui.getSprit(), gui.getSpritName(), gui.getPreis());
			}
		};
	}

	public void hinzufuegen(String name, double preis)
	{
		sprittpreise.addElement(new Sprit(name, preis));
	}

	public void oeffneAdminGUI()
	{
		adminGUI = new AdminGUI(this);
		adminGUI.setzeModel(sprittpreise);
		aendernAnlegen(adminGUI);
		adminGUI.setzeActionListener(aendernActionListener);
	}

	public void oeffneAnzeige()
	{
		anzeige = new Anzeige(this);
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

}
