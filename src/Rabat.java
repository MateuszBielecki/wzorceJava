class Rabat extends DekoratorProduktu {
    private double rabat;

    public Rabat(Produkt produkt, double rabat) {
        super(produkt);
        this.rabat = rabat;
    }

    @Override
    public double getCena() {
        double cenaProduktu = super.getCena();
        double cenaZRabatem = cenaProduktu - rabat;
        return cenaZRabatem < 0 ? 0 : cenaZRabatem;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rabat 10 PLN";
    }
}