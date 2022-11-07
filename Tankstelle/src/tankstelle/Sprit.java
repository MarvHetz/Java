package tankstelle;

public class Sprit
{
	private String name;

	private double preis;

	public Sprit(String name, double preis)
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

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPreis(double preis)
	{
		this.preis = preis;
	}

	@Override
	public String toString()
	{
		return name + ": " + preis;
	}

}
