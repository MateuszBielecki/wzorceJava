public class Sklep {
    public Sklep() {
    }

    public static void main(String[] args) {
        Produkt produkt = new ProduktBazowy(20.0, "Książka");
        produkt = new MaskotkaSklepu(produkt);
        produkt = new SmyczDoPendrive(produkt);
        produkt = new Transport(produkt, 13.0);
        produkt = new Rabat(produkt, 10.0);
        System.out.println("Zakupione produkty:");
        System.out.println(produkt);
        System.out.println("Łączna cena: " + produkt.getCena() + " PLN");
    }
}