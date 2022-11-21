
public class Ware
{
	private String artikelBezeichnung;
	private int artikelNummer;
	private String preis;

	public Ware(String artikelBezeichnung, int artikelNummer, String preis)
	{
		super();
		this.artikelBezeichnung = artikelBezeichnung;
		this.artikelNummer = artikelNummer;
		this.preis = preis;
	}

	@Override
	public String toString()
	{
		return artikelBezeichnung + " " + preis;
	}

	public String toStringForFile()
	{
		return Integer.toString(artikelNummer) + ";" + artikelBezeichnung + ";" + preis + ";";
	}
}
