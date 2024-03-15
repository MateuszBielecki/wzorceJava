public class ProduktNiemcy implements Produkt {

    private double cenaNetto;

    public ProduktNiemcy(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    @Override
    public double getCenaNetto() {
        return cenaNetto;
    }
}