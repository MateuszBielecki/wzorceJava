public class BezSosu implements PizzaDekorator {
    private final Pizza PizzaStandardowa;

    public BezSosu(Pizza PizzaStandardowa) {
        this.PizzaStandardowa = PizzaStandardowa;
    }

    @Override
    public Pizza getPizzaStandardowa() {
        return PizzaStandardowa;
    }

    @Override
    public String getOpis() {
        String opis = PizzaStandardowa.getOpis();
        if (opis.contains("sos pomidorowy")) {
            opis = opis.replace(", sos pomidorowy", "");
        }
        return opis;
    }

    @Override
    public double getCena() {
        return PizzaStandardowa.getCena();
    }
}