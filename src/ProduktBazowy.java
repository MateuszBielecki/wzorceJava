class ProduktBazowy implements Produkt {
    private double cena;
    private String nazwa;

    public ProduktBazowy(double cena, String nazwa) {
        this.cena = cena;
        this.nazwa = nazwa;
    }

    @Override
    public double getCena() {
        return cena;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public void dodajProdukt(Produkt produkt) {
    }

    @Override
    public void usunProdukt(Produkt produkt) {
    }

    @Override
    public String toString() {
        return nazwa + ": " + cena + " PLN";
    }
}