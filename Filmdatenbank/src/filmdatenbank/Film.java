package filmdatenbank;

import java.util.Objects;

public class Film
{
	private String genre;

	private int id;

	private int laenge;

	private String name;

	public Film(int id, String name, String genre, int laenge)
	{
		super();
		this.id = id;
		this.name = name;
		this.laenge = laenge;
		this.genre = genre;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(genre, other.genre) && id == other.id && laenge == other.laenge
				&& Objects.equals(name, other.name);
	}

	public String getGenre()
	{
		return genre;
	}

	public int getId()
	{
		return id;
	}

	public int getLaenge()
	{
		return laenge;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(genre, id, laenge, name);
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setLaenge(int laenge)
	{
		this.laenge = laenge;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return id + " | " + name + " | " + genre;
	}

}
