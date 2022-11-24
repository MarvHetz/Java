package autohaus;

import java.util.ArrayList;

public class Auto
{
	private ArrayList<Farbe> farben;

	private String name;

	private ArrayList<PS> ps;

	public Auto(String name)
	{
		super();
		this.farben = new ArrayList<>();
		this.name = name;
		this.ps = new ArrayList<>();
	}

	public ArrayList<Farbe> getFarben()
	{
		return farben;
	}

	public ArrayList<PS> getPs()
	{
		return ps;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
