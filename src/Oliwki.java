public class Oliwki implements PizzaDekorator {
    private final Pizza PizzaStandardowa;

    public Oliwki(Pizza PizzaStandardowa) {
        this.PizzaStandardowa = PizzaStandardowa;
    }

    @Override
    public Pizza getPizzaStandardowa() {
        return PizzaStandardowa;
    }

    @Override
    public String getOpis() {
        return PizzaStandardowa.getOpis() + ", oliwki";
    }

    @Override
    public double getCena() {
        return PizzaStandardowa.getCena() + 3.0;
    }
}
