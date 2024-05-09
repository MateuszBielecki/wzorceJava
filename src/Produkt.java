interface Produkt {
    double getCena();
    String getNazwa();

    void dodajProdukt(Produkt produkt);
    void usunProdukt(Produkt produkt);

    String toString();
}