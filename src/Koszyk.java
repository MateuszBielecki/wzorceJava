import java.util.ArrayList;
import java.util.List;

public class Koszyk {

    private List<Produkt> produkty;
    private Podatek podatek;

    public Koszyk(Podatek podatek) {
        this.produkty = new ArrayList<>();
        this.podatek = podatek;
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public double obliczCeneBrutto() {
        double cenaBrutto = 0.0;
        for (Produkt produkt : produkty) {
            cenaBrutto += produkt.getCenaNetto() + podatek.naliczPodatek(produkt);
        }
        return cenaBrutto;
    }

    public double obliczCeneNetto() {
        double cenaNetto = 0.0;
        for (Produkt produkt : produkty) {
            cenaNetto += produkt.getCenaNetto();
        }
        return cenaNetto;
    }
    public void setPodatek(Podatek podatek) {
        this.podatek = podatek;
    }

    public static void main(String[] args) {
        Koszyk koszyk = new Koszyk(new PodatekPolska());
        koszyk.dodajProdukt(new ProduktPolska(250.0));
        koszyk.dodajProdukt(new ProduktPolska(250.0));

        System.out.println("Cena netto: " + koszyk.obliczCeneNetto());
        System.out.println("Cena brutto (Polska): " + koszyk.obliczCeneBrutto());

        koszyk.setPodatek(new PodatekUK());

        System.out.println("Cena netto: " + koszyk.obliczCeneNetto());
        System.out.println("Cena brutto (UK): " + koszyk.obliczCeneBrutto());

        koszyk.setPodatek(new PodatekNiemcy());

        System.out.println("Cena netto: " + koszyk.obliczCeneNetto());
        System.out.println("Cena brutto (Niemcy): " + koszyk.obliczCeneBrutto());
    }
}