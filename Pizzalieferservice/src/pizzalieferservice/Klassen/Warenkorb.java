package klassen;
public class Warenkorb {
  private Pizza pizza;
  private Groesse groesse;
  private Extras extras;
  private double preis = 0;

    public Warenkorb()
    {

    }

    public Warenkorb(Pizza pizza, Groesse groesse, Extras extras, double preis)
    {
        this.pizza = pizza;
        this.groesse = groesse;
        this.extras = extras;
        this.preis = preis;
    }
}