package tankstelle;

import javax.swing.DefaultListModel;

public class Controller
{
	private DefaultListModel<Sprit> sprittpreise;

	public Controller()
	{
		sprittpreise = new DefaultListModel<>();
	}

	public void aendern(Sprit sprit, String name, double preis)
	{
		sprit.setName(name);
		sprit.setPreis(preis);
	}

	public void hinzufuegen(String name, double preis)
	{
		sprittpreise.addElement(new Sprit(name, preis));
	}
}
