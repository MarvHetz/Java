package autohaus;

public class Farbe
{
	private String name;

	public Farbe(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
