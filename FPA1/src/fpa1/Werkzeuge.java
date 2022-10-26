package fpa1;

public abstract class Werkzeuge
{
	protected String name;
	protected double basistarif;
	protected int arbeitsStunden;
	
	public Werkzeuge(String name, double basistarif, int arbeitsStunden)
	{
		super();
		this.name = name;
		this.basistarif = basistarif;
		this.arbeitsStunden = arbeitsStunden;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getBasistarif()
	{
		return basistarif;
	}

	public void setBasistarif(double basistarif)
	{
		this.basistarif = basistarif;
	}

	public int getArbeitsStunden()
	{
		return arbeitsStunden;
	}

	public void setArbeitsStunden(int arbeitsStunden)
	{
		this.arbeitsStunden = arbeitsStunden;
	}
	
	@Override
	public String toString()
	{
		return "Werkzeuge [name=" + name + ", basistarif=" + basistarif + ", arbeitsStunden=" + arbeitsStunden + "]";
	}


}
