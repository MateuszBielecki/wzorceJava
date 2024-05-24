class Transport extends DekoratorProduktu {
    private double kosztTransportu;

    public Transport(Produkt produkt, double kosztTransportu) {
        super(produkt);
        this.kosztTransportu = kosztTransportu;
    }

    public double getKosztTransportu() {
        return this.kosztTransportu;
    }

    public double getCena() {
        return super.getCena() + this.kosztTransportu;
    }

    public String toString() {
        return super.toString() + ", Transport (" + this.kosztTransportu + " PLN)";
    }
}