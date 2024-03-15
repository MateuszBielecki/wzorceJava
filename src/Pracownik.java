public class Pracownik {

    public static void main(String[] args) {
        Pracownik mechanik = new Pracownik("Mechanik samochodowy");
        mechanik.setSposobPracowania(new NaprawaSamochodow());
        mechanik.setSposobSpedzaniaWolnegoCzasu(new Silownia());
        mechanik.setSposobDojeżdżania(new Samochod());

        mechanik.methods();

        Pracownik listonosz = new Pracownik("Listonosz");
        listonosz.setSposobPracowania(new RoznoszenieListow());
        listonosz.setSposobSpedzaniaWolnegoCzasu(new Silownia());
        listonosz.setSposobDojeżdżania(new Rower());

        listonosz.methods();

        Pracownik lekarz = new Pracownik("Lekarz");
        lekarz.setSposobPracowania(new Leczenie());
        lekarz.setSposobSpedzaniaWolnegoCzasu(new LiteraturaPopularnoNaukowa());
        lekarz.setSposobDojeżdżania(new Samochod());

        lekarz.methods();
    }

    private Pracowac sposobPracowania;
    private SpedzanieWolnegoCzasu sposobSpedzaniaWolnegoCzasu;
    private Dojezdzac sposobDojeżdżania;
    private String zawod;

    public Pracownik(String zawod) {
        this.zawod = zawod;
    }

    public void setSposobPracowania(Pracowac sposobPracowania) {
        this.sposobPracowania = sposobPracowania;
    }

    public void setSposobSpedzaniaWolnegoCzasu(SpedzanieWolnegoCzasu sposobSpedzaniaWolnegoCzasu) {
        this.sposobSpedzaniaWolnegoCzasu = sposobSpedzaniaWolnegoCzasu;
    }

    public void setSposobDojeżdżania(Dojezdzac sposobDojeżdżania) {
        this.sposobDojeżdżania = sposobDojeżdżania;
    }

    public void pracuj() {
        sposobPracowania.pracuj();
    }

    public void spedzajWolnyCzas() {
        sposobSpedzaniaWolnegoCzasu.spedzajWolnyCzas();
    }

    public void dojezdzaj() {
        sposobDojeżdżania.dojezdzaj();
    }

    public void methods() {
        System.out.println("Zawód: " + zawod);
        pracuj();
        spedzajWolnyCzas();
        dojezdzaj();
    }
}
