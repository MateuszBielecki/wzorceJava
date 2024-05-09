abstract class DekoratorProduktu implements Produkt {
    private Produkt produkt;

    public DekoratorProduktu(Produkt produkt) {
        this.produkt = produkt;
    }

    @Override
    public double getCena() {
        return produkt.getCena();
    }

    @Override
    public String getNazwa() {
        return produkt.getNazwa();
    }

    @Override
    public void dodajProdukt(Produkt produkt) {
        produkt.dodajProdukt(this);
    }

    @Override
    public void usunProdukt(Produkt produkt) {
        produkt.usunProdukt(this);
    }

    @Override
    public String toString() {
        return produkt.toString();
    }
}