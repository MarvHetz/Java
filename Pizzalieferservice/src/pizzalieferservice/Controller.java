package pizzalieferservice;
public class Controller
{
    private  DefaultListModel<Warenkorb> warenkorbDefaultListModel;
    private double gesamtpreis = 0;
    public Controller()
    {
        warenkorbDefaultListModel = new DefaultListModel();
    }

    public void hinzufuegen(Pizza pizza, Extras extras, Groesse groesse)
    {
        double preis = berechnePreis(pizza,extras,groesse);
        warenkorbDefaultListModel.add(new Warenkorb(pizza,extras,groesse,preis));
    }

    public void enfernen(Warenkorrb zuEntfernen)
    {
        warenkorbDefaultListModel.remove(zuEntfernen);
    }

    public void clearList()
    {
        warenkorbDefaultListModel.clear();
    }

    private double berechnePreis(Pizza pizza, Extras extras, Groesse groesse)
    {
        return pizza.getPreis() + extras.getPreis() + groesse.getPreis();
    }

    public DefaultListModel<Warenkorb> getWarenkorbDefaultListModel()
    {
        return warenkorbDefaultListModel;
    }
}