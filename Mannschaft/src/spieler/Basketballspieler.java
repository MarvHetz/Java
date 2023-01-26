package spieler;

public class Basketballspieler extends Spieler
{
    private int anzahlGeworfenerKoerbe;

    public Basketballspieler()
    {
    }

    public Basketballspieler(String name)
    {
        super(name);
        this.anzahlGeworfenerKoerbe = 0;
    }

    @Override
    public void erziehlePunkt()
    {
        anzahlGeworfenerKoerbe++;
    }
}
