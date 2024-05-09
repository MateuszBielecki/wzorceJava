class SmyczDoPendrive extends DekoratorProduktu {
    public SmyczDoPendrive(Produkt produkt) {
        super(produkt);
    }

    @Override
    public double getCena() {
        return super.getCena() + 1;
    }

    @Override
    public String toString() {
        return super.toString() + ", Smycz do pendrive";
    }
}