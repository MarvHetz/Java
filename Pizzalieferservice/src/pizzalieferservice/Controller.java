package pizzalieferservice;
public class Controller
{
    private  DefaultListModel<Warenkorb> warenkorbDefaultListModel;
    public Controller()
    {
        warenkorbDefaultListModel = new DefaultListModel();
    }

    public void hinzufuegen(Pizza pizza, Extras extras, Groesse groesse)
    {
        double preis = berechnePreis(pizza,extras,groesse);
        warenkorbDefaultListModel.add(new Warenkorb(pizza,extras,groesse,preis));
    }

    private double berechnePreis(Pizza pizza, Extras extras, Groesse groesse)
    {
        return pizza.getPreis() + extras.getPreis() + groesse.getPreis();
    }

    public DefaultListModel<Warenkorb> getWarenkorbDefaultListModel() {
        return warenkorbDefaultListModel;
    }
}