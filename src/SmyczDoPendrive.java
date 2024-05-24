class SmyczDoPendrive extends DekoratorProduktu {
    public SmyczDoPendrive(Produkt produkt) {
        super(produkt);
    }

    public double getCena() {
        return super.getCena() + 1.0;
    }

    public String toString() {
        return super.toString() + ", Smycz do pendrive (1.0 PLN)";
    }
}