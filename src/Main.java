public class Main {
    public static void main(String[] args) {
        String reklama = "Super oferta!";
        String preferowanyJezykHiszp = "es";
        String preferowanyJezykAng = "en";
        String odbiorcaEmail = "jankowalski@gmail.com";
        String odbiorcaSMS = "+48123456789";
        String odbiorcaGlosowa = "+48123456789";

        ZarzadcaReklamy zarzadca = new ZarzadcaReklamy(new StrategiaTlumaczeniaNaHiszpanski());

        double kwotaZaplaconaKlient1 = 2000;
        zarzadca.wyslijReklame(reklama, preferowanyJezykHiszp, kwotaZaplaconaKlient1, odbiorcaGlosowa);

        double kwotaZaplaconaKlient2 = 700;
        zarzadca = new ZarzadcaReklamy(new StrategiaTlumaczeniaNaAngielski());
        zarzadca.wyslijReklame(reklama, preferowanyJezykAng, kwotaZaplaconaKlient2, odbiorcaSMS);

        double kwotaZaplaconaKlient3 = 300;
        zarzadca = new ZarzadcaReklamy(new StrategiaTlumaczeniaNaAngielski());
        zarzadca.wyslijReklame(reklama, preferowanyJezykAng, kwotaZaplaconaKlient3, odbiorcaEmail);
    }
}
