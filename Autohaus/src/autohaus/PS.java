package autohaus;

public class PS
{
	private int psAnzahl;
	private double psPreis;

	public PS(int psAnzahl, double psPreis)
	{
		super();
		this.psAnzahl = psAnzahl;
		this.psPreis = psPreis;
	}

	@Override
	public String toString()
	{
		return String.valueOf(psAnzahl);
	}

}
