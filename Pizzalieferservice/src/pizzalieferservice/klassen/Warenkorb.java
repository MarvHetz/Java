package pizzalieferservice.klassen;

public class Warenkorb
{
	private Extras extras;
	private Groesse groesse;
	private Pizza pizza;
	private double preis = 0;

	public Warenkorb()
	{

	}

	public Warenkorb(Pizza pizza, Groesse groesse, Extras extras, double preis)
	{
		this.pizza = pizza;
		this.groesse = groesse;
		this.extras = extras;
		this.preis = preis;
	}
}