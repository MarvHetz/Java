package pizzalieferservice.klassen;

public class Extras
{
	private String name;

	private double preis;

	public Extras(String name, double preis)
	{
		this.name = name;
		this.preis = preis;
	}

	public String getName()
	{
		return name;
	}

	public double getPreis()
	{
		return preis;
	}

	@Override
	public String toString()
	{
		return name;
	}
}