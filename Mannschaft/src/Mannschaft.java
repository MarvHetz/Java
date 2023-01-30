import spieler.Spieler;

import java.util.ArrayList;

public class Mannschaft<T extends Spieler>
{
    private final ArrayList<T> mannschaft;

    public Mannschaft()
    {
        mannschaft = new ArrayList<T>();
    }

    public void aufnehmen(T spieler)
    {
        mannschaft.add(spieler);
    }
}
