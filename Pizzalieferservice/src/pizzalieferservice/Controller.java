package pizzalieferservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;

import pizzalieferservice.klassen.Extras;
import pizzalieferservice.klassen.Groesse;
import pizzalieferservice.klassen.Pizza;
import pizzalieferservice.klassen.Warenkorb;

public class Controller
{
	private Extras[] extras =
	{ new Extras("Salami", 0.6), new Extras("Extra Mozzerella", 1.1), new Extras("Schinken", 0.7),
			new Extras("Chicken", 1.5) };

	private double gesamtpreis = 0;

	private Groesse[] groessen =
	{ new Groesse("Small", -1.7), new Groesse("Normall", 0.0), new Groesse("Big", 1.8), new Groesse("Grande", 3.5) };

	private Pizza[] pizzen =
	{ new Pizza("Salami", 6.50), new Pizza("Schinken", 6.7), new Pizza("Hawai", 7.5) };

	private PizzaGUI view;
	private DefaultListModel<Warenkorb> warenkorbDefaultListModel;

	public Controller()
	{
		warenkorbDefaultListModel = new DefaultListModel();
		view = new PizzaGUI(this);
		view.setzeModels(warenkorbDefaultListModel, pizzen, extras, groessen);
	}

	public void bestellen()
	{
		try
		{
			File bestellung = new File("Bestellung.txt");
			BufferedWriter bWriter = new BufferedWriter(new FileWriter(bestellung, false));
			try
			{
				for (int i = 0; i < warenkorbDefaultListModel.size(); i++)
				{

					bWriter.write((warenkorbDefaultListModel.getElementAt(i)).toString());
					bWriter.newLine();
				}

			} catch (Exception e)
			{
				System.out.println(e.getMessage());
			} finally
			{
				bWriter.close();
			}
		} catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void clearList()
	{
		warenkorbDefaultListModel.clear();
	}

	public void enfernen(Warenkorb zuEntfernen)
	{
		warenkorbDefaultListModel.removeElement(zuEntfernen);
	}

	public Extras[] getExtras()
	{
		return extras;
	}

	public Groesse[] getGroessen()
	{
		return groessen;
	}

	public Pizza[] getPizzen()
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

	private double berechnePreis(Pizza pizza, Extras extras, Groesse groesse)
	{
		return pizza.getPreis() + extras.getPreis() + groesse.getPreis();
	}
}