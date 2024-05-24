abstract class DekoratorProduktu implements Produkt {
    protected Produkt produkt;

    public DekoratorProduktu(Produkt produkt) {
        this.produkt = produkt;
    }

    public double getCena() {
        return this.produkt.getCena();
    }

    public String getNazwa() {
        return this.produkt.getNazwa();
    }

    public void dodajProdukt(Produkt produkt) {
        produkt.dodajProdukt(this);
    }

    public void usunProdukt(Produkt produkt) {
        produkt.usunProdukt(this);
    }

    public String toString() {
        return this.produkt.toString();
    }
}