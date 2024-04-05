public class Main {

    public static void main(String[] args) {
        Postać strzelec = new Postać("Terminator", "Strzelec", new StrzelecAtak());
        Postać łucznik = new Postać("Robin Hood", "Łucznik", new LucznikAtak());
        Postać rycerz = new Postać("Zawisza", "Rycerz", new RycerzAtak());
        Postać kanonier = new Postać("Wojtek", "Kanonier", new KanonierAtak());

        strzelec.atakuj();
        łucznik.atakuj();
        rycerz.atakuj();
        kanonier.atakuj();
    }
}