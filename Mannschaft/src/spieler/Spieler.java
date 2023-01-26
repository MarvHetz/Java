package spieler;

public abstract class Spieler
{
    private String name;

    public Spieler()
    {
    }

    public Spieler(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }

    public abstract void erziehlePunkt();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
