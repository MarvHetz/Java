package pizzalieferservice;

import javax.swing.DefaultListModel;

import pizzalieferservice.klassen.Extras;
import pizzalieferservice.klassen.Groesse;
import pizzalieferservice.klassen.Pizza;
import pizzalieferservice.klassen.Warenkorb;

public class Controller
{
	private DefaultListModel<Extras> extras = new DefaultListModel<>();

	private double gesamtpreis = 0;

	private DefaultListModel<Groesse> groessen = new DefaultListModel<>();

	private DefaultListModel<Pizza> pizzen = new DefaultListModel<>();

	private PizzaGUI view;
	private DefaultListModel<Warenkorb> warenkorbDefaultListModel;

	public Controller()
	{
		warenkorbDefaultListModel = new DefaultListModel();
		view = new PizzaGUI(this);
		view.setzeModels(warenkorbDefaultListModel, pizzen, extras, groessen);

		einspeichernExtras();
		einspeichernGroessen();
		einspeichernPizzen();
	}

	private double berechnePreis(Pizza pizza, Extras extras, Groesse groesse)
	{
		return pizza.getPreis() + extras.getPreis() + groesse.getPreis();
	}

	public void clearList()
	{
		warenkorbDefaultListModel.clear();
	}

	private void einspeichernExtras()
	{
		extras.addElement(new Extras("Salami", 0.6));
		extras.addElement(new Extras("Extra Mozzerella", 1.1));
		extras.addElement(new Extras("Schinken", 0.7));
		extras.addElement(new Extras("Chicken", 1.5));
	}

	private void einspeichernGroessen()
	{
		groessen.addElement(new Groesse("Small", -1.7));
		groessen.addElement(new Groesse("Normall", 0.0));
		groessen.addElement(new Groesse("Big", 1.8));
		groessen.addElement(new Groesse("Grande", 3.5));
	}

	private void einspeichernPizzen()
	{
		pizzen.addElement(new Pizza("Salami", 6.50));
		pizzen.addElement(new Pizza("Schinken", 6.7));
		pizzen.addElement(new Pizza("Hawai", 7.5));
	}

	public void enfernen(Warenkorb zuEntfernen)
	{
		warenkorbDefaultListModel.removeElement(zuEntfernen);
	}

	public DefaultListModel<Extras> getExtras()
	{
		return extras;
	}

	public DefaultListModel<Groesse> getGroessen()
	{
		return groessen;
	}

	public DefaultListModel<Pizza> getPizzen()
	{
		return pizzen;
	}

	public DefaultListModel<Warenkorb> getWarenkorbDefaultListModel()
	{
		return warenkorbDefaultListModel;
	}

	public void hinzufuegen(Pizza pizza, Extras extras, Groesse groesse)
	{
		double preis = berechnePreis(pizza, extras, groesse);
		warenkorbDefaultListModel.addElement(new Warenkorb(pizza, groesse, extras, preis));
	}
}