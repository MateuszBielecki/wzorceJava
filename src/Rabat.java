public class Rabat extends DekoratorProduktu {
    private double rabat;

    public Rabat(Produkt produkt, double rabat) {
        super(produkt);
        this.rabat = rabat;
    }

    public double getCena() {
        double cenaProduktu = super.getCena();
        double kosztTransportu = getKosztTransportu();
        double cenaBezTransportu = cenaProduktu - kosztTransportu;
        double cenaZRabatem = cenaBezTransportu - this.rabat;

        return cenaZRabatem < 0.0 ? kosztTransportu : cenaZRabatem + kosztTransportu;
    }

    public String toString() {
        return super.toString() + ", Rabat (-" + this.rabat + " PLN)";
    }
}