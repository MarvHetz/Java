import java.util.ArrayList;

public class Liga<T extends Mannschaft>
{
    ArrayList<T> mannschaften;

    public Liga()
    {
        mannschaften = new ArrayList<T>();
    }

    public ArrayList<T> getMannschaften()
    {
        return mannschaften;
    }

    public void hinzufuegen(T mannschaft)
    {
        mannschaften.add(mannschaft);
    }
}
