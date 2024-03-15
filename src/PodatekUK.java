public class PodatekUK implements Podatek {

    private final double stawkaVAT = 20.0;

    @Override
    public double naliczPodatek(Produkt produkt) {
        return produkt.getCenaNetto() * stawkaVAT / 100;
    }
}