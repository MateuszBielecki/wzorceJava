public class PodatekPolska implements Podatek {

    private final double stawkaVAT = 23.0;

    @Override
    public double naliczPodatek(Produkt produkt) {
        return produkt.getCenaNetto() * stawkaVAT / 100;
    }
}