public class BezMozzarelli implements PizzaDekorator {
    private final Pizza PizzaStandardowa;

    public BezMozzarelli(Pizza PizzaStandardowa) {
        this.PizzaStandardowa = PizzaStandardowa;
    }

    @Override
    public Pizza getPizzaStandardowa() {
        return PizzaStandardowa;
    }

    @Override
    public String getOpis() {
        String opis = PizzaStandardowa.getOpis();
        if (opis.contains("mozzarella")) {
            opis = opis.replace(", mozzarella", "");
        }
        return opis;
    }

    @Override
    public double getCena() {
        return PizzaStandardowa.getCena();
    }
}