package pizzalieferservice;

import javax.swing.DefaultListModel;

import pizzalieferservice.klassen.Extras;
import pizzalieferservice.klassen.Groesse;
import pizzalieferservice.klassen.Pizza;
import pizzalieferservice.klassen.Warenkorb;

public class Controller
{
	private double gesamtpreis = 0;
	private PizzaGUI view;
	private DefaultListModel<Warenkorb> warenkorbDefaultListModel;

	public Controller()
	{
		warenkorbDefaultListModel = new DefaultListModel();
		view = new PizzaGUI(this);
	}

	private double berechnePreis(Pizza pizza, Extras extras, Groesse groesse)
	{
		return pizza.getPreis() + extras.getPreis() + groesse.getPreis();
	}

	public void clearList()
	{
		warenkorbDefaultListModel.clear();
	}

	public void enfernen(Warenkorrb zuEntfernen)
	{
		warenkorbDefaultListModel.remove(zuEntfernen);
	}

	public DefaultListModel<Warenkorb> getWarenkorbDefaultListModel()
	{
		return warenkorbDefaultListModel;
	}

	public void hinzufuegen(Pizza pizza, Extras extras, Groesse groesse)
	{
		double preis = berechnePreis(pizza, extras, groesse);
		warenkorbDefaultListModel.add(new Warenkorb(pizza, groesse, extras, preis));
	}
}