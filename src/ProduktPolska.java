public class ProduktPolska implements Produkt {

    private double cenaNetto;

    public ProduktPolska(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    @Override
    public double getCenaNetto() {
        return cenaNetto;
    }
}