class Transport extends DekoratorProduktu {
    public Transport(Produkt produkt) {
        super(produkt);
    }

    @Override
    public double getCena() {
        return super.getCena() + 13;
    }

    @Override
    public String toString() {
        return super.toString() + ", Transport";
    }
}