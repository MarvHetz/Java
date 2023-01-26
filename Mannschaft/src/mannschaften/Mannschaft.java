package mannschaften;

import spieler.Spieler;

import java.util.ArrayList;

public class Mannschaft<T extends Spieler>
{
    private ArrayList<T> mannschaft;

    public Mannschaft()
    {
    }

    public void aufnehmen(T spieler)
    {
        mannschaft.add(spieler);
    }
}
