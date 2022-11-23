package autohaus;

import javax.swing.DefaultComboBoxModel;

public class Auto
{
	private DefaultComboBoxModel<Farbe> farben;

	private String name;

	private DefaultComboBoxModel<PS> ps;

	public Auto(String name)
	{
		super();
		this.farben = new DefaultComboBoxModel<>();
		this.name = name;
		this.ps = new DefaultComboBoxModel<>();
	}

	public DefaultComboBoxModel<Farbe> getFarben()
	{
		return farben;
	}

	public DefaultComboBoxModel<PS> getPs()
	{
		return ps;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
