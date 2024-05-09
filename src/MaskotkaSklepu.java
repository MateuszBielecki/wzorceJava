class MaskotkaSklepu extends DekoratorProduktu {
    public MaskotkaSklepu(Produkt produkt) {
        super(produkt);
    }

    @Override
    public double getCena() {
        return super.getCena();
    }

    @Override
    public String toString() {
        return super.toString() + ", Maskotka";
    }
}