class MaskotkaSklepu extends DekoratorProduktu {
    public MaskotkaSklepu(Produkt produkt) {
        super(produkt);
    }

    public double getCena() {
        return super.getCena();
    }

    public String toString() {
        return super.toString() + ", Maskotka (0.0 PLN)";
    }
}