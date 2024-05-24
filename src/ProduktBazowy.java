class ProduktBazowy implements Produkt {
    private double cena;
    private String nazwa;

    public ProduktBazowy(double cena, String nazwa) {
        this.cena = cena;
        this.nazwa = nazwa;
    }

    public double getCena() {
        return this.cena;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public void dodajProdukt(Produkt produkt) {
    }

    public void usunProdukt(Produkt produkt) {
    }

    public String toString() {
        return this.nazwa + ": " + this.cena + " PLN";
    }
}