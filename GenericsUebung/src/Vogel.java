
public class Vogel extends Tier
{
	private boolean kannFliegen;

	public Vogel(String name, String art, boolean kannFliegen)
	{
		super(name, art);
		this.kannFliegen = kannFliegen;
	}

	public boolean isKannFliegen()
	{
		return kannFliegen;
	}

	public void setKannFliegen(boolean kannFliegen)
	{
		this.kannFliegen = kannFliegen;
	}
}
