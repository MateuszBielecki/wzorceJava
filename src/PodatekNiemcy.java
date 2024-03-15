public class PodatekNiemcy implements Podatek {

    private final double stawkaVAT = 19.0;

    @Override
    public double naliczPodatek(Produkt produkt) {
        return produkt.getCenaNetto() * stawkaVAT / 100;
    }
}