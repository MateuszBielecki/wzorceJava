public class Pieczarki implements PizzaDekorator {
    private final Pizza PizzaStandardowa;

    public Pieczarki(Pizza PizzaStandardowa) {
        this.PizzaStandardowa = PizzaStandardowa;
    }

    @Override
    public Pizza getPizzaStandardowa() {
        return PizzaStandardowa;
    }

    @Override
    public String getOpis() {
        return PizzaStandardowa.getOpis() + ", pieczarki";
    }

    @Override
    public double getCena() {
        return PizzaStandardowa.getCena() + 2.0;
    }
}