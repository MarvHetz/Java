import spieler.Basketballspieler;
import spieler.Fussballspieler;

import javax.swing.*;
import java.util.ArrayList;

public class Controller
{
    private final GUI gui;

    private final Liga<Mannschaft<Fussballspieler>> fussballLiga;
    private final Liga<Mannschaft<Basketballspieler>> basketballLiga;

    public Controller()
    {
        gui = new GUI();
        fussballLiga = new Liga<>();
        basketballLiga = new Liga<>();
        spielerHinzufuegen();
        setzeModels();
    }

    private void spielerHinzufuegen()
    {
        Mannschaft<Fussballspieler> mannschaft1 = new Mannschaft<>();
        for (int i = 0; i < 11; i++)
        {
            mannschaft1.aufnehmen(new Fussballspieler("FussballSpieler " + i));
        }
        fussballLiga.hinzufuegen(mannschaft1);
    }

    private void mannschaftLinksEinfuegen()
    {
        DefaultListModel<Mannschaft> defaultListModelLinks = new DefaultListModel<Mannschaft>();
        ArrayList<Mannschaft> mannschaften = ((Liga<Mannschaft>) gui.getComboBoxMannschaftenLinks().getSelectedItem()).getMannschaften();
        mannschaften.stream().forEach(defaultListModelLinks::addElement);
    }

    private void setzeModels()
    {
        ComboBoxModel<Liga<Mannschaft<Fussballspieler>>> comboBoxModelLinks = new DefaultComboBoxModel<>();
        ((DefaultComboBoxModel<Liga<Mannschaft<Fussballspieler>>>) comboBoxModelLinks).addElement(fussballLiga);
        gui.getComboBoxMannschaftenLinks().setModel(comboBoxModelLinks);
        ComboBoxModel<Liga<Mannschaft<Basketballspieler>>> comboBoxModelRechts = new DefaultComboBoxModel<>();
        ((DefaultComboBoxModel<Liga<Mannschaft<Basketballspieler>>>) comboBoxModelRechts).addElement(basketballLiga);
        gui.getComboBoxMannschaftenRechts().setModel(comboBoxModelRechts);
    }
}
