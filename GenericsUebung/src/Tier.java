
public abstract class Tier
{
	private String art;

	private String name;

	public Tier(String name, String art)
	{
		super();
		this.name = name;
		this.art = art;
	}

	public String getArt()
	{
		return art;
	}

	public String getName()
	{
		return name;
	}

	public void setArt(String art)
	{
		this.art = art;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
