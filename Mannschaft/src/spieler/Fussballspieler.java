package spieler;

public class Fussballspieler extends Spieler
{
    private int anzahlGeschossenerTore;

    public Fussballspieler()
    {
    }

    public Fussballspieler(String name)
    {
        super(name);
        this.anzahlGeschossenerTore = 0;
    }

    @Override
    public void erziehlePunkt()
    {
        anzahlGeschossenerTore++;
    }


    public int getanzahlGeschossenerTore()
    {
        return anzahlGeschossenerTore;
    }

    public void setanzahlGeschossenerTore(int anzahlGeschossenerTore)
    {
        this.anzahlGeschossenerTore = anzahlGeschossenerTore;
    }

}
