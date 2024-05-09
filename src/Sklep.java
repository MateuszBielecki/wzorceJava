public class Sklep {
    public static void main(String[] args) {
        Produkt produkt = new ProduktBazowy(20, "Książka");

        produkt = new MaskotkaSklepu(produkt);
        produkt = new SmyczDoPendrive(produkt);
        produkt = new Transport(produkt);
        produkt = new Rabat(produkt, 10);

        System.out.println("Zakupione produkty:");
        System.out.println(produkt);
        System.out.println("Łączna cena: " + produkt.getCena() + " PLN");
    }
}