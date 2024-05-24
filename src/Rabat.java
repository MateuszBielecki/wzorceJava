class Rabat extends DekoratorProduktu {
    private double rabat;

    public Rabat(Produkt produkt, double rabat) {
        super(produkt);
        this.rabat = rabat;
    }

    public double getCena() {
        double cenaProduktu = super.getCena();
        double cenaBezTransportu = cenaProduktu;

        if (this.produkt instanceof Transport) {
            cenaBezTransportu -= ((Transport) this.produkt).getKosztTransportu();
        }

        double cenaZRabatem = cenaBezTransportu - this.rabat;
        return cenaZRabatem < 0.0 ? ((Transport) this.produkt).getKosztTransportu() : cenaZRabatem + ((Transport) this.produkt).getKosztTransportu();
    }

    public String toString() {
        return super.toString() + ", Rabat (-" + this.rabat + " PLN)";
    }
}