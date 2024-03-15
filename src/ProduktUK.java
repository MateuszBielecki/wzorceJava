public class ProduktUK implements Produkt {

    private double cenaNetto;

    public ProduktUK(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    @Override
    public double getCenaNetto() {
        return cenaNetto;
    }
}