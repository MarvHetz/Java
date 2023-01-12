
public class Saeugetier extends Tier
{
	private int anzahlDerBeine;

	public Saeugetier(String name, String art, int anzahlDerBeine)
	{
		super(name, art);
		this.anzahlDerBeine = anzahlDerBeine;
	}

	public int getAnzahlDerBeine()
	{
		return anzahlDerBeine;
	}

	public void setAnzahlDerBeine(int anzahlDerBeine)
	{
		this.anzahlDerBeine = anzahlDerBeine;
	}
}